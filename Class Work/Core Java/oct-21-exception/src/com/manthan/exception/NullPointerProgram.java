package com.manthan.exception;

public class NullPointerProgram {

	public static void main(String[] args) {
		System.out.println("Main started");
		String s=null;
		try {
			System.out.println(s.length());
		}
		catch (NullPointerException e) {
			System.out.println("dont deal with null");
		}

		System.out.println("Main ended");
	}

}
