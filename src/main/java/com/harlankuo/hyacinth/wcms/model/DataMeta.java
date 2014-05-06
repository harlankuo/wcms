package com.harlankuo.hyacinth.wcms.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class DataMeta extends BaseDomain {
	private static final long serialVersionUID = -7970848646314840509L;
    private Integer metaId;

    private String metaKeywords;

    private String metaDescription;

    private String metaAuthor;

    private String metaCopyright;

    private Integer metaContentId;

    private Integer metaIsdelete;

    public Integer getMetaId() {
        return metaId;
    }

    public void setMetaId(Integer metaId) {
        this.metaId = metaId;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getMetaAuthor() {
        return metaAuthor;
    }

    public void setMetaAuthor(String metaAuthor) {
        this.metaAuthor = metaAuthor;
    }

    public String getMetaCopyright() {
        return metaCopyright;
    }

    public void setMetaCopyright(String metaCopyright) {
        this.metaCopyright = metaCopyright;
    }

    public Integer getMetaContentId() {
        return metaContentId;
    }

    public void setMetaContentId(Integer metaContentId) {
        this.metaContentId = metaContentId;
    }

    public Integer getMetaIsdelete() {
        return metaIsdelete;
    }

    public void setMetaIsdelete(Integer metaIsdelete) {
        this.metaIsdelete = metaIsdelete;
    }
}