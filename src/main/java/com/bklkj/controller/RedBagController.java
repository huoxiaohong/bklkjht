package com.bklkj.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bklkj.pojo.Gold;
import com.bklkj.pojo.Redbag;
import com.bklkj.pojo.User;
import com.bklkj.service.GoldService;
import com.bklkj.service.RedBagService;
import com.bklkj.service.UserService;

@Controller
@RequestMapping("redbag")
public class RedBagController {

	@Autowired
	private RedBagService redBagService;
	@Autowired
	private GoldService goldService;
	@Autowired
	private UserService userService;
	
	private Gold gold;
	
	private User user;

	// 红包概率
	public int rb = 8;
	// 优惠券概率
	public int cou = 2;
	// 得到金币数量的概率
	public int minGold = 60;
	public int maxGold = 90;

	// 判断是否为同一天
	public static boolean isToday(Date date) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		if (fmt.format(date).toString().equals(fmt.format(new Date()).toString())) {// 格式化为相同格式
			return true;
		} else {
			return false;
		}
	}

	// 扫码
	// 扫码用户得到红包和金币
	@RequestMapping("updateRedbag")
	@ResponseBody
	public Integer userGetRedbag(@RequestParam(value = "goldnum", required = false)Integer goldnum,@RequestParam(value = "userid", required = false)String userid,Integer RedbagNum,Redbag Redbag, HttpServletRequest req, HttpSession session) throws Exception {
		// 判断session中是否有用户
		User user = (User) req.getSession().getAttribute("userPhone");
		// 随机数
		if (user!=null) {
			Random rnd = new Random();
			int goldNum = rnd.nextInt(31) + 60;
			if (goldNum >= minGold && goldNum <= maxGold) {
				// 记录到gold表
				goldService.insert(goldnum,userid);
				// 更改user表中的金币数量，即总数
				userService.updateUserGold(goldNum);
			}
			goldService.insert(goldnum,userid);
			Date date = null;
			if (isToday(date) == true && RedbagNum < 3) {
				// 用户得到红包
				redBagService.updateRedbag(Redbag);
			} else if (isToday(date) == false) {
				// 第二天红包数改成1
				redBagService.updateRedbag2(Redbag);
			}
		return 1;
		}return 0; 
	}

	// 活动
	// 活动用户得到红包或者积分
	@RequestMapping("activityGet")
	@ResponseBody
	public Integer userGetRedbagOrIntegral(Integer RedbagNum,Redbag Redbag,Integer userIntegral,HttpServletRequest req, HttpSession session) {
		User user = (User) req.getSession().getAttribute("userPhone");
		//如果能查到用戶
		if(user!=null){
			Random rnd = new Random();
			int tempInt = rnd.nextInt(9);
			if (tempInt >= 0 && tempInt < cou) {
				// 用户获得积分
				userService.updateUserIntegralA(userIntegral);
			} else if (tempInt >= 2 && tempInt <= rb) {
				Date date = null;
				if (isToday(date) == true && RedbagNum < 3) {
					// 用户获得红包 
					redBagService.updateRedbag(Redbag);
				} else if (isToday(date) == false) {
					// 第二天红包数改成1
					redBagService.updateRedbag2(Redbag);
				}
			}
			return 1;
		}else{
			return 0;
		}

	}

	// 用户打开红包
	@RequestMapping("userUseRedbag")
	@ResponseBody
	public void userUseRedbag(Redbag redbag, Gold goldNum) {
		if (user.getUsergold() > 100) {
			userService.updateUserGoldSub(goldNum);
			Random rnd = new Random();
			int tempInt = rnd.nextInt(9);
			if (tempInt >= 0 && tempInt < cou) {
				// 用户获得优惠券
				redBagService.updateRedbag3(redbag);
			} else if (tempInt >= 2 && tempInt <= rb) {
				// 用户获得现金和积分
				redBagService.updateRedbag4(redbag);
			}
		}
	}
}
