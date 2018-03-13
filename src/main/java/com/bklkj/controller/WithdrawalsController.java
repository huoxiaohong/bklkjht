package com.bklkj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bklkj.pojo.User;
import com.bklkj.pojo.Withdrawals;
import com.bklkj.service.WithdrawalsService;

@Controller
@RequestMapping("withdrawals")
public class WithdrawalsController {

		@Autowired
		private WithdrawalsService withdrawalsService;
		
		//根据userId查询提现
		@RequestMapping("selectByUserId")
		@ResponseBody
		public List<Withdrawals> selectByUserId(String userId){
			List<Withdrawals>list=withdrawalsService.selectByUserId(userId);
			return list;
		}
	
}
