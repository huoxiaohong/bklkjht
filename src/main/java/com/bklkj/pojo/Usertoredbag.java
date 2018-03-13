package com.bklkj.pojo;

import java.util.Date;

public class Usertoredbag {
    private Integer id;

    private String userid;

    private Double money;

    private Double maxmoney;

    private Date moneytime;

    private Double totalmoney;

    private Date maxmoneytime;

    private Integer businessid;

    private Integer judge;

    private Integer rownum;

    private Integer totalrownum;

    private String usernickname;

    private Integer maxrownum;

    private Integer redbagnum;

    private Integer redbagtype;

    private Integer redbagid;

    private Date countdownbegintime;

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

    public Double getMaxmoney() {
        return maxmoney;
    }

    public void setMaxmoney(Double maxmoney) {
        this.maxmoney = maxmoney;
    }

    public Date getMoneytime() {
        return moneytime;
    }

    public void setMoneytime(Date moneytime) {
        this.moneytime = moneytime;
    }

    public Double getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Double totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Date getMaxmoneytime() {
        return maxmoneytime;
    }

    public void setMaxmoneytime(Date maxmoneytime) {
        this.maxmoneytime = maxmoneytime;
    }

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public Integer getJudge() {
        return judge;
    }

    public void setJudge(Integer judge) {
        this.judge = judge;
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

    public String getUsernickname() {
        return usernickname;
    }

    public void setUsernickname(String usernickname) {
        this.usernickname = usernickname == null ? null : usernickname.trim();
    }

    public Integer getMaxrownum() {
        return maxrownum;
    }

    public void setMaxrownum(Integer maxrownum) {
        this.maxrownum = maxrownum;
    }

    public Integer getRedbagnum() {
        return redbagnum;
    }

    public void setRedbagnum(Integer redbagnum) {
        this.redbagnum = redbagnum;
    }

    public Integer getRedbagtype() {
        return redbagtype;
    }

    public void setRedbagtype(Integer redbagtype) {
        this.redbagtype = redbagtype;
    }

    public Integer getRedbagid() {
        return redbagid;
    }

    public void setRedbagid(Integer redbagid) {
        this.redbagid = redbagid;
    }

    public Date getCountdownbegintime() {
        return countdownbegintime;
    }

    public void setCountdownbegintime(Date countdownbegintime) {
        this.countdownbegintime = countdownbegintime;
    }
}