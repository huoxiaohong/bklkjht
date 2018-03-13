package com.bklkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bklkj.dao.AdministrationMapper;
import com.bklkj.pojo.Administration;
import com.bklkj.pojo.AdministrationExample;
import com.bklkj.pojo.AdministrationExample.Criteria;

@Service
public class AdministrationServiceImpl implements AdministrationService {
	
	@Autowired
	private AdministrationMapper administrationMapper;

	@Override
	public Administration userLogin(String AdministrationName, String AdministrationPassword) {
		AdministrationExample example=new AdministrationExample();
			Criteria criteria = example.createCriteria();
			criteria.andAdministrationnameEqualTo(AdministrationName);
			criteria.andAdministrationpasswordEqualTo(AdministrationPassword);
			administrationMapper.selectByExample(example);
			List<Administration> list;
			return (list=administrationMapper.selectByExample(example))==null||list.size()==0?null:list.get(0);
		
	}
	
}
