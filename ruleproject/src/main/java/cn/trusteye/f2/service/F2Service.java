package cn.trusteye.f2.service;

import cn.trusteye.f2.pojo.pocustom.F2sesnkeySetCustom;
import cn.trusteye.f2.pojo.vo.F2sessionQueryVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Rayman on 2017/3/14.
 */
public interface F2Service {
    Integer findSessionCount(F2sessionQueryVo f2sessionQueryVo) throws Exception;
    List<F2sesnkeySetCustom> findSessionList(F2sessionQueryVo f2sessionQueryVo) throws Exception;
}
