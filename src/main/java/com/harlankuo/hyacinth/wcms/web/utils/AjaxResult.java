/**
* 项目名:Web内容管理系统
* 包名：com.harlankuo.hyacinth.wcms.web.utils
* 文件名：AjaxResult.java
* 版本信息：1.0
* 日期：2014年4月24日-下午2:11:44
* 作者：harlankuo
* Copyright (c)2014版权所有--harlankuo
*/
	
package com.harlankuo.hyacinth.wcms.web.utils;

import java.io.Serializable;

/**
 * 类名称：AjaxResult
 * 类描述：
 * 创建人：harlankuo
 * 修改人：harlankuo
 * 修改时间：2014年4月24日 下午2:11:44
 * 修改备注：@version 1.0.0
 */

public class AjaxResult implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean result;

	private String code;

	private Integer id;

	private String errorMessage;

	private String toURL;

	public void success(String toURL) {
		this.result = true;
		this.toURL = toURL;
	}

	public void fail(String errorMessage) {
		this.result = false;
		this.errorMessage = errorMessage;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getToURL() {
		return toURL;
	}

	public void setToURL(String toURL) {
		this.toURL = toURL;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
