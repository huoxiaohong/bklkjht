package com.bklkj.dao;

import com.bklkj.pojo.Withdrawals;
import com.bklkj.pojo.WithdrawalsExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WithdrawalsMapper {
	
    int countByExample(WithdrawalsExample example);

    int deleteByExample(WithdrawalsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Withdrawals record);

    int insertSelective(Withdrawals record);

    List<Withdrawals> selectByExample(WithdrawalsExample example);

    Withdrawals selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Withdrawals record, @Param("example") WithdrawalsExample example);

    int updateByExample(@Param("record") Withdrawals record, @Param("example") WithdrawalsExample example);

    int updateByPrimaryKeySelective(Withdrawals record);

    int updateByPrimaryKey(Withdrawals record);

	List<Withdrawals> selectByUserId(@Param("userid")String userid);

	Integer selectWithdrawalsMoney(@Param("withdrawalsmoney")Double withdrawalsmoney, @Param("userid")String userid);

	List<Withdrawals> selectByTime(@Param("withdrawalstime")Date withdrawalstime, @Param("userid")String userid);

	Double selectwith(@Param("withdrawalsmoney")Double withdrawalsmoney, @Param("userid")String userid);

	List<Withdrawals> selectjilu(@Param("userwithdrawalsmoney")Double userwithdrawalsmoney,@Param("userid") String userid);

	Double selectwithmoney(@Param("withdrawalsmoney")Double withdrawalsmoney, @Param("userid")String userid);

	Double selectwithm(@Param("userid")String userid);
}