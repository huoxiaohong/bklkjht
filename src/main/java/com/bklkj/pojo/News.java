package com.bklkj.pojo;

import java.util.Date;

public class News {
    private Integer newsid;

    private String userid;

    private String usernews;

    private String newsclassification;

    private Date newstime;

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsernews() {
        return usernews;
    }

    public void setUsernews(String usernews) {
        this.usernews = usernews == null ? null : usernews.trim();
    }

    public String getNewsclassification() {
        return newsclassification;
    }

    public void setNewsclassification(String newsclassification) {
        this.newsclassification = newsclassification == null ? null : newsclassification.trim();
    }

    public Date getNewstime() {
        return newstime;
    }

    public void setNewstime(Date newstime) {
        this.newstime = newstime;
    }
}