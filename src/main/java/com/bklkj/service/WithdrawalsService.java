package com.bklkj.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bklkj.pojo.User;
import com.bklkj.pojo.Withdrawals;

@Service
public interface WithdrawalsService {

	List<Withdrawals> selectByUserId(String userid);

	Integer selectWithdrawalsMoney(Double withdrawalsmoney, String userid);

	List<Withdrawals> selectByTime(Date withdrawalstime, String userid);

	Double selectwith(Double withdrawalsmoney, String userid);

	List<Withdrawals> selectjilu(Double userwithdrawalsmoney, String userid);

	Double selectwithmoney(Double withdrawalsmoney, String userid);

	Double selectwithm(String userid);


}
