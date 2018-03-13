package com.bklkj.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bklkj.pojo.Business;
import com.bklkj.pojo.Redbag;

@Service
public interface RedBagService {

	public Integer updateRedbag(Redbag redbag);

	public void updateRedbag2(Redbag redbag);

	public void updateRedbag3(Redbag redbag);

	public void updateRedbag4(Redbag redbag);

	Integer updateRedbagNum(Integer redbagNum);

	public List<Redbag> selectByUserId(String userid);

	public List<Redbag> selectUserIdJudge(String userid);

	public Integer insertMax(Integer redbagnum, Double redbagmoney, String userid, Integer businessid);

	public List<Redbag> selectBusinessName(String redbagbusiness, String userid);

	public Integer insertMin(Integer redbagnum, Double redbagmoney, String userid, Integer businessid);

	public List<Redbag> selectLast(String userid, Date redbagtime);

	public void updateJudge(Integer judge, String userid);

	public Double selectSumMoney(Double redbagmoney, String userid);

	public List<String> selectBusinessName(String userid);

	public Double selectshengyumoney(String userid);

	public void updatebusinessmoney(String userid);

	public List<String> selectBusinessweb(String userid);

	public List<String> selectredbagrecord(String userid);

	public List<String> selectBusinessPiture(String userid);

	public List<String> selectime(String userid);

	public List<String> selectnames(String userid);

	public List<String> selectlogo(String userid);

	public List<String> selectmoney();

	public Double selectpaihangmoney(String userid);

	public Integer selectpaihang(String userid);

	public Integer selectpaihangno(String userid);

	public List<String> selectredbagtype(String userid);

	public List<String> selectbusinessintroduce(String userid);

	

}
