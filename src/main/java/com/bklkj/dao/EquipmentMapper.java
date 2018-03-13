package com.bklkj.dao;

import com.bklkj.pojo.Equipment;
import com.bklkj.pojo.EquipmentExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipmentMapper {
    int countByExample(EquipmentExample example);

    int deleteByExample(EquipmentExample example);

    int deleteByPrimaryKey(Integer id);


    int insertSelective(Equipment record);

    List<Equipment> selectByExample(EquipmentExample example);

    Equipment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Equipment record, @Param("example") EquipmentExample example);

    int updateByExample(@Param("record") Equipment record, @Param("example") EquipmentExample example);

    int updateByPrimaryKeySelective(Equipment record);

    int updateByPrimaryKey(Equipment record);
    

	List<Equipment> selectByUserId(@Param("equipmentname")String equipmentname,@Param("userid")String userid);

	Integer updateByUserId(@Param("equipmentname")String equipmentname,@Param("userid")String userid);

	void insert(@Param("equipmentname")String equipmentname,@Param("userid") String userid);

	List<Equipment> selectByUserIdPhone(@Param("equipmentname")String equipmentname,@Param("userphone") String userphone);

	Integer updateByUserIdPhone(@Param("equipmentname")String equipmentname, @Param("userphone")String userphone);

	void insertPhone(@Param("equipmentname")String equipmentname,@Param("userphone") String userphone);

	List<Equipment> selectequipmentname(@Param("equipmentname")String equipmentname,@Param("userphone") String userphone);

	void updateuserid(@Param("equipmentname")String equipmentname,@Param("userid") String userid, @Param("userphone")String userphone);

	List<Equipment> selectequipmentnameandtime(@Param("signtime")Date signtime, @Param("equipmentname")String equipmentname, @Param("userid")String userid);

	//void updateByEquipmentName(Integer userid);
	
}