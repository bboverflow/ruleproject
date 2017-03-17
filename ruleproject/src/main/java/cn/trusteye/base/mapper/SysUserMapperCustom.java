package cn.trusteye.base.mapper;

import cn.trusteye.base.pojo.po.SysUser;
import cn.trusteye.base.pojo.po.SysUserExample;
import cn.trusteye.base.pojo.pocustom.SysUserCustom;
import cn.trusteye.base.pojo.vo.UserQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserMapperCustom {
    List<SysUserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;

    int findUserCount(UserQueryVo userQueryVo);
}