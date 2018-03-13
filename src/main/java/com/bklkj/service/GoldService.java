package com.bklkj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bklkj.pojo.Gold;
import com.bklkj.pojo.User;



@Service
public interface GoldService {
	
		//添加
		Integer insert(Integer goldnum, String userid);

		Integer updateUserGold(Integer goldnum, String userid);

		Integer useGold(Integer goldnum, String userid);

		List<User> selectUserGold(Integer usergold, String userid);

		Integer insertMax(Integer goldnum, String userid);

		Integer insertMin(Integer goldnum, String userid);

		List<Gold> selectUserLastGold(String userid);

		List<Gold> selectById( String userid);

}
