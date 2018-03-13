package com.bklkj.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bklkj.pojo.News;

@Service
public interface NewsService {

	List<News> selectByAll(String userid, String usernews, String newsclassification, Date newstime);

	List<News> selectAll();

	List<News> selectmsgType(String newsclassification, String userid);

	List<News> selectusernews(String userid, String usernews, String newsclassification, Date newstime);

}
