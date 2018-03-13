package com.bklkj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bklkj.dao.WxMapper;
import com.bklkj.pojo.Wx;

@Service
public class WxServiceImpl implements WxService{

	@Autowired
	private WxMapper wxMapper;
	
	//添加购买记录
	@Override
	public void insert(Wx wx) {
		// TODO Auto-generated method stub
		wxMapper.insert(wx);
	}

}
