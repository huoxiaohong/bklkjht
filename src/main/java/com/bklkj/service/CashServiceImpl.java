package com.bklkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bklkj.dao.CashMapper;
import com.bklkj.pojo.Cash;

@Service
public class CashServiceImpl implements CashService {
	
	
	@Autowired
	private CashMapper cashMapper;
	//�û�������ֽ�
	@Override
	public void insert(Cash cash) {
		cashMapper.insert(cash);
	}
	
	//��ѯ�û���õ��ֽ���
	@Override
	public List<Cash> selectByAll() {
		List<Cash> list = cashMapper.selectByAll();
		return list;
	}

	@Override
	public List<Cash> selectByRedbag() throws Exception {
		List<Cash> list=cashMapper.selectByRedbag();
		return list;
	}

	@Override
	public List<Cash> selectByActivity() throws Exception {
		List<Cash> list=cashMapper.selectByActivity();
		return list;
	}
	
	public List<Cash> selectByMoney()throws Exception{
		List<Cash> list=cashMapper.selectByMoney();
		return list;
	}

	@Override
	public List<Cash> selectByActivityMoney() {
		List<Cash> list=cashMapper.selectByActivityMoney();
		return list;
	}

	@Override
	public List<Cash> selectByRedbagMoney() {
		List<Cash> list=cashMapper.selectByRedbagMoney();
		return list;
	}
	
}
