package com.bklkj.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bklkj.dao.GoldMapper;
import com.bklkj.dao.UserMapper;
import com.bklkj.pojo.Gold;
import com.bklkj.pojo.User;

@Service
public class GoldServiceImpl implements GoldService {
	@Autowired
	private GoldMapper goldMapper;
	@Autowired
	private UserMapper userMapper;

	@Override
	public Integer insert(Integer goldnum, String userid) {
		return goldMapper.insertGold(goldnum,userid);
	}

	@Override
	public Integer updateUserGold(Integer goldnum, String userid) {
		
		return goldMapper.updateUserGold(goldnum,userid);
	}

	@Override
	public Integer useGold(Integer goldnum, String userid) {
		return goldMapper.useGold(goldnum,userid);
	}

	@Override
	public List<User> selectUserGold(Integer usergold,String userid) {
		List<User>list= userMapper.selectUserGold(usergold,userid);
		return list;
		
	}

	@Override
	public Integer insertMax(Integer goldnum, String userid) {
		
		return goldMapper.insertMaxGold(goldnum,userid);
		
	}

	@Override
	public Integer insertMin(Integer goldnum, String userid) {
		
		return goldMapper.insertMinGold(goldnum,userid);
	}

	@Override
	public List<Gold> selectUserLastGold(String userid) {
		List<Gold>list=goldMapper.selectUserLastGold(userid);
		return list;
	}

	@Override
	public List<Gold> selectById(String userid) {
		List<Gold>list=goldMapper.selectById(userid);
		return list;
	}

}
