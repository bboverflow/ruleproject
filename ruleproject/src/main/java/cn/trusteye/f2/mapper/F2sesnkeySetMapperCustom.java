package cn.trusteye.f2.mapper;

import cn.trusteye.f2.pojo.pocustom.F2sesnkeySetCustom;
import cn.trusteye.f2.pojo.vo.F2sessionQueryVo;

import java.util.List;

/**
 * Created by Rayman on 2017/3/14.
 */
public interface F2sesnkeySetMapperCustom {
    public int findSessionCount(F2sessionQueryVo f2sessionQueryVo) throws Exception;
    public List<F2sesnkeySetCustom> findSessionList(F2sessionQueryVo f2sessionQueryVo) throws Exception;
}
