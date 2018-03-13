package com.bklkj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bklkj.pojo.Feedback;


@Service
public interface FeedbackService {
	//
	public void insert(Feedback feedback);
	//
	public List<Feedback> selectByAll(); 
	//
	public Integer selectByUserPhone(int UserPhone);
	//
	public Integer deleteById(Feedback feedback);
	//根据类型查询
	public Integer selectByFeedType(String feedType);
	//添加反馈
	public Integer insertfeedback(String userid, String feedback);
	
	public void updateFrequency(String userid, String frequency);
	
	public Integer selectnum(String userid);
	
	public String selectfeedback(String feedback, String userid);
	
	public List<Feedback> selectAll(String userid);
	
	public Integer insertfeedbackadd(String userphone, String userid, String feedback, String feedtype, String useremail);

}
