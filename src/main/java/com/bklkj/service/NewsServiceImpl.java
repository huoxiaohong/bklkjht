package com.bklkj.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bklkj.dao.NewsMapper;
import com.bklkj.pojo.News;

@Service
public class NewsServiceImpl implements NewsService {

	@Autowired 
	private NewsMapper newsMapper;

	@Override
	public List<News> selectByAll(String userid, String usernews, String newsclassification, Date newstime) {
		List<News>list= newsMapper.selectAll(userid,usernews,newsclassification,newstime);
		return list;
	}

	@Override
	public List<News> selectAll() {
		// TODO Auto-generated method stub
		return newsMapper.selectAll();
	}

	@Override
	public List<News> selectmsgType(String newsclassification, String userid) {
		// TODO Auto-generated method stub
		return newsMapper.selectmsgType(userid,newsclassification);
	}

	@Override
	public List<News> selectusernews(String userid, String usernews, String newsclassification, Date newstime) {
		List<News>list= newsMapper.selectusernews(userid,usernews,newsclassification,newstime);
		return list;
	}
	
}
