package com.bklkj.service;

import org.springframework.stereotype.Service;

import com.bklkj.pojo.Alipay;

@Service
public interface AlipayService {

	void insert(Alipay alipay);

	void updateuser(String userid, String payid, String alipaystate);

	String selectalipaystate(String userid);

	String selectalipayid(String userid);

	void insertwithdraw(String orderNo, String userid, String amount);

	void updateusermoney(String userid, String amount);

	Integer selectusergold(String userid);

	void updategold(String userid, String amount);

	String selectordermoney(String commodityid);

	String selectsbuject(String commodityid);

	void updateuserintegral10(String userid);

	void updateuserintegral60(String userid);

	void updateuserintegral198(String userid);

	void updateuserintegral388(String userid);

	void updateuserintegral998(String userid);

	void updateuserintegral1988(String userid);

	void update10(String userid);
	void update60(String userid);
	void update198(String userid);
	void update388(String userid);
	void update998(String userid);
	void update1988(String userid);




}
