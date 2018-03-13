package com.bklkj.dao;

import com.bklkj.pojo.Cash;
import com.bklkj.pojo.CashExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CashMapper {
    int countByExample(CashExample example);

    int deleteByExample(CashExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cash record);

    int insertSelective(Cash record);

    List<Cash> selectByExample(CashExample example);

    Cash selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cash record, @Param("example") CashExample example);

    int updateByExample(@Param("record") Cash record, @Param("example") CashExample example);

    int updateByPrimaryKeySelective(Cash record);

    int updateByPrimaryKey(Cash record);

	List<Cash> selectByAll();

	List<Cash> selectByRedbag();

	List<Cash> selectByActivity();

	List<Cash> selectByActivityMoney();

	List<Cash> selectByRedbagMoney();

	List<Cash> selectByMoney();

	List<Cash> selectByRedbagTime();
}