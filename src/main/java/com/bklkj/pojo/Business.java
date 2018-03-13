package com.bklkj.pojo;

public class Business {
    private Integer businessid;

    private String businessname;

    private String businessphone;

    private String businessaddress;

    private String logo;

    private String businessintroduce;

    private String businesswebsite;

    private String businessemail;

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname == null ? null : businessname.trim();
    }

    public String getBusinessphone() {
        return businessphone;
    }

    public void setBusinessphone(String businessphone) {
        this.businessphone = businessphone == null ? null : businessphone.trim();
    }

    public String getBusinessaddress() {
        return businessaddress;
    }

    public void setBusinessaddress(String businessaddress) {
        this.businessaddress = businessaddress == null ? null : businessaddress.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getBusinessintroduce() {
        return businessintroduce;
    }

    public void setBusinessintroduce(String businessintroduce) {
        this.businessintroduce = businessintroduce == null ? null : businessintroduce.trim();
    }

    public String getBusinesswebsite() {
        return businesswebsite;
    }

    public void setBusinesswebsite(String businesswebsite) {
        this.businesswebsite = businesswebsite == null ? null : businesswebsite.trim();
    }

    public String getBusinessemail() {
        return businessemail;
    }

    public void setBusinessemail(String businessemail) {
        this.businessemail = businessemail == null ? null : businessemail.trim();
    }
}