package com.bklkj.dao;

import com.bklkj.pojo.User;
import com.bklkj.pojo.Usertoredbag;
import com.bklkj.pojo.UsertoredbagExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsertoredbagMapper {
    int countByExample(UsertoredbagExample example);

    int deleteByExample(UsertoredbagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Usertoredbag record);

    int insertSelective(Usertoredbag record);

    List<Usertoredbag> selectByExample(UsertoredbagExample example);

    Usertoredbag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Usertoredbag record, @Param("example") UsertoredbagExample example);

    int updateByExample(@Param("record") Usertoredbag record, @Param("example") UsertoredbagExample example);

    int updateByPrimaryKeySelective(Usertoredbag record);

    int updateByPrimaryKey(Usertoredbag record);

	Integer selectByTotalMoney(String userid);

	//Integer selectByTotalMoney(String userphone);

	List<Usertoredbag> selectByUserId(@Param("userid")String userid);

	public List<Usertoredbag> selectCount(@Param("userid")String userid);

	List<Usertoredbag> selectTime(@Param("userid")String userid);

	Integer insertRedbag(@Param("userid")String userid);

	List<Usertoredbag> selectByLastR(@Param("businessid")Integer businessid, @Param("userid")String userid);

	void updateJudge(@Param("judge")Integer judge, @Param("userid")String userid);

	Integer selectUserIdJudge(@Param("userid")String userid);

	List<Usertoredbag> selectByTotalMoney(@Param("usernickname")String usernickname,@Param("userid") String userId);

	List<Usertoredbag> selectrow(@Param("userid")String userid);

	List<Usertoredbag> selectByMaxMoney(@Param("rownum")Integer rownum, @Param("usernickname")String usernickname, @Param("userid")String userid,@Param("maxmoney") Double maxmoney);

	void updateMaxmoney(@Param("maxmoney")Double maxmoney, @Param("userid")String userid);

	void updaterow(@Param("rownum")Integer rownum, @Param("userid")String userid);

	void updaterownum(@Param("totalrownum")Integer totalrownum,@Param("userid") String userid);

	void updateTotalmoney(@Param("totalmoney")Double totalmoney, @Param("userid")String userid);

	List<String> selectByTotalMoney(@Param("totalrownum")Integer totalrownum, @Param("usernickname")String usernickname,@Param("userid") String userid, @Param("totalmoney")Double totalmoney);

	List<Usertoredbag> selectrownum(@Param("userid")String userid);

	void insertmoney(@Param("money")Double money,@Param("userid") String userid);

	void updatemoney(@Param("money")Double money, @Param("userid")String userid, @Param("id")Integer id);

	List<String> selectrownum(@Param("totalrownum")Integer totalrownum, @Param("userid")String userid);

	List<String> selectusernickname(@Param("usernickname")String usernickname, @Param("userid")String userid);

	List<String> selectmoney();

	Integer selectrownumone( @Param("userid")String userid);

	List<String> selectByTotalMoneyone(@Param("userid")String userid);

	Integer selectlastrownum(@Param("userid")String userid);

	List<String> selectmaxrownum(@Param("userid")String userid);

	List<String> selectmaxusernickname(@Param("usernickname")String usernickname, @Param("userid")String userid);

	List<String> selectmaxmoney();

	List<String> selectBymaxMoneyone(@Param("userid")String userid);

	Integer selectMAXrownumone(@Param("userid")String userid);

	Integer selectmaxlastrownum(@Param("userid")String userid);

	void updatemoneynum1(@Param("userid")String userid);

	Integer selectredbagnum(@Param("moneytime")Date moneytime, @Param("userid")String userid);

	void insertRedbag2(@Param("userid")String userid);

	void insertRedbag3(@Param("userid")String userid);

	Integer selectrednum(@Param("userid")String userid);

	List<Integer> selectByredbagType( @Param("redbagnum")Integer redbagnum, @Param("userid")String userid);

	Integer selectcount(@Param("userid")String userid);

	void updatetype(@Param("redbagtype")Integer redbagtype, @Param("userid")String userid, @Param("redbagnum")Integer redbagnum);

	List<Usertoredbag> selectByType(@Param("userid")String userid);

	Integer selectredbagnum2(@Param("userid")String userid);

	Integer selectcount2(@Param("userid")String userid);

	List<Usertoredbag> selectredbagnum1(@Param("userid")String userid);

	List<Usertoredbag> selectredbagnum3(@Param("userid")String userid);
	
	List<Usertoredbag> selectredbagnum4(@Param("userid")String userid);

	List<Usertoredbag> selectredbagid1(@Param("userid")String userid);

	List<Usertoredbag> selectredbagid2(@Param("userid")String userid);

	List<Usertoredbag> selectredbagid3(@Param("userid")String userid);

	void updateredbagid1(@Param("userid")String userid);
	
	void updateredbagid2(@Param("userid")String userid);
	
	void updateredbagid3(@Param("userid")String userid);

	Integer selectredbagid(@Param("userid")String userid);

	void updatecountdownbegintime(@Param("userid")String userid, @Param("redbagnum")Integer redbagnum);

	Integer selectuseri(@Param("userid")String userid);

	String selectcountdown(@Param("userid")String userid,@Param("redbagnum") Integer redbagnum);

	String selectnow();

	void updateintegral(@Param("userid")String userid);

	void updateredbagtype(@Param("userid")String userid,@Param("redbagnum") Integer redbagnum);

	Integer selecttype(@Param("userid")String userid, @Param("redbagnum")Integer redbagnum);

	void updateredbagtype1(@Param("userid")String userid, @Param("redbagnum")Integer redbagnum);

	void updateintegral10(@Param("userid")String userid);
	
	void updateintegral15(@Param("userid")String userid);
	
	void updateintegral20(@Param("userid")String userid);

	List<Usertoredbag> selectByType2(@Param("userid")String userid);

	String selectnownow();

	String selecttimedown();

	String selectactivitytime(@Param("userid")String userid);

	Integer selectnumber(@Param("userid")String userid);

	String selectnowlast();

	Integer selectcountnum(@Param("userid")String userid);

	String selectcountdownlist(@Param("userid")String userid);

	String selectcountdownlist2(@Param("userid")String userid);
	
	String selectcountdownlist3(@Param("userid")String userid);

	Integer selectredbagnumtime(@Param("userid")String userid);

	List<Date> selectredbagtime(@Param("userid")String userid);

	String selectcountdowntime(@Param("userid")String userid);

	void updateredbagtypeone(@Param("userid")String userid);

	List<User> selectuseralipayid(@Param("userid")String userid);


}