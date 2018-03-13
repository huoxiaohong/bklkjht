package com.bklkj.service;

import org.springframework.stereotype.Service;

import com.bklkj.pojo.Integralrecharge;


@Service
public interface IntegralrechargeService {

	String selectByUserId();

	Integer update(Integralrecharge integralrecharge);

	void insert(Integralrecharge integralrecharge);

	String update(Integer userIntegral);

	Integer updateUserUseIntegal();


}
