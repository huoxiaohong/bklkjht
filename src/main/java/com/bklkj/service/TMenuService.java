package com.bklkj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bklkj.pojo.TMenu;

@Service
public interface TMenuService {

	List<TMenu> selectByAll() throws Exception;

}
