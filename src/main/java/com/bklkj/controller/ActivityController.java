package com.bklkj.controller;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bklkj.Commons.Activitytojson;
import com.bklkj.Commons.Joinactivity;
import com.bklkj.Commons.Other;
import com.bklkj.Commons.Timu;
import com.bklkj.Commons.UserStringToJson;
import com.bklkj.dao.UserMapper;
import com.bklkj.pojo.Activity;
import com.bklkj.pojo.Problem;
import com.bklkj.pojo.User;
import com.bklkj.service.ActivityService;
import com.bklkj.service.ActivitytemporaryService;
import com.bklkj.service.BusinessService;
import com.bklkj.service.ProblemService;
import com.bklkj.service.RedBagService;
import com.bklkj.service.UserService;
import com.bklkj.service.UsertoredbagService;

@Controller
@RequestMapping("activity")
public class ActivityController {

	@Autowired
	private ActivityService activityService;
	@Autowired
	private UserService userService;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private BusinessService businessService;
	@Autowired
	private RedBagService redbagService;
	@Autowired
	private ActivitytemporaryService activitytemporaryService;
	@Autowired
	private ProblemService problemService;
	@Autowired
	private UsertoredbagService usertoredbagService;

	// 查找所有
	@RequestMapping("selectByAll")
	@ResponseBody
	public List<Activity> selectActivity() throws Exception {
		return activityService.selectActivity();
	}

	// 添加活动
	@RequestMapping("insert")
	@ResponseBody
	public void insertActivity(Activity activity) throws Exception {
		activityService.insertActivity(activity);

	}

	// 删除
	@RequestMapping("delete")
	@ResponseBody
	public void doDelete(@RequestParam(value = "id", required = false) Integer id) throws Exception {
		activityService.deleteById(id);
	}

	// 更改
	@RequestMapping("updateById")
	@ResponseBody
	public Integer updateUser(Activity activity) throws Exception {
		/*
		 * if(activity.getBusinessactivity().equals("undefined")){
		 * activity.setBusinessactivity(null); }else
		 * if(activity.getBusinessactivitybegintime().equals("NaN")){//
		 * activity.setBusinessactivitybegintime(null); }else
		 * if(activity.getBusinessactivityintegral().equals("undefined")){
		 * activity.setBusinessactivityintegral(null); }else
		 * if(activity.getBusinessactivitymoney().equals("undefined")){
		 * activity.setBusinessactivitymoney(null); }else
		 * if(activity.getBusinessactivityname().equals("undefined")){//
		 * activity.setBusinessactivityname(null); }else
		 * if(activity.getBusinessactivitynum().equals("undefined")){
		 * activity.setBusinessactivitynum(null); }else
		 * if(activity.getBusinessactivitystoptime().equals("NaN")){//
		 * activity.setBusinessactivitystoptime(null); }else
		 * if(activity.getBusinessid().equals("undefined")){//
		 * activity.setBusinessid(null); }else
		 */
		return activityService.updateActivity(activity);
	}

	// 根据开始时间查找
	@RequestMapping("selectByBeginTime")
	@ResponseBody
	public List<Activity> selectByBeginTime(@RequestParam("businessActivityBeginTime") Date businessActivityBeginTime)
			throws Exception {
		return activityService.selectByBeginTime(businessActivityBeginTime);
	}

	// 根据开始Id查找
	@RequestMapping("selectById")
	@ResponseBody
	public List<Activity> selectById(@RequestParam("Id") Integer Id) throws Exception {
		return activityService.selectById(Id);
	}

