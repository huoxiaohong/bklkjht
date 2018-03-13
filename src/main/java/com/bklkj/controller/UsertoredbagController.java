package com.bklkj.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bklkj.Commons.Countdown;
import com.bklkj.Commons.Countdown2;
import com.bklkj.pojo.Usertoredbag;
import com.bklkj.service.RedBagService;
import com.bklkj.service.UsertoredbagService;
  

@Controller
@RequestMapping("usertoredbag")
public class UsertoredbagController {
	
	@Autowired
	private UsertoredbagService usertoredbagService;
	
	@Autowired
	private RedBagService redbagService;
	
	//根据红包总额查找
	@RequestMapping("selectByTotalMoney")
	@ResponseBody
	public List<Usertoredbag> selectByTotalMoney(String usernickname,String userId){
		return usertoredbagService.selectByTotalMoney(usernickname,userId);
	}
	
	//显示需要使用多少积分
	@RequestMapping("usetime")
	@ResponseBody
	public Countdown chakan(@RequestParam(value = "userid", required = false) String userid,Countdown cd,
			@RequestParam(value = "redbagnum", required = false) Integer redbagnum) throws Exception{
		//获取当前时间
		String nowtime=usertoredbagService.selectnow();
		String time = usertoredbagService.selectcountdown(userid,redbagnum);
		 SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		   java.util.Date date= myFormatter.parse(nowtime); 
		   java.util.Date date2= myFormatter.parse(time); 
		   java.util.Date mydate= myFormatter.parse("2015-01-01 00:00:00");
		   long  day=(date.getTime()-mydate.getTime());
		   long  day2=(date2.getTime()-mydate.getTime());
		   long sub=(day2-day)*-1;
		   long subtime = 7200-sub/1000;
		 if(sub<7200000&&sub>5400000){
			 
				 cd.setCode("1");
				 cd.setMessage("成功");
				 cd.setIntegral("5");
				 cd.setSubtime(subtime+"");
				 cd.setRedbagnum(redbagnum.toString());
				 
		 }else if(sub<=5400000&&sub>3600000){
			
				 cd.setCode("1");
				 cd.setMessage("成功");
				 cd.setIntegral("10");
				 cd.setSubtime(subtime+"");
				 cd.setRedbagnum(redbagnum.toString());
			 
		 }else if(sub<=3600000&&sub>1800000){
			
				 cd.setCode("1");
				 cd.setMessage("成功");
				 cd.setIntegral("15");
				 cd.setSubtime(subtime+"");
				 cd.setRedbagnum(redbagnum.toString());
			 
		 }else if(sub<=1800000&&sub>0){
				 cd.setCode("1");
				 cd.setMessage("成功");
				 cd.setSubtime(subtime+"");
				 cd.setIntegral("20");
				 cd.setRedbagnum(redbagnum.toString());
		 }else if(sub>=7200000){
			
			 cd.setCode("1");
			 cd.setMessage("倒计时已经过去了");
			 cd.setIntegral("0");
			 cd.setSubtime("0");
			 cd.setRedbagnum(redbagnum.toString());
			 usertoredbagService.updateredbagtype(userid,redbagnum);
		 }
		
		return cd;
	}
	
