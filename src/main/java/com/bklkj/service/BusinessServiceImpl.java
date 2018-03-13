package com.bklkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bklkj.dao.BusinessMapper;
import com.bklkj.pojo.Business;

@Service
public class BusinessServiceImpl implements BusinessService {

	@Autowired
	private BusinessMapper businessMapper;
	
	
	@Override
	public List<Business> selectByAll() {
		List<Business> list=businessMapper.selectByAll();
		return list;
	}
	
	//添加商户
	@Override
	public void insertBusiness(Business business) throws Exception {
		System.out.println(business);
		 businessMapper.insertSelective(business);
		 System.out.println(business);
	}
	
	
	@Override
	public void deleteById(Business businessId) {
		Business business = new Business();
		int a=business.getBusinessid();
		 businessMapper.deleteById(a);
	}

	
	@Override
	public void updateBusinessById(Business businessId) {
		businessMapper.updateBusinessById(businessId);
	}
	
	//根据名字查询商户
	@Override
	public List<Business> selectByName(String businessName) throws Exception {
		/*BusinessExample example=new BusinessExample();
		Criteria criteria = example.createCriteria();
		System.out.println(businessName);*/
	//  criteria.andBusinessnameEqualTo(new String(businessName.getBytes("iso-8859-1"), "utf-8"));
	//	List<Business> selectByExample = businessMapper.selectByExample(example);
		businessName=new String(businessName.getBytes("8859_1"), "utf8");
		List<Business> list = businessMapper.selectByName(businessName);
		//System.out.println(list); - =OK 
		//return selectByExample;
		return list;
	}
	

	@Override
	public List<Business> selectBusiness() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteById(Integer businessId) throws Exception {
		// TODO Auto-generated method stub
		 int i=businessMapper.deleteById(businessId);
		return i;
	}

	@Override
	public Integer selectbusinesscount() {
		// TODO Auto-generated method stub
		return businessMapper.selectbusinesscount();
	}

	@Override
	public List<String> selectBusinessname() {
		// TODO Auto-generated method stub
		return businessMapper.selectBusinessname();
	}

	@Override
	public Integer selectforbusinessname() {
		// TODO Auto-generated method stub
		return businessMapper.selectforbusinessname();
	}

	@Override
	public void insertinto(String businessname, String businessphone, String businessaddress, String logo,
			String BusinessIntroduce, String businessWebsite, String businessemail, String businesspicture1,
			String businesspicture2, String businesspicture3, String businesspicture4, String businesspicture5) {
		// TODO Auto-generated method stub
		businessMapper.insertinto(businessname,businessphone,businessaddress,logo,BusinessIntroduce,
				businessWebsite,businessemail,
				businesspicture1,
				businesspicture2,
				businesspicture3,
				businesspicture4,
				businesspicture5);
	}



	/****************************************************************/
	
}
