package com.bklkj.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bklkj.dao.UsertoredbagMapper;
import com.bklkj.pojo.User;
import com.bklkj.pojo.Usertoredbag;

@Service
public class UsertoredbagServiceImpl implements UsertoredbagService {

	@Autowired
	private UsertoredbagMapper usertoredbagMapper;

	@Override
	public List<Usertoredbag> selectByTotalMoney(String usernickname,String userId) {
		List<Usertoredbag>list= usertoredbagMapper.selectByTotalMoney(usernickname,userId);
		return list;
		
	}


	@Override
	public Integer selectByTotalMoney(String userphone) {
		return usertoredbagMapper.selectByTotalMoney(userphone);
	}


	@Override
	public List<Usertoredbag> selectByUserId(String userid) {
		// TODO Auto-generated method stub
		List<Usertoredbag>list= usertoredbagMapper.selectByUserId(userid);
		return list;
	}

	@Override
	public List<Usertoredbag> selectCount(String userid) {
		List<Usertoredbag>list= usertoredbagMapper.selectCount(userid);
		return list;
	}

	@Override
	public List<Usertoredbag> selectTime(String userid) {
		List<Usertoredbag>list = usertoredbagMapper.selectTime(userid);
		return list;
	}

	@Override
	public Integer insertRedbag(String userid) {
		return usertoredbagMapper.insertRedbag(userid);
	}

	@Override
	public List<Usertoredbag> selectByLastR(Integer businessid, String userid) {
		List<Usertoredbag>list=usertoredbagMapper.selectByLastR(businessid,userid);
		return list;
	}

	@Override
	public void updateJudge(Integer judge, String userid) {
		// TODO Auto-generated method stub
		usertoredbagMapper.updateJudge(judge,userid);
	}

	@Override
	public Integer selectUserIdJudge(String userid) {
		// TODO Auto-generated method stub
		Integer list=usertoredbagMapper.selectUserIdJudge(userid);
		return list;
	}

	@Override
	public List<Usertoredbag> selectrow(String userid) {
		// TODO Auto-generated method stub
		List<Usertoredbag> list2= usertoredbagMapper.selectrow(userid);
		return list2;
	}

	@Override
	public List<Usertoredbag> selectByMaxMoney(Integer rownum,String usernickname,String userid,Double maxmoney) {
		List<Usertoredbag>list=usertoredbagMapper.selectByMaxMoney(rownum,usernickname,userid,maxmoney);
		return list;
	}


	@Override
	public void updateMaxmoney(Double maxmoney, String userid) {
		// TODO Auto-generated method stub
		usertoredbagMapper.updateMaxmoney(maxmoney,userid);
	}


	@Override
	public void updaterow(Integer rownum, String userid) {
		// TODO Auto-generated method stub
		usertoredbagMapper.updaterow(rownum,userid);
	}


	@Override
	public void updaterownum(Integer totalrownum, String userid) {
		// TODO Auto-generated method stub
		usertoredbagMapper.updaterownum(totalrownum,userid);
	}


	@Override
	public void updateTotalmoney(Double totalmoney, String userid) {
		// TODO Auto-generated method stub
		usertoredbagMapper.updateTotalmoney(totalmoney,userid);
	}


	@Override
	public List<String> selectByTotalMoney(Integer totalrownum, String usernickname, String userid,
			Double totalmoney) {
		List<String>list=usertoredbagMapper.selectByTotalMoney(totalrownum,usernickname,userid,totalmoney);
		return list;
	}


	@Override
	public List<Usertoredbag> selectrownum(String userid) {
		List<Usertoredbag> list2= usertoredbagMapper.selectrownum(userid);
		return list2;
	}


	@Override
	public void insertmoney(Double money, String userid) {
		usertoredbagMapper.insertmoney(money,userid);
		
	}


	@Override
	public void updatemoney(Double money, String userid,Integer id) {
		usertoredbagMapper.updatemoney(money,userid,id);
		
	}


