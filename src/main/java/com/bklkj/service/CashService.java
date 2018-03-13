package com.bklkj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bklkj.pojo.Cash;

@Service
public interface CashService {

	public void insert(Cash cash);

	public List<Cash> selectByAll();

	public List<Cash> selectByRedbag() throws Exception;

	public List<Cash> selectByActivity() throws Exception;

	public List<Cash> selectByMoney() throws Exception;

	List<Cash> selectByActivityMoney();

	List<Cash> selectByRedbagMoney();

}
