package com.bklkj.service;

import java.util.List;

import com.bklkj.pojo.User;

/**
 * @author huoxiaohong
 * @version 创建时间：2018年1月4日 下午4:04:39
 * @Title:  huoUserService.java   
 * @Package com.bklkj.service 
 * @Description TODO
 */
public interface huoUserService {
	/**
	 * select * from user limit 0,20 :0是起始值 20是条数
	 * select * from user limit 0,-1 :0起始值  -1 代表到last
	 * select * from user limit 5 :检索前五行
	 * */
	List<User> selectHuoUser();

	List<User> selectjion(Integer loginway, String userid);

	List<User> selectbyphone(String userphone);

}
