package com.bklkj.pojo;

import java.util.Date;

public class Activityget {
    private Integer id;

    private String userid;

    private Double money;

    private Date moneytime;

    private Integer businessid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getMoneytime() {
        return moneytime;
    }

    public void setMoneytime(Date moneytime) {
        this.moneytime = moneytime;
    }

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }
}