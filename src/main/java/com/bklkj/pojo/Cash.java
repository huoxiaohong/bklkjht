package com.bklkj.pojo;

import java.util.Date;

public class Cash {
    private Integer id;

    private Integer activitycashid;

    private Double activitycashmoney;

    private Integer businessid;

    private String userid;

    private Date cashtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivitycashid() {
        return activitycashid;
    }

    public void setActivitycashid(Integer activitycashid) {
        this.activitycashid = activitycashid;
    }

    public Double getActivitycashmoney() {
        return activitycashmoney;
    }

    public void setActivitycashmoney(Double activitycashmoney) {
        this.activitycashmoney = activitycashmoney;
    }

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getCashtime() {
        return cashtime;
    }

    public void setCashtime(Date cashtime) {
        this.cashtime = cashtime;
    }
}