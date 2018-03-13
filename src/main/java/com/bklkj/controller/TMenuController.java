package com.bklkj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bklkj.pojo.TMenu;
import com.bklkj.service.TMenuService;

@Controller
@RequestMapping("tMenu")
public class TMenuController {
	@Autowired
	private TMenuService tMenuService;
	
	
	//��ѯ
	@RequestMapping("selectByAll")
	@ResponseBody
	public List<TMenu> selecyByAll() throws Exception{
		List<TMenu> list = tMenuService.selectByAll();
		return list;
	}
	
	
}
