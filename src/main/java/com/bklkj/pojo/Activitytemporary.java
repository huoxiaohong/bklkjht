package com.bklkj.pojo;

import java.util.Date;

public class Activitytemporary {
    private Integer rownum;

    private String businessname;

    private Double businessactivitymoney;

    private String logo;

    private Integer activitytype;

    private Integer businessid;

    private Date time;
    
    private Integer joinnum;

    public Integer getJoinnum() {
		return joinnum;
	}

	public void setJoinnum(Integer joinnum) {
		this.joinnum = joinnum;
	}

	public Integer getRownum() {
        return rownum;
    }

    public void setRownum(Integer rownum) {
        this.rownum = rownum;
    }

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname == null ? null : businessname.trim();
    }

    public Double getBusinessactivitymoney() {
        return businessactivitymoney;
    }

    public void setBusinessactivitymoney(Double businessactivitymoney) {
        this.businessactivitymoney = businessactivitymoney;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public Integer getActivitytype() {
        return activitytype;
    }

    public void setActivitytype(Integer activitytype) {
        this.activitytype = activitytype;
    }

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}