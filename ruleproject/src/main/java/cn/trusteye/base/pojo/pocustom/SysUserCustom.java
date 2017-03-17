package cn.trusteye.base.pojo.pocustom;

import cn.trusteye.base.pojo.po.SysUser;

/**
 * Created by Rayman on 2017/3/16.
 */
public class SysUserCustom extends SysUser{
    private String rolename;
    private String roleid;
    private String userState;
    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }
}
