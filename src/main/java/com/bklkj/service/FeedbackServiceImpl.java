package com.bklkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bklkj.dao.FeedbackMapper;
import com.bklkj.pojo.Feedback;

@Service
public class FeedbackServiceImpl implements FeedbackService {
	
	@Autowired
	private FeedbackMapper feedbackMapper;

	@Override
	public void insert(Feedback feedback) {
		feedbackMapper.insert(feedback);
		
	}

	@Override
	public List<Feedback> selectByAll() {
		return feedbackMapper.selectByAll();
	}
	
	@Override
	public Integer selectByUserPhone(int UserPhone){
		return feedbackMapper.selectByUserPhone(UserPhone);
		
	}

	@Override
	public Integer deleteById(Feedback feedback) {
		return feedbackMapper.deleteById(feedback);
	}

	@Override
	public Integer selectByFeedType(String feedType) {
		
		return feedbackMapper.selectByFeedType(feedType);
	}

	@Override
	public Integer insertfeedback(String userid, String feedback) {
		return feedbackMapper.insertfeedback(userid,feedback);
	}

	@Override
	public void updateFrequency(String userid, String frequency) {
		// TODO Auto-generated method stub
		feedbackMapper.updateFrequency(userid,frequency);
	}

	@Override
	public Integer selectnum(String userid) {
		// TODO Auto-generated method stub
		return feedbackMapper.selectnum(userid);
	}


	@Override
	public String selectfeedback(String feedback, String userid) {
		return feedbackMapper.selectfeedback(feedback,userid);
	}

	@Override
	public List<Feedback> selectAll(String userid) {
		// TODO Auto-generated method stub
		return feedbackMapper.selectAll(userid);
	}

	@Override
	public Integer insertfeedbackadd(String userphone, String userid, String feedback, String feedtype,String useremail) {
		// TODO Auto-generated method stub
		return feedbackMapper.insertfeedbackadd(userphone,userid,feedback, feedtype,useremail);
	}
	
}
