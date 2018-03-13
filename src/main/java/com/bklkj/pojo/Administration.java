package com.bklkj.pojo;

public class Administration {
    private Integer id;

    private String administrationname;

    private String administrationpassword;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdministrationname() {
        return administrationname;
    }

    public void setAdministrationname(String administrationname) {
        this.administrationname = administrationname == null ? null : administrationname.trim();
    }

    public String getAdministrationpassword() {
        return administrationpassword;
    }

    public void setAdministrationpassword(String administrationpassword) {
        this.administrationpassword = administrationpassword == null ? null : administrationpassword.trim();
    }
}