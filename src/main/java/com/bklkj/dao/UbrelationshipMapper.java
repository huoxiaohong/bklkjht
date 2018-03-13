package com.bklkj.dao;

import com.bklkj.pojo.Ubrelationship;
import com.bklkj.pojo.UbrelationshipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UbrelationshipMapper {
    int countByExample(UbrelationshipExample example);

    int deleteByExample(UbrelationshipExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ubrelationship record);

    int insertSelective(Ubrelationship record);

    List<Ubrelationship> selectByExample(UbrelationshipExample example);

    Ubrelationship selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ubrelationship record, @Param("example") UbrelationshipExample example);

    int updateByExample(@Param("record") Ubrelationship record, @Param("example") UbrelationshipExample example);

    int updateByPrimaryKeySelective(Ubrelationship record);

    int updateByPrimaryKey(Ubrelationship record);
}