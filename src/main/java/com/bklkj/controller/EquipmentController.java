package com.bklkj.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bklkj.pojo.Equipment;
import com.bklkj.service.EquipmentService;


@Controller
@RequestMapping("equipment")
public class EquipmentController {
	@Autowired
	private EquipmentService equipmentService;
	
	@RequestMapping("insert")
	@ResponseBody
	public void insert (@RequestParam("equipmentname")String equipmentname,@RequestParam("userid")String userid){
		equipmentService.insert(equipmentname,userid);
		
	}
	@RequestMapping("selectByUserId")
	@ResponseBody
	public List<Equipment> selectByUserId (String equipmentname,String userid){
		List<Equipment>list=equipmentService.selectByUserId( equipmentname,userid);
		return list;
	}
	
	@RequestMapping("updateByUserId")
	@ResponseBody
	public Integer updateByUserId (String equipmentname,String userid){
		return equipmentService.updateByUserId(equipmentname,userid);
	}
	
}
