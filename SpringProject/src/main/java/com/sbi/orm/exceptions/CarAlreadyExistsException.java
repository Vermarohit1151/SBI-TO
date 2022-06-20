package com.sbi.orm.exceptions;

public class CarAlreadyExistsException extends RuntimeException {
	
	public CarAlreadyExistsException(String msg) {
		super(msg);
	}
}
