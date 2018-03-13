package com.bklkj.pojo;

public class TMenu {
    private Integer menuId;

    private String menuName;

    private Integer menuFid;

    private String menuUrl;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public Integer getMenuFid() {
        return menuFid;
    }

    public void setMenuFid(Integer menuFid) {
        this.menuFid = menuFid;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }
}