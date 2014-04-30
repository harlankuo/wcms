package com.harlankuo.hyacinth.wcms.model;
import java.io.Serializable;

import javax.persistence.Entity;

import com.harlankuo.hyacinth.wcms.entity.BaseDomain;

@Entity
public class DataLink extends BaseDomain {
	private static final long serialVersionUID = -7970848646314840509L;
	
    private Integer linkId;

    private String linkName;

    private String linkUrl;

    private Integer linkBaseinfoId;

    private Integer linkIsdelete;

    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public Integer getLinkBaseinfoId() {
        return linkBaseinfoId;
    }

    public void setLinkBaseinfoId(Integer linkBaseinfoId) {
        this.linkBaseinfoId = linkBaseinfoId;
    }

    public Integer getLinkIsdelete() {
        return linkIsdelete;
    }

    public void setLinkIsdelete(Integer linkIsdelete) {
        this.linkIsdelete = linkIsdelete;
    }
}