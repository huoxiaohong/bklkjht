package com.bklkj.dao;

import com.bklkj.pojo.Integralrecharge;
import com.bklkj.pojo.IntegralrechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntegralrechargeMapper {
    int countByExample(IntegralrechargeExample example);

    int deleteByExample(IntegralrechargeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Integralrecharge record);

    int insertSelective(Integralrecharge record);

    List<Integralrecharge> selectByExample(IntegralrechargeExample example);

    Integralrecharge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Integralrecharge record, @Param("example") IntegralrechargeExample example);

    int updateByExample(@Param("record") Integralrecharge record, @Param("example") IntegralrechargeExample example);

    int updateByPrimaryKeySelective(Integralrecharge record);

    int updateByPrimaryKey(Integralrecharge record);

	String selectByUserId();
}