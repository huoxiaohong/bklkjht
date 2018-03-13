package com.bklkj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bklkj.pojo.User;
import com.bklkj.service.huoUserService;

/**
 * @author huoxiaohong
 * @version 创建时间：2018年1月4日 下午3:45:18
 * @Title: huoUserController.java
 * @Package com.bklkj.controller
 * @Description 
 * UserController 中有具体根据名称。。用户余额等查询
 * 
 */
@Controller
@RequestMapping("huoUser")
public class huoUserController {
	@Autowired
	private huoUserService huouserservice;

	// 查询所有用户 显示20条数据
	@RequestMapping("selectHuoUser")
	@ResponseBody
	public List<User> selectHuoUser() throws Exception {
		return huouserservice.selectHuoUser();
	}

	// 根据ID查询用户登录的方式
	@RequestMapping("selectjon")
	@ResponseBody
	public List<User> selectjion(
			@RequestParam(value = "loginway", required = false) Integer loginway,
			@RequestParam(value = "userid", required = false) String userid) {
		return huouserservice.selectjion(loginway, userid);

	}

	// 根据电话号码查询登录方式
	@RequestMapping("selectbyphone")
	@ResponseBody
	public List<User> selectbyphone(@RequestParam("userphone") String userphone) {
		return huouserservice.selectbyphone(userphone);
	}
}
