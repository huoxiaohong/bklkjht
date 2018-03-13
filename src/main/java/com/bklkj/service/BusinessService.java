package com.bklkj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bklkj.pojo.Business;


@Service
public interface BusinessService {
	//添加商户
	public void insertBusiness(Business business)throws Exception;
	 //
	public Integer deleteById(Integer businessId)throws Exception;
	
	public List<Business> selectBusiness();
	//
	public void updateBusinessById(Business business);
	//根据名字查询商户
	public List<Business> selectByName(/*@Param("businessName")*/String businessName) throws Exception;
	
	public List<Business> selectByAll();
	
	public void deleteById(Business businessId)throws Exception;
	
	public Integer selectbusinesscount();
	
	public List<String> selectBusinessname();
	
	public Integer selectforbusinessname();
	
	public void insertinto(String businessname, String businessphone, String businessaddress, String logo,
			String BusinessIntroduce, String businessWebsite, String businessemail, String businesspicture1,
			String businesspicture2, String businesspicture3, String businesspicture4, String businesspicture5);
	

}
