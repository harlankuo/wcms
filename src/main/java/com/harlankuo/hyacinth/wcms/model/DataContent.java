package com.harlankuo.hyacinth.wcms.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class DataContent extends BaseDomain {
	private static final long serialVersionUID = -7970848646314840509L;
	
    private Integer contentId;

    private String contentTitle;

    private String contentImageurl;

    private Date contentPublishtime;

    private String contentDesc;

    private Integer contentMenuId;

    private Integer contentIsdelete;

    private String contentWebinfo;

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle;
    }

    public String getContentImageurl() {
        return contentImageurl;
    }

    public void setContentImageurl(String contentImageurl) {
        this.contentImageurl = contentImageurl;
    }

    public Date getContentPublishtime() {
        return contentPublishtime;
    }

    public void setContentPublishtime(Date contentPublishtime) {
        this.contentPublishtime = contentPublishtime;
    }

    public String getContentDesc() {
        return contentDesc;
    }

    public void setContentDesc(String contentDesc) {
        this.contentDesc = contentDesc;
    }

    public Integer getContentMenuId() {
        return contentMenuId;
    }

    public void setContentMenuId(Integer contentMenuId) {
        this.contentMenuId = contentMenuId;
    }

    public Integer getContentIsdelete() {
        return contentIsdelete;
    }

    public void setContentIsdelete(Integer contentIsdelete) {
        this.contentIsdelete = contentIsdelete;
    }

    public String getContentWebinfo() {
        return contentWebinfo;
    }

    public void setContentWebinfo(String contentWebinfo) {
        this.contentWebinfo = contentWebinfo;
    }
}