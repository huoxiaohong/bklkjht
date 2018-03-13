package com.bklkj.pojo;

import java.util.Date;

public class Withdrawals {
    private Integer id;

    private String userid;

    private Integer withdrawalschannelid;

    private Double withdrawalsmoney;

    private Date withdrawalstime;

    private String withdrawalsschannelname;

    private String waypicture;

    private String orderno;

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

    public Integer getWithdrawalschannelid() {
        return withdrawalschannelid;
    }

    public void setWithdrawalschannelid(Integer withdrawalschannelid) {
        this.withdrawalschannelid = withdrawalschannelid;
    }

    public Double getWithdrawalsmoney() {
        return withdrawalsmoney;
    }

    public void setWithdrawalsmoney(Double withdrawalsmoney) {
        this.withdrawalsmoney = withdrawalsmoney;
    }

    public Date getWithdrawalstime() {
        return withdrawalstime;
    }

    public void setWithdrawalstime(Date withdrawalstime) {
        this.withdrawalstime = withdrawalstime;
    }

    public String getWithdrawalsschannelname() {
        return withdrawalsschannelname;
    }

    public void setWithdrawalsschannelname(String withdrawalsschannelname) {
        this.withdrawalsschannelname = withdrawalsschannelname == null ? null : withdrawalsschannelname.trim();
    }

    public String getWaypicture() {
        return waypicture;
    }

    public void setWaypicture(String waypicture) {
        this.waypicture = waypicture == null ? null : waypicture.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }
}