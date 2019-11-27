package com.manthan.exception;

public class DayLimitException extends RuntimeException{
	String m="sorry day limit crossed";
	public String getMessage() {
		return m;

	}
}
