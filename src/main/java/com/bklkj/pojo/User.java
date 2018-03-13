package com.bklkj.pojo;

public class User {
    private String userid;

    private String userphone;

    private String username;

    private String usernickname;

    private String userpassword;

    private Integer userintegral;

    private Double userbalance;

    private Integer useralipayid;

    private String userpicture;

    private Integer usergold;

    private Integer loginway;

    private Integer state;

    private Integer judge;

    private String security;

    private Integer questionone;

    private Integer questiontwo;

    private Integer questionthree;

    private String alipayid;

    private String alipaystate;
    
    private Integer redbagjudge;

    public Integer getRedbagjudge() {
		return redbagjudge;
	}

	public void setRedbagjudge(Integer redbagjudge) {
		this.redbagjudge = redbagjudge;
	}

	public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUsernickname() {
        return usernickname;
    }

    public void setUsernickname(String usernickname) {
        this.usernickname = usernickname == null ? null : usernickname.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public Integer getUserintegral() {
        return userintegral;
    }

    public void setUserintegral(Integer userintegral) {
        this.userintegral = userintegral;
    }

    public Double getUserbalance() {
        return userbalance;
    }

    public void setUserbalance(Double userbalance) {
        this.userbalance = userbalance;
    }

    public Integer getUseralipayid() {
        return useralipayid;
    }

    public void setUseralipayid(Integer useralipayid) {
        this.useralipayid = useralipayid;
    }

    public String getUserpicture() {
        return userpicture;
    }

    public void setUserpicture(String userpicture) {
        this.userpicture = userpicture == null ? null : userpicture.trim();
    }

    public Integer getUsergold() {
        return usergold;
    }

    public void setUsergold(Integer usergold) {
        this.usergold = usergold;
    }

    public Integer getLoginway() {
        return loginway;
    }

    public void setLoginway(Integer loginway) {
        this.loginway = loginway;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getJudge() {
        return judge;
    }

    public void setJudge(Integer judge) {
        this.judge = judge;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security == null ? null : security.trim();
    }

    public Integer getQuestionone() {
        return questionone;
    }

    public void setQuestionone(Integer questionone) {
        this.questionone = questionone;
    }

    public Integer getQuestiontwo() {
        return questiontwo;
    }

    public void setQuestiontwo(Integer questiontwo) {
        this.questiontwo = questiontwo;
    }

    public Integer getQuestionthree() {
        return questionthree;
    }

    public void setQuestionthree(Integer questionthree) {
        this.questionthree = questionthree;
    }

    public String getAlipayid() {
        return alipayid;
    }

    public void setAlipayid(String alipayid) {
        this.alipayid = alipayid == null ? null : alipayid.trim();
    }

    public String getAlipaystate() {
        return alipaystate;
    }

    public void setAlipaystate(String alipaystate) {
        this.alipaystate = alipaystate == null ? null : alipaystate.trim();
    }
}