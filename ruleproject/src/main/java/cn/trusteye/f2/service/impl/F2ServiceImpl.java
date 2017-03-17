package cn.trusteye.f2.service.impl;

import cn.trusteye.f2.mapper.F2sesnkeySetMapperCustom;
import cn.trusteye.f2.pojo.pocustom.F2sesnkeySetCustom;
import cn.trusteye.f2.pojo.vo.F2sessionQueryVo;
import cn.trusteye.f2.service.F2Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Rayman on 2017/3/14.
 */
public class F2ServiceImpl implements F2Service{

    @Autowired
    F2sesnkeySetMapperCustom f2sesnkeySetMapperCustom;

    @Override
    public List<F2sesnkeySetCustom> findSessionList(F2sessionQueryVo f2sessionQueryVo) throws Exception {
        return f2sesnkeySetMapperCustom.findSessionList(f2sessionQueryVo);
    }

    @Override
    public Integer findSessionCount(F2sessionQueryVo f2sessionQueryVo) throws Exception{
        return f2sesnkeySetMapperCustom.findSessionCount(f2sessionQueryVo);
    }
}
