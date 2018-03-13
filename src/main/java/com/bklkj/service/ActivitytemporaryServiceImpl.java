package com.bklkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bklkj.dao.ActivitytemporaryMapper;

@Service
public class ActivitytemporaryServiceImpl implements ActivitytemporaryService {
	
	@Autowired
	private ActivitytemporaryMapper activitytemporaryMapper;
	
	@Override
	public List<String> selectall() {
		
		return activitytemporaryMapper.selectall();
	}

}
