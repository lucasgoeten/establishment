package com.mannagement.establishment.service.exception;

public class ObjectIsNotValideException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjectIsNotValideException(String msg) {
		super(msg);
	}
	
	public ObjectIsNotValideException(String msg, Throwable cause) {
		super(msg, cause);
	}
}