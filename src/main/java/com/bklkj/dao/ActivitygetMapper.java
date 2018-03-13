package com.bklkj.dao;

import com.bklkj.pojo.Activityget;
import com.bklkj.pojo.ActivitygetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivitygetMapper {
    int countByExample(ActivitygetExample example);

    int deleteByExample(ActivitygetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Activityget record);

    int insertSelective(Activityget record);

    List<Activityget> selectByExample(ActivitygetExample example);

    Activityget selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Activityget record, @Param("example") ActivitygetExample example);

    int updateByExample(@Param("record") Activityget record, @Param("example") ActivitygetExample example);

    int updateByPrimaryKeySelective(Activityget record);

    int updateByPrimaryKey(Activityget record);
}