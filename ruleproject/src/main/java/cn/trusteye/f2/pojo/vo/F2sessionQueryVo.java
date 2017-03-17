package cn.trusteye.f2.pojo.vo;

import cn.trusteye.base.util.PageQuery;
import cn.trusteye.f2.pojo.pocustom.F2sesnkeySetCustom;

/**
 * Created by Rayman on 2017/3/14.
 */
public class F2sessionQueryVo {
    private F2sesnkeySetCustom f2sesnkeySetCustom;
    private PageQuery pageQuery;

    public F2sesnkeySetCustom getF2sesnkeySetCustom() {
        return f2sesnkeySetCustom;
    }

    public void setF2sesnkeySetCustom(F2sesnkeySetCustom f2sesnkeySetCustom) {
        this.f2sesnkeySetCustom = f2sesnkeySetCustom;
    }

    public PageQuery getPageQuery() {
        return pageQuery;
    }

    public void setPageQuery(PageQuery pageQuery) {
        this.pageQuery = pageQuery;
    }
}
