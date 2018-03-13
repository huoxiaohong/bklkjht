package com.bklkj.pojo;

public class Ubrelationship {
    private Integer id;

    private String userid;

    private Integer basinessid;

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

    public Integer getBasinessid() {
        return basinessid;
    }

    public void setBasinessid(Integer basinessid) {
        this.basinessid = basinessid;
    }
}