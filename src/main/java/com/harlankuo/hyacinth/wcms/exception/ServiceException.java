package com.harlankuo.hyacinth.wcms.exception;

import org.springframework.dao.DataAccessException;

public class ServiceException extends DataAccessException {
	
private static final long serialVersionUID = 1L;
    
    public ServiceException(String msg) {
        super(msg);
    }
 
    public ServiceException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
