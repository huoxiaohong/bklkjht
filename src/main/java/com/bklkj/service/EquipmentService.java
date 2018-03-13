package com.bklkj.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bklkj.pojo.Equipment;

@Service
public interface EquipmentService {


	List<Equipment> selectByUserId(String equipmentname, String userid);

	Integer updateByUserId(String equipmentname, String userid);

	void insert(String equipmentname, String userid);

	List<Equipment> selectByUserIdPhone(String equipmentname, String userphone);

	Integer updateByUserIdPhone(String equipmentname, String userphone);

	void insertPhone(String equipmentname, String userphone);

	List<Equipment> selectequipmentname(String equipmentname, String userphone);

	void updateuserid(String equipmentname, String userid, String userphone);

	List<Equipment> selectequipmentnameandtime(Date signtime, String equipmentname, String userid);

	//void updateByEquipmentName(String userid);

}
