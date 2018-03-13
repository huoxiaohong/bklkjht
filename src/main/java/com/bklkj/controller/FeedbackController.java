package com.bklkj.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bklkj.pojo.Feedback;
import com.bklkj.Commons.Fk;
import com.bklkj.service.FeedbackService;

@Controller
@RequestMapping("feedback")
public class FeedbackController {
	@Autowired
	private FeedbackService feedbackService;
	
	
	@RequestMapping("insert")
	@ResponseBody
	public Integer insert(Feedback feedback){
		if(feedback.getFrequency()==0){
		 feedbackService.insert(feedback);
		 feedback.setFrequency(1);
		}else {
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
		if(feedback.getFeedbacktime().toString().equals(fmt.format(new Date()).toString())){//判断是否为同一时间
				return 1;
		  }else {
			  feedback.setFrequency(0);
		        return 0;
		      }
		}
		return 1;
	}
	
	@RequestMapping("selectByAll")
	@ResponseBody
	public List<Feedback> selectByAll(){
		List<Feedback> list=feedbackService.selectByAll();
		return list;
		
	}
	
	@RequestMapping("selectByUserPhone")
	@ResponseBody
	public Integer selectByUserPhone(int UserPhone){
		return feedbackService.selectByUserPhone(UserPhone);
		}
	
	@RequestMapping("delete")
	@ResponseBody
	public Integer deleteById(Feedback feedback){
		return feedbackService.deleteById(feedback);
	}
	
	@RequestMapping("selectByFeedType")
	@ResponseBody
	public Integer selectByFeedType(String feedType){
		return feedbackService.selectByFeedType(feedType);
		
	}
	
	//添加反馈
	@RequestMapping("insertFeedback")
	@ResponseBody
	public Fk insertfeedback(@RequestParam(value = "userid", required = false) String userid,Fk fk,
			@RequestParam(value = "feedback", required = false) String feedback,
			@RequestParam(value = "feedtype", required = false) String feedtype,
			@RequestParam(value = "frequency", required = false) String frequency,
			@RequestParam(value = "feedbacktime", required = false) Date feedbacktime
			){
		List <Feedback> list2 = feedbackService.selectAll(userid);
		if(list2!=null&&list2.size()!=0){
		Integer num =feedbackService.selectnum(userid);
		if(num<3){
		Integer sorf = feedbackService.insertfeedback(userid,feedback);
		if(sorf==1){
			fk.setCode("1");
			fk.setMessage("提交成功");
			String list= feedbackService.selectfeedback(feedback,userid);
			fk.setFeedback(list);
			
		}else{
			fk.setCode("0");
			fk.setMessage("提交失败");
		}
		}else{
			fk.setCode("0");
			fk.setMessage("一天最多三次");
		}
		}else if(list2==null||list2.size()==0){
			Integer sorf = feedbackService.insertfeedback(userid,feedback);
			if(sorf==1){
				fk.setCode("1");
				fk.setMessage("提交成功");
				String list = feedbackService.selectfeedback(feedback,userid);
				fk.setFeedback(list);
				
			}else{
				fk.setCode("0");
				fk.setMessage("提交失败");
			}
		}
		return fk;
	}
	
	//添加反馈点进去
	@RequestMapping("insertFkphone")
	@ResponseBody
	public Fk insertfeedback(@RequestParam(value = "userid", required = false) String userid,Fk fk,
			@RequestParam(value = "feedback", required = false) String feedback,
			@RequestParam(value = "feedtype", required = false) String feedtype,
			@RequestParam(value = "frequency", required = false) String frequency,
			@RequestParam(value = "feedbacktime", required = false) Date feedbacktime,
			@RequestParam(value = "userphone", required = false) String userphone,
			@RequestParam(value = "useremail", required = false) String useremail
			){
		List <Feedback> list2 = feedbackService.selectAll(userid);
		if(list2!=null&&list2.size()!=0){
		Integer num =feedbackService.selectnum(userid);
		if(num<3){
		Integer sorf = feedbackService.insertfeedbackadd(userphone,userid,feedback,feedtype,useremail);
		if(sorf==1){
			fk.setCode("1");
			fk.setMessage("提交成功");
			String list= feedbackService.selectfeedback(feedback,userid);
			fk.setFeedback(list);
			
		}else{
			fk.setCode("0");
			fk.setMessage("提交失败");
		}
		}else{
			fk.setCode("0");
			fk.setMessage("一天最多三次");
		}
		}else if(list2==null||list2.size()==0){
			Integer sorf = feedbackService.insertfeedbackadd(userphone,userid,feedback,feedtype,useremail);
			if(sorf==1){
				fk.setCode("1");
				fk.setMessage("提交成功");
				String list = feedbackService.selectfeedback(feedback,userid);
				fk.setFeedback(list);
				
			}else{
				fk.setCode("0");
				fk.setMessage("提交失败");
			}
		}
		return fk;
	}
	
}
