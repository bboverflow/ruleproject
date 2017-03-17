package cn.trusteye.base.service;

import cn.trusteye.base.pojo.po.SysRole;
import cn.trusteye.base.pojo.po.SysUser;
import cn.trusteye.base.pojo.pocustom.SysUserCustom;
import cn.trusteye.base.pojo.vo.RoleQueryVo;
import cn.trusteye.base.pojo.vo.UserQueryVo;

import java.util.List;

/**
 * Created by Rayman on 2017/3/16.
 */
public interface UserService {
    List<SysUserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;

    int findUserCount(UserQueryVo userQueryVo) throws Exception;

    public SysUser findSysUserByid(String id) throws Exception;

    public void insertUser(SysUserCustom sysUserCustom) throws Exception;

    public List<SysRole> findRoleList(RoleQueryVo roleQueryVo) throws Exception;
}
