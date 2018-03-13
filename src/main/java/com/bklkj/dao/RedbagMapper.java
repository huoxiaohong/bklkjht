package com.bklkj.dao;

import com.bklkj.pojo.Business;
import com.bklkj.pojo.Redbag;
import com.bklkj.pojo.RedbagExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RedbagMapper {
    int countByExample(RedbagExample example);

    int deleteByExample(RedbagExample example);

    int deleteByPrimaryKey(Integer redbagid);

    int insert(Redbag record);

    int insertSelective(Redbag record);

    List<Redbag> selectByExample(RedbagExample example);

    Redbag selectByPrimaryKey(Integer redbagid);

    int updateByExampleSelective(@Param("record") Redbag record, @Param("example") RedbagExample example);

    int updateByExample(@Param("record") Redbag record, @Param("example") RedbagExample example);

    int updateByPrimaryKeySelective(Redbag record);

    int updateByPrimaryKey(Redbag record);

	Integer updateRedbagNum(Integer redbagNum);

	Integer updateRedbag(Redbag redbag);

	void updateRedbag2(Redbag redbag);

	void updateRedbag3(Redbag redbag);

	void updateRedbag4(Redbag redbag);

	List<Redbag> selectByUserId(@Param("userid")String userid);

	List<Redbag> selectUserIdJudge(@Param("userid")String userid);

	Integer insertMax(@Param("redbagnum")Integer redbagnum, @Param("redbagmoney")Double redbagmoney, @Param("userid")String userid, @Param("businessid")Integer businessid);

	List<Redbag> selectBusinessName(@Param("businessname")String businessname,@Param("userid") String userid);

	List<Redbag> selectLast(@Param("userid")String userid, @Param("redbagtime")Date redbagtime);

	void updateJudge(@Param("judge")Integer judge,@Param("userid") String userid);
	
	Integer insertMin(@Param("redbagnum")Integer redbagnum, @Param("redbagmoney")Double redbagmoney, @Param("userid")String userid,@Param("businessid") Integer businessid);

	Double selectSumMoney(@Param("redbagmoney")Double redbagmoney, @Param("userid")String userid);

	List<String> selectBusinessName(@Param("userid")String userid);

	Double selectshengyumoney(@Param("userid")String userid);

	void updatebusinessmoney(@Param("userid")String userid);

	List<String> selectBusinessweb(@Param("userid")String userid);

	List<String> selectredbagrecord(@Param("userid")String userid);

	List<String> selectBusinessPiture(@Param("userid")String userid);

	List<String> selectime(@Param("userid")String userid);

	List<String> selectnames(@Param("userid")String userid);

	List<String> selectlogo(@Param("userid")String userid);

	List<String> selectmoney();

	Double selectpaihangmoney(@Param("userid")String userid);

	Integer selectpaihang(@Param("userid")String userid);

	Integer selectpaihangno(@Param("userid")String userid);

	List<String> selectredbagtype(@Param("userid")String userid);

	List<String> selectbusinessintroduce(@Param("userid")String userid);
	
}