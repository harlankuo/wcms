package com.harlankuo.hyacinth.wcms.model;

import java.io.Serializable;

import javax.persistence.Entity;

import com.harlankuo.hyacinth.wcms.entity.BaseDomain;

@Entity
public class DataBaseInfo extends BaseDomain {
	private static final long serialVersionUID = -7970848646314840509L;
    private Integer baseinfoId;

    private String baseinfoName;

    private String baseinfoUrl;

    private String baseinfoDesc;

    private Integer baseinfoUserId;

    private Integer baseinfoIsdelete;

    public Integer getBaseinfoId() {
        return baseinfoId;
    }

    public void setBaseinfoId(Integer baseinfoId) {
        this.baseinfoId = baseinfoId;
    }

    public String getBaseinfoName() {
        return baseinfoName;
    }

    public void setBaseinfoName(String baseinfoName) {
        this.baseinfoName = baseinfoName;
    }

    public String getBaseinfoUrl() {
        return baseinfoUrl;
    }

    public void setBaseinfoUrl(String baseinfoUrl) {
        this.baseinfoUrl = baseinfoUrl;
    }

    public String getBaseinfoDesc() {
        return baseinfoDesc;
    }

    public void setBaseinfoDesc(String baseinfoDesc) {
        this.baseinfoDesc = baseinfoDesc;
    }

    public Integer getBaseinfoUserId() {
        return baseinfoUserId;
    }

    public void setBaseinfoUserId(Integer baseinfoUserId) {
        this.baseinfoUserId = baseinfoUserId;
    }

    public Integer getBaseinfoIsdelete() {
        return baseinfoIsdelete;
    }

    public void setBaseinfoIsdelete(Integer baseinfoIsdelete) {
        this.baseinfoIsdelete = baseinfoIsdelete;
    }
}