package com.bklkj.pojo;

import java.util.Date;

public class Integralrecharge {
    private Integer orderid;

    private String userid;

    private Double rechargeamount;

    private Date rechargetime;

    private Integer rechargechannelid;

    private Integer integral;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Double getRechargeamount() {
        return rechargeamount;
    }

    public void setRechargeamount(Double rechargeamount) {
        this.rechargeamount = rechargeamount;
    }

    public Date getRechargetime() {
        return rechargetime;
    }

    public void setRechargetime(Date rechargetime) {
        this.rechargetime = rechargetime;
    }

    public Integer getRechargechannelid() {
        return rechargechannelid;
    }

    public void setRechargechannelid(Integer rechargechannelid) {
        this.rechargechannelid = rechargechannelid;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }
}