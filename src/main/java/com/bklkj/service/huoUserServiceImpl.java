package com.bklkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bklkj.dao.UserMapper;
import com.bklkj.pojo.User;

/**
 * @author huoxiaohong
 * @version 创建时间：2018年1月4日 下午4:06:07
 * @Title: huoUserServiceImpl.java
 * @Package com.bklkj.service
 * @Description TODO
 */
@Service
public class huoUserServiceImpl implements huoUserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> selectHuoUser() {
		List<User> list = userMapper.selectByAll();
		return list;
	}

	@Override
	public List<User> selectjion(Integer loginway, String userid) {
		List<User> list = userMapper.selectLoginWay(loginway, userid);
		return list;
	}

	@Override
	public List<User> selectbyphone(String userphone) {
		List<User> list = userMapper.selectByPhone(userphone);
		return list;
	}

}