	@Override
	public List<String> selectrownum(Integer totalrownum, String userid) {
		return usertoredbagMapper.selectrownum(totalrownum,userid);
	}


	@Override
	public List<String> selectusernickname(String usernickname, String userid) {
		return usertoredbagMapper.selectusernickname(usernickname,userid);
	}


	@Override
	public List<String> selectmoney() {
		return usertoredbagMapper.selectmoney();
	}

//查询个人排行
	@Override
	public Integer selectrownumone(String userid) {
		return usertoredbagMapper.selectrownumone(userid);
	}

	//查询单人是否在表中
	@Override
	public List<String> selectByTotalMoneyone(String userid) {
		return usertoredbagMapper.selectByTotalMoneyone(userid);
	}


	@Override
	public Integer selectlastrownum(String userid) {
		return usertoredbagMapper.selectlastrownum(userid);
	}


	@Override
	public List<String> selectmaxrownum(String userid) {
		return usertoredbagMapper.selectmaxrownum(userid);
	}


	@Override
	public List<String> selectmaxusernickname(String usernickname, String userid) {
		return usertoredbagMapper.selectmaxusernickname(usernickname,userid);
	}


	@Override
	public List<String> selectmaxmoney() {
		return usertoredbagMapper.selectmaxmoney();
	}


	@Override
	public List<String> selectBymaxMoneyone(String userid) {
		return usertoredbagMapper.selectBymaxMoneyone(userid);
	}


	@Override
	public Integer selectMAXrownumone(String userid) {
		return usertoredbagMapper.selectMAXrownumone(userid);
	}


	@Override
	public Integer selectmaxlastrownum(String userid) {
		return usertoredbagMapper.selectmaxlastrownum(userid);
	}


	@Override
	public void updatemoneynumlast1(String userid) {
		usertoredbagMapper.updatemoneynum1(userid);
	}


	@Override
	public Integer selectredbagnum(Date moneytime, String userid) {
		return usertoredbagMapper.selectredbagnum(moneytime,userid);
	}


	@Override
	public void insertRedbag2(String userid) {
		usertoredbagMapper.insertRedbag2(userid);
		
	}
	@Override
	public void insertRedbag3(String userid) {
		usertoredbagMapper.insertRedbag3(userid);
		
	}


	@Override
	public Integer selectrednum(String userid) {
		return usertoredbagMapper.selectrednum(userid);
	}


	@Override
	public Integer selectcount(String userid) {
		return usertoredbagMapper.selectcount(userid);
	}


	@Override
	public void updatetype(Integer redbagtype, String userid, Integer redbagnum) {
		usertoredbagMapper.updatetype(redbagtype,userid,redbagnum);
	}


	@Override
	public void updatetype2(Integer redbagtype, String userid, Integer redbagnum) {
		usertoredbagMapper.updatetype(redbagtype,userid,redbagnum);
	}


	@Override
	public void updatetype3(Integer redbagtype, String userid, Integer redbagnum) {
		usertoredbagMapper.updatetype(redbagtype,userid,redbagnum);
	}