	// 活动页面
	// 查看自己的金币，积分和余额，以及红包和红包状态
	@RequestMapping("activity")
	@ResponseBody
	public Activitytojson userSelf(@RequestParam(value = "usergold", required = false) Integer usergold,
			@RequestParam(value = "userintegral", required = false) Integer userintegral,
			@RequestParam(value = "userbalance", required = false) Double userbalance, UserStringToJson usj,
			@RequestParam(value = "loginway", required = false) Integer loginway,
			@RequestParam(value = "userid", required = false) String userid, Activitytojson aj) throws ParseException {
		// DecimalFormat df = new DecimalFormat("######0.00");
		// Integer count = businessService.selectbusinesscount();
		// 展示滚动条
		List<String> nickname = userService.selectByuser();
		List<String> bus = businessService.selectBusinessname();
		List<String> money = redbagService.selectmoney();
		List<Map<String, String>> maplist = new ArrayList<Map<String, String>>();
		for (int i = 0; i < money.size(); i++) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("name", nickname.get(i));
			map.put("businessname", bus.get(i));
			map.put("money", money.get(i));
			maplist.add(map);
		}
		aj.setList(maplist);
		List<String> selectall = activitytemporaryService.selectall();
		if (selectall == null || selectall.size() == 0) {
			// 把数据存到临时表中，6小时更换
		
			activityService.insertactivitytemporary();
			/*activityService.insertproblemtemporary();*/
			// 随机出现的三个商户
			List<String> businessname = activityService.selectbusinessname();
			List<String> businesslogo = activityService.selectbusinesslogo();
			List<String> businessmoney = activityService.selectbusinessmoney();
			List<String> businesstype = activityService.selectbusinesstype();
			List<String> one = activityService.selectpersonone(userid);
			List<String> two = activityService.selectpersontwo(userid);
			List<String> three = activityService.selectpersonthree(userid);
			List<Map<String, String>> maplist2 = new ArrayList<Map<String, String>>();
			for (int i = 0; i < businessname.size(); i++) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("businessname", businessname.get(i));
				map.put("businesslogo", businesslogo.get(i));
				map.put("businessmoney", businessmoney.get(i));
				map.put("businesstype", businesstype.get(i));
				map.put("peoplenum", "123");
				map.put("time", "5");
				maplist2.add(map);
			}
			aj.setList2(maplist2);
			Double qian = activityService.selectbusinessactivitymoney();
			if(qian<20){
				activityService.updatebusinesstype(userid);
				activityService.updatebusinesstype2(userid);
			}
			aj.setOne(one.get(0));
			aj.setTwo(two.get(0));
			aj.setThree(three.get(0));
			aj.setCode(1);
			aj.setSubtime((long) 21600000);
			aj.setMessage("成功");
		} else if (selectall != null && selectall.size() != 0) {
			String nowtime=usertoredbagService.selectnow();
			String time = usertoredbagService.selecttimedown();
			 SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			   java.util.Date date= myFormatter.parse(nowtime); 
			   java.util.Date date2= myFormatter.parse(time); 
			   java.util.Date mydate= myFormatter.parse("2015-01-01 00:00:00");
			   long  day=(date.getTime()-mydate.getTime());
			   long  day2=(date2.getTime()-mydate.getTime());
			long sub=(day2-day)*-1;
			long subtime = 300-sub/1000;
			if(sub>=300000){
				//删除表中商户
				activityService.deletebusiness();
				//重新添加活动
				activityService.insertactivitytemporary();
				//用户点击状态发生改变
				activityService.updateusertype(userid);
			// 随机出现的三个商户
			List<String> businessname = activityService.selectbusinessname();
			List<String> businesslogo = activityService.selectbusinesslogo();
			List<String> businessmoney = activityService.selectbusinessmoney();
			List<String> businesstype = activityService.selectbusinesstype();
			List<String> one = activityService.selectpersonone(userid);
			List<String> two = activityService.selectpersontwo(userid);
			List<String> three = activityService.selectpersonthree(userid);
			List<Map<String, String>> maplist2 = new ArrayList<Map<String, String>>();
			for (int i = 0; i < businessname.size(); i++) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("businessname", businessname.get(i));
				map.put("businesslogo", businesslogo.get(i));
				map.put("businessmoney", businessmoney.get(i));
				map.put("businesstype", businesstype.get(i));
				map.put("peoplenum", "123");
				map.put("time", "5");
				maplist2.add(map);
			}
			aj.setList2(maplist2);
			//查询最后的商家的钱数
			aj.setOne(one.get(0));
			aj.setTwo(two.get(0));
			aj.setThree(three.get(0));
			aj.setCode(1);
			aj.setSubtime(subtime);
			aj.setMessage("成功");
			}else if (sub<300000){
				List<String> businessname = activityService.selectbusinessname();
				List<String> businesslogo = activityService.selectbusinesslogo();
				List<String> businessmoney = activityService.selectbusinessmoney();
				List<String> businesstype = activityService.selectbusinesstype();
				List<String> joinnum =activityService.selectjoinnum();
				List<String> one = activityService.selectpersonone(userid);
				List<String> two = activityService.selectpersontwo(userid);
				List<String> three = activityService.selectpersonthree(userid);
				List<Map<String, String>> maplist2 = new ArrayList<Map<String, String>>();
				for (int i = 0; i < businessname.size(); i++) {
					Map<String, String> map = new HashMap<String, String>();
					map.put("businessname", businessname.get(i));
					map.put("businesslogo", businesslogo.get(i));
					map.put("businessmoney", businessmoney.get(i));
					map.put("businesstype", businesstype.get(i));
					map.put("peoplenum", joinnum.get(i));
					map.put("time", "5");
					maplist2.add(map);
				}
				aj.setList2(maplist2);
				Double qian = activityService.selectbusinessactivitymoney();
				if(qian<20){
					activityService.updatebusinesstype(userid);
					activityService.updatebusinesstype2(userid);
				}
				aj.setOne(one.get(0));
				aj.setTwo(two.get(0));
				aj.setThree(three.get(0));
				aj.setCode(1);
				aj.setSubtime(subtime);
				aj.setMessage("成功");
			}
		}
		return aj;
	}

	// 参加活动
	@RequestMapping("joinactivity")
	@ResponseBody
	public Timu useplay(Joinactivity jy, @RequestParam(value = "userid", required = false) String userid,
			@RequestParam(value = "rownum", required = false) Integer rownum,
			@RequestParam(value = "businessid", required = false) Integer businessid,
			@RequestParam(value = "redbagmoney", required = false) Double redbagmoney,
			@RequestParam(value = "redbagbusiness", required = false) String redbagbusiness,
			@RequestParam(value = "panduan", required = false) Integer panduan,
			@RequestParam(value = "ans", required = false) Integer ans,
			@RequestParam(value = "questionone", required = false) Integer questionone,
			@RequestParam(value = "questiontwo", required = false) Integer questiontwo,
			@RequestParam(value = "questionthree", required = false) Integer questionthree,Timu tu,
			@RequestParam(value = "row", required = false) Integer row) {
		
		DecimalFormat df = new DecimalFormat("######0.00");
		// 判断用户有没有权利点题目
		Integer problemone = problemService.selectproblemonetype(userid, rownum);
		Integer problemtwo = problemService.selectproblemtwotype(userid, rownum);
		Integer problemthree = problemService.selectproblemthreetype(userid, rownum);
		if (row == 1) {
			problemService.updatejoinnum1();
			problemService.updatejoinnum11();
			Integer type=problemService.selectbusinesstype();
			if(type==1){
			if (problemone == 1) {
				tu.setCode(0);
				tu.setMessage("您已经点过这道题了,请等待刷新时间");
				List list=new ArrayList<>();
				tu.setList(list);
			} else if (problemone == 0) {
				List<Problem>timu = problemService.selectproblem();
				tu.setCode(1);
				tu.setList(timu);
				tu.setMessage("查找成功");
				userService.updatequestion1(questionone, userid);
			}
			}else if (type==2){
				tu.setCode(0);
				tu.setMessage("活动已结束");
				List list=new ArrayList<>();
				tu.setList(list);
			}
		}
		if (row == 2) {
			problemService.updatejoinnum2();
			problemService.updatejoinnum22();
			Integer type=problemService.selectbusinesstype2();
			if(type==1){
			if (problemtwo == 1) {
				tu.setCode(0);
				tu.setMessage("您已经点过这道题了,请等待刷新时间");
				List list=new ArrayList<>();
				tu.setList(list);
			} else if (problemtwo == 0) {
				List<Problem>timu = problemService.selectproblem();
				tu.setCode(1);
				tu.setList(timu);
				tu.setMessage("查找成功");
				userService.updatequestion2(questionone, userid);
			}
			}else if(type==2){
				tu.setCode(0);
				tu.setMessage("活动已结束");
				List list=new ArrayList<>();
				tu.setList(list);
			}
		}
		if (row == 3) {
			problemService.updatejoinnum3();
			problemService.updatejoinnum33();
			Integer type=problemService.selectbusinesstype3();
			if(type==1){
			if (problemthree == 1) {
				tu.setCode(0);
				tu.setMessage("您已经点过这道题了,请等待刷新时间");
				List list=new ArrayList<>();
				tu.setList(list);
			} else if (problemthree == 0) {
				List<Problem>timu = problemService.selectproblem();
				tu.setCode(1);
				tu.setList(timu);
				tu.setMessage("查找成功");
				userService.updatequestion3(questionone, userid);
			}
			}else if(type==2){
				tu.setCode(0);
				tu.setMessage("活动已结束");
				List list=new ArrayList<>();
				tu.setList(list);
			}
		}
		return tu;
	}
	
	
	// 点进去参加完活动
		@RequestMapping("activityover")
		@ResponseBody
		public Joinactivity selecttimu(Joinactivity jy, @RequestParam(value = "userid", required = false) String userid,
				@RequestParam(value = "rownum", required = false) Integer rownum,
				@RequestParam(value = "businessid", required = false) Integer businessid,
				@RequestParam(value = "redbagmoney", required = false) Double redbagmoney,
				@RequestParam(value = "redbagbusiness", required = false) String redbagbusiness,
				@RequestParam(value = "panduan", required = false) Integer panduan,
				@RequestParam(value = "ans", required = false) Integer ans,
				@RequestParam(value = "questionone", required = false) Integer questionone,
				@RequestParam(value = "questiontwo", required = false) Integer questiontwo,
				@RequestParam(value = "questionthree", required = false) Integer questionthree) {
			
			DecimalFormat df = new DecimalFormat("######0.00");
					if (ans == 1) {
						// 用户得到现金
						problemService.insertMin(rownum, redbagmoney, userid, businessid);
						Double qian = problemService.selectmoney(userid);
						String name = problemService.selectname(userid);
						String web = problemService.selectweb(userid);
						String logo = problemService.selectlogo(userid);
						String introduce = problemService.selectintroduce(userid);
						jy.setCode(1);
						jy.setMessage("成功");
						jy.setMoney(df.format(qian));
						jy.setBusinessintroduce(introduce);
						jy.setName(name);
						jy.setWeb(web);
						jy.setLogo(logo);
						// 从商家扣除
						problemService.updatebusinessmoney(userid);
						problemService.updatebusinessmoney2(userid);
					} else if (ans == 0) {
						jy.setCode(0);
						jy.setMessage("对不起您答错了,无法获得现金奖励");
						userService.updatequestion1(questionone, userid);
					}
					return jy;
		}
		
		
	
}
