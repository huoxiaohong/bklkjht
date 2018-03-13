package com.bklkj.Commons.pageUtil;

import java.io.Serializable;
import java.util.List;

public class PageObject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<?> list;
	/**
	 */
	public static int cpn(Integer pageNo) {
		return (pageNo == null || pageNo < 1) ? 1 : pageNo;
	}
	private Integer pageNo;
	/**
	 */
	private Integer pageSize;
	/**
	 */
	private Integer totalCount;
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
	}
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
}
