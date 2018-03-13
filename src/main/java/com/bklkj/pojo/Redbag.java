package com.bklkj.pojo;

import java.util.Date;

public class Redbag {
    private Integer redbagid;

    private Double redbagmoney;

    private String redbagbusiness;

    private String userid;

    private Integer businessid;

    private String coupon;

    private Date coupontime;

    private Integer integral;

    private Date integraltime;

    private Integer redbagnum;

    private Date redbagtime;

    private Integer rownum;

    private Integer totalrownum;

    private Integer totalmoney;

    public Integer getRedbagid() {
        return redbagid;
    }

    public void setRedbagid(Integer redbagid) {
        this.redbagid = redbagid;
    }

    public Double getRedbagmoney() {
        return redbagmoney;
    }

    public void setRedbagmoney(Double redbagmoney) {
        this.redbagmoney = redbagmoney;
    }

    public String getRedbagbusiness() {
        return redbagbusiness;
    }

    public void setRedbagbusiness(String redbagbusiness) {
        this.redbagbusiness = redbagbusiness == null ? null : redbagbusiness.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon == null ? null : coupon.trim();
    }

    public Date getCoupontime() {
        return coupontime;
    }

    public void setCoupontime(Date coupontime) {
        this.coupontime = coupontime;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Date getIntegraltime() {
        return integraltime;
    }

    public void setIntegraltime(Date integraltime) {
        this.integraltime = integraltime;
    }

    public Integer getRedbagnum() {
        return redbagnum;
    }

    public void setRedbagnum(Integer redbagnum) {
        this.redbagnum = redbagnum;
    }

    public Date getRedbagtime() {
        return redbagtime;
    }

    public void setRedbagtime(Date redbagtime) {
        this.redbagtime = redbagtime;
    }

    public Integer getRownum() {
        return rownum;
    }

    public void setRownum(Integer rownum) {
        this.rownum = rownum;
    }

    public Integer getTotalrownum() {
        return totalrownum;
    }

    public void setTotalrownum(Integer totalrownum) {
        this.totalrownum = totalrownum;
    }

    public Integer getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Integer totalmoney) {
        this.totalmoney = totalmoney;
    }
}