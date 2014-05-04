/**
* 项目名:Web内容管理系统
* 包名：com.harlankuo.hyacinth.wcms.exception
* 文件名：BusinessException.java
* 版本信息：1.0
* 日期：2014年5月4日-上午11:15:21
* 作者：harlankuo
* Copyright (c)2014版权所有--harlankuo
*/
	
package com.harlankuo.hyacinth.wcms.exception;

/**
 * 类名称：BusinessException
 * 类描述：应用异常处理类
 * 创建人：harlankuo
 * 修改人：harlankuo
 * 修改时间：2014年5月4日 上午11:15:21
 * 修改备注：@version 1.0.0
 */

public class BusinessException extends Exception {
	
	private static final long serialVersionUID = 1L;  
	  
    public BusinessException() {  
        // TODO Auto-generated constructor stub  
    	super();
    }  
  
    public BusinessException(String message) {  
        super(message);  
        // TODO Auto-generated constructor stub  
    }  
  
    public BusinessException(Throwable cause) {  
        super(cause);  
        // TODO Auto-generated constructor stub  
    }  
  
    public BusinessException(String message, Throwable cause) {  
        super(message, cause);  
        // TODO Auto-generated constructor stub  
    }  
}
