package com.bklkj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bklkj.Commons.GoldStringToJson;
import com.bklkj.pojo.User;
import com.bklkj.service.GoldService;
import com.bklkj.service.UserService;

@Controller
@RequestMapping("gold")
public class GoldController {
	@Autowired
	private GoldService goldService;
	@Autowired
	private UserService userService;

	/*
	 * //查找用户金币
	 * 
	 * @RequestMapping("selectUserGold")
	 * 
	 * @ResponseBody public List<User> selectUserGold(@RequestParam(value =
	 * "userid", required = false)String userid) throws Exception { List<User>
	 * c = userService.selectUserGold(userid, userid); return c; }
	 */

	// 更改用户的金币数
	@RequestMapping("updateUserGold")
	@ResponseBody
	public Integer updateUserGold(@RequestParam(value = "goldnum", required = false) Integer goldnum,
			@RequestParam(value = "userid", required = false) String userid) throws Exception {
		return goldService.updateUserGold(goldnum, userid);
	}

	// 用户获得金币
	@RequestMapping("insertById")
	@ResponseBody
	public GoldStringToJson insertGold(@RequestParam(value = "loginway", required = false) Integer loginway,
			@RequestParam(value = "goldnum", required = false) Integer goldnum,
			@RequestParam(value = "userid", required = false) String userid, GoldStringToJson gj) throws Exception {
		List<User> lw = userService.selectLoginWay(loginway,userid);
			int a = goldService.insert(goldnum, userid);
			if (a == 1)
				goldService.updateUserGold(goldnum, userid);
			gj.setCode(1);
			gj.setMessage("成功");
			return gj;
	}

	// 用户使用金币
	@RequestMapping("userUseGold")
	@ResponseBody
	public GoldStringToJson useGold(@RequestParam(value = "usergold", required = false) Integer usergold,
			@RequestParam(value = "loginway", required = false) Integer loginway,
			@RequestParam(value = "goldnum", required = false) Integer goldnum,
			@RequestParam(value = "userid", required = false) String userid, GoldStringToJson gj) throws Exception {
		List<User> g = userService.selectUserGold(userid);
		List<User> lw = userService.selectLoginWay(loginway,userid);
		
			if ((lw.get(0).getLoginway()).equals(1)) {
				if (g.get(0).getUsergold() >= 100) {
				goldService.useGold(goldnum, userid);
				gj.setCode(1);
				gj.setMessage("使用成功");
				return gj;
				}else if(g.get(0).getUsergold() < 100){
					gj.setCode(0);
					gj.setMessage("您的金币不足");
					return gj;
					}
			} else if ((lw.get(0).getLoginway()).equals(2)) {
				gj.setCode(1);
				gj.setMessage("dfasdfa");
				return gj;
			}
			return gj;
	}
}
