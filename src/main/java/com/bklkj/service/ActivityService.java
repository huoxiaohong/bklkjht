package com.bklkj.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bklkj.pojo.Activity;
import com.bklkj.pojo.Problem;

@Service
public interface ActivityService {
	
	//
	public List<Activity> selectActivity()throws Exception;
	//
	public void insertActivity(Activity activity)throws Exception;
	//
	public void deleteById(Integer id)throws Exception;
	//
	public List<Activity> selectById(Integer id)throws Exception;
	
	public List<Activity> selectByBeginTime(Date businessActivityBeginTime);
	
	Integer updateActivity(Activity activity) throws Exception;
	
	public List<String> selectmoney(String userid);
	public List<String> selectime(String userid);
	public List<String> selectnames(String userid);
	public List<String> selectlogo(String userid);
	public List<String> selectbusinessname();
	public List<String> selectbusinesslogo();
	public List<String> selectbusinessmoney();
	public List<String> selectbusinesstype();
	
	public void insertactivitytemporary();
	
	public List<String> selectbusinessnum();
	public List<String> selectanswer();
	public List<String> selectquestion();
	public List<String> selectanswer1();
	public List<String> selectanswer2();
	public List<String> selectanswer3();
	//public List<String> selectanswer4();
	public List<String> selectpicture();
	
	public List<String> rightanswer();
	public List<String> selectpersonone(String userid);
	public List<String> selectpersontwo(String userid);
	public List<String> selectpersonthree(String userid);
	public List<String> selectquestiontype();
	
	public List<Problem> selectproblem();
	public void insertproblemtemporary();
	
	public List<String> selectuser(String userid);
	public void deletebusiness();
	public void updatebusinesstype(String userid);
	public void updatebusinesstype2(String userid);
	public Double selectbusinessactivitymoney();
	public void updateusertype(String userid);
	public List<String> selectjoinnum();
	
	
	/*public void updateActivity(Integer id);*/
	
	
	
	
	
	
	
	
}
