package com.bklkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bklkj.dao.TMenuMapper;
import com.bklkj.pojo.TMenu;

@Service
public class TMenuServiceImpl implements TMenuService {
	
	@Autowired
	private TMenuMapper tMenuMapper;

	@Override
	public List<TMenu> selectByAll() throws Exception {
		List<TMenu>list=tMenuMapper.selectByAll();
		return list;
	}

}
