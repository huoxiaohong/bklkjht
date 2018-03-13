package com.bklkj.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.bklkj.pojo.Problem;


@Service
public interface ProblemService {

	Integer selectrand(String userid, Integer rownum);

	Integer selectproblemonetype(String userid, Integer rownum);

	Integer selectproblemtwotype(String userid,Integer rownum);

	Integer selectproblemthreetype(String userid,Integer rownum);

	void insertMin(Integer rownum, Double redbagmoney, String userid, Integer businessid);
	//查询是哪个问题
	List<Problem> selectproblemone(Integer rownum);

	Integer selectans(Integer ans, String userid);

	void updatebusinessmoney(String userid);

	Double selectmoney(String userid);

	String selectname(String userid);

	String selectlogo(String userid);

	String selectweb(String userid);

	List<Problem> selectproblem();

	String selectintroduce(String userid);

	void updatebusinessmoney2(String userid);

	Integer selectbusinesstype();

	Integer selectbusinesstype2();
	
	Integer selectbusinesstype3();

	void updatejoinnum1();
	
	void updatejoinnum2();

	void updatejoinnum3();

	void updatejoinnum33();
	void updatejoinnum11();
	void updatejoinnum22();

}
