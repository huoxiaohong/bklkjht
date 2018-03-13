package com.bklkj.dao;

import com.bklkj.Commons.Shourujilu;
import com.bklkj.pojo.Gold;
import com.bklkj.pojo.User;
import com.bklkj.pojo.UserExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	int countByExample(UserExample example);

	int deleteByExample(UserExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExample(UserExample example);

	User selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	List<User> selectByAll();

	List<User> selectByPhone(@Param("userphone") String userphone);

	User selectByName(String userName);

	List<User> selectByMoney(double userbalance);

	int insertPhone(User user);

	int updateUserIntegral(Integer userIntegral);

	int updateUserUseIntegal();

	void updateUserGold(int goldNum);

	List<User> selectUserGold(@Param("usergold") Integer usergold,@Param("userid") String userid);

	void updateUserGoldSub(Gold goldNum);

	void updateUserIntegralSum(@Param("userintegral") Integer userintegral);

	List<User> selectUserIntegral(@Param("userid") String userid);

	void updateUserGoldSum(Gold goldNum);

	Integer updateUserIntegralA(Integer userIntegral);

	int insertt(User user);

	Integer insertt(@Param("userid")String userid, @Param("userphone") String userphone, @Param("userpassword") String userpassword);

	List<User> selectByPP(@Param("userphone") String userphone, @Param("userpassword") String userpassword);

	int updateByPhone(@Param("userpassword") String userpassword, @Param("userid") String userid,
			@Param("loginway") Integer loginway);

	double selectUserBalance(double userbalance);

	public List<User> showUser(@Param("usergold") Integer usergold, @Param("userintegral") Integer userintegral,
			@Param("userbalance") Double userbalance, @Param("userphone") String userphone);

	List<User> selectByUserId(@Param("userid")String userid);

	List<User> selectByPi(@Param("userid")String userid, @Param("userphone")String userphone);

	//List<User> selectState(@Param("state")Integer state,@Param("userid") String userid);

	List<User> selectState(@Param("userid")String userid);

	List<User> selectUserGold(@Param("userid")String userid);

	Integer updateUserUseIntegal(@Param("userintegral")Integer userintegral, @Param("userid")String userid);

	void updateJudge(@Param("judge")Integer judge, @Param("userid")String userid);

	void insertLoginWay(@Param("loginway")Integer loginway,@Param("userid") String userid);

	List<User> selectByUserPhone(@Param("userphone")String userphone);

	List<User> selectUserUserid(@Param("userphone")String userphone, @Param("userid")String userid);

	List<User> selectLoginWayPhone(@Param("loginway")Integer loginway,@Param("userphone") String userphone);

	List<User> selectStatePhone(@Param("userphone")String userphone);

	void updateRedbag(@Param("userbalance")Double userbalance, @Param("userid")String userid);

	int updateMaxIn(@Param("userintegral")Integer userintegral,@Param("userid") String userid);

	Integer updateMinin(@Param("userintegral")Integer userintegral,@Param("userid") String userid);

	List<User> selectUserBalance(@Param("userbalance")Double userbalance,@Param("userid") String userid);

	List<User> selectUserPicture(@Param("userpicture")String userpicture, @Param("userid")String userid);

	Double updatewith(@Param("userwithdrawalsmoney")Double userwithdrawalsmoney, @Param("userid")String userid);

	List<User> selectUserWithdrawals(@Param("userwithdrawalsmoney")Double userwithdrawalsmoney, @Param("userid")String userid);

	List<User> selectUserPi(@Param("userphone")String userphone, @Param("userid")String userid);

	void updateUserNickname(@Param("usernickname")String usernickname, @Param("userphone")String userphone);

	Integer updatenickname(@Param("usernickname")String usernickname,@Param("userid") String userid);

	List<User> selectusernickname(@Param("usernickname")String usernickname,@Param("userid") String userid);

	List<User> selectByTotalMoney(@Param("usernickname")String usernickname,@Param("userid") String userId);

	List<User> selectrow(@Param("userid")String userid);

	List<User> selectByMaxMoney(@Param("rownum")Integer rownum, @Param("usernickname")String usernickname, @Param("userid")String userid,@Param("maxmoney") Double maxmoney);

	void updateMaxmoney(@Param("maxmoney")Double maxmoney, @Param("userid")String userid);

	void updaterow(@Param("rownum")Integer rownum, @Param("userid")String userid);

	void updaterownum(@Param("totalrownum")Integer totalrownum,@Param("userid") String userid);

	void updateTotalmoney(@Param("totalmoney")Double totalmoney, @Param("userid")String userid);

	List<User> selectByTotalMoney(@Param("totalrownum")Integer totalrownum, @Param("usernickname")String usernickname,@Param("userid") String userid, @Param("totalmoney")Double totalmoney);

	List<User> selectrownum(@Param("userid")String userid);

	Integer changesecurity(@Param("userid")String userid, @Param("security")String security);

	String selectSecurity(@Param("userid")String userid, @Param("security")String security);

	void changesecurityOff(@Param("userid")String userid, @Param("security")String security);

	void updateRecordusernickname(@Param("usernickname")String usernickname, @Param("userid")String userid);

	void changesecurityOn(@Param("userid")String userid, @Param("security")String security);

	Integer selectOthernickname(@Param("usernickname")String usernickname,@Param("userid") String userid);

	List<String> selectall(@Param("userid")String userid);

	List<String> selectredbagrecord(@Param("userid")String userid);

	List<String> selectime(@Param("userid")String userid);

	List<String> selectnames(@Param("userid")String userid);

	List<String> selectlogo(@Param("userid")String userid);

	List<String> selectredbagrecordmoney(@Param("redbagmoney")Double redbagmoney, @Param("userid")String userid, @Param("redbagmoneymin")Double redbagmoneymin,
			@Param("redbagmoneymax")Double redbagmoneymax);

	List<String> selectimemoney(@Param("redbagmoney")Double redbagmoney, @Param("userid")String userid, @Param("redbagmoneymin")Double redbagmoneymin,
			@Param("redbagmoneymax")Double redbagmoneymax);

	List<String> selectnamesmoney(@Param("redbagmoney")Double redbagmoney, @Param("userid")String userid, @Param("redbagmoneymin")Double redbagmoneymin,
			@Param("redbagmoneymax")Double redbagmoneymax);

	List<String> selectlogomoney(@Param("redbagmoney")Double redbagmoney, @Param("userid")String userid, @Param("redbagmoneymin")Double redbagmoneymin,
			@Param("redbagmoneymax")Double redbagmoneymax);

	Object selectlogomoney(String newFileName);

	List<String> selectAll();

	void updatequestion1(@Param("questionone")Integer questionone,@Param("userid") String userid);

	void updatequestion2(@Param("questiontwo")Integer questiontwo, @Param("userid")String userid);

	void updatequestion3(@Param("questionthree")Integer questionthree,@Param("userid") String userid);

	List<String> selectnickname(@Param("usernickname")String usernickname, @Param("userid")String userid);

	void updateuserphone(@Param("userphone")String userphone, @Param("userid")String userid);

	void updateuserpassword(@Param("userpassword") String userpassword,@Param("userphone")String userphone);

	void updatepicture(@Param("userid")String userid,@Param("all") String all);

	void insertUser(@Param("userid")String userid, @Param("usernickname")String usernickname, @Param("userpicture")String userpicture);

	void updatemoney(@Param("userid")String userid);

	List<User> selectByUserI(@Param("userid")String userid);

	List<User> selectLoginWay(@Param("loginway")Integer loginway, @Param("userid")String userid);

	void updateuserid(@Param("userphone")String userphone);

	List<String> selectByotherloginuserid(@Param("userid")String userid);

	void updateotherlogin(@Param("userid")String userid, @Param("usernickname")String usernickname, @Param("userpicture")String userpicture);

	List<User> selectuseralipayid(@Param("userid")String userid);


}