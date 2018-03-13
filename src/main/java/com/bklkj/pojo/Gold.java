package com.bklkj.pojo;

import java.util.Date;

public class Gold {
    private Integer goldid;

    private Integer goldnum;

    private Date goletime;

    private String userid;

    public Integer getGoldid() {
        return goldid;
    }

    public void setGoldid(Integer goldid) {
        this.goldid = goldid;
    }

    public Integer getGoldnum() {
        return goldnum;
    }

    public void setGoldnum(Integer goldnum) {
        this.goldnum = goldnum;
    }

    public Date getGoletime() {
        return goletime;
    }

    public void setGoletime(Date goletime) {
        this.goletime = goletime;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}