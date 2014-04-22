package com.harlankuo.hyacinth.wcms.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class SysMenu implements Serializable {
	private static final long serialVersionUID = -7970848646314840509L;
    private Integer menuId;

    private String menuName;

    private Integer menuParentId;

    private String menuParentName;

    private Integer menuType;

    private String menuUrl;

    private Integer menuSort;

    private Integer menuDisplayorder;

    private String menuDesc;

    private Integer menuUserId;

    private Integer menuBaseinfoId;

    private Integer menuIsdelete;

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
        this.menuName = menuName;
    }

    public Integer getMenuParentId() {
        return menuParentId;
    }

    public void setMenuParentId(Integer menuParentId) {
        this.menuParentId = menuParentId;
    }

    public String getMenuParentName() {
        return menuParentName;
    }

    public void setMenuParentName(String menuParentName) {
        this.menuParentName = menuParentName;
    }

    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public Integer getMenuSort() {
        return menuSort;
    }

    public void setMenuSort(Integer menuSort) {
        this.menuSort = menuSort;
    }

    public Integer getMenuDisplayorder() {
        return menuDisplayorder;
    }

    public void setMenuDisplayorder(Integer menuDisplayorder) {
        this.menuDisplayorder = menuDisplayorder;
    }

    public String getMenuDesc() {
        return menuDesc;
    }

    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc;
    }

    public Integer getMenuUserId() {
        return menuUserId;
    }

    public void setMenuUserId(Integer menuUserId) {
        this.menuUserId = menuUserId;
    }

    public Integer getMenuBaseinfoId() {
        return menuBaseinfoId;
    }

    public void setMenuBaseinfoId(Integer menuBaseinfoId) {
        this.menuBaseinfoId = menuBaseinfoId;
    }

    public Integer getMenuIsdelete() {
        return menuIsdelete;
    }

    public void setMenuIsdelete(Integer menuIsdelete) {
        this.menuIsdelete = menuIsdelete;
    }
}