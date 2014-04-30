/**
* 项目名:Web内容管理系统
* 包名：com.harlankuo.hyacinth.wcms.entity
* 文件名：ReturnValue.java
* 版本信息：1.0
* 日期：2014年4月29日-下午2:41:53
* 作者：harlankuo
* Copyright (c)2014版权所有--harlankuo
*/
	
package com.harlankuo.hyacinth.wcms.entity;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.Entity;

/**
 * 类名称：ReturnValue
 * 类描述：所有Json返回的实体对象
 * 创建人：harlankuo
 * 修改人：harlankuo
 * 修改时间：2014年4月29日 下午2:41:53
 * 修改备注：@version 1.0.0
 */
@Entity
public class ReturnValue implements Serializable {
	private static final long serialVersionUID = -7970848646314840509L;
	private Boolean success;
	private String url;
	private String message;
	private String error;
	private HashMap<String, Object> dataMap;
	
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public HashMap<String, Object> getDataMap() {
		return dataMap;
	}
	public void setDataMap(HashMap<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
	
}
