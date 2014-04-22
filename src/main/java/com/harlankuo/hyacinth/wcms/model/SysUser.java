package com.harlankuo.hyacinth.wcms.model;

import java.util.Date;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class SysUser implements Serializable {
	private static final long serialVersionUID = -7970848646314840509L;
    private Integer userId;

    private String userName;

    private String userPassword;

    private Integer userFlag;

    private Date userCreatetime;

    private Integer userIsdelete;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(Integer userFlag) {
        this.userFlag = userFlag;
    }

    public Date getUserCreatetime() {
        return userCreatetime;
    }

    public void setUserCreatetime(Date userCreatetime) {
        this.userCreatetime = userCreatetime;
    }

    public Integer getUserIsdelete() {
        return userIsdelete;
    }

    public void setUserIsdelete(Integer userIsdelete) {
        this.userIsdelete = userIsdelete;
    }
}