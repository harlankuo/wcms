package com.harlankuo.hyacinth.wcms.model;

import java.util.Date;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class SysLog implements Serializable {
	private static final long serialVersionUID = -7970848646314840509L;
    private Integer logId;

    private String logUser;

    private Date logDate;

    private String logIp;

    private String logContent;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getLogUser() {
        return logUser;
    }

    public void setLogUser(String logUser) {
        this.logUser = logUser;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    public String getLogIp() {
        return logIp;
    }

    public void setLogIp(String logIp) {
        this.logIp = logIp;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }
}