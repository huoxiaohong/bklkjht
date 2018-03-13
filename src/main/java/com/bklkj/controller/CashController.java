package com.bklkj.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bklkj.pojo.Cash;
import com.bklkj.service.CashService;

@Controller
@RequestMapping("cash")
public class CashController {

	@Autowired
	private CashService cashService;

	// �ж��Ƿ�Ϊ����
	public static Date getNextDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		date = calendar.getTime();
		return date;
	}

	// �û�������ֽ�
	@RequestMapping("insert")
	@ResponseBody
	public void insert(Cash cash) {
		cashService.insert(cash);
	}

	// �û������ֽ��ѯ
	@RequestMapping("selectByAll")
	@ResponseBody
	public List<Cash> selectByAll() {
		List<Cash> list = cashService.selectByAll();
		return list;
	}

	// �û�ͨ�������ֽ�Ĳ�ѯ
	@RequestMapping("selectByRedbag")
	@ResponseBody
	public List<Cash> selectByRedbag() throws Exception {
		List<Cash> list = cashService.selectByRedbag();
		return list;

	}

	// �û�ͨ������ֽ�Ĳ�ѯ
	@RequestMapping("selectByActivity")
	@ResponseBody
	public List<Cash> selectByActivity() throws Exception {
		List<Cash> list = cashService.selectByActivity();
		return list;

	}

	// ʱ��β���ȫ��
	@RequestMapping("selectByMoney")
	@ResponseBody
	public List<Cash> selectByMoney() throws Exception {
		List<Cash> list = cashService.selectByMoney();
		return list;
	}

	// ʱ��β��һ����ֽ�
	@RequestMapping("selectByActivityMoney")
	@ResponseBody
	public List<Cash> selectByActivityMoney() throws Exception {
		List<Cash> list = cashService.selectByActivityMoney();
		return list;
	}

	// 根据得到红包时间排序
	@RequestMapping("selectByRedbagTime")
	@ResponseBody
	public List<Cash> selectByRedbagMoney() throws Exception {
		List<Cash> list = cashService.selectByRedbagMoney();
		return list;
	}

}
