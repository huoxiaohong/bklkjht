package com.bklkj.dao;

import com.bklkj.pojo.Wx;
import com.bklkj.pojo.WxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxMapper {
    int countByExample(WxExample example);

    int deleteByExample(WxExample example);

    int deleteByPrimaryKey(String id);

    int insert(Wx record);

    int insertSelective(Wx record);

    List<Wx> selectByExample(WxExample example);

    Wx selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Wx record, @Param("example") WxExample example);

    int updateByExample(@Param("record") Wx record, @Param("example") WxExample example);

    int updateByPrimaryKeySelective(Wx record);

    int updateByPrimaryKey(Wx record);
}