package cn.trusteye.f2.mapper;

import cn.trusteye.f2.pojo.po.F2sesnkeySet;
import cn.trusteye.f2.pojo.po.F2sesnkeySetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface F2sesnkeySetMapper {
    long countByExample(F2sesnkeySetExample example);

    int deleteByExample(F2sesnkeySetExample example);

    int insert(F2sesnkeySet record);

    int insertSelective(F2sesnkeySet record);

    List<F2sesnkeySet> selectByExample(F2sesnkeySetExample example);

    int updateByExampleSelective(@Param("record") F2sesnkeySet record, @Param("example") F2sesnkeySetExample example);

    int updateByExample(@Param("record") F2sesnkeySet record, @Param("example") F2sesnkeySetExample example);
}