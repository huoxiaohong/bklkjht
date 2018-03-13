package com.bklkj.dao;

import com.bklkj.pojo.Administration;
import com.bklkj.pojo.AdministrationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdministrationMapper {
    int countByExample(AdministrationExample example);

    int deleteByExample(AdministrationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Administration record);

    int insertSelective(Administration record);

    List<Administration> selectByExample(AdministrationExample example);

    Administration selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Administration record, @Param("example") AdministrationExample example);

    int updateByExample(@Param("record") Administration record, @Param("example") AdministrationExample example);

    int updateByPrimaryKeySelective(Administration record);

    int updateByPrimaryKey(Administration record);
}