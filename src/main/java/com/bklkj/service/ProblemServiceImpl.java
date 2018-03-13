package com.bklkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bklkj.dao.ProblemMapper;
import com.bklkj.pojo.Problem;

@Service
public class ProblemServiceImpl implements ProblemService{
	
	@Autowired
	private ProblemMapper problemMapper;

	@Override
	public Integer selectrand(String userid,Integer rownum) {
		// TODO Auto-generated method stub
		return problemMapper.selectrand(userid,rownum);
	}

	@Override
	public Integer selectproblemonetype(String userid,Integer rownum) {
		// TODO Auto-generated method stub
		return problemMapper.selectproblemonetype(userid,rownum);
	}

	@Override
	public Integer selectproblemtwotype(String userid,Integer rownum) {
		// TODO Auto-generated method stub
		 return problemMapper.selectproblemtwotype(userid,rownum);
	}

	@Override
	public Integer selectproblemthreetype(String userid,Integer rownum) {
		// TODO Auto-generated method stub
		 return problemMapper.selectproblemthreetype(userid,rownum);
	}

	@Override
	public void insertMin(Integer rownum,Double redbagmoney, String userid, Integer businessid) {
		// TODO Auto-generated method stub
		 problemMapper.insertMin(rownum,redbagmoney,userid,businessid);
	}

	@Override
	public List<Problem> selectproblemone(Integer rownum) {
		// TODO Auto-generated method stub
		return problemMapper.selectproblemone(rownum);
	}

	@Override
	public Integer selectans(Integer ans, String userid) {
		// TODO Auto-generated method stub
		return problemMapper.selectans(ans,userid);
	}

	@Override
	public void updatebusinessmoney(String userid) {
		// TODO Auto-generated method stub
		 problemMapper.updatebusinessmoney(userid);
	}

	@Override
	public Double selectmoney(String userid) {
		// TODO Auto-generated method stub
		return problemMapper.selectmoney(userid);
	}

	@Override
	public String selectname(String userid) {
		// TODO Auto-generated method stub
		return problemMapper.selectname(userid);
	}

	@Override
	public String selectlogo(String userid) {
		// TODO Auto-generated method stub
		return problemMapper.selectlogo(userid);
	}

	@Override
	public String selectweb(String userid) {
		// TODO Auto-generated method stub
		return problemMapper.selectweb(userid);
	}

	@Override
	public List<Problem> selectproblem() {
		// TODO Auto-generated method stub
		return problemMapper.selectproblem();
	}

	@Override
	public String selectintroduce(String userid) {
		// TODO Auto-generated method stub
		return problemMapper.selectintroduce(userid);
	}
	
	@Override
	public void updatebusinessmoney2(String userid) {
		// TODO Auto-generated method stub
		 problemMapper.updatebusinessmoney2(userid);
	}

	@Override
	public Integer selectbusinesstype() {
		// TODO Auto-generated method stub
		return problemMapper.selectbusinesstype();
	}
	
	@Override
	public Integer selectbusinesstype2() {
		// TODO Auto-generated method stub
		return problemMapper.selectbusinesstype2();
	}
	
	@Override
	public Integer selectbusinesstype3() {
		// TODO Auto-generated method stub
		return problemMapper.selectbusinesstype3();
	}

	@Override
	public void updatejoinnum1() {
		// TODO Auto-generated method stub
		problemMapper.updatejoinnum1();
	}
	@Override
	public void updatejoinnum2() {
		// TODO Auto-generated method stub
		problemMapper.updatejoinnum2();
	}
	@Override
	public void updatejoinnum3() {
		// TODO Auto-generated method stub
		problemMapper.updatejoinnum3();
	}
	public void updatejoinnum11() {
		// TODO Auto-generated method stub
		problemMapper.updatejoinnum11();
	}
	public void updatejoinnum22() {
		// TODO Auto-generated method stub
		problemMapper.updatejoinnum22();
	}
	public void updatejoinnum33() {
		// TODO Auto-generated method stub
		problemMapper.updatejoinnum33();
	}

}
