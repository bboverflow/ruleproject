package cn.trusteye.base.pojo.vo;

import cn.trusteye.base.pojo.pocustom.SysUserCustom;
import cn.trusteye.base.util.PageQuery;

/**
 * Created by Rayman on 2017/3/16.
 */
public class UserQueryVo {
    SysUserCustom userCustom;
    PageQuery pageQuery;

    public SysUserCustom getUserCustom() {
        return userCustom;
    }

    public void setUserCustom(SysUserCustom userCustom) {
        this.userCustom = userCustom;
    }

    public PageQuery getPageQuery() {
        return pageQuery;
    }

    public void setPageQuery(PageQuery pageQuery) {
        this.pageQuery = pageQuery;
    }
}
