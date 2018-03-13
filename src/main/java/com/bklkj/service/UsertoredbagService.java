package com.bklkj.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bklkj.pojo.User;
import com.bklkj.pojo.Usertoredbag;


@Service
public interface UsertoredbagService {
	
	public List<Usertoredbag> selectByTotalMoney(String usernickname, String userId);

	public Integer selectByTotalMoney(String userphone);

	public List<Usertoredbag> selectCount(String userid);

	public List<Usertoredbag> selectTime(String userid);
	
	public Integer insertRedbag(String userid);

	List<Usertoredbag> selectByUserId(String userid);

	public List<Usertoredbag> selectByLastR(Integer businessid, String userid);

	public void updateJudge(Integer judge, String userid);

	public Integer selectUserIdJudge(String userid);

	public List<Usertoredbag> selectrow(String userid);

	public List<Usertoredbag> selectByMaxMoney(Integer rownum, String usernickname, String userid, Double maxmoney);

	public void updateMaxmoney(Double maxmoney, String userid);

	public void updaterow(Integer rownum, String userid);

	public void updaterownum(Integer totalrownum, String userid);

	public void updateTotalmoney(Double totalmoney, String userid);

	public List<String> selectByTotalMoney(Integer totalrownum, String usernickname, String userid,
			Double totalmoney);

	public List<Usertoredbag> selectrownum(String userid);

	public void insertmoney(Double money, String userid);

	public void updatemoney(Double money, String userid, Integer id);

	public List<String> selectrownum(Integer totalrownum, String userid);

	public List<String> selectusernickname(String usernickname, String userid);

	public List<String> selectmoney();

	public Integer selectrownumone(String userid);

	public List<String> selectByTotalMoneyone(String userid);

	Integer selectlastrownum(String userid);

	public List<String> selectmaxrownum(String userid);

	public List<String> selectmaxusernickname(String usernickname, String userid);

	public List<String> selectmaxmoney();

	public List<String> selectBymaxMoneyone(String userid);

	public Integer selectMAXrownumone(String userid);

	public Integer selectmaxlastrownum(String userid);

	public Integer selectredbagnum(Date moneytime, String userid);

	public void updatemoneynumlast1(String userid);

	public void insertRedbag2(String userid);

	public void insertRedbag3(String userid);

	public Integer selectrednum(String userid);

	public Integer selectcount(String userid);

	public void updatetype(Integer redbagtype, String userid, Integer redbagnum);

	public void updatetype2(Integer redbagtype, String userid, Integer redbagnum);

	public void updatetype3(Integer redbagtype, String userid, Integer redbagnum);

	public List<Usertoredbag> selectByType(String userid);

	public Integer selectredbagnum(String userid);

	public Integer selectcount2(String userid);

	public List<Usertoredbag> selectredbagnum1(String userid);

	public List<Usertoredbag> selectredbagnum3(String userid);

	public List<Usertoredbag> selectredbagnum4(String userid);

	public List<Usertoredbag> selectredbagid1(String userid);

	public List<Usertoredbag> selectredbagid2(String userid);

	public List<Usertoredbag> selectredbagid3(String userid);

	public void updateredbagid1(String userid);

	public void updateredbagid2(String userid);
	
	public void updateredbagid3(String userid);

	public Integer selectredbagid(String userid);

	public void updatecountdownbegintime(String userid, Integer redbagnum);

	public Integer selectuseri(String userid);

	public String selectcountdown(String userid, Integer redbagnum);

	public String selectnow();

	public void updateintegral(String userid);

	public void updateredbagtype(String userid, Integer redbagnum);

	public Integer selecttype(String userid, Integer redbagnum);

	public void updateredbagtype1(String userid, Integer redbagnum);

	public void updateintegral10(String userid);
	
	public void updateintegral15(String userid);
	
	public void updateintegral20(String userid);

	public List<Usertoredbag> selectByType2(String userid);

	public String selectnownow();

	public String selecttimedown();

	public String selectactivitytime(String userid);

	public Integer selectnumber(String userid);

	public String selectnowlast();

	public void selectByredbagType(Integer redbagnum, String userid);

	public Integer selectcountnum(String userid);

	public String selectcountdownlist(String userid);

	public String selectcountdownlist2(String userid);
	
	public String selectcountdownlist3(String userid);

	public Integer selectredbagnumtime(String userid);

	public List<Date> selectredbagtime(String userid);

	public String selectcountdowntime(String userid);

	public void updateredbagtypeone(String userid);

	public List<User> selectuseralipayid(String userid);



}
