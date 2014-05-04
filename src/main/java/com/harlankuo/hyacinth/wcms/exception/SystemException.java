/**
* 项目名:Web内容管理系统
* 包名：com.harlankuo.hyacinth.wcms.exception
* 文件名：SystemException.java
* 版本信息：1.0
* 日期：2014年5月4日-上午11:16:46
* 作者：harlankuo
* Copyright (c)2014版权所有--harlankuo
*/
	
package com.harlankuo.hyacinth.wcms.exception;

/**
 * 类名称：SystemException
 * 类描述：系统异常处理类
 * 创建人：harlankuo
 * 修改人：harlankuo
 * 修改时间：2014年5月4日 上午11:16:46
 * 修改备注：@version 1.0.0
 */

public class SystemException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;  
	  
    public SystemException() {  
        // TODO Auto-generated constructor stub  
    	super();
    }  
  
    /** 
     * @param message 
     */  
    public SystemException(String message) {  
        super(message);  
        // TODO Auto-generated constructor stub  
    }  
  
    /** 
     * @param cause 
     */  
    public SystemException(Throwable cause) {  
        super(cause);  
        // TODO Auto-generated constructor stub  
    }  
  
    /** 
     * @param message 
     * @param cause 
     */  
    public SystemException(String message, Throwable cause) {  
        super(message, cause);  
        // TODO Auto-generated constructor stub  
    }  
}
