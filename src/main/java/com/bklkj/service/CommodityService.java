package com.bklkj.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface CommodityService {

	List<String> selectordernum();

	List<String> selectordername();

	List<String> selectorderprice();

	List<String> selectorderdescribe();

	
	
}
