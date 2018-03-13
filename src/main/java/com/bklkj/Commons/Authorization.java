package com.bklkj.Commons;

public class Authorization {
	private int code;
	// 提示信息
	private String message;
	
	private String alipaystate;

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

	public String getAlipaystate() {
		return alipaystate;
	}

	public void setAlipaystate(String alipaystate) {
		this.alipaystate = alipaystate;
	}
	
}
