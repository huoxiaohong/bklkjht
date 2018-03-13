package com.bklkj.service;

import org.springframework.stereotype.Service;

import com.bklkj.pojo.Administration;


@Service
public interface AdministrationService {

	public Administration userLogin(String AdministrationName,String AdministrationPassword);
}
