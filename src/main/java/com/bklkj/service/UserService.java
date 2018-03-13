package com.bklkj.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.bklkj.Commons.Shourujilu;
import com.bklkj.pojo.Gold;
import com.bklkj.pojo.Problem;
import com.bklkj.pojo.User;
import com.bklkj.pojo.UserExample;

@Service
public interface UserService {

	public List<User> selectUser() throws Exception;

	public List<User> selectByPhone(String userphone) throws Exception;

	List<User> selectByExample(UserExample example);

	User selectByName(String username);

	public List<User> selectByMoney(double userbalance);

	// public User selectByphoneNumber(String phoneNumber) throws Exception;

	// public User userLogin(String userphone, String userpassword);

	public Integer insertt(String userid, String userphone, String userpassword);

	int insertPhone(User user);

	public Integer updateUserIntegral(Integer userintegral);

	public void updateUserGold(int goldnum);

	public List<User> selectUserGold(String userid);

	public void updateUserGoldSub(Gold goldnum);

	public List<User> selectUserIntegral(String userid);

	public void updateUserIntegralSum(Integer userintegral);

	public Integer updateUserIntegralA(Integer userintegral);

	public List<User> selectByPP(String userphone, String userpassword);

	Integer updateByPhoneNum(String userpassword, String userid, Integer loginway);

	public double selectUserBalance(double userbalance);

	public List<User> showUser(Integer usergold, Integer userintegral, Double userbalance, String userphone);

	List<User> selectByUserId(String userid);
	
	List<User> selectByPi(String userid,String userphone);

	public List<User> selectState(String userid);

	public Integer updateUserUseIntegal(Integer userintegral, String userid);

	public void updateJudge(Integer judge, String userid);

	public void insertLoginWay(Integer loginway, String userid);
	
	public List<User> selectUserUserid(String userphone, String userid);

	public List<User> selectLoginWayPhone(Integer loginway, String userphone);

	public List<User> selectStatePhone(String userphone);

	public void updateRedbag(Double userbalance, String userid);

	public Integer updateMaxIn(Integer userintegral, String userid);

	public Integer updateMinin(Integer userintegral, String userid);

	public List<User> selectUserBalance(Double userbalance, String userid);

	public List<User> selectUserPicture(String userpicture, String userid);

	public Double updatewith(Double userwithdrawalsmoney, String userid);

	public List<User> selectUserWithdrawals(Double userwithdrawalsmoney, String userid);

	public List<User> selectUserPi(String userid, String userphone);

	public void updateUserNickname(String usernickname, String userphone);

	public Integer updatenickname(String usernickname, String userid);

	public List<User> selectusernickname(String usernickname, String userid);

	public List<User> selectrow(String userid);

	public List<User> selectByMaxMoney(Integer rownum, String usernickname, String userid, Double maxmoney);

	public void updateMaxmoney(Double maxmoney, String userid);

	public void updaterow(Integer rownum, String userid);

	public void updaterownum(Integer totalrownum, String userid);

	public void updateTotalmoney(Double totalmoney, String userid);

	public List<User> selectByTotalMoney(Integer totalrownum, String usernickname, String userid,
			Double totalmoney);

	public List<User> selectrownum(String userid);
	public List<User> selectByTotalMoney(String usernickname, String userId);

	public Integer changesecurity(String userid, String security);

	public String selectSecurity(String userid, String security);

	public void changesecurityOff(String userid, String security);

	public void updateRecordusernickname(String usernickname, String userid);

	public void changesecurityOn(String userid, String security);

	public Integer selectOthernickname(String usernickname, String userid);

	public List<String> selectall(String userid);

	public List<String> selectredbagrecord(String userid);

	public List<String> selectime(String userid);

	public List<String> selectnames(String userid);

	public List<String> selectlogo(String userid);

	public List<String> selectredbagrecordmoney(Double redbagmoney, String userid, Double redbagmoneymin,
			Double redbagmoneymax);

	public List<String> selectimemoney(Double redbagmoney, String userid, Double redbagmoneymin,
			Double redbagmoneymax);

	public List<String> selectnamesmoney(Double redbagmoney, String userid, Double redbagmoneymin,
			Double redbagmoneymax);

	public List<String> selectlogomoney(Double redbagmoney, String userid, Double redbagmoneymin,
			Double redbagmoneymax);

	public void insertUser(User user, String newFileName);

	public List<String> selectByuser();

	public void updatequestion1(Integer questionone, String userid);

	public void updatequestion2(Integer questiontwo, String userid);
	
	public void updatequestion3(Integer questionthree, String userid);

	public List<String> selectnickname(String usernickname, String userid);

	public void updateuserphone(String userphone, String userid);

	public void updateuserpassword(String userpassword,String userphone);

	public void updatepicture(String userid, String all);

	public void insertUser(String userid, String usernickname, String userpicture);

	public List<User> selectByUserI(String userid);

	public List<User> selectLoginWay(Integer loginway, String userid);

	public void updateuserid(String userphone);

	public List<String> selectByotherloginuserid(String userid);

	public void updateotherlogin(String userid, String usernickname, String userpicture);

	public List<User> selectuseralipayid(String userid);

	//public void updtepicture(String userid);

	//boolean upload(String userid, MultipartFile file, JSONObject result) throws Exception;

	
}
