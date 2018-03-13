package com.bklkj.pojo;

public class Activity {
    private Integer id;

    private Integer businessid;

    private String businessactivity;

    private String businessactivityname;

    private String businessactivitybegintime;

    private String businessactivitystoptime;

    private Integer businessactivitynum;

    private Double businessactivitymoney;

    private Integer businessactivityintegral;

    private Integer activitytype;

    private Integer joinnum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public String getBusinessactivity() {
        return businessactivity;
    }

    public void setBusinessactivity(String businessactivity) {
        this.businessactivity = businessactivity == null ? null : businessactivity.trim();
    }

    public String getBusinessactivityname() {
        return businessactivityname;
    }

    public void setBusinessactivityname(String businessactivityname) {
        this.businessactivityname = businessactivityname == null ? null : businessactivityname.trim();
    }

    public String getBusinessactivitybegintime() {
        return businessactivitybegintime;
    }

    public void setBusinessactivitybegintime(String businessactivitybegintime) {
        this.businessactivitybegintime = businessactivitybegintime == null ? null : businessactivitybegintime.trim();
    }

    public String getBusinessactivitystoptime() {
        return businessactivitystoptime;
    }

    public void setBusinessactivitystoptime(String businessactivitystoptime) {
        this.businessactivitystoptime = businessactivitystoptime == null ? null : businessactivitystoptime.trim();
    }

    public Integer getBusinessactivitynum() {
        return businessactivitynum;
    }

    public void setBusinessactivitynum(Integer businessactivitynum) {
        this.businessactivitynum = businessactivitynum;
    }

    public Double getBusinessactivitymoney() {
        return businessactivitymoney;
    }

    public void setBusinessactivitymoney(Double businessactivitymoney) {
        this.businessactivitymoney = businessactivitymoney;
    }

    public Integer getBusinessactivityintegral() {
        return businessactivityintegral;
    }

    public void setBusinessactivityintegral(Integer businessactivityintegral) {
        this.businessactivityintegral = businessactivityintegral;
    }

    public Integer getActivitytype() {
        return activitytype;
    }

    public void setActivitytype(Integer activitytype) {
        this.activitytype = activitytype;
    }

    public Integer getJoinnum() {
        return joinnum;
    }

    public void setJoinnum(Integer joinnum) {
        this.joinnum = joinnum;
    }
}