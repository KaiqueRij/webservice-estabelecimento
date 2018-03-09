package com.kaique.appestabelecimento.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String message){
		super(message);
	}
	
	public ObjectNotFoundException(String msg, Throwable cause){
		super(msg, cause);
	}

}
