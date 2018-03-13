package com.bklkj.pojo;

public class Commodity {
    private String commodityid;

    private String commodityname;

    private String commodityprice;

    private String commoditydescribe;

    

    public String getCommodityid() {
		return commodityid;
	}

	public void setCommodityid(String commodityid) {
		this.commodityid = commodityid;
	}

	public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname == null ? null : commodityname.trim();
    }

    public String getCommodityprice() {
        return commodityprice;
    }

    public void setCommodityprice(String commodityprice) {
        this.commodityprice = commodityprice == null ? null : commodityprice.trim();
    }

    public String getCommoditydescribe() {
        return commoditydescribe;
    }

    public void setCommoditydescribe(String commoditydescribe) {
        this.commoditydescribe = commoditydescribe == null ? null : commoditydescribe.trim();
    }
}