	//根据倒计时消耗积分打开红包（2小时倒计时）
		@RequestMapping("userbytime")
		@ResponseBody
		public Countdown daojishi(@RequestParam(value = "userid", required = false) String userid,Countdown cd,
				@RequestParam(value = "redbagnum", required = false) Integer redbagnum) throws Exception{
			//获取当前时间
			String nowtime=usertoredbagService.selectnow();
			//查询用户积分
			Integer integral=usertoredbagService.selectuseri(userid);
			String time = usertoredbagService.selectcountdown(userid,redbagnum);
			 SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			   java.util.Date date= myFormatter.parse(nowtime); 
			   java.util.Date date2= myFormatter.parse(time); 
			   java.util.Date mydate= myFormatter.parse("2015-01-01 00:00:00");
			   long  day=(date.getTime()-mydate.getTime());
			   long  day2=(date2.getTime()-mydate.getTime());
			long sub=(day2-day)*-1;
			long subtime = 7200-sub/1000;
			 if(sub<7200000&&sub>5400000){
				 if(integral>=5){
					 usertoredbagService.updateintegral(userid);
					 cd.setCode("1");
					 cd.setMessage("购买成功");
					 cd.setIntegral("5");
					 cd.setSubtime("0");
					 cd.setRedbagnum(redbagnum.toString());
					 //如果购买成功，更改红包状态
					 usertoredbagService.updateredbagtype(userid,redbagnum);
				 }else if(integral<5){
					 cd.setCode("0");
					 cd.setMessage("您的积分不够");
					 cd.setIntegral("0");
					 cd.setSubtime(subtime+"");
					 cd.setRedbagnum(redbagnum.toString());
				 }
			 }else if(sub<=5400000&&sub>3600000){
				 if(integral>=10){
					 usertoredbagService.updateintegral10(userid);
					 cd.setCode("1");
					 cd.setMessage("购买成功");
					 cd.setIntegral("10");
					 cd.setSubtime("0");
					 cd.setRedbagnum(redbagnum.toString());
					 //如果购买成功，更改红包状态
					 usertoredbagService.updateredbagtype(userid,redbagnum);
				 }else if(integral<10){
					 cd.setCode("0");
					 cd.setMessage("您的积分不够");
					 cd.setIntegral("0");
					 cd.setSubtime(subtime+"");
					 cd.setRedbagnum(redbagnum.toString());
				 }
				 
			 }else if(sub<=3600000&&sub>1800000){
				 if(integral>=15){
					 usertoredbagService.updateintegral15(userid);
					 cd.setCode("1");
					 cd.setMessage("购买成功");
					 cd.setIntegral("15");
					 cd.setSubtime("0");
					 cd.setRedbagnum(redbagnum.toString());
					 //如果购买成功，更改红包状态
					 usertoredbagService.updateredbagtype(userid,redbagnum);
				 }else if(integral<15){
					 cd.setCode("0");
					 cd.setMessage("您的积分不够");
					 cd.setSubtime(subtime+"");
					 cd.setIntegral("0");
					 cd.setRedbagnum(redbagnum.toString());
				 }
				 
			 }else if(sub<=1800000&&sub>0){
				 if(integral>=20){
					 usertoredbagService.updateintegral20(userid);
					 cd.setCode("1");
					 cd.setMessage("购买成功");
					 cd.setIntegral("20");
					 cd.setSubtime("0");
					 cd.setRedbagnum(redbagnum.toString());
					 //如果购买成功，更改红包状态
					 usertoredbagService.updateredbagtype(userid,redbagnum);
				 }else if(integral<20){
					 cd.setCode("0");
					 cd.setMessage("您的积分不够");
					 cd.setIntegral("0");
					 cd.setSubtime(subtime+"");
					 cd.setRedbagnum(redbagnum.toString());
				 }
			 }else if(sub>=7200000){
				 cd.setCode("1");
				 cd.setMessage("倒计时已经过去了");
				 cd.setIntegral("0");
				 cd.setRedbagnum(redbagnum.toString());
				 usertoredbagService.updateredbagtype(userid,redbagnum);
			 }
			
			return cd;
		}
		
		
		//用户点击红包(有意向)
		@RequestMapping("begintime")
		@ResponseBody
		public Countdown2 dianji(@RequestParam(value = "userid", required = false) String userid,Countdown2 cd,
				@RequestParam(value = "nowtime", required = false) Integer nowtime,
				@RequestParam(value = "redbagnum", required = false) Integer redbagnum){
			List<String> zc = redbagService.selectredbagtype(userid);
			if (zc!=null&&zc.size()!=0){
				cd.setCode("0");
				cd.setMessage("您不能同时打开两个红包");
				cd.setRedbagnum(redbagnum.toString());
			}else if(zc==null||zc.size()==0){
			//点击时间
			usertoredbagService.updatecountdownbegintime(userid,redbagnum);
			cd.setCode("1");
			cd.setMessage("红包状态由0变成1");
			cd.setRedbagnum(redbagnum.toString());
			usertoredbagService.updateredbagtype1(userid, redbagnum);
			}
			return cd;
		}
		
}
