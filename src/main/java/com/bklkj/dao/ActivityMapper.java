package com.bklkj.dao;

import com.bklkj.pojo.Activity;
import com.bklkj.pojo.ActivityExample;
import com.bklkj.pojo.Problem;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ActivityMapper {

	int countByExample(ActivityExample example);

    int deleteByExample(ActivityExample example);

    int deleteByPrimaryKey(Integer id);

    String insert(Activity record);

    int insertSelective(Activity record);

    List<Activity> selectByExample(ActivityExample example);

    Activity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByExample(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);

	void deleteById(@Param("id")Integer id);

	List<Activity> selectByAll();

	String update(Activity activity);

	List<Activity> selectById(Integer id);

	List<Activity> selectBusinessActivityBeginTime(Date businessActivityBeginTime);

	Integer updateById(Activity activity)throws Exception;

	List<String> selectmoney(@Param("userid")String userid);

	List<String> selectnames(@Param("userid")String userid);

	List<String> selectlogo(@Param("userid")String userid);

	List<String> selectime(@Param("userid")String userid);

	List<String> selectbusinessname();

	List<String> selectbusinesslogo();

	List<String> selectbusinessmoney();

	List<String> selectbusinesstype();

	void insertactivitytemporary();

	List<String> selectbusinessnum();

	List<String> selectanswer();

	List<String> selectquestion();

	List<String> selectanswer1();

	List<String> selectanswer2();

	List<String> selectanswer3();

	List<String> selectanswer4();

	List<String> selectpicture();

	List<String> rightanswer();

	List<String> selectpersonone(@Param("userid")String userid);

	List<String> selectpersontwo(@Param("userid")String userid);

	List<String> selectpersonthree(@Param("userid")String userid);

	List<String> selectquestiontype();

	List<Problem> selectproblem();

	void insertproblemtemporary();

	List<String> selectuser(@Param("userid")String userid);

	void deletebusiness();

	void updatebusinesstype(@Param("userid")String userid);
	void updatebusinesstype2(@Param("userid")String userid);

	Double selectbusinessactivitymoney();

	void updateusertype(@Param("userid")String userid);

	List<String> selectjoinnum();

	
	
	
}