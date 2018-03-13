package com.bklkj.pojo;

public class Withdrawalschannel {
    private Integer withdrawalschannelid;

    private String withdrawalschannelname;

    private String withdrawalschannelpicture;

    public Integer getWithdrawalschannelid() {
        return withdrawalschannelid;
    }

    public void setWithdrawalschannelid(Integer withdrawalschannelid) {
        this.withdrawalschannelid = withdrawalschannelid;
    }

    public String getWithdrawalschannelname() {
        return withdrawalschannelname;
    }

    public void setWithdrawalschannelname(String withdrawalschannelname) {
        this.withdrawalschannelname = withdrawalschannelname == null ? null : withdrawalschannelname.trim();
    }

    public String getWithdrawalschannelpicture() {
        return withdrawalschannelpicture;
    }

    public void setWithdrawalschannelpicture(String withdrawalschannelpicture) {
        this.withdrawalschannelpicture = withdrawalschannelpicture == null ? null : withdrawalschannelpicture.trim();
    }
}