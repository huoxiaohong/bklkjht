package com.bklkj.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bklkj.dao.ActivityMapper;
import com.bklkj.pojo.Activity;
import com.bklkj.pojo.Problem;

@Service
public class ActivityServiceImpl implements ActivityService {
	
	@Autowired
	private ActivityMapper activityMapper;
	
	//更改
	@Override
	public Integer updateActivity(Activity activity) throws Exception {
		
	  return activityMapper.updateById(activity);
		
    }
	//
    @Override
    public void deleteById(Integer id) {
    	activityMapper.deleteById(id);
    }
    //
    @Override
    public void insertActivity(Activity activity) {
    	 activityMapper.insertSelective(activity);
    }
    //
	@Override
	public List<Activity> selectActivity() throws Exception {
		List<Activity>list = activityMapper.selectByAll();
		return list;
	}
	//
	@Override
	public List<Activity> selectById(Integer id) throws Exception {
		List<Activity>list= activityMapper.selectById(id);
		return list;
	}
	/*//update
	@Override
	public Integer updateActivity(Integer id)throws Exception{
		Activity activity=new Activity();
    	int a=activity.getId();
		return activityMapper.updateById(a);
	}*/
	
	//根据开始时间查找
	@Override
	public List<Activity> selectByBeginTime(Date businessActivityBeginTime) {
		// TODO Auto-generated method stub
		List<Activity> list = activityMapper.selectBusinessActivityBeginTime(businessActivityBeginTime);
		//System.out.println(list); - =OK 
		//return selectByExample;
		return list;
	}
	/*@Override
	public void updateActivity(Integer id) {
		// TODO Auto-generated method stub
		Activity activity=new Activity();
		if(activity!=null){
    	int a=activity.getId();
		activityMapper.updateById(a);
		System.err.println(a);
		System.err.println(activity);
		}
	}*/
	@Override
	public List<String> selectmoney(String userid) {
		// TODO Auto-generated method stub
		return activityMapper.selectmoney(userid);
	}
	
	@Override
	public List<String> selectime(String userid) {
		// TODO Auto-generated method stub
		return activityMapper.selectime(userid);
	}
	
	@Override
	public List<String> selectnames(String userid) {
		// TODO Auto-generated method stub
		return activityMapper.selectnames(userid);
	}
	
	@Override
	public List<String> selectlogo(String userid) {
		// TODO Auto-generated method stub
		return activityMapper.selectlogo(userid);
	}
	@Override
	public List<String> selectbusinessname() {
		// TODO Auto-generated method stub
		return activityMapper.selectbusinessname();
	}
	@Override
	public List<String> selectbusinesslogo() {
		// TODO Auto-generated method stub
		return activityMapper.selectbusinesslogo();
	}
	@Override
	public List<String> selectbusinessmoney() {
		// TODO Auto-generated method stub
		return activityMapper.selectbusinessmoney();
	}
	@Override
	public List<String> selectbusinesstype() {
		// TODO Auto-generated method stub
		return activityMapper.selectbusinesstype();
	}
	@Override
	public void insertactivitytemporary() {
		// TODO Auto-generated method stub
		 activityMapper.insertactivitytemporary();
	}
	@Override
	public List<String> selectbusinessnum() {
		// TODO Auto-generated method stub
		return activityMapper.selectbusinessnum();
	}
	@Override
	public List<String> selectanswer() {
		// TODO Auto-generated method stub
		return activityMapper.selectanswer();
	}
	@Override
	public List<String> selectquestion() {
		// TODO Auto-generated method stub
		return activityMapper.selectquestion();
	}
	@Override
	public List<String> selectanswer1() {
		// TODO Auto-generated method stub
		return activityMapper.selectanswer1();
	}
	@Override
	public List<String> selectanswer2() {
		// TODO Auto-generated method stub
		return activityMapper.selectanswer2();
	}
	@Override
	public List<String> selectanswer3() {
		// TODO Auto-generated method stub
		return activityMapper.selectanswer3();
	}
	@Override
	public List<String> selectpicture() {
		// TODO Auto-generated method stub
		return activityMapper.selectpicture();
	}
	@Override
	public List<String> rightanswer() {
		// TODO Auto-generated method stub
		return activityMapper.rightanswer();
	}
	@Override
	public List<String> selectpersonone(String userid) {
		// TODO Auto-generated method stub
		return activityMapper.selectpersonone(userid);
	}
	@Override
	public List<String> selectpersontwo(String userid) {
		// TODO Auto-generated method stub
		return activityMapper.selectpersontwo(userid);
	}
	@Override
	public List<String> selectpersonthree(String userid) {
		// TODO Auto-generated method stub
		return activityMapper.selectpersonthree(userid);
	}
	@Override
	public List<String> selectquestiontype() {
		// TODO Auto-generated method stub
		return activityMapper.selectquestiontype();
	}
	@Override
	public List<Problem> selectproblem() {
		// TODO Auto-generated method stub
		return activityMapper.selectproblem();
	}
	@Override
	public void insertproblemtemporary() {
		// TODO Auto-generated method stub
		activityMapper.insertproblemtemporary();
	}
	@Override
	public List<String> selectuser(String userid) {
		// TODO Auto-generated method stub
		return activityMapper.selectuser(userid);
	}
	@Override
	public void deletebusiness() {
		// TODO Auto-generated method stub
		activityMapper.deletebusiness();
	}
	@Override
	public void updatebusinesstype(String userid) {
		// TODO Auto-generated method stub
		activityMapper.updatebusinesstype(userid);
	}
   
	public void updatebusinesstype2(String userid) {
		// TODO Auto-generated method stub
		activityMapper.updatebusinesstype2(userid);
	}
	@Override
	public Double selectbusinessactivitymoney() {
		// TODO Auto-generated method stub
		return activityMapper.selectbusinessactivitymoney();
	}
	@Override
	public void updateusertype(String userid) {
		// TODO Auto-generated method stub
		activityMapper.updateusertype(userid);
	}
	@Override
	public List<String> selectjoinnum() {
		// TODO Auto-generated method stub
		return activityMapper.selectjoinnum();
	}
   
	
	
}
