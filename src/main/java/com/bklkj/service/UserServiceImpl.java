package com.bklkj.service;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.domain.Picture;
import com.bklkj.Commons.DateUtil;
import com.bklkj.Commons.Shourujilu;
import com.bklkj.dao.UserMapper;
import com.bklkj.pojo.Gold;
import com.bklkj.pojo.Problem;
import com.bklkj.pojo.User;
import com.bklkj.pojo.UserExample;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> selectUser() throws Exception {
		List<User> list = userMapper.selectByAll();
		return list;
	}

	@Override
	public User selectByName(String userName) {
		return userMapper.selectByName(userName);

	}

	@Override
	public List<User> selectByPhone(String userphone) throws Exception {
		List<User> list = userMapper.selectByPhone(userphone);
		return list;
	}

	@Override
	public List<User> selectByExample(UserExample example) {
		return null;
	}

	@Override
	public List<User> selectByMoney(double userbalance) {
		List<User> list = userMapper.selectByMoney(userbalance);
		return list;
	}

	// 忘记密码
	@Override
	public Integer updateByPhoneNum(String userpassword, String userid, Integer loginway) {
		return userMapper.updateByPhone(userpassword, userid, loginway);
	}

	/*
	 * @Override public User selectByphoneNumber(String userphone) throws
	 * Exception { UserExample example; Criteria criteria=(example=new
	 * UserExample()).createCriteria();
	 * criteria.andPhoneNumberEqualTo(userphone); List<User> list; return
	 * (list=userMapper.selectByExample(example))==null||list.size()==0?null:
	 * list.get(0); }
	 */

	/*
	 * @Override public User userLogin(String userphone,String userpassword){
	 * UserExample example=new UserExample(); Criteria criteria =
	 * example.createCriteria(); criteria.andPhoneNumberEqualTo(userphone);
	 * criteria.andUserpasswordEqualTo(userpassword);
	 * userMapper.selectByExample(example); List<User> list; return
	 * (list=userMapper.selectByExample(example))==null||list.size()==0?null:
	 * list.get(0); }
	 */

	@Override
	public int insertPhone(User user) {
		return userMapper.insertPhone(user);
	}

	@Override
	public Integer insertt(String userid,String userphone, String userpassword) {
		return userMapper.insertt(userid,userphone, userpassword);
	}

	// 更改用户的积分量
	@Override
	public Integer updateUserIntegral(Integer userintegral) {
		return userMapper.updateUserIntegral(userintegral);
	}

	// 更改用户的金币数量
	@Override
	public void updateUserGold(int goldnum) {
		userMapper.updateUserGold(goldnum);
	}

	// 查询金币总数
	@Override
	public List<User> selectUserGold(String userid) {
		List<User> list = userMapper.selectUserGold(userid);
		return list;

	}

	// 用户打开红包从金币数量中减100
	@Override
	public void updateUserGoldSub(Gold goldnum) {
		userMapper.updateUserGoldSub(goldnum);
	}

	// 查询用户的总积分数量
	@Override
	public List<User> selectUserIntegral(String userid) {
		List<User>list= userMapper.selectUserIntegral(userid);
		return list;
	}

	// 更改用户积分总和
	@Override
	public void updateUserIntegralSum(Integer userintegral) {
		userMapper.updateUserIntegralSum(userintegral);
	}

	// 更改从活动得到的积分
	@Override
	public Integer updateUserIntegralA(Integer userintegral) {
		return userMapper.updateUserIntegralA(userintegral);
	}

	// 登录查询
	@Override
	public List<User> selectByPP(String userphone, String userpassword) {
		List<User> list = userMapper.selectByPP(userphone, userpassword);
		return list;
	}

	@Override
	public double selectUserBalance(double userbalance) {
		return userMapper.selectUserBalance(userbalance);

	}

	@Override
	public List<User> showUser(Integer usergold, Integer userintegral, Double userbalance, String userphone) {
		List<User> list2 = userMapper.showUser(usergold, userintegral, userbalance, userphone);
		return list2;
	}


	@Override
	public List<User> selectByUserId(String userid) {
		List<User> list = userMapper.selectByUserId(userid);
		return list;
	}

	@Override
	public List<User> selectByPi(String userid, String userphone) {
		List<User>list=userMapper.selectByPi(userid, userphone);
		return list;
	}

	@Override
	public List<User> selectState(String userid) {
		List<User>s=userMapper.selectState(userid);
		return s;
	}

	@Override
	public Integer updateUserUseIntegal(Integer userintegral, String userid) {
		return userMapper.updateUserUseIntegal(userintegral,userid);
		
		
	}

	@Override
	public void updateJudge(Integer judge, String userid) {
		userMapper.updateJudge(judge,userid);
		
	}

	@Override
	public void insertLoginWay(Integer loginway, String userid) {
		userMapper.insertLoginWay(loginway,userid);
		
	}

	@Override
	public List<User> selectUserUserid(String userphone,String userid) {
		List<User>list=userMapper.selectUserUserid(userphone,userid);
		return list;
	}

	@Override
	public List<User> selectLoginWayPhone(Integer loginway, String userphone) {
		List<User>list=userMapper.selectLoginWayPhone(loginway,userphone);
		return list;
	}

	@Override
	public List<User> selectStatePhone(String userphone) {
		List<User>s=userMapper.selectStatePhone(userphone);
		return s;
	}

	@Override
	public void updateRedbag(Double userbalance, String userid) {
		userMapper.updateRedbag(userbalance,userid);
		
	}

	@Override
	public Integer updateMaxIn(Integer userintegral, String userid) {
		return userMapper.updateMaxIn(userintegral,userid);
	}

	@Override
	public Integer updateMinin(Integer userintegral, String userid) {
		return userMapper.updateMinin(userintegral,userid);
	}

	@Override
	public List<User> selectUserBalance(Double userbalance, String userid) {
		List<User>list=userMapper.selectUserBalance(userbalance,userid);
		return list;
		
	}

	@Override
	public List<User> selectUserPicture(String userpicture, String userid) {
		List<User>list=userMapper.selectUserPicture(userpicture,userid);
		return list;
		
	}

	@Override
	public Double updatewith(Double userwithdrawalsmoney, String userid) {
		return userMapper.updatewith(userwithdrawalsmoney,userid);
	}

	@Override
	public List<User> selectUserWithdrawals(Double userwithdrawalsmoney, String userid) {
		List<User>list=userMapper.selectUserWithdrawals(userwithdrawalsmoney,userid);
		return list;
	}

	@Override
	public List<User> selectUserPi(String userid, String userphone) {
		List<User>list=userMapper.selectUserPi(userphone,userid);
		return list;
	}

	@Override
	public void updateUserNickname(String usernickname, String userphone) {
		userMapper.updateUserNickname(usernickname,userphone);
		
	}

	@Override
	public Integer updatenickname(String usernickname, String userid) {
		return userMapper.updatenickname(usernickname,userid);
		
	}

	@Override
	public List<User> selectusernickname(String usernickname, String userid) {
		List<User>list= userMapper.selectusernickname(usernickname,userid);
		return list;
	}

	@Override
	public List<User> selectrow(String userid) {
		List<User> list2= userMapper.selectrow(userid);
		return list2;
	}

	@Override
	public List<User> selectByMaxMoney(Integer rownum,String usernickname,String userid,Double maxmoney) {
		List<User>list=userMapper.selectByMaxMoney(rownum,usernickname,userid,maxmoney);
		return list;
	}


	@Override
	public void updateMaxmoney(Double maxmoney, String userid) {
		userMapper.updateMaxmoney(maxmoney,userid);
	}


	@Override
	public void updaterow(Integer rownum, String userid) {
		userMapper.updaterow(rownum,userid);
	}


	@Override
	public void updaterownum(Integer totalrownum, String userid) {
		userMapper.updaterownum(totalrownum,userid);
	}


	@Override
	public void updateTotalmoney(Double totalmoney, String userid) {
		userMapper.updateTotalmoney(totalmoney,userid);
	}


	@Override
	public List<User> selectByTotalMoney(Integer totalrownum, String usernickname, String userid,
			Double totalmoney) {
		List<User>list=userMapper.selectByTotalMoney(totalrownum,usernickname,userid,totalmoney);
		return list;
	}


	@Override
	public List<User> selectrownum(String userid) {
		List<User> list2= userMapper.selectrownum(userid);
		return list2;
	}

	@Override
	public List<User> selectByTotalMoney(String usernickname,String userId) {
		List<User>list= userMapper.selectByTotalMoney(usernickname,userId);
		return list;
		
	}

	@Override
	public Integer changesecurity(String userid, String security) {
		return userMapper.changesecurity(userid,security);
	}

	@Override
	public String selectSecurity(String userid, String security) {
		return userMapper.selectSecurity(userid,security);
	}

	@Override
	public void changesecurityOff(String userid, String security) {
		 
		userMapper.changesecurityOff(userid,security);
	}

	@Override
	public void updateRecordusernickname(String usernickname, String userid) {
		 userMapper.updateRecordusernickname(usernickname,userid);
		
	}

	@Override
	public void changesecurityOn(String userid, String security) {
		 userMapper.changesecurityOn(userid,security);
	}

	@Override
	public Integer selectOthernickname(String usernickname, String userid) {
		return userMapper.selectOthernickname(usernickname,userid);
	}

	@Override
	public List<String> selectall(String userid) {
		return userMapper.selectall(userid);
	}

	@Override
	public List<String> selectredbagrecord(String userid) {
		return userMapper.selectredbagrecord(userid);
	}

	@Override
	public List<String> selectime(String userid) {
		return userMapper.selectime(userid);
	}

	@Override
	public List<String> selectnames(String userid) {
		return userMapper.selectnames(userid);
	}

	@Override
	public List<String> selectlogo(String userid) {
		return userMapper.selectlogo(userid);
	}

	@Override
	public List<String> selectredbagrecordmoney(Double redbagmoney, String userid, Double redbagmoneymin,
			Double redbagmoneymax) {
		return userMapper.selectredbagrecordmoney(redbagmoney,userid,redbagmoneymin,redbagmoneymax);
	}

	@Override
	public List<String> selectimemoney(Double redbagmoney, String userid, Double redbagmoneymin,
			Double redbagmoneymax) {
		return userMapper.selectimemoney(redbagmoney,userid,redbagmoneymin,redbagmoneymax);
	}

	@Override
	public List<String> selectnamesmoney(Double redbagmoney, String userid, Double redbagmoneymin,
			Double redbagmoneymax) {
		return userMapper.selectnamesmoney(redbagmoney,userid,redbagmoneymin,redbagmoneymax);
	}

	@Override
	public List<String> selectlogomoney(Double redbagmoney, String userid, Double redbagmoneymin,
			Double redbagmoneymax) {
		return userMapper.selectlogomoney(redbagmoney,userid,redbagmoneymin,redbagmoneymax);
	}

	@Override
	public void insertUser(User user, String newFileName) {
		userMapper.selectlogomoney(newFileName);
	}

	@Override
	public List<String> selectByuser() {
		return userMapper.selectAll();
	}

	@Override
	public void updatequestion1(Integer questionone, String userid) {
		// TODO Auto-generated method stub
		userMapper.updatequestion1(questionone,userid);
	}

	@Override
	public void updatequestion2(Integer questiontwo, String userid) {
		// TODO Auto-generated method stub
		userMapper.updatequestion2(questiontwo,userid);
	}

	@Override
	public void updatequestion3(Integer questionthree, String userid) {
		// TODO Auto-generated method stub
		userMapper.updatequestion3(questionthree,userid);
	}

	@Override
	public List<String> selectnickname(String usernickname, String userid) {
		// TODO Auto-generated method stub
		return userMapper.selectnickname(usernickname,userid);
	}

	@Override
	public void updateuserphone(String userphone, String userid) {
		// TODO Auto-generated method stub
		userMapper.updateuserphone(userphone,userid);
	}

	@Override
	public void updateuserpassword(String userpassword,String userphone) {
		// TODO Auto-generated method stub
		 userMapper.updateuserpassword(userpassword,userphone);
	}

	@Override
	public void updatepicture(String userid,String all) {
		// TODO Auto-generated method stub
		userMapper.updatepicture(userid,all);
	}

	@Override
	public void insertUser(String userid, String usernickname, String userpicture) {
		// TODO Auto-generated method stub
		userMapper.insertUser(userid,usernickname,userpicture);
	}

	@Override
	public List<User> selectByUserI(String userid) {
		// TODO Auto-generated method stub
		return userMapper.selectByUserI(userid);
	}

	@Override
	public List<User> selectLoginWay(Integer loginway, String userid) {
		List<User> list = userMapper.selectLoginWay(loginway,userid);
		return list;
	}

	@Override
	public void updateuserid(String userphone) {
		// TODO Auto-generated method stub
		userMapper.updateuserid(userphone);
	}

	@Override
	public List<String> selectByotherloginuserid(String userid) {
		// TODO Auto-generated method stub
		return	userMapper.selectByotherloginuserid(userid);
		
	}

	@Override
	public void updateotherlogin(String userid,String usernickname,String userpicture) {
		// TODO Auto-generated method stub
		userMapper.updateotherlogin(userid,usernickname,userpicture);
	}

	@Override
	public List<User> selectuseralipayid(String userid) {
		// TODO Auto-generated method stub
		return userMapper.selectuseralipayid(userid);
	}




	

}
