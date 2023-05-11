package com.example.demo.service.execption;

public class ObjectNotFoundExecption extends RuntimeException {

	
	private static final long serialVersionUID = 1L;

	public ObjectNotFoundExecption(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ObjectNotFoundExecption(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
