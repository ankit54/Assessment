package com.manthan.exception;

public class IvalidAgeException extends Exception {
	String message;

	public IvalidAgeException() {
		this.message="you are below 18";
	}

	public IvalidAgeException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
