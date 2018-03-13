package com.bklkj.Commons;

import java.util.Date;
import java.util.List;

public class RedbagRecord {
	private int code;
	// 提示信息
	private String message;
	
	private Double redbagmoney;
	
	private String businessname;
	
	private Date redbagtime;
	
	private String way;
	 
	private String picture;
	
	private List list;

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Double getRedbagmoney() {
		return redbagmoney;
	}

	public void setRedbagmoney(Double redbagmoney) {
		this.redbagmoney = redbagmoney;
	}

	public String getBusinessname() {
		return businessname;
	}

	public void setBusinessname(String businessname) {
		this.businessname = businessname;
	}

	public Date getRedbagtime() {
		return redbagtime;
	}

	public void setRedbagtime(Date redbagtime) {
		this.redbagtime = redbagtime;
	}
}
