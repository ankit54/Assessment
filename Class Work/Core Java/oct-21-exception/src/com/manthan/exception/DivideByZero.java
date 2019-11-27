package com.manthan.exception;

public class DivideByZero {

	public static void main(String[] args) {
		System.out.println("Main started");
		
		try {
			System.out.println(10/0);
		}
		catch (ArithmeticException e) {
			System.out.println("dont divide by zero");
		}
		
		System.out.println("Main ended");
	}

}
