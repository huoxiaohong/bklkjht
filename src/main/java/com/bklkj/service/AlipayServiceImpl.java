package com.bklkj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bklkj.dao.AlipayMapper;
import com.bklkj.pojo.Alipay;

@Service
public class AlipayServiceImpl implements AlipayService {
	
	@Autowired
	private AlipayMapper alipayMapper;

	@Override
	public void insert(Alipay alipay) {
		
		
		alipayMapper.insert(alipay);
		
	}

	@Override
	public void updateuser(String userid, String payid,String alipaystate) {
		alipayMapper.updateuser(userid,payid,alipaystate);
	}

	@Override
	public String selectalipaystate(String userid) {
		// TODO Auto-generated method stub
		return alipayMapper.selectalipaystate(userid);
	}

	@Override
	public String selectalipayid(String userid) {
		// TODO Auto-generated method stub
		return alipayMapper.selectalipayid(userid);
	}

	@Override
	public void insertwithdraw(String orderNo, String userid, String amount) {
		// TODO Auto-generated method stub
		alipayMapper.insertwithdraw(orderNo,userid,amount);
	}

	@Override
	public void updateusermoney(String userid,String amount) {
		// TODO Auto-generated method stub
		alipayMapper.updateusermoney(userid,amount);
	}

	@Override
	public Integer selectusergold(String userid) {
		// TODO Auto-generated method stub
		return alipayMapper.selectusergold(userid);
	}

	@Override
	public void updategold(String userid,String amount) {
		// TODO Auto-generated method stub
		alipayMapper.updategold(userid,amount);
	}

	@Override
	public String selectordermoney(String commodityid) {
		// TODO Auto-generated method stub
		return alipayMapper.selectordermoney(commodityid);
	}

	@Override
	public String selectsbuject(String commodityid) {
		// TODO Auto-generated method stub
		return alipayMapper.selectsbuject(commodityid);
	}

	@Override
	public void updateuserintegral10(String userid) {
		// TODO Auto-generated method stub
		alipayMapper.updateuserintegral10(userid);
	}

	@Override
	public void updateuserintegral60(String userid) {
		// TODO Auto-generated method stub
		alipayMapper.updateuserintegral60(userid);
	}

	@Override
	public void updateuserintegral198(String userid) {
		// TODO Auto-generated method stub
		alipayMapper.updateuserintegral198(userid);
	}

	@Override
	public void updateuserintegral388(String userid) {
		// TODO Auto-generated method stub
		alipayMapper.updateuserintegral388(userid);
	}

	@Override
	public void updateuserintegral998(String userid) {
		// TODO Auto-generated method stub
		alipayMapper.updateuserintegral1988(userid);
	}
	
	public void updateuserintegral1988(String userid) {
		// TODO Auto-generated method stub
		alipayMapper.updateuserintegral1988(userid);
	}

	@Override
	public void update10(String userid) {
		// TODO Auto-generated method stub
		alipayMapper.updateuserintegral10(userid);
	}

	@Override
	public void update60(String userid) {
		// TODO Auto-generated method stub
		alipayMapper.update60(userid);
	}

	@Override
	public void update198(String userid) {
		// TODO Auto-generated method stub
		alipayMapper.update198(userid);
	}

	@Override
	public void update388(String userid) {
		// TODO Auto-generated method stub
		alipayMapper.update388(userid);
	}

	@Override
	public void update998(String userid) {
		// TODO Auto-generated method stub
		alipayMapper.update998(userid);
	}

	@Override
	public void update1988(String userid) {
		// TODO Auto-generated method stub
		alipayMapper.update1988(userid);
	}

	

}
