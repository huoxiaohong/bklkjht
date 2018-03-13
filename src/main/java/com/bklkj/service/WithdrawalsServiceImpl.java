package com.bklkj.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bklkj.dao.WithdrawalsMapper;
import com.bklkj.pojo.User;
import com.bklkj.pojo.Withdrawals;

@Service
public class WithdrawalsServiceImpl implements WithdrawalsService {

	@Autowired
	private WithdrawalsMapper withdrawalsMapper;
	
	@Override
	public List<Withdrawals> selectByUserId(String userid) {
		// TODO Auto-generated method stub
		List<Withdrawals>list=withdrawalsMapper.selectByUserId(userid);
		return list;
	}
	
	//提现总额
	@Override
	public Integer selectWithdrawalsMoney(Double withdrawalsmoney, String userid) {
		Integer a= withdrawalsMapper.selectWithdrawalsMoney(withdrawalsmoney,userid);
	    return a;
	}

	@Override
	public List<Withdrawals> selectByTime(Date withdrawalstime, String userid) {
		List<Withdrawals>list=withdrawalsMapper.selectByTime(withdrawalstime,userid);
		return list;
	}

	@Override
	public Double selectwith(Double withdrawalsmoney, String userid) {
		return withdrawalsMapper.selectwith(withdrawalsmoney,userid);
		
	}

	@Override
	public List<Withdrawals> selectjilu(Double userwithdrawalsmoney, String userid) {
		// TODO Auto-generated method stub
		List<Withdrawals>list=withdrawalsMapper.selectjilu(userwithdrawalsmoney,userid);
		return list;
	}

	@Override
	public Double selectwithmoney(Double withdrawalsmoney, String userid) {
		return withdrawalsMapper.selectwithmoney(withdrawalsmoney,userid);
	}

	@Override
	public Double selectwithm(String userid) {
		// TODO Auto-generated method stub
		return withdrawalsMapper.selectwithm(userid);
	}
}
