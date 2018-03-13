package com.bklkj.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bklkj.Commons.Findtime;
import com.bklkj.Commons.Forget;
import com.bklkj.Commons.Mine;
import com.bklkj.Commons.Mybag;
import com.bklkj.Commons.Nickname;
import com.bklkj.Commons.Original;
import com.bklkj.Commons.Other;
import com.bklkj.Commons.Paihang;
import com.bklkj.Commons.Paihang2;
import com.bklkj.Commons.Phone;
import com.bklkj.Commons.Picture;
import com.bklkj.Commons.RedbagRecord;
import com.bklkj.Commons.Rg;
import com.bklkj.Commons.Security;
import com.bklkj.Commons.Shourujilu;
import com.bklkj.Commons.Show;
import com.bklkj.Commons.StringToJson;
import com.bklkj.Commons.Tixian;
import com.bklkj.Commons.UserSaoma;
import com.bklkj.Commons.UserSee;
import com.bklkj.Commons.UserStringToJson;
import com.bklkj.dao.UserMapper;
import com.bklkj.pojo.Equipment;
import com.bklkj.pojo.Gold;
import com.bklkj.pojo.Redbag;
import com.bklkj.pojo.User;
import com.bklkj.pojo.Usertoredbag;
import com.bklkj.pojo.Withdrawals;
import com.bklkj.service.ActivityService;
import com.bklkj.service.BusinessService;
import com.bklkj.service.EquipmentService;
import com.bklkj.service.GoldService;
import com.bklkj.service.RedBagService;
import com.bklkj.service.UserService;
import com.bklkj.service.UsertoredbagService;
import com.bklkj.service.WithdrawalsService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private EquipmentService equipmentService;
	@Autowired
	private GoldService goldService;
	@Autowired
	private UsertoredbagService usertoredbagService;
	@Autowired
	private RedBagService redbagService;
	@Autowired
	private WithdrawalsService withdrawalsService;
	@Autowired
	private BusinessService businessService;
	@Autowired
	private ActivityService activityService;

	// 根据id查找登录方式
	@RequestMapping("selectByLoginWay")
	@ResponseBody
	public List<User> selectLoginWay(
			@RequestParam(value = "loginway", required = false) Integer loginway,
			@RequestParam(value = "userid", required = false) String userid) {
		List<User> lw = userService.selectLoginWay(loginway, userid);
		return lw;
	}

	// 根据电话号查询
	@RequestMapping("selectByPhone")
	@ResponseBody
	public List<User> selectUserByPhone(
			@RequestParam("userphone") String userphone) throws Exception {
		List<User> list = userService.selectByPhone(userphone);
		return list;
	}

	// 根据名称查询
	@RequestMapping("selectByName")
	@ResponseBody
	public User selectBusinessByName(@RequestParam("username") String username)
			throws Exception {
		return userService.selectByName(username);

	}

	// 查询全部
	@RequestMapping("selectByAll")
	@ResponseBody
	public List<User> selectUser() throws Exception {
		return userService.selectUser();
	}

	// 根据钱数()排序
	@RequestMapping("selectByMoney")
	@ResponseBody
	public List<User> selectByMoney(
			@RequestParam("userBalance") double userbalance) {
		return userService.selectByMoney(userbalance);

	}

	/******************************************************************************/
	// 查询用户的金币数量
	@RequestMapping("selectUserGold")
	@ResponseBody
	public List<User> selectUserGold(@RequestParam("userid") String userid) {
		List<User> list = userService.selectUserGold(userid);
		return list;
	}

	/**
	 * IFNULL(expr1,expr2)的用法： 假如expr1 不为 NULL，则 IFNULL() 的返回值为 expr1;否则其返回值为
	 * expr2。 
	 * select usergold,UserIntegral,UserBalance from (select
	 * IFNULL(SUM(goldnum),0) from gold where
	 * userid=#{userid,jdbcType=VARCHAR})gg,user where
	 * userid=#{userid,jdbcType=VARCHAR}
	 * **/
	// 用户注销
	@RequestMapping("userExit")
	@ResponseBody
	public StringToJson userExit(HttpSession session, StringToJson sj,
			String userid, Integer state) throws Exception {
		List<User> list = userService.selectByUserId(userid);
		System.out.println(list+"*************************");
		if (list != null && list.size() != 0) {
			User user = new User();
			user.setState(0);
			session.invalidate();
			sj.setCode(1);
			sj.setMessage("注销成功");
			sj.setUserid(userid);
			System.out.println(sj);
		}
		return sj;
	}

	// 用户更改密码（抛弃）
	@RequestMapping("userPassword")
	@ResponseBody
	public StringToJson userPassword(
			@RequestParam(value = "userpassword", required = false) String userpassword,
			StringToJson sj,
			@RequestParam(value = "userphone", required = false) String userphone,
			@RequestParam(value = "loginway", required = false) Integer loginway,
			@RequestParam(value = "userid", required = false) String userid)
			throws Exception {
		List<User> list = userService.selectByPhone(userphone);
		if (list != null && list.size() != 0) {
			userService.updateByPhoneNum(userpassword, userid, loginway);
			List<User> li = userService.selectUserPi(userid, userphone);
			sj.setCode(1);
			sj.setMessage("更改成功");
			sj.setUserid(li.get(0).getUserid());
			return sj;
		}
		sj.setMessage("请输入正确的手机号");
		return sj;

	}

	/*
	 * // 用户唯一性的判断
	 * 
	 * @RequestMapping("userJudge")
	 * 
	 * @ResponseBody public User userJudge(String phoneNumber) throws Exception
	 * { return userService.selectByphoneNumber(phoneNumber); }
	 */

	// 用户登录的判断
	@RequestMapping("userLogin")
	@ResponseBody
	public StringToJson userLogin(
			@RequestParam("userphone") String userphone,
			@RequestParam("userpassword") String userpassword,
			HttpServletRequest req,
			StringToJson sj,
			@RequestParam(value = "loginway", required = false) Integer loginway,
			@RequestParam(value = "userid", required = false) String userid,
			@RequestParam(value = "equipmentname", required = false) String equipmentname,
			@RequestParam(value = "state", required = false) Integer state) {

		// 对页面传回的值进行二次判断
		/*
		 * Pattern pattern = Pattern .compile(
		 * "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17([0,1,6,7,]))|(18[0-2,5-9]))\\d{8}$"
		 * ); Matcher matcher = pattern.matcher(userPhone);
		 */

		List<User> list = userService.selectByPP(userphone, userpassword);
		if (userphone == null || userpassword == null /* || !matcher.matches() */) {
			sj.setMessage("您的账号或者密码不能为空");
			return sj;
		} else {
			// 判断是否为同一天
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date nowTime = new Date();
			// 查找到用户，执行登录操作
			if (list != null && list.size() != 0) {
				List<User> id = userService.selectUserUserid(userphone, userid);
				List<User> lw = userService.selectLoginWayPhone(loginway,
						userphone);
				if ((lw.get(0).getLoginway()).equals(1)) {
					List<User> s = userService.selectStatePhone(userphone);
					int se = s.get(0).getState();
					if (se == 0) {
						sj.setCode(4);
						sj.setMessage("对不起，您的账号被封，暂不能登录，感谢您的充值，详情咨询赵小花");
					} else if (se == 1) {
						List<Equipment> et = equipmentService
								.selectByUserIdPhone(equipmentname, userphone);
						// 数组长度
						int n = et.size();
						if ((et != null && et.size() != 0)) {
							List<Equipment> ee = equipmentService
									.selectequipmentname(equipmentname,
											userphone);
							boolean eee = ee.get(0).getEquipmentname()
									.equals(equipmentname);
							boolean t = sdf.format(et.get(0).getSigntime())
									.equals(sdf.format(nowTime));
							if (t == false && eee == true) {
								equipmentService.updateByUserIdPhone(
										equipmentname, userphone);
							} else if (t == false && eee == false) {
								equipmentService.insertPhone(equipmentname,
										userphone);
								equipmentService.updateuserid(equipmentname,
										userid, userphone);
							}
						} else if (n == 0) {
							equipmentService.insertPhone(equipmentname,
									userphone);
							equipmentService.updateuserid(equipmentname,
									userid, userphone);
						}

						req.getSession().setAttribute("user", list);
						sj.setCode(1);
						sj.setMessage("登陆成功");
						sj.setUserid(id.get(0).getUserid());
						return sj;
					}
				} else if ((lw.get(0).getLoginway()).equals(2)) {

				}
			} else if (list == null || list.size() == 0) {
				sj.setMessage("请核对您的账号密码");
				return sj;
			}
		}
		return sj;
	}

	// 发送验证码
	@RequestMapping("send")
	@ResponseBody
	public static String sendSms(@RequestParam("userphone") String userphone,
			HttpServletRequest request) throws Exception {
		String vcode = "";
		for (int i = 0; i < 6; i++) {
			vcode = vcode + (int) (Math.random() * 9);
		}
		MoblieMessageUtil.sendSms(userphone, "呛呛科技", "SMS_111320136", vcode);
		HttpSession session = request.getSession();
		session.setAttribute("code", vcode);
		session.setAttribute("userphone", userphone);
		return vcode;
	}

	// 更改密码验证码
	@RequestMapping("sendtwo")
	@ResponseBody
	public static String change(@RequestParam("userphone") String userphone,
			HttpServletRequest request) throws Exception {
		String vcode = "";
		for (int i = 0; i < 6; i++) {
			vcode = vcode + (int) (Math.random() * 9);
		}
		MoblieMessageUtil2.sendSms(userphone, "呛呛科技", "SMS_111320135", vcode);
		HttpSession session = request.getSession();
		session.setAttribute("code2", vcode);
		return vcode;
	}

	// 注册
	@RequestMapping("userReg")
	@ResponseBody
	public StringToJson userReg(
			User user,
			@RequestParam("userphone") String userphone,
			@RequestParam("userpassword") String userpassword,
			HttpServletRequest req,
			StringToJson sj,
			@RequestParam(value = "loginway", required = false) Integer loginway,
			@RequestParam(value = "userid", required = false) String userid,
			@RequestParam(value = "usernickname", required = false) String usernickname,
			@RequestParam(value = "yanzheng", required = false) String yanzheng,
			@RequestParam(value = "vcode", required = false) String vcode)
			throws Exception {
		String code = (String) req.getSession().getAttribute("code");
		String phone = (String) req.getSession().getAttribute("userphone");
		List<User> list = userMapper.selectByPhone(userphone);
		if (user.getUserphone() == null || user.getUserpassword() == null
				|| (list != null && list.size() != 0)/* || !matcher.matches() */) {
			if (list != null && list.size() != 0) {
				sj.setCode(0);
				sj.setMessage("此电话号已经注册");
				sj.setUserid("0");
			} else if (userphone == null) {
				sj.setCode(0);
				sj.setMessage("请输入手机号");
				sj.setUserid("0");
			} else if (userpassword == null) {
				sj.setCode(0);
				sj.setUserid("0");
				sj.setMessage("请输入密码");
			}
		} else {
			if (yanzheng == null || yanzheng.equals("")) {
				// if (list==null&&userphone!=null&&userpassword!=null)
				sj.setCode(0);
				sj.setMessage("请输入验证码");
			} else if ((yanzheng.equals(code)) && phone == userphone) {

				// 添加用户
				userService.insertt(userid, userphone, userpassword);
				req.setAttribute("userphone", user.getUserphone());
				req.setAttribute("userpassword", user.getUserpassword());
				List<User> list2 = userMapper.selectByPhone(userphone);
				sj.setCode(1);
				sj.setMessage("注册成功");
				userService.updateUserNickname(usernickname, userphone);

				sj.setUserid(list2.get(0).getUserid());
				return sj;
			} else if (yanzheng != code || yanzheng.equals("")) {
				sj.setCode(0);
				sj.setMessage("请输入正确的验证码");
			}
		}
		return sj;
	}

	/*
	 * else if ((lw.get(0).getLoginway()).equals(2)) { sj.setCode(1);
	 * sj.setMessage("dfasdfa"); return sj; } return sj;
	 */

	// 分离之后的上半页
	@RequestMapping("see")
	@ResponseBody
	public UserSee see(
			@RequestParam(value = "usergold", required = false) Integer usergold,
			@RequestParam(value = "userintegral", required = false) Integer userintegral,
			@RequestParam(value = "userbalance", required = false) Double userbalance,
			UserSee urs,
			@RequestParam(value = "loginway", required = false) Integer loginway,
			@RequestParam(value = "userid", required = false) String userid,
			@RequestParam(value = "redbagnum", required = false) Integer redbagnum) {
		DecimalFormat df = new DecimalFormat("######0.00");
		userMapper.updatemoney(userid);
		// 查找是否有user
		List<User> list = userMapper.selectByUserId(userid);
		// 判断list是否为空
		if (list != null && list.size() != 0) {
			Integer num = usertoredbagService.selectcount(userid);
			List<Usertoredbag> redbagtype = usertoredbagService
					.selectByType(userid);
			if (redbagtype != null && redbagtype.size() != 0) {
				List<Map<String, String>> maplist = new ArrayList<Map<String, String>>();
				for (Usertoredbag et : redbagtype) {
					Map<String, String> map = new HashMap<String, String>(); // 声明一个map集合
					map.put("type", et.getRedbagtype().toString());// 将id存进map中
					map.put("num", et.getRedbagnum().toString());
					maplist.add(map);
				}
				// Integer
				// rednum=usertoredbagService.selectredbagnum(userid);
				urs.setCode(1);
				urs.setMessage("成功");
				urs.setUserbalance(df.format(list.get(0).getUserbalance())
						.toString());
				urs.setUsergold(list.get(0).getUsergold());
				urs.setUserintegral(list.get(0).getUserintegral());
				// usj.setRednum(rednum.toString());
			}
		}
		urs.setCode(1);
		urs.setMessage("成功");
		urs.setUserbalance(df.format(list.get(0).getUserbalance()).toString());
		urs.setUsergold(list.get(0).getUsergold());
		urs.setUserintegral(list.get(0).getUserintegral());
		return urs;
	}

	// 找包界面
	@RequestMapping("userCoinNumber")
	@ResponseBody
	public UserStringToJson userSelf(
			@RequestParam(value = "usergold", required = false) Integer usergold,
			@RequestParam(value = "userintegral", required = false) Integer userintegral,
			@RequestParam(value = "userbalance", required = false) Double userbalance,
			UserStringToJson usj,
			@RequestParam(value = "loginway", required = false) Integer loginway,
			@RequestParam(value = "userid", required = false) String userid,
			@RequestParam(value = "redbagnum", required = false) Integer redbagnum)
			throws ParseException {
		List<User> lw = userService.selectLoginWay(loginway, userid);
		// 查找是否有user
		List<User> list = userMapper.selectByUserId(userid);
		// 判断list是否为空
		if (list != null && list.size() != 0) {
			// 一天中得到红包的数量
			Integer num = usertoredbagService.selectcountnum(userid);
			// type==1的数量
			Integer redbagtimenum = usertoredbagService
					.selectredbagnumtime(userid);
			List<Usertoredbag> redbagtype = usertoredbagService
					.selectByType2(userid);
			if (redbagtype != null && redbagtype.size() != 0) {
				if (redbagtimenum == 0) {
					Integer numm = usertoredbagService.selectnumber(userid);
					if (numm == 1 || numm == 2 || numm == 0) {
						List<Usertoredbag> redbagtype1 = usertoredbagService
								.selectByType2(userid);
						List<Map<String, String>> maplist = new ArrayList<Map<String, String>>();
						for (Usertoredbag et : redbagtype1) {
							Map<String, String> map = new HashMap<String, String>(); // 声明一个map集合
							map.put("type", et.getRedbagtype().toString());// 将id存进map中
							map.put("redbagnum", et.getRedbagnum().toString());
							map.put("redbagid", et.getRedbagid().toString());
							maplist.add(map);
						}
						usj.setBigtime("0");
						usj.setList(maplist);
						usj.setCode(1);
						usj.setMessage("成功");
						usj.setNum(num.toString());
						usj.setRedbagtime("0");
					} else if (numm == 3) {
						List<Usertoredbag> redbagtype4 = usertoredbagService
								.selectByType2(userid);
						List<Map<String, String>> maplist4 = new ArrayList<Map<String, String>>();
						for (Usertoredbag et : redbagtype4) {
							Map<String, String> map = new HashMap<String, String>(); // 声明一个map集合
							map.put("type", et.getRedbagtype().toString());// 将id存进map中
							map.put("redbagnum", et.getRedbagnum().toString());
							map.put("redbagid", et.getRedbagid().toString());
							maplist4.add(map);
						}
						// 时间
						String nowtime = usertoredbagService.selectnowlast();
						String time = usertoredbagService
								.selectactivitytime(userid);
						String now = usertoredbagService.selectnow();
						SimpleDateFormat myFormatter = new SimpleDateFormat(
								"yyyy-MM-dd HH:mm:ss");
						java.util.Date date = myFormatter.parse(time);
						java.util.Date mydate = myFormatter.parse(nowtime);
						java.util.Date mydate2 = myFormatter.parse(now);
						long day1 = (date.getTime() - mydate2.getTime());
						long day2 = (date.getTime() - mydate.getTime());
						long day = day1 - day2;
						long subtime = day / 1000;
						usj.setBigtime(subtime + "");
						usj.setList(maplist4);
						usj.setCode(1);
						usj.setMessage("成功");
						usj.setNum(num.toString());
						usj.setRedbagtime("0");
					}
				} else if (redbagtimenum == 1) {
					// 今天得到的红包数量
					Integer numm = usertoredbagService.selectnumber(userid);
					if (numm == 1 || numm == 2 || numm == 0) {
						String redbagtime = usertoredbagService
								.selectcountdowntime(userid);
						String nowtime = usertoredbagService.selectnowlast();
						String now = usertoredbagService.selectnow();
						SimpleDateFormat myFormatter = new SimpleDateFormat(
								"yyyy-MM-dd HH:mm:ss");
						java.util.Date mydate = myFormatter.parse(nowtime);
						java.util.Date mydate2 = myFormatter.parse(now);
						java.util.Date date2 = myFormatter.parse(redbagtime);
						long day3 = (mydate2.getTime() - date2.getTime());
						long redbagsubtime = 7200 - day3 / 1000;
						if (redbagsubtime <= 0) {
							usertoredbagService.updateredbagtypeone(userid);
							List<Usertoredbag> redbagtype2 = usertoredbagService
									.selectByType2(userid);
							List<Map<String, String>> maplist2 = new ArrayList<Map<String, String>>();
							for (Usertoredbag et : redbagtype2) {
								Map<String, String> map = new HashMap<String, String>(); // 声明一个map集合
								map.put("type", et.getRedbagtype().toString());// 将id存进map中
								map.put("redbagnum", et.getRedbagnum()
										.toString());
								map.put("redbagid", et.getRedbagid().toString());
								maplist2.add(map);
							}
							usj.setBigtime("0");
							usj.setList(maplist2);
							usj.setCode(1);
							usj.setMessage("成功");
							usj.setNum(num.toString());
							usj.setBigtime("0");
							usj.setRedbagtime("0");
							return usj;
						} else if (redbagsubtime > 0) {
							List<Map<String, String>> maplist = new ArrayList<Map<String, String>>();
							for (Usertoredbag et : redbagtype) {
								Map<String, String> map = new HashMap<String, String>(); // 声明一个map集合
								map.put("type", et.getRedbagtype().toString());// 将id存进map中
								map.put("redbagnum", et.getRedbagnum()
										.toString());
								map.put("redbagid", et.getRedbagid().toString());
								maplist.add(map);
							}
							usj.setBigtime("0");
							usj.setList(maplist);
							usj.setCode(1);
							usj.setMessage("成功");
							usj.setNum(num.toString());
							usj.setBigtime("0");
							usj.setRedbagtime(redbagsubtime + "");
						}
					} else if (numm == 3) {
						String redbagtime = usertoredbagService
								.selectcountdowntime(userid);
						// 时间
						String nowtime = usertoredbagService.selectnowlast();
						String time = usertoredbagService
								.selectactivitytime(userid);
						String now = usertoredbagService.selectnow();
						SimpleDateFormat myFormatter = new SimpleDateFormat(
								"yyyy-MM-dd HH:mm:ss");
						java.util.Date date = myFormatter.parse(time);
						java.util.Date mydate = myFormatter.parse(nowtime);
						java.util.Date mydate2 = myFormatter.parse(now);
						long day1 = (date.getTime() - mydate2.getTime());
						long day2 = (date.getTime() - mydate.getTime());
						long day = day1 - day2;
						long subtime = day / 1000;
						java.util.Date date2 = myFormatter.parse(redbagtime);
						long day3 = (mydate2.getTime() - date2.getTime());
						long redbagsubtime = 7200 - day3 / 1000;
						if (redbagsubtime <= 0) {
							usertoredbagService.updateredbagtypeone(userid);
							List<Usertoredbag> redbagtype3 = usertoredbagService
									.selectByType2(userid);
							List<Map<String, String>> maplist3 = new ArrayList<Map<String, String>>();
							for (Usertoredbag et : redbagtype3) {
								Map<String, String> map = new HashMap<String, String>(); // 声明一个map集合
								map.put("type", et.getRedbagtype().toString());// 将id存进map中
								map.put("redbagnum", et.getRedbagnum()
										.toString());
								map.put("redbagid", et.getRedbagid().toString());
								maplist3.add(map);
							}
							usj.setBigtime("0");
							usj.setList(maplist3);
							usj.setCode(1);
							usj.setMessage("成功");
							usj.setNum(num.toString());
							usj.setBigtime("0");
							usj.setRedbagtime("0");
						} else if (redbagsubtime > 0) {
							List<Map<String, String>> maplist = new ArrayList<Map<String, String>>();
							for (Usertoredbag et : redbagtype) {
								Map<String, String> map = new HashMap<String, String>(); // 声明一个map集合
								map.put("type", et.getRedbagtype().toString());// 将id存进map中
								map.put("redbagnum", et.getRedbagnum()
										.toString());
								map.put("redbagid", et.getRedbagid().toString());
								maplist.add(map);
							}
							usj.setBigtime("0");
							usj.setList(maplist);
							usj.setCode(1);
							usj.setMessage("成功");
							usj.setNum(num.toString());
							usj.setBigtime(subtime + "");
							usj.setRedbagtime(redbagsubtime + "");
						}
					}

				}

			} else if (redbagtype == null || redbagtype.size() == 0) {
				List list2 = new ArrayList<>();
				usj.setCode(1);
				usj.setNum(num.toString());
				usj.setList(list2);
				usj.setMessage("成功");
				usj.setBigtime("0");
				usj.setRedbagtime("0");
			}
		}
		return usj;
	}

	// 查询用户状态码
	@RequestMapping("state")
	@ResponseBody
	public List<User> state(
			@RequestParam(value = "userid", required = false) String userid) {
		List<User> list = userService.selectState(userid);
		return list;
	}

	// 查询用户积分
	@RequestMapping("selectUserIntegral")
	@ResponseBody
	public List<User> selectUserIntegral(
			@RequestParam(value = "userid", required = false) String userid) {
		List<User> list = userService.selectUserIntegral(userid);
		return list;
	}

	// 用户扫码得到红包或者金币
	@RequestMapping("userGetRedbagOrGold")
	@ResponseBody
	public UserSaoma userSaoma(
			@RequestParam(value = "usergold", required = false) Integer usergold,
			@RequestParam(value = "userintegral", required = false) Integer userintegral,
			@RequestParam(value = "userbalance", required = false) Double userbalance,
			UserStringToJson usj,
			@RequestParam(value = "loginway", required = false) Integer loginway,
			@RequestParam(value = "userid", required = false) String userid,
			@RequestParam(value = "goldnum", required = false) Integer goldnum,
			@RequestParam(value = "judge", required = false) Integer judge,
			@RequestParam(value = "businessid", required = false) Integer businessid,
			UserSaoma us,
			@RequestParam(value = "moneytime", required = false) Date moneytime) {
		List<User> list = userService.selectByUserI(userid);
		// 扫码成功概率
		int success = 2;
		Random rm = new Random();
		int sorf = rm.nextInt(9);
		// 查询的是红包状态为0,1,2时候的数量
		Integer number = usertoredbagService.selectcount2(userid);
		// 查询金币表有没有记录
		List<Gold> g = goldService.selectById(userid);
		// 判断一天内是否得到过红包
		List<Usertoredbag> ug = usertoredbagService.selectByUserId(userid);
		if (number < 3) {
			/* if ((lw.get(0).getLoginway()).equals(1)) { */
			// 第一次扫码
			if (list.get(0).getJudge() == 0) {
				int a = goldService.insertMax(goldnum, userid);
				Integer rg = usertoredbagService.insertRedbag(userid);
				if (a == 1 && rg == 1) {
					goldService.updateUserGold(goldnum, userid);
					// 查询最后一次添加金币的数量
					List<Gold> f = goldService.selectUserLastGold(userid);
					List<Usertoredbag> u = usertoredbagService.selectByLastR(
							businessid, userid);
					us.setCode(1);
					us.setGoldnum(f.get(0).getGoldnum());
					us.setMessage("成功+第一次扫码");
					us.setRedbagnum(1);
					us.setRedbagid(1);
					us.setRedBagState(0);
					userService.updateJudge(judge, userid);
				}
			} else if (list.get(0).getJudge() == 1) {
				// 判断是否有数据
				if (ug != null && ug.size() != 0 && g != null && g.size() != 0) {
					// 查看一天得到的红包数量
					List<Usertoredbag> a = usertoredbagService
							.selectCount(userid);
					int count = a.size();
					if (count < 3) {
						if (sorf <= success) {
							/* if(redbagnum==null){ */
							List<Usertoredbag> num1 = usertoredbagService
									.selectredbagnum1(userid);
							List<Usertoredbag> num2 = usertoredbagService
									.selectredbagnum3(userid);
							List<Usertoredbag> num3 = usertoredbagService
									.selectredbagnum4(userid);
							// 判断是否有id
							List<Usertoredbag> id1 = usertoredbagService
									.selectredbagid1(userid);
							List<Usertoredbag> id2 = usertoredbagService
									.selectredbagid2(userid);
							List<Usertoredbag> id3 = usertoredbagService
									.selectredbagid3(userid);
							// num==1
							if (((num1 == null || num1.size() == 0)
									&& (num2 != null && num2.size() != 0) && (num3 != null && num3
									.size() != 0))
									|| ((num1 == null || num1.size() == 0)
											&& (num2 != null && num2.size() != 0) && (num3 == null || num3
											.size() == 0))
									|| ((num1 == null || num1.size() == 0)
											&& (num2 == null || num2.size() == 0) && (num3 != null && num3
											.size() != 0))
									|| ((num1 == null || num1.size() == 0)
											&& (num2 == null || num2.size() == 0) && (num3 == null || num3
											.size() == 0))) {
								Integer rg = usertoredbagService
										.insertRedbag(userid);
								if (((id1 == null || id1.size() == 0)
										&& (id2 == null || id2.size() == 0) && (id3 == null || id3
										.size() == 0))
										|| ((id1 == null || id1.size() == 0)
												&& (id2 != null && id2.size() != 0) && (id3 == null || id3
												.size() == 0))
										|| ((id1 == null || id1.size() == 0)
												&& (id2 == null || id2.size() == 0) && (id3 != null && id3
												.size() != 0))
										|| ((id1 == null || id1.size() == 0)
												&& (id2 != null && id2.size() != 0) && (id3 != null && id3
												.size() != 0))) {
									usertoredbagService.updateredbagid1(userid);
								} else if (((id1 != null && id1.size() != 0)
										&& (id2 == null || id2.size() == 0) && (id3 == null || id3
										.size() == 0))
										|| ((id1 != null && id1.size() != 0)
												&& (id2 == null || id2.size() == 0) && (id3 != null && id3
												.size() != 0))) {
									usertoredbagService.updateredbagid2(userid);
								} else if ((id1 != null && id1.size() != 0)
										&& (id2 != null && id2.size() != 0)
										&& (id3 == null || id3.size() == 0)) {
									usertoredbagService.updateredbagid3(userid);
								}
							}
							// num==2
							else if (((num1 != null && num1.size() != 0)
									&& (num2 == null || num2.size() == 0) && (num3 != null && num3
									.size() != 0))
									|| ((num1 != null && num1.size() != 0)
											&& (num2 == null || num2.size() == 0) && (num3 == null || num3
											.size() == 0))) {
								usertoredbagService.insertRedbag2(userid);

								if (((id1 == null || id1.size() == 0)
										&& (id2 == null || id2.size() == 0) && (id3 == null || id3
										.size() == 0))
										|| ((id1 == null || id1.size() == 0)
												&& (id2 != null && id2.size() != 0) && (id3 == null || id3
												.size() == 0))
										|| ((id1 == null || id1.size() == 0)
												&& (id2 == null || id2.size() == 0) && (id3 != null && id3
												.size() != 0))
										|| ((id1 == null || id1.size() == 0)
												&& (id2 != null && id2.size() != 0) && (id3 != null && id3
												.size() != 0))) {
									usertoredbagService.updateredbagid1(userid);
								} else if (((id1 != null && id1.size() != 0)
										&& (id2 == null || id2.size() == 0) && (id3 == null || id3
										.size() == 0))
										|| ((id1 != null && id1.size() != 0)
												&& (id2 == null || id2.size() == 0) && (id3 != null && id3
												.size() != 0))) {
									usertoredbagService.updateredbagid2(userid);
								} else if ((id1 != null && id1.size() != 0)
										&& (id2 != null && id2.size() != 0)
										&& (id3 == null || id3.size() == 0)) {
									usertoredbagService.updateredbagid3(userid);
								}
							}
							// num==3
							else if ((num1 != null && num1.size() != 0)
									&& (num2 != null && num2.size() != 0)
									&& (num3 == null || num3.size() == 0)) {
								usertoredbagService.insertRedbag3(userid);
								if (((id1 == null || id1.size() == 0)
										&& (id2 == null || id2.size() == 0) && (id3 == null || id3
										.size() == 0))
										|| ((id1 == null || id1.size() == 0)
												&& (id2 != null && id2.size() != 0) && (id3 == null || id3
												.size() == 0))
										|| ((id1 == null || id1.size() == 0)
												&& (id2 == null || id2.size() == 0) && (id3 != null && id3
												.size() != 0))
										|| ((id1 == null || id1.size() == 0)
												&& (id2 != null && id2.size() != 0) && (id3 != null && id3
												.size() != 0))) {
									usertoredbagService.updateredbagid1(userid);
								} else if (((id1 != null && id1.size() != 0)
										&& (id2 == null || id2.size() == 0) && (id3 == null || id3
										.size() == 0))
										|| ((id1 != null && id1.size() != 0)
												&& (id2 == null || id2.size() == 0) && (id3 != null && id3
												.size() != 0))) {
									usertoredbagService.updateredbagid2(userid);
								} else if ((id1 != null && id1.size() != 0)
										&& (id2 != null && id2.size() != 0)
										&& (id3 == null || id3.size() == 0)) {
									usertoredbagService.updateredbagid3(userid);
								}
							}
							int b = goldService.insertMin(goldnum, userid);
							goldService.updateUserGold(goldnum, userid);
							// 得到红包
							Integer redbagnum = usertoredbagService
									.selectredbagnum(moneytime, userid);
							// 查询最后一次添加金币的数量
							List<Gold> f = goldService
									.selectUserLastGold(userid);
							List<Usertoredbag> u = usertoredbagService
									.selectByLastR(businessid, userid);
							Integer redbagid = usertoredbagService
									.selectredbagid(userid);
							us.setCode(1);
							us.setRedbagnum(redbagnum);
							us.setRedBagState(0);
							us.setRedbagid(redbagid);
							us.setGoldnum(f.get(0).getGoldnum());
							us.setMessage("成功+已经不是第一次扫");
						} else if (sorf > success) {
							goldService.insertMin(goldnum, userid);
							goldService.updateUserGold(goldnum, userid);
							// 查询最后一次添加金币的数量
							List<Gold> f = goldService
									.selectUserLastGold(userid);
							us.setCode(0);
							us.setGoldnum(f.get(0).getGoldnum());
							us.setRedBagState(0);
							us.setRedbagid(0);
							us.setRedbagnum(0);
							us.setMessage("扫码失败");
						}
					} else if (count >= 3) {

						int b = goldService.insertMin(goldnum, userid);
						goldService.updateUserGold(goldnum, userid);
						// 查询最后一次添加金币的数量
						List<Gold> f = goldService.selectUserLastGold(userid);
						us.setCode(1);
						us.setGoldnum(f.get(0).getGoldnum());
						us.setRedBagState(1);
						us.setRedbagid(0);
						us.setMessage("成功+已达到最大红包数量");

						/*
						 * //int c = goldService.insertMin(goldnum, userid);
						 * goldService.updateUserGold(goldnum, userid); //
						 * 查询最后一次添加金币的数量 List<Gold> f =
						 * goldService.selectUserLastGold(userid);
						 * us.setCode(1); us.setGoldnum(f.get(0).getGoldnum());
						 * us.setRedBagState(1); us.setRedbagid(0);
						 * us.setMessage("已达到最大红包数量");
						 */
					}

				} else if ((ug == null || ug.size() == 0)
						|| (g == null || g.size() == 0)) {
					List<Usertoredbag> num1 = usertoredbagService
							.selectredbagnum1(userid);
					List<Usertoredbag> num2 = usertoredbagService
							.selectredbagnum3(userid);
					List<Usertoredbag> num3 = usertoredbagService
							.selectredbagnum4(userid);
					// 判断是否有id
					List<Usertoredbag> id1 = usertoredbagService
							.selectredbagid1(userid);
					List<Usertoredbag> id2 = usertoredbagService
							.selectredbagid2(userid);
					List<Usertoredbag> id3 = usertoredbagService
							.selectredbagid3(userid);
					if (((num1 == null || num1.size() == 0)
							&& (num2 != null && num2.size() != 0) && (num3 != null && num3
							.size() != 0))
							|| ((num1 == null || num1.size() == 0)
									&& (num2 != null && num2.size() != 0) && (num3 == null || num3
									.size() == 0))
							|| ((num1 == null || num1.size() == 0)
									&& (num2 == null || num2.size() == 0) && (num3 != null && num3
									.size() != 0))
							|| ((num1 == null || num1.size() == 0)
									&& (num2 == null || num2.size() == 0) && (num3 == null || num3
									.size() == 0))) {
						Integer rg = usertoredbagService.insertRedbag(userid);

						if (((id1 == null || id1.size() == 0)
								&& (id2 == null || id2.size() == 0) && (id3 == null || id3
								.size() == 0))
								|| ((id1 == null || id1.size() == 0)
										&& (id2 != null && id2.size() != 0) && (id3 == null || id3
										.size() == 0))
								|| ((id1 == null || id1.size() == 0)
										&& (id2 == null || id2.size() == 0) && (id3 != null && id3
										.size() != 0))
								|| ((id1 == null || id1.size() == 0)
										&& (id2 != null && id2.size() != 0) && (id3 != null && id3
										.size() != 0))) {
							usertoredbagService.updateredbagid1(userid);
						} else if (((id1 != null && id1.size() != 0)
								&& (id2 == null || id2.size() == 0) && (id3 == null || id3
								.size() == 0))
								|| ((id1 != null && id1.size() != 0)
										&& (id2 == null || id2.size() == 0) && (id3 != null && id3
										.size() != 0))) {
							usertoredbagService.updateredbagid2(userid);
						} else if ((id1 != null && id1.size() != 0)
								&& (id2 != null && id2.size() != 0)
								&& (id3 == null || id3.size() == 0)) {
							usertoredbagService.updateredbagid3(userid);
						}
					} else if (((num1 != null && num1.size() != 0)
							&& (num2 == null || num2.size() == 0) && (num3 != null && num3
							.size() != 0))
							|| ((num1 != null && num1.size() != 0)
									&& (num2 == null || num2.size() == 0) && (num3 == null || num3
									.size() == 0))) {
						usertoredbagService.insertRedbag2(userid);
						if (((id1 == null || id1.size() == 0)
								&& (id2 == null || id2.size() == 0) && (id3 == null || id3
								.size() == 0))
								|| ((id1 == null || id1.size() == 0)
										&& (id2 != null && id2.size() != 0) && (id3 == null || id3
										.size() == 0))
								|| ((id1 == null || id1.size() == 0)
										&& (id2 == null || id2.size() == 0) && (id3 != null && id3
										.size() != 0))
								|| ((id1 == null || id1.size() == 0)
										&& (id2 != null && id2.size() != 0) && (id3 != null && id3
										.size() != 0))) {
							usertoredbagService.updateredbagid1(userid);
						} else if (((id1 != null && id1.size() != 0)
								&& (id2 == null || id2.size() == 0) && (id3 == null || id3
								.size() == 0))
								|| ((id1 != null && id1.size() != 0)
										&& (id2 == null || id2.size() == 0) && (id3 != null && id3
										.size() != 0))) {
							usertoredbagService.updateredbagid2(userid);
						} else if ((id1 != null && id1.size() != 0)
								&& (id2 != null && id2.size() != 0)
								&& (id3 == null || id3.size() == 0)) {
							usertoredbagService.updateredbagid3(userid);
						}

					} else if ((num1 != null && num1.size() != 0)
							&& (num2 != null && num2.size() != 0)
							&& (num3 == null || num3.size() == 0)) {
						usertoredbagService.insertRedbag3(userid);
						if (((id1 == null || id1.size() == 0)
								&& (id2 == null || id2.size() == 0) && (id3 == null || id3
								.size() == 0))
								|| ((id1 == null || id1.size() == 0)
										&& (id2 != null && id2.size() != 0) && (id3 == null || id3
										.size() == 0))
								|| ((id1 == null || id1.size() == 0)
										&& (id2 == null || id2.size() == 0) && (id3 != null && id3
										.size() != 0))
								|| ((id1 == null || id1.size() == 0)
										&& (id2 != null && id2.size() != 0) && (id3 != null && id3
										.size() != 0))) {
							usertoredbagService.updateredbagid1(userid);
						} else if (((id1 != null && id1.size() != 0)
								&& (id2 == null || id2.size() == 0) && (id3 == null || id3
								.size() == 0))
								|| ((id1 != null && id1.size() != 0)
										&& (id2 == null || id2.size() == 0) && (id3 != null && id3
										.size() != 0))) {
							usertoredbagService.updateredbagid2(userid);
						} else if ((id1 != null && id1.size() != 0)
								&& (id2 != null && id2.size() != 0)
								&& (id3 == null || id3.size() == 0)) {
							usertoredbagService.updateredbagid3(userid);
						}

					}
					int b = goldService.insertMin(goldnum, userid);
					Integer redbagnum = usertoredbagService.selectredbagnum(
							moneytime, userid);
					goldService.updateUserGold(goldnum, userid);
					// 查询最后一次添加的红包的redbagid
					Integer redbagid = usertoredbagService
							.selectredbagid(userid);
					// 查询最后一次添加金币的数量
					List<Gold> f = goldService.selectUserLastGold(userid);
					List<Usertoredbag> u = usertoredbagService.selectByLastR(
							businessid, userid);
					us.setCode(1);
					us.setRedbagnum(redbagnum);
					us.setGoldnum(f.get(0).getGoldnum());
					us.setRedbagid(redbagid);
					us.setRedBagState(0);
					us.setMessage("成功");
				}
			}
		} else if (number == 3) {
			us.setCode(1);
			us.setRedBagState(1);
			us.setRedbagnum(0);
			us.setGoldnum(0);
			us.setRedbagid(0);
			us.setMessage("请先打开红包");
		}
		return us;
	}

	/**
	 * 用户打开红包
	 */
	@RequestMapping("userUseRedbag")
	@ResponseBody
	public Rg userUseRedbag(
			@RequestParam(value = "usergold", required = false) Integer usergold,
			@RequestParam(value = "userintegral", required = false) Integer userintegral,
			@RequestParam(value = "userbalance", required = false) Double userbalance,
			UserStringToJson usj,
			@RequestParam(value = "loginway", required = false) Integer loginway,
			@RequestParam(value = "userid", required = false) String userid,
			@RequestParam(value = "goldnum", required = false) Integer goldnum,
			@RequestParam(value = "redbagjudge", required = false) Integer redbagjudge,
			@RequestParam(value = "businessid", required = false) Integer businessid,
			UserSaoma us,
			@RequestParam(value = "redbagmoney", required = false) Double redbagmoney,
			@RequestParam(value = "redbagbusiness", required = false) String redbagbusiness,
			Rg rg,
			@RequestParam(value = "redbagtime", required = false) Date redbagtime,
			@RequestParam(value = "maxmoney", required = false) Double maxmoney,
			@RequestParam(value = "rownum", required = false) Integer rownum,
			@RequestParam(value = "money", required = false) Double money,
			@RequestParam(value = "id", required = false) Integer id,
			@RequestParam(value = "redbagtype", required = false) Integer redbagtype,
			@RequestParam(value = "redbagnum", required = false) Integer redbagnum) {
		DecimalFormat df = new DecimalFormat("######0.00");

		Integer type = usertoredbagService.selecttype(userid, redbagnum);
		if (type == 2) {
			// 查询商家数量
			Integer bnum = businessService.selectbusinesscount();
			int count = 2;
			Random rm = new Random();
			int c = (int) (Math.random() * 10);
			Integer rlist = usertoredbagService.selectUserIdJudge(userid);
			// 第一次开红包
			if (rlist == 0) {
				usertoredbagService.selectByredbagType(redbagnum, userid);
				redbagService.insertMax(redbagnum, redbagmoney, userid,
						businessid);
				userService.updateRedbag(userbalance, userid);
				// 查询商家
				List<String> name = redbagService.selectBusinessName(userid);
				// 查询商家网址
				List<String> web = redbagService.selectBusinessweb(userid);
				List<String> picture = redbagService
						.selectBusinessPiture(userid);
				List<String> introduce = redbagService
						.selectbusinessintroduce(userid);
				// userService.updateMaxIn(userintegral, userid);
				// 查找businessname
				// List<Redbag>rbg=redbagService.selectBusinessName(redbagbusiness,userid);
				// userService.updateRedbag(userbalance,userid);
				List<Redbag> last = redbagService
						.selectLast(userid, redbagtime);
				// 更改用户状态
				usertoredbagService.updateJudge(redbagjudge, userid);
				usertoredbagService.updatetype(redbagtype, userid, redbagnum);
				// 从商家金币减出去
				redbagService.updatebusinessmoney(userid);
				rg.setCode(1);
				rg.setMessage("恭喜恭喜得到大红包");
				rg.setBusinessname(name.get(0));
				rg.setWeb(web.get(0));
				rg.setRedbagnum(redbagnum.toString());
				rg.setPicture(picture.get(0));
				rg.setBusinessintroduce(introduce.get(0));
				rg.setRedbagmoney(df.format(last.get(0).getRedbagmoney()));
				// rg.setIntegral(20);
				return rg;
			} // 不是第一次开红包
			else if (rlist == 1) {
				/* if (c > count) { */
				// userService.updateMinin(userintegral, userid);
				redbagService.insertMin(redbagnum, redbagmoney, userid,
						businessid);
				// 查找businessname
				// List<Redbag>rr =
				// redbagService.selectBusinessName(redbagbusiness,userid);
				userService.updateRedbag(userbalance, userid);
				List<Redbag> last = redbagService
						.selectLast(userid, redbagtime);
				// 查询商家
				List<String> name = redbagService.selectBusinessName(userid);
				// 查询商家网址
				List<String> web = redbagService.selectBusinessweb(userid);
				List<String> picture = redbagService
						.selectBusinessPiture(userid);
				List<String> introduce = redbagService
						.selectbusinessintroduce(userid);
				// 从商家金币减出去
				redbagService.updatebusinessmoney(userid);
				usertoredbagService.updatetype(redbagtype, userid, redbagnum);
				rg.setCode(1);
				rg.setMessage("恭喜恭喜得到小红包");
				rg.setBusinessname(name.get(0));
				rg.setPicture(picture.get(0));
				rg.setRedbagnum(redbagnum.toString());
				rg.setBusinessintroduce(introduce.get(0));
				rg.setWeb(web.get(0));
				rg.setRedbagmoney(df.format(last.get(0).getRedbagmoney()));
				// rg.setIntegral(1);
			}
		}
		/* } */
		return rg;
	}

	// 我的界面
	@RequestMapping("mine")
	@ResponseBody
	public Mine mine(
			@RequestParam(value = "usergold", required = false) Integer usergold,
			@RequestParam(value = "userintegral", required = false) Integer userintegral,
			@RequestParam(value = "userbalance", required = false) Double userbalance,
			UserStringToJson usj,
			@RequestParam(value = "loginway", required = false) Integer loginway,
			@RequestParam(value = "userid", required = false) String userid,
			@RequestParam(value = "goldnum", required = false) Integer goldnum,
			@RequestParam(value = "judge", required = false) Integer judge,
			@RequestParam(value = "businessid", required = false) Integer businessid,
			UserSaoma us,
			@RequestParam(value = "redbagmoney", required = false) Double redbagmoney,
			@RequestParam(value = "redbagbusiness", required = false) String redbagbusiness,
			Rg rg,
			@RequestParam(value = "redbagtime", required = false) Date redbagtime,
			Mine m,
			@RequestParam(value = "userpicture", required = false) String userpicture,
			@RequestParam(value = "withdrawalsmoney", required = false) Double withdrawalsmoney,
			@RequestParam(value = "userwithdrawalsmoney", required = false) Double userwithdrawalsmoney,
			@RequestParam(value = "usernickname", required = false) String usernickname) {
		DecimalFormat df = new DecimalFormat("######0.00");
		List<Withdrawals> list = withdrawalsService.selectByUserId(userid);
		List<Redbag> list2 = redbagService.selectByUserId(userid);
		if (list != null && list.size() != 0 && list2 != null
				&& list2.size() != 0) {
			// 总收入
			Double ur = redbagService.selectSumMoney(redbagmoney, userid);
			// 头像
			List<User> up = userService.selectUserPicture(userpicture, userid);
			// 提现总额
			Double withmoney = withdrawalsService.selectwithmoney(
					withdrawalsmoney, userid);
			List<User> nn = userService
					.selectusernickname(usernickname, userid);
			if (withmoney != 0.00 && ur != 0.00) {
				m.setSummoney(df.format(ur));
				;
				m.setCode(1);
				m.setUserpicture(up.get(0).getUserpicture());
				m.setWithdrawalsmoney(df.format(withmoney));
				m.setUsernickname(nn.get(0).getUsernickname());
				m.setMessage("OK");
			} else if (withmoney == 0.00 && ur != 0.00) {
				m.setSummoney(df.format(ur));
				m.setCode(1);
				m.setUserpicture(up.get(0).getUserpicture());
				m.setWithdrawalsmoney("0.00");
				m.setUsernickname(nn.get(0).getUsernickname());
				m.setMessage("您没有提现");
			} else if (withmoney == 0.00 && ur == 0.00) {
				m.setSummoney("0.00");
				m.setCode(1);
				m.setUserpicture(up.get(0).getUserpicture());
				m.setWithdrawalsmoney("0.00");
				m.setUsernickname(nn.get(0).getUsernickname());
				m.setMessage("您没有钱");
			}
		} else if (list2 == null || list2.size() == 0) {
			// 总收入
			Double ur = redbagService.selectSumMoney(redbagmoney, userid);
			// 头像
			List<User> up = userService.selectUserPicture(userpicture, userid);
			// 提现总额
			Double withmoney = withdrawalsService.selectwithmoney(
					withdrawalsmoney, userid);
			List<User> nn = userService
					.selectusernickname(usernickname, userid);
			m.setSummoney("0.00");
			m.setCode(1);
			m.setUserpicture(up.get(0).getUserpicture());
			m.setWithdrawalsmoney("0.00");
			m.setUsernickname(nn.get(0).getUsernickname());
			m.setMessage("您没有现金");
		} else if (list == null || list.size() == 0) {
			// 总收入
			Double ur = redbagService.selectSumMoney(redbagmoney, userid);
			// 头像
			List<User> up = userService.selectUserPicture(userpicture, userid);
			// 提现总额
			Double withmoney = withdrawalsService.selectwithmoney(
					withdrawalsmoney, userid);
			List<User> nn = userService
					.selectusernickname(usernickname, userid);
			m.setSummoney(df.format(ur));
			m.setCode(1);
			m.setUserpicture(up.get(0).getUserpicture());
			m.setWithdrawalsmoney("0.00");
			m.setUsernickname(nn.get(0).getUsernickname());
			m.setMessage("您没有提现");
		}

		return m;
	}

	// 提现明细记录
	@RequestMapping("with")
	@ResponseBody
	public Tixian with(
			@RequestParam(value = "usergold", required = false) Integer usergold,
			@RequestParam(value = "userintegral", required = false) Integer userintegral,
			@RequestParam(value = "userbalance", required = false) Double userbalance,
			UserStringToJson usj,
			@RequestParam(value = "loginway", required = false) Integer loginway,
			@RequestParam(value = "userid", required = false) String userid,
			@RequestParam(value = "goldnum", required = false) Integer goldnum,
			@RequestParam(value = "judge", required = false) Integer judge,
			@RequestParam(value = "businessid", required = false) Integer businessid,
			UserSaoma us,
			@RequestParam(value = "redbagmoney", required = false) Double redbagmoney,
			@RequestParam(value = "redbagbusiness", required = false) String redbagbusiness,
			Rg rg,
			@RequestParam(value = "redbagtime", required = false) Date redbagtime,
			Mine m,
			@RequestParam(value = "userpicture", required = false) String userpicture,
			@RequestParam(value = "withdrawalsmoney", required = false) Double withdrawalsmoney,
			@RequestParam(value = "userwithdrawalsmoney", required = false) Double userwithdrawalsmoney,
			Tixian tx) {
		DecimalFormat df = new DecimalFormat("######0.00");
		List<Withdrawals> list = withdrawalsService.selectjilu(
				userwithdrawalsmoney, userid);
		if (list == null || list.size() == 0) {
			List list2 = new ArrayList<>();
			tx.setCode(1);
			tx.setMessage("您没有提现过");
			tx.setList(list2);
		} else if (list != null && list.size() != 0) {
			SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日 HH:mm:ss");
			List<Map<String, String>> maplist = new ArrayList<Map<String, String>>();
			for (Withdrawals et : list) {
				Map<String, String> map = new HashMap<String, String>(); // 声明一个map集合
				map.put("money", df.format(et.getWithdrawalsmoney()));// 将money存进map中
				map.put("time", sdf.format(et.getWithdrawalstime())); // 将time存进map中
				map.put("name", et.getWithdrawalsschannelname());
				map.put("picture", et.getWaypicture());
				maplist.add(map);
			}
			tx.setCode(1);
			tx.setList(maplist);
			tx.setMessage("详情");
		}
		return tx;
	}

	// 点进去
	@RequestMapping("mybag")
	@ResponseBody
	public Mybag mybag(
			@RequestParam(value = "userid", required = false) String userid,
			Mybag mg,
			@RequestParam(value = "withdrawalsmoney", required = false) Double withdrawalsmoney,
			@RequestParam(value = "userwithdrawalsmoney", required = false) Double userwithdrawalsmoney,
			@RequestParam(value = "withdrawalstime", required = false) Date withdrawalstime) {
		DecimalFormat df = new DecimalFormat("######0.00");
		// 查询最后一次的提现金额
		// List<Withdrawals>list=withdrawalsService.selectByTime(withdrawalstime,userid);
		List<Withdrawals> list = withdrawalsService.selectByUserId(userid);
		if (list != null && list.size() != 0) {
			// 提现总额
			/** 需要用总额-提现总额 */
			Double with = withdrawalsService.selectwithm(userid);
			mg.setCode(1);
			mg.setMessage("查询成功");
			mg.setUserwithdrawalsmoney(df.format(with));
			return mg;
		}
		Double with = withdrawalsService.selectwithm(userid);
		mg.setCode(1);
		mg.setMessage("查询成功");
		mg.setUserwithdrawalsmoney(df.format(with));
		return mg;

	}

	// 收入记录
	@RequestMapping("redbagRecord")
	@ResponseBody
	public RedbagRecord redbagRecord(
			@RequestParam(value = "userid", required = false) String userid,
			RedbagRecord rd,
			@RequestParam(value = "withdrawalsmoney", required = false) Double withdrawalsmoney,
			@RequestParam(value = "userwithdrawalsmoney", required = false) Double userwithdrawalsmoney,
			@RequestParam(value = "withdrawalstime", required = false) Date withdrawalstime) {

		// 查询最后一次的提现金额
		List<Withdrawals> list = withdrawalsService.selectByTime(
				withdrawalstime, userid);
		List<Redbag> rg = redbagService.selectByUserId(userid);
		return rd;
	}

	// 更改昵称
	@RequestMapping("updatenickname")
	@ResponseBody
	public Nickname updatenickname(
			@RequestParam(value = "usernickname", required = false) String usernickname,
			@RequestParam(value = "userid", required = false) String userid,
			Nickname nk) {
		List<User> list = userService.selectusernickname(usernickname, userid);
		if (list != null && list.size() != 0) {
			Integer other = userService.selectOthernickname(usernickname,
					userid);
			if (other == 0) {
				if (usernickname.equals("")) {
					nk.setCode(0);
					nk.setMessage("请输入昵称");
					nk.setNickname("");
					return nk;
				} else {
					userService.updatenickname(usernickname, userid);
					nk.setCode(1);
					nk.setMessage("更改成功");
					List<String> nickname = userService.selectnickname(
							usernickname, userid);
					nk.setNickname(nickname.get(0));
					return nk;
				}
			} else if (other == 1) {
				nk.setCode(0);
				nk.setMessage("昵称已经存在");
				nk.setNickname("");
				return nk;
			}
		} else if (list == null || list.equals(" ")) {
			nk.setCode(0);
			nk.setMessage("请输入昵称");
			return nk;
		}
		return nk;
	}

	// 人品排行
	@RequestMapping("selectByMaxMoney")
	@ResponseBody
	public Paihang selectByMaxMoney(
			@RequestParam(value = "userid", required = false) String userid,
			Paihang ph,
			@RequestParam(value = "usernickname", required = false) String usernickname,
			@RequestParam(value = "maxmoney", required = false) Double maxmoney,
			@RequestParam(value = "rownum", required = false) Integer rownum) {
		// 查询最大值个人排行有没有
		List<User> list = userService.selectByMaxMoney(rownum, usernickname,
				userid, maxmoney);
		List<String> rownumm = usertoredbagService.selectmaxrownum(userid);
		List<String> nickname = usertoredbagService.selectmaxusernickname(
				usernickname, userid);
		List<String> money = usertoredbagService.selectmaxmoney();
		List<String> listone = usertoredbagService.selectBymaxMoneyone(userid);
		Integer rownumone = usertoredbagService.selectMAXrownumone(userid);
		if (list.size() != 0 && list != null) {
			if (listone != null && listone.size() != 0) {
				if (rownumone <= 500) {
					List<Map<String, String>> maplist = new ArrayList<Map<String, String>>();
					for (int i = 0; i < list.size(); i++) {
						Map<String, String> map = new HashMap<String, String>();
						map.put("rownum", rownumm.get(i));
						map.put("nickname", nickname.get(i));
						map.put("money", money.get(i));
						maplist.add(map);

						ph.setCode(1);
						ph.setList(maplist);
						ph.setRow(rownumone.toString());
						ph.setMessage("成功查询");
					}
				} else if (rownumone > 500) {
					List<Map<String, String>> maplist = new ArrayList<Map<String, String>>();
					for (int i = 0; i < list.size(); i++) {
						Map<String, String> map = new HashMap<String, String>();
						map.put("rownum", rownumm.get(i));
						map.put("nickname", nickname.get(i));
						map.put("money", money.get(i));
						maplist.add(map);

						ph.setCode(1);
						ph.setList(maplist);
						ph.setRow("您当前排名在500名之后");
						ph.setMessage("成功查询");
					}
				}
			} else if (listone == null || listone.size() == 0) {

				Integer last = usertoredbagService.selectmaxlastrownum(userid);

				List<Map<String, String>> maplist = new ArrayList<Map<String, String>>();
				for (int i = 0; i < list.size(); i++) {
					Map<String, String> map = new HashMap<String, String>();
					map.put("rownum", rownumm.get(i));
					map.put("nickname", nickname.get(i));
					map.put("money", money.get(i));
					maplist.add(map);
				}
				ph.setCode(1);
				ph.setList(maplist);
				ph.setRow(last.toString());
				ph.setMessage("成功查询");
			}
		}
		return ph;
	}

	// 总额度排行
	@RequestMapping("selectByTotalMoney")
	@ResponseBody
	public Paihang2 selectByTotalMoney(
			@RequestParam(value = "userid", required = false) String userid,
			Paihang2 ph,
			@RequestParam(value = "usernickname", required = false) String usernickname,
			@RequestParam(value = "maxmoney", required = false) Double maxmoney,
			@RequestParam(value = "totalrownum", required = false) Integer totalrownum,
			@RequestParam(value = "totalmoney", required = false) Double totalmoney)
			throws UnsupportedEncodingException {
		// 查询前20最大值总排行
		List<String> list = usertoredbagService.selectByTotalMoney(totalrownum,
				usernickname, userid, totalmoney);
		List<String> rownum = usertoredbagService.selectrownum(totalrownum,
				userid);
		List<String> nickname = usertoredbagService.selectusernickname(
				usernickname, userid);
		List<String> money = usertoredbagService.selectmoney();
		List<String> listone = usertoredbagService
				.selectByTotalMoneyone(userid);
		Integer rownumone = usertoredbagService.selectrownumone(userid);
		// 如果0-20不为空
		if (list != null && list.size() != 0) {
			if (listone != null && listone.size() != 0) {
				if (rownumone <= 500) {
					List<Map<String, String>> maplist = new ArrayList<Map<String, String>>();
					for (int i = 0; i < list.size(); i++) {
						Map<String, String> map = new HashMap<String, String>();
						map.put("rownum", rownum.get(i));
						map.put("nickname", nickname.get(i));
						map.put("money", money.get(i));
						maplist.add(map);
						ph.setCode(1);
						ph.setList(maplist);
						ph.setMessage("成功查询");
					}
				} else if (rownumone > 500) {
					List<Map<String, String>> maplist = new ArrayList<Map<String, String>>();
					for (int i = 0; i < list.size(); i++) {
						Map<String, String> map = new HashMap<String, String>();
						map.put("rownum", rownum.get(i));
						map.put("nickname", nickname.get(i));
						map.put("money", money.get(i));
						maplist.add(map);

						ph.setCode(1);
						ph.setList(maplist);
						ph.setMessage("成功查询");
					}
				}
			} else if (listone == null || listone.size() == 0) {
				Integer last = usertoredbagService.selectlastrownum(userid);
				List<Map<String, String>> maplist = new ArrayList<Map<String, String>>();
				for (int i = 0; i < list.size(); i++) {
					Map<String, String> map = new HashMap<String, String>();
					map.put("rownum", rownum.get(i));
					map.put("nickname", nickname.get(i));
					map.put("money", money.get(i));
					maplist.add(map);
				}
				ph.setCode(1);
				ph.setList(maplist);
				ph.setMessage("成功查询");
			}
		}
		return ph;
	}

	// 设备安全
	@RequestMapping("changesecurity")
	@ResponseBody
	public Original selectByTotalMoney(
			@RequestParam(value = "userid", required = false) String userid,
			Original ol,
			@RequestParam(value = "security", required = false) String security,
			@RequestParam(value = "equipmentname", required = false) String equipmentname,
			@RequestParam(value = "signtime", required = false) Date signtime) {
		// 查询用户状态
		String offOrOn = userService.selectSecurity(userid, security);
		if (offOrOn.equals("1")) {
			userService.changesecurityOff(userid, security);
			ol.setCode(1);
			ol.setSecurity("0");
			ol.setMessage("更改为关闭");
		} else if (offOrOn.equals("0")) {
			userService.changesecurityOn(userid, security);
			ol.setCode(1);
			ol.setSecurity("1");
			ol.setMessage("更改为打开");
		}
		return ol;
	}

	// 设备安全进去页面
	@RequestMapping("selectsecurity")
	@ResponseBody
	public Security selectBySecurity(
			@RequestParam(value = "userid", required = false) String userid,
			Original ol,
			@RequestParam(value = "security", required = false) String security,
			@RequestParam(value = "equipmentname", required = false) String equipmentname,
			@RequestParam(value = "signtime", required = false) Date signtime,
			Security sy) {
		// 查询用户状态
		String offOrOn = userService.selectSecurity(userid, security);
		if (offOrOn.equals("1")) {
			// 查询登录设备
			List<Equipment> nameandtime = equipmentService
					.selectequipmentnameandtime(signtime, equipmentname, userid);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss");
			List<Map<String, String>> maplist = new ArrayList<Map<String, String>>();
			for (Equipment et : nameandtime) {
				Map<String, String> map = new HashMap<String, String>(); // 声明一个map集合
				map.put("name", et.getEquipmentname());// 将name存进map中
				map.put("time", sdf.format(et.getSigntime())); // 将time存进map中
				maplist.add(map);
			}
			sy.setList(maplist);
			sy.setCode(1);
			sy.setSecurity(offOrOn);
			sy.setMessage("此时是打开的");
		} else if (offOrOn.equals("0")) {
			// 查询登录设备
			List<Equipment> nameandtime = equipmentService
					.selectequipmentnameandtime(signtime, equipmentname, userid);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss");
			List<Map<String, String>> maplist = new ArrayList<Map<String, String>>();
			for (Equipment et : nameandtime) {
				Map<String, String> map = new HashMap<String, String>(); // 声明一个map集合
				map.put("name", et.getEquipmentname());// 将id存进map中
				map.put("time", sdf.format(et.getSigntime())); // 将name存进map中
				maplist.add(map);
			}
			sy.setList(maplist);
			sy.setCode(1);
			sy.setSecurity(offOrOn);
			sy.setMessage("此时是关闭");
		}
		return sy;
	}

	// 头像上传
	@RequestMapping("userpicture")
	@ResponseBody
	public Picture insertUser(
			@RequestParam(value = "userid", required = false) String userid,
			HttpServletRequest request, User user, String filePath,
			String serverPath, HttpServletResponse response,
			@RequestParam(value = "file", required = false) MultipartFile file,
			String all, Picture pe) throws IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;charset=utf-8");
		// String path ="D:/userpicture/";
		/* if (request instanceof MultipartHttpServletRequest) { */
		String path = request.getSession().getServletContext()
				.getRealPath("upload");
		String fileName = file.getOriginalFilename();
		String newFileName = UUID.randomUUID() + fileName;
		File dir = new File(path, newFileName);
		all = newFileName;
		if (!dir.exists()) {
			dir.mkdirs();
		}
		userService.updatepicture(userid, all);
		// MultipartFile自带的解析方法
		file.transferTo(dir);
		/* } */
		pe.setCode(1);
		pe.setMessage("上传成功");
		pe.setAll("upload/" + all);
		return pe;
	}

	// 收入记录
	@RequestMapping("selectall")
	@ResponseBody
	public Shourujilu selectGetRecord(
			@RequestParam(value = "userid", required = false) String userid,
			Shourujilu su) {
		// 查询全部收入
		List<String> money = userService.selectredbagrecord(userid);
		List<String> time = userService.selectime(userid);
		List<String> name = userService.selectnames(userid);
		List<String> logo = userService.selectlogo(userid);
		if (money != null && money.size() != 0) {
			List<Map<String, String>> maplist = new ArrayList<Map<String, String>>();
			for (int i = 0; i < money.size(); i++) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("money", money.get(i));
				map.put("time", time.get(i));
				map.put("name", name.get(i));
				map.put("logo", logo.get(i));
				maplist.add(map);
			}
			su.setCode(1);
			su.setMessage("查询成功");
			su.setList(maplist);
		} else if (money == null || money.size() == 0) {
			List list = new ArrayList<>();
			su.setCode(1);
			su.setMessage("您还没有收入");
			su.setList(list);
		}
		return su;

	}

	// 按照红包收入记录
	@RequestMapping("selectredbagrecord")
	@ResponseBody
	public Shourujilu selectredbagrecord(
			@RequestParam(value = "userid", required = false) String userid,
			Shourujilu su) {
		List<String> money = redbagService.selectredbagrecord(userid);
		List<String> time = redbagService.selectime(userid);
		List<String> name = redbagService.selectnames(userid);
		List<String> logo = redbagService.selectlogo(userid);
		if (money != null && money.size() != 0) {
			List<Map<String, String>> maplist = new ArrayList<Map<String, String>>();
			for (int i = 0; i < money.size(); i++) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("money", money.get(i));
				map.put("time", time.get(i));
				map.put("name", name.get(i));
				map.put("logo", logo.get(i));
				maplist.add(map);
			}
			su.setCode(1);
			su.setMessage("查询成功");
			su.setList(maplist);
		} else if (money == null || money.size() == 0) {
			List list = new ArrayList<>();
			su.setList(list);
			su.setCode(1);
			su.setMessage("您还没有收入");

		}
		return su;
	}

	@RequestMapping("selectactivitygetrecord")
	@ResponseBody
	// 按照活动收入查询
	public Shourujilu selectactivitygetrecord(
			@RequestParam(value = "userid", required = false) String userid,
			Shourujilu su) {
		List<String> money = activityService.selectmoney(userid);
		List<String> time = activityService.selectime(userid);
		List<String> name = activityService.selectnames(userid);
		List<String> logo = activityService.selectlogo(userid);
		if (money != null && money.size() != 0) {
			List<Map<String, String>> maplist = new ArrayList<Map<String, String>>();
			for (int i = 0; i < money.size(); i++) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("money", money.get(i));
				map.put("time", time.get(i));
				map.put("name", name.get(i));
				map.put("logo", logo.get(i));
				maplist.add(map);
			}
			su.setCode(1);
			su.setMessage("查询成功");
			su.setList(maplist);
		} else if (money == null || money.size() == 0) {
			List list = new ArrayList<>();
			su.setList(list);
			su.setCode(1);
			su.setMessage("您还没有收入");
		}
		return su;
	}

	// 根据金额查询
	@RequestMapping("selectByallmoney")
	@ResponseBody
	public Shourujilu selectBytime(
			@RequestParam(value = "userid", required = false) String userid,
			Shourujilu su,
			@RequestParam(value = "redbagmoney", required = false) Double redbagmoney,
			@RequestParam(value = "redbagmoneymin", required = false) Double redbagmoneymin,
			@RequestParam(value = "redbagmoneymax", required = false) Double redbagmoneymax) {
		// 查询全部收入
		List<String> money = userService.selectredbagrecordmoney(redbagmoney,
				userid, redbagmoneymin, redbagmoneymax);
		List<String> time = userService.selectimemoney(redbagmoney, userid,
				redbagmoneymin, redbagmoneymax);
		List<String> name = userService.selectnamesmoney(redbagmoney, userid,
				redbagmoneymin, redbagmoneymax);
		List<String> logo = userService.selectlogomoney(redbagmoney, userid,
				redbagmoneymin, redbagmoneymax);
		if (money != null && money.size() != 0) {
			List<Map<String, String>> maplist = new ArrayList<Map<String, String>>();
			for (int i = 0; i < money.size(); i++) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("money", money.get(i));
				map.put("time", time.get(i));
				map.put("name", name.get(i));
				map.put("logo", logo.get(i));
				maplist.add(map);
			}
			su.setCode(1);
			su.setMessage("查询成功");
			su.setList(maplist);
		} else if (money == null || money.size() == 0) {
			su.setCode(1);
			su.setMessage("您还没有收入");
		}
		return su;
	}

	// 分享接口
	@RequestMapping("show")
	@ResponseBody
	public Show selectpaimingandmoney(
			@RequestParam(value = "userid", required = false) String userid,
			Show sw) {
		List<Withdrawals> list = withdrawalsService.selectByUserId(userid);
		List<Redbag> list2 = redbagService.selectByUserId(userid);
		DecimalFormat df = new DecimalFormat("0.00");
		if (list != null && list.size() != 0 && list2 != null
				&& list2.size() != 0) {
			Double money = redbagService.selectpaihangmoney(userid);
			Integer num = redbagService.selectpaihang(userid);
			sw.setCode(1);
			sw.setMessage("查询成功");
			sw.setMoney(money);
			sw.setPaihang(num);
		} else if ((list == null || list.size() == 0)
				&& (list2 != null && list2.size() != 0)) {
			Integer num = redbagService.selectpaihang(userid);
			sw.setCode(1);
			sw.setMessage("查询成功");
			df.format(sw.setMoney(0.00));
			sw.setPaihang(num);
		} else if ((list != null && list.size() != 0)
				&& (list2 == null || list2.size() == 0)) {
			Integer num2 = redbagService.selectpaihangno(userid);
			sw.setCode(1);
			sw.setMessage("查询成功");
			df.format(sw.setMoney(0.00));
			sw.setPaihang(num2);
		} else if ((list2 == null || list2.size() == 0)
				&& (list == null || list.size() == 0)) {
			Integer num2 = redbagService.selectpaihangno(userid);
			sw.setCode(1);
			sw.setMessage("查询成功");
			df.format(sw.setMoney(0.00));
			sw.setPaihang(num2);
		}
		return sw;
	}

	// 绑定电话
	@RequestMapping("phone")
	@ResponseBody
	public Phone addphone(
			@RequestParam(value = "userid", required = false) String userid,
			Phone pe,
			@RequestParam(value = "loginway", required = false) Integer loginway,
			@RequestParam(value = "userphone", required = false) String userphone) {
		List<User> lw = userService.selectLoginWay(loginway, userid);
		if ((lw.get(0).getLoginway()).equals(2)) {
			userService.updateuserphone(userphone, userid);
			pe.setCode(1);
			pe.setMessage("更改成功");
		}
		return pe;
	}

	// 忘记密码
	@RequestMapping("forget")
	@ResponseBody
	public Forget forgetpassword(
			@RequestParam(value = "userphone", required = false) String userphone,
			Forget ft,
			HttpServletRequest request,
			@RequestParam(value = "yanzheng", required = false) String yanzheng,
			@RequestParam(value = "userpassword", required = false) String userpassword)
			throws Exception {
		String code = (String) request.getSession().getAttribute("code2");
		List<User> list = userService.selectByPhone(userphone);
		if (list == null || list.size() == 0) {
			ft.setCode(0);
			ft.setMessage("请先注册");
			ft.setUserid("0");
		} else if (list != null && list.size() != 0) {
			if (yanzheng == null || yanzheng.equals("")) {
				ft.setCode(0);
				ft.setMessage("请输入验证码");
				ft.setUserid("0");
			} else if (yanzheng.equals(code)) {
				// 更改用户密码
				userService.updateuserpassword(userpassword, userphone);
				ft.setCode(1);
				ft.setMessage("更改成功");
				ft.setUserid(list.get(0).getUserid());
			} else if (yanzheng != code || yanzheng.equals("")) {
				ft.setCode(0);
				ft.setMessage("请输入正确的验证码");
				ft.setUserid("0");
			}
		}
		return ft;
	}

	@RequestMapping("findtime")
	@ResponseBody
	public Findtime time(Findtime te,
			@RequestParam(value = "userid", required = false) String userid)
			throws ParseException {
		// 找包界面倒计时
		// 判断是否有用户一天之内红包个数
		Integer numm = usertoredbagService.selectnumber(userid);
		if (numm == 1 || numm == 2 || numm == 0) {
			te.setCode(1);
			te.setMessage("不需要显示倒计时");
			te.setTime((long) 0);
		} else if (numm == 3) {
			// 时间
			String nowtime = usertoredbagService.selectnowlast();
			String time = usertoredbagService.selectactivitytime(userid);
			String now = usertoredbagService.selectnow();
			SimpleDateFormat myFormatter = new SimpleDateFormat(
					"yyyy-MM-dd HH:mm:ss");
			java.util.Date date = myFormatter.parse(time);
			java.util.Date mydate = myFormatter.parse(nowtime);
			java.util.Date mydate2 = myFormatter.parse(now);
			long day1 = (date.getTime() - mydate2.getTime());
			long day2 = (date.getTime() - mydate.getTime());
			long day = day1 - day2;
			long subtime = day / 1000;
			te.setCode(1);
			te.setMessage("成功");
			te.setTime(subtime);
		}
		return te;
	}

	// 第三方登录
	@RequestMapping("otherlogin")
	@ResponseBody
	public Other login(
			@RequestParam(value = "userid", required = false) String userid,
			HttpServletRequest request,
			User user,
			String filePath,
			String serverPath,
			HttpServletResponse response,
			Other or,
			@RequestParam(value = "usernickname", required = false) String usernickname,
			@RequestParam(value = "userpicture", required = false) String userpicture,
			@RequestParam(value = "loginway", required = false) Integer loginway) {
		List<String> list = userService.selectByotherloginuserid(userid);
		if (list == null || list.size() == 0) {
			userService.insertUser(userid, usernickname, userpicture);
			or.setCode(1);
			or.setMessage("添加成功");
		} else if (list != null && list.size() != 0) {
			// userService.updateotherlogin(userid,usernickname,userpicture);
			or.setCode(1);
			or.setMessage("不是第一次登录");
		}
		return or;
	}
}
