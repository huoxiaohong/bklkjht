package com.bklkj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bklkj.Commons.IntegralStringToJson;
import com.bklkj.Commons.UserStringToJson;
import com.bklkj.pojo.Alipay;
import com.bklkj.pojo.Integralrecharge;
import com.bklkj.pojo.User;
import com.bklkj.pojo.Wx;
import com.bklkj.service.AlipayService;
import com.bklkj.service.IntegralrechargeService;
import com.bklkj.service.UserService;
import com.bklkj.service.WxService;

@Controller
@RequestMapping("integralrecharge")
public class IntegralrechargeController {

	@Autowired
	private IntegralrechargeService integralrechargeService;

	@Autowired
	private UserService userService;

	@Autowired
	private AlipayService alipayService;

	@Autowired
	private WxService wxService;
	
	private Alipay alipay;
	
	private Wx wx;
	
	private User user;

	// 用户支付宝、微信购买积分
	@RequestMapping("buyUserIntegral")
	@ResponseBody
	public Integer update(Integralrecharge Integralrecharge) {
		String select = integralrechargeService.selectByUserId();
		if (alipay.getTradeFinished().equals("SUCCESS") && select.equals("SUCCESS")
				|| wx.getReturnCode().equals("SUCCESS") && select.equals("SUCCESS")) {
			Integer userIntegral = null;
			userService.updateUserIntegral(userIntegral);
			userService.updateUserIntegralSum(userIntegral);
		} else if (alipay.getTradeFinished().equals("SUCCESS") && select.equals("false")
				|| wx.getReturnCode().equals("SUCCESS") && select.equals("false")) {
			alipayService.insert(alipay);
			wxService.insert(wx);
			Integer userIntegral = null;
			integralrechargeService.insert(Integralrecharge);
			userService.updateUserIntegralSum(userIntegral);

			return 1;
		}
		return 0;
	}
	
	//用户使用积分
	@RequestMapping("userUseIntegal")
	@ResponseBody
	public IntegralStringToJson updateByUse(@RequestParam(value = "loginway", required = false) Integer loginway,@RequestParam(value = "userid", required = false) String userid,@RequestParam(value = "userintegral", required = false) Integer userintegral,IntegralStringToJson isj){
		List<User> lw = userService.selectLoginWay(loginway,userid);
		if ((lw.get(0).getLoginway()).equals(1)) {
			List <User> i=userService.selectUserIntegral(userid);
		if(i.get(0).getUserintegral()>=10){
			int ue=userService.updateUserUseIntegal(userintegral,userid);
			if(ue==1){
				isj.setCode(1);
				isj.setMessage("使用成功");
			}
			isj.setCode(0);
			isj.setMessage("您的积分不足，请充值");
			return isj;
			} 
		}else if ((lw.get(0).getLoginway()).equals(2)) {
			isj.setCode(1);
			isj.setMessage("dfasdfa");
			return isj;
		}
		return isj;
	}

	// 根据用户ID查找
	@RequestMapping("selectByUserId")
	@ResponseBody
	public String selectByUserId(@Param("UserIntegral") HttpServletRequest request, String UserIntegral) {
		String select = integralrechargeService.selectByUserId();
		return select;
	}

}
