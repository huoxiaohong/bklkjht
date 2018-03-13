package com.bklkj.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bklkj.dao.RedbagMapper;
import com.bklkj.pojo.Business;
import com.bklkj.pojo.Redbag;

@Service
public class RedBagServiceImpl implements RedBagService {

	@Autowired
	private RedbagMapper redbagMapper;
	
	//更改红包数量
	@Override
	public Integer updateRedbagNum(Integer redbagNum) {
		return redbagMapper.updateRedbagNum(redbagNum);
		
	}
	//更改红包
	@Override
	public Integer updateRedbag(Redbag redbag) {
		return redbagMapper.updateRedbag(redbag);
	}
	
	@Override
	public void updateRedbag2(Redbag redbag) {
		 redbagMapper.updateRedbag2(redbag);
	}

	@Override
	public void updateRedbag3(Redbag redbag) {
		 redbagMapper.updateRedbag3(redbag);
	}

	@Override
	public void updateRedbag4(Redbag redbag) {
		 redbagMapper.updateRedbag4(redbag);
	}
	@Override
	public List<Redbag> selectByUserId(String userid) {
		List<Redbag>list=redbagMapper.selectByUserId(userid);
		return list;
	}
	@Override
	public List<Redbag> selectUserIdJudge(String userid) {
		List<Redbag>list=redbagMapper.selectUserIdJudge(userid);
		return list;
	}
	@Override
	public Integer insertMax(Integer redbagnum,Double redbagmoney,String userid,Integer businessid) {
		return redbagMapper.insertMax(redbagnum,redbagmoney,userid,businessid);
	}
	@Override
	public List<Redbag> selectBusinessName(String redbagbusiness, String userid) {
		List<Redbag>list=redbagMapper.selectBusinessName(redbagbusiness,userid);
		return list;
	}
	@Override
	public Integer insertMin(Integer redbagnum,Double redbagmoney, String userid,Integer businessid) {
		return redbagMapper.insertMin(redbagnum,redbagmoney,userid,businessid);
	}
	@Override
	public List<Redbag> selectLast(String userid, Date redbagtime) {
		List<Redbag>list = redbagMapper.selectLast(userid,redbagtime);
		return list;
	}
	@Override
	public void updateJudge(Integer judge, String userid) {
		redbagMapper.updateJudge(judge,userid);
		
	}
	@Override
	public Double selectSumMoney(Double redbagmoney, String userid) {
		return redbagMapper.selectSumMoney(redbagmoney,userid);
	}
	@Override
	public List<String> selectBusinessName(String userid) {
		return redbagMapper.selectBusinessName(userid);
	}
	@Override
	public Double selectshengyumoney(String userid) {
		return redbagMapper.selectshengyumoney(userid);
	}
	@Override
	public void updatebusinessmoney(String userid) {
		redbagMapper.updatebusinessmoney(userid);
		
	}
	@Override
	public List<String> selectBusinessweb(String userid) {
		return redbagMapper.selectBusinessweb(userid);
	}
	@Override
	public List<String> selectredbagrecord(String userid) {
		return redbagMapper.selectredbagrecord(userid);
	}
	@Override
	public List<String> selectBusinessPiture(String userid) {
		return redbagMapper.selectBusinessPiture(userid);
	}
	@Override
	public List<String> selectime(String userid) {
		return redbagMapper.selectime(userid);
	}
	@Override
	public List<String> selectnames(String userid) {
		return redbagMapper.selectnames(userid);
	}
	@Override
	public List<String> selectlogo(String userid) {
		return redbagMapper.selectlogo(userid);
	}
	@Override
	public List<String> selectmoney(){
		return redbagMapper.selectmoney();
	}
	@Override
	public Double selectpaihangmoney(String userid) {
		return redbagMapper.selectpaihangmoney(userid);
	}
	@Override
	public Integer selectpaihang(String userid) {
		return redbagMapper.selectpaihang(userid);
	}
	@Override
	public Integer selectpaihangno(String userid) {
		// TODO Auto-generated method stub
		return redbagMapper.selectpaihangno(userid);
	}
	@Override
	public List<String> selectredbagtype(String userid) {
		// TODO Auto-generated method stub
		return redbagMapper.selectredbagtype(userid);
	}
	@Override
	public List<String> selectbusinessintroduce(String userid) {
		// TODO Auto-generated method stub
		return redbagMapper.selectbusinessintroduce(userid);
	}
	
	
}
