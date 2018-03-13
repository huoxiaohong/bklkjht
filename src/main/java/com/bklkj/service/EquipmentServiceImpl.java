package com.bklkj.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bklkj.dao.EquipmentMapper;
import com.bklkj.pojo.Equipment;

@Service
public class EquipmentServiceImpl implements EquipmentService {

	@Autowired
	private EquipmentMapper equipmentMapper;
	
	//
	@Override
	public void insert(String equipmentname,String userid) {
		equipmentMapper.insert(equipmentname,userid);
		
	}

	@Override
	public List<Equipment> selectByUserId(String equipmentname,String userid) {
		List<Equipment>list=equipmentMapper.selectByUserId(equipmentname,userid);
		return list;
	}

	@Override
	public Integer updateByUserId(String equipmentname,String userid) {
		// TODO Auto-generated method stub
		return equipmentMapper.updateByUserId(equipmentname,userid);
	}

	@Override
	public List<Equipment> selectByUserIdPhone(String equipmentname, String userphone) {
		List<Equipment>list=equipmentMapper.selectByUserIdPhone(equipmentname,userphone);
		return list;
	}

	@Override
	public Integer updateByUserIdPhone(String equipmentname, String userphone) {
		return equipmentMapper.updateByUserIdPhone(equipmentname,userphone);
		
	}


	@Override
	public void insertPhone(String equipmentname, String userphone) {
		equipmentMapper.insertPhone(equipmentname,userphone);
		
	}

	@Override
	public void updateuserid(String equipmentname,String userid,String userphone) {
		equipmentMapper.updateuserid(equipmentname,userid,userphone);
		
	}

	@Override
	public List<Equipment> selectequipmentname(String equipmentname, String userphone) {
		List<Equipment>list=equipmentMapper.selectequipmentname(equipmentname,userphone);
		return list;
	}

	@Override
	public List<Equipment> selectequipmentnameandtime(Date signtime,String equipmentname, String userid) {
		
		return equipmentMapper.selectequipmentnameandtime(signtime,equipmentname, userid);
	}

/*	@Override
	public void updateByEquipmentName(String userid) {
		// TODO Auto-generated method stub
		equipmentMapper.updateByEquipmentName(userid);
	}*/

}
