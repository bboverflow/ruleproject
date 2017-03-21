package cn.trusteye.base.service.impl;

import cn.trusteye.base.mapper.SysRoleMapper;
import cn.trusteye.base.mapper.SysUserMapper;
import cn.trusteye.base.mapper.SysUserMapperCustom;
import cn.trusteye.base.mapper.SysUserRoleMapper;
import cn.trusteye.base.pojo.po.*;
import cn.trusteye.base.pojo.pocustom.SysUserCustom;
import cn.trusteye.base.pojo.vo.RoleQueryVo;
import cn.trusteye.base.pojo.vo.UserQueryVo;
import cn.trusteye.base.process.result.ExceptionResultInfo;
import cn.trusteye.base.process.result.ResultInfo;
import cn.trusteye.base.process.result.ResultUtil;
import cn.trusteye.base.service.UserService;
import cn.trusteye.base.util.ResourcesUtil;
import cn.trusteye.base.util.UUIDBuild;
import org.springframework.beans.factory.annotation.Autowired;
import cn.trusteye.base.process.context.Configure;

import java.util.List;

/**
 * Created by Rayman on 2017/3/16.
 */
public class UserServiceImpl implements UserService {
    @Autowired
    SysUserMapperCustom sysUserMapperCustom;

    @Autowired
    SysUserMapper sysUserMapper;

    @Autowired
    SysUserRoleMapper sysUserRoleMapper;

    @Autowired
    SysRoleMapper sysRoleMapper;


    //查找用户列表
    @Override
    public List<SysUserCustom> findUserList(UserQueryVo userQueryVo) throws Exception {
        List<SysUserCustom> list = sysUserMapperCustom.findUserList(userQueryVo);
        for(SysUserCustom sysUserCustom : list){
            String Locked = sysUserCustom.getLocked();
                if(Locked.equals("0")) sysUserCustom.setUserState("未锁定");
                if(Locked.equals("1")) sysUserCustom.setUserState("锁定");
        }
        return list;
    }

    @Override
    public int findUserCount(UserQueryVo userQueryVo) throws Exception {
        return sysUserMapperCustom.findUserCount(userQueryVo);
    }

    //根据账号查询用户
    @Override
    public SysUser findSysUserByid(String id) throws Exception{
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
        criteria.andIdEqualTo(id);
        List<SysUser> list = sysUserMapper.selectByExample(sysUserExample);

        if(list != null && list.size()==1){
            return list.get(0);
        }
        return null;
    }

    @Override
    public void insertUser(SysUserCustom sysUserCustom) throws Exception {
       //通用校验：非空校验、长度校验等（使用工具完成）

        //业务合法性校验：账号唯一性等
        SysUser sysUser = this.findSysUserByid(sysUserCustom.getId());

        if(sysUser != null){
/*
            //账号重复
            throw new Exception("账号重复");
*/

/*
            ResultInfo resultInfo = new ResultInfo();
            resultInfo.setType(ResultInfo.TYPE_RESULT_FAILURE);
            resultInfo.setMessage("账号重复");

            String message = ResourcesUtil.getValue("resources.message","213");
            resultInfo.setMessage(message);

            throw new ExceptionResultInfo(resultInfo);
*/
            //使用工具类提交异常结果
            ResultUtil.throwExcepion(ResultUtil.createFail(Configure.MESSAGE,213,null));
        }

        //插入用户表
        sysUser = new SysUser();
        sysUser.setId(sysUserCustom.getId());
        sysUser.setUsername(sysUserCustom.getUsername());
        sysUser.setUsercode(sysUserCustom.getUsername());
        sysUser.setAddress(sysUserCustom.getAddress());
        sysUser.setPassword(sysUserCustom.getPassword());
        sysUser.setPosition(sysUserCustom.getPosition());
        sysUser.setDepartment(sysUserCustom.getDepartment());
        sysUser.setLocked(sysUserCustom.getLocked());
        sysUser.setMobile(sysUserCustom.getMobile());
        sysUserMapper.insert(sysUser);

        //插入用户角色关系表
        SysUserRole sysUserRole = new SysUserRole();
        sysUserRole.setId(UUIDBuild.getUUID());
        sysUserRole.setSysUserId(sysUserCustom.getId());
        sysUserRole.setSysRoleId(sysUserCustom.getRoleid());

        sysUserRoleMapper.insert(sysUserRole);
    }

    //查找角色列表
    @Override
    public List<SysRole> findRoleList(RoleQueryVo roleQueryVo) throws Exception {
        SysRoleExample sysRoleExample = new SysRoleExample();
        SysRoleExample.Criteria criteria= sysRoleExample.createCriteria();

        List<SysRole> list = sysRoleMapper.selectByExample(sysRoleExample);
        return list;
    }
}