	@Override
	public List<Usertoredbag> selectByType(String userid) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectByType(userid);
	}


	@Override
	public Integer selectredbagnum(String userid) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectredbagnum2(userid);
	}


	@Override
	public Integer selectcount2(String userid) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectcount2(userid);
	}


	@Override
	public List<Usertoredbag> selectredbagnum1(String userid) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectredbagnum1(userid);
	}
	
	public List<Usertoredbag> selectredbagnum3(String userid) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectredbagnum3(userid);
	}
	
	public List<Usertoredbag> selectredbagnum4(String userid) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectredbagnum4(userid);
	}


	@Override
	public List<Usertoredbag> selectredbagid1(String userid) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectredbagid1(userid);
	}


	@Override
	public List<Usertoredbag> selectredbagid2(String userid) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectredbagid2(userid);
	}


	@Override
	public List<Usertoredbag> selectredbagid3(String userid) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectredbagid3(userid);
	}


	@Override
	public void updateredbagid1(String userid) {
		// TODO Auto-generated method stub
		usertoredbagMapper.updateredbagid1(userid);
	}
	public void updateredbagid2(String userid) {
		// TODO Auto-generated method stub
		usertoredbagMapper.updateredbagid2(userid);
	}
	public void updateredbagid3(String userid) {
		// TODO Auto-generated method stub
		usertoredbagMapper.updateredbagid3(userid);
	}
	public Integer selectredbagid(String userid) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectredbagid(userid);
	}


	@Override
	public void updatecountdownbegintime(String userid,Integer redbagnum) {
		// TODO Auto-generated method stub
		usertoredbagMapper.updatecountdownbegintime(userid,redbagnum);
	}


	@Override
	public Integer selectuseri(String userid) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectuseri(userid);
	}


	@Override
	public String selectcountdown(String userid, Integer redbagnum) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectcountdown(userid,redbagnum);
	}


	@Override
	public String selectnow() {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectnow();
	}


	@Override
	public void updateintegral(String userid) {
		// TODO Auto-generated method stub
		usertoredbagMapper.updateintegral(userid);
	}


	@Override
	public void updateredbagtype(String userid, Integer redbagnum) {
		// TODO Auto-generated method stub
		usertoredbagMapper.updateredbagtype(userid,redbagnum);
	}


	@Override
	public Integer selecttype(String userid, Integer redbagnum) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selecttype(userid,redbagnum);
		
	}


	@Override
	public void updateredbagtype1(String userid, Integer redbagnum) {
		// TODO Auto-generated method stub
		usertoredbagMapper.updateredbagtype1(userid,redbagnum);
	}
	
	
	@Override
	public void updateintegral10(String userid) {
		// TODO Auto-generated method stub
		usertoredbagMapper.updateintegral10(userid);
	}
	
	
	@Override
	public void updateintegral15(String userid) {
		// TODO Auto-generated method stub
		usertoredbagMapper.updateintegral15(userid);
	}
	
	
	@Override
	public void updateintegral20(String userid) {
		// TODO Auto-generated method stub
		usertoredbagMapper.updateintegral20(userid);
	}


	@Override
	public List<Usertoredbag> selectByType2(String userid) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectByType2(userid);
	}


	@Override
	public String selectnownow() {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectnownow();
	}
	
	public String selecttimedown() {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selecttimedown();
	}


	@Override
	public String selectactivitytime(String userid) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectactivitytime(userid);
	}


	@Override
	public Integer selectnumber(String userid) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectnumber(userid);
	}


	@Override
	public String selectnowlast() {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectnowlast();
	}


	@Override
	public void selectByredbagType(Integer redbagnum, String userid) {
		// TODO Auto-generated method stub
		usertoredbagMapper.selectByredbagType(redbagnum,userid);
	}


	@Override
	public Integer selectcountnum(String userid) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectcountnum(userid);
	}


	@Override
	public String selectcountdownlist(String userid) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectcountdownlist(userid);
	}
	@Override
	public String selectcountdownlist2(String userid) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectcountdownlist2(userid);
	}
	@Override
	public String selectcountdownlist3(String userid) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectcountdownlist3(userid);
	}


	@Override
	public Integer selectredbagnumtime(String userid) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectredbagnumtime(userid);
	}


	@Override
	public List<Date> selectredbagtime(String userid) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectredbagtime(userid);
	}


	@Override
	public String selectcountdowntime(String userid) {
		// TODO Auto-generated method stub
		return  usertoredbagMapper.selectcountdowntime(userid);
	}


	@Override
	public void updateredbagtypeone(String userid) {
		// TODO Auto-generated method stub
		 usertoredbagMapper.updateredbagtypeone(userid);
	}


	@Override
	public List<User> selectuseralipayid(String userid) {
		// TODO Auto-generated method stub
		return usertoredbagMapper.selectuseralipayid(userid);
	}
	
}
