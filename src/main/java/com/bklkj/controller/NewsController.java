package com.bklkj.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bklkj.Commons.Xiaoxi;
import com.bklkj.pojo.News;
import com.bklkj.service.NewsService;

@Controller
@RequestMapping("news")
public class NewsController {
	
	@Autowired
	private NewsService newsService;
	
	//消息
	@RequestMapping("selectnews")
	@ResponseBody
	public Xiaoxi Newss(@RequestParam(value = "userid", required = false) String userid,
			@RequestParam(value = "usernews", required = false) String usernews,
			@RequestParam(value = "newsclassification", required = false) String newsclassification,
			@RequestParam(value = "newstime", required = false) Date newstime,Xiaoxi xx){
		//查找消息
		List<News>list=newsService.selectByAll(userid,usernews,newsclassification,newstime);
		if(list!=null&&list.size()!=0){
			SimpleDateFormat sdf=new SimpleDateFormat("MM-dd");
			List<Map<String, String>> maplist = new ArrayList<Map<String,String>>();
			for (News et:list) {
			    Map<String, String> map = new HashMap<String, String>(); //声明一个map集合
                map.put("type",et.getNewsclassification().toString());//将id存进map中
                map.put("time",sdf.format(et.getNewstime()).toString()); //将name存进map中 
                map.put("desc", et.getUsernews());
                maplist.add(map);  
			}
			xx.setCode("1");
			xx.setMessage("查询成功");
			xx.setList(maplist);
			
		}else if(list==null||list.size()==0){
			xx.setCode("0");
			xx.setMessage("您没有消息");
		}
		
		return xx;
		
	}
	
	
	//消息
		@RequestMapping("news")
		@ResponseBody
		public Xiaoxi Newsss(@RequestParam(value = "userid", required = false) String userid,
				@RequestParam(value = "usernews", required = false) String usernews,
				@RequestParam(value = "newsclassification", required = false) String newsclassification,
				@RequestParam(value = "newstime", required = false) Date newstime,Xiaoxi xx){
			//查找消息
			List<News>list=newsService.selectByAll(userid,usernews,newsclassification,newstime);
			List<News>msgType = newsService.selectmsgType(newsclassification,userid);
			if(list!=null&&list.size()!=0){
				if(msgType.get(0).getNewsclassification().equals("1")){
				SimpleDateFormat sdf=new SimpleDateFormat("MM月dd日 mm-dd");
				List<Map<String, String>> maplist = new ArrayList<Map<String,String>>();
				for (News et:list) {
				    Map<String, String> map = new HashMap<String, String>(); //声明一个map集合
	                map.put("time",sdf.format(et.getNewstime()).toString()); //将name存进map中 
	                map.put("desc", et.getUsernews());
	                maplist.add(map);  
				}
				xx.setCode("1");
				xx.setMessage("查询成功");
				xx.setList(maplist);
				}else if(msgType.get(0).getNewsclassification()=="2"){
					SimpleDateFormat sdf=new SimpleDateFormat("MM月dd日 mm-dd");
					List<Map<String, String>> maplist = new ArrayList<Map<String,String>>();
					for (News et:list) {
					    Map<String, String> map = new HashMap<String, String>(); //声明一个map集合
		                map.put("time",sdf.format(et.getNewstime().toString())); //将name存进map中 
		                map.put("desc", et.getUsernews());
		                maplist.add(map);  
					}
					xx.setCode("1");
					xx.setMessage("查询成功");
					xx.setList(maplist);
				}
			}else if(list==null||list.size()==0){
				xx.setCode("1");
				xx.setMessage("您没有消息");
			}
			
			return xx;
			
		}
	
}
