package com.bklkj.dao;

import com.bklkj.pojo.Gold;
import com.bklkj.pojo.GoldExample;
import com.bklkj.pojo.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoldMapper {
    int countByExample(GoldExample example);

    int deleteByExample(GoldExample example);

    int deleteByPrimaryKey(Integer goldid);

    int insert(Gold record);

    int insertSelective(Gold record);

    List<Gold> selectByExample(GoldExample example);

    Gold selectByPrimaryKey(Integer goldid);

    int updateByExampleSelective(@Param("record") Gold record, @Param("example") GoldExample example);

    int updateByExample(@Param("record") Gold record, @Param("example") GoldExample example);

    int updateByPrimaryKeySelective(Gold record);

    int updateByPrimaryKey(Gold record);
    
	Integer insertGold(@Param("goldnum")Integer goldnum, @Param("userid")String userid);

	Integer updateUserGold(@Param("goldnum")Integer goldnum,@Param("userid") String userid);

	int useGold(@Param("goldnum")Integer goldnum, @Param("userid")String userid);

	List<User> selectUserGold(@Param("userid")String userid);

	Integer insertById(String userid);

	Integer insertMaxGold(@Param("goldnum")Integer goldnum, @Param("userid")String userid);

	Integer insertMinGold(@Param("goldnum")Integer goldnum, @Param("userid")String userid);

	List<Gold> selectUserLastGold( @Param("userid")String userid);

	List<Gold> selectById(@Param("userid")String userid);

	
}