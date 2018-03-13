package com.bklkj.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bklkj.Commons.Android;
import com.bklkj.Commons.OrderInfoUtil2_0;
import com.bklkj.Commons.Recharge;
import com.bklkj.service.CommodityService;

@Controller
@RequestMapping("commodity")
public class CommodityController {
	
	@Autowired
	private CommodityService commodityService;
	
	//积分充值界面
	@RequestMapping("recharge")
	@ResponseBody
	public Recharge selectrecharge(Recharge re){
		List<String>ordernum=commodityService.selectordernum();
		List<String>ordername=commodityService.selectordername();
		List<String>orderprice=commodityService.selectorderprice();
		List<String>orderdescribe=commodityService.selectorderdescribe();
		List<Map<String, String>> maplist = new ArrayList<Map<String, String>>();
		for (int i = 0; i < ordernum.size(); i++) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("num", ordernum.get(i));
			map.put("name", ordername.get(i));
			map.put("price",orderprice.get(i));
			map.put("describe", orderdescribe.get(i));
			maplist.add(map);
		}
		re.setCode(1);
		re.setMessage("成功");
		re.setList(maplist);
		return re;
	}
	
	/*//安卓支付接口
	@RequestMapping("android")
	@ResponseBody
	public Android pay(Android ad,@RequestParam(value = "userid", required = false) String userid){
		OrderInfoUtil2s_0 o=new OrderInfoUtil2_0();
		
		//o.payinfo(subject, body, price, out_trade_no);
		
		return ad;
	}*/
	
}
