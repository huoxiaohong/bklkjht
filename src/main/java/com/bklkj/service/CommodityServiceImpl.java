package com.bklkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bklkj.dao.CommodityMapper;

@Service
public class CommodityServiceImpl implements CommodityService {

	@Autowired
	private CommodityMapper commodityMapper;
	
	@Override
	public List<String> selectordernum() {
		// TODO Auto-generated method stub
		return commodityMapper.selectordernum();
	}

	@Override
	public List<String> selectordername() {
		// TODO Auto-generated method stub
		return commodityMapper.selectordername();
	}

	@Override
	public List<String> selectorderprice() {
		// TODO Auto-generated method stub
		return commodityMapper.selectorderprice();
	}

	@Override
	public List<String> selectorderdescribe() {
		// TODO Auto-generated method stub
		return commodityMapper.selectorderdescribe();
	}

}
