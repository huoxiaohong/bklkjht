package com.bklkj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bklkj.dao.IntegralrechargeMapper;
import com.bklkj.dao.UserMapper;
import com.bklkj.pojo.Integralrecharge;

@Service
public class IntegralrechargeServiceImpl implements IntegralrechargeService{
	
	@Autowired
	private IntegralrechargeMapper integralrechargeMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public String selectByUserId() {
		return integralrechargeMapper.selectByUserId();
	}


	@Override
	public String update(Integer userIntegral) {
		return integralrechargeMapper.selectByUserId();
	}

	@Override
	public Integer update(Integralrecharge integralrecharge) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Integralrecharge integralrecharge) {
		integralrechargeMapper.insert(integralrecharge);
	}

	@Override
	public Integer updateUserUseIntegal() {
		return userMapper.updateUserUseIntegal();
	}


}
