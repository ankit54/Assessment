package com.manthan.exception;

public class Irctc {
	void confirm() {
		System.out.println("irctc confirm started");
		try {
			System.out.println(10/2);
		}
		catch (ArithmeticException e) {
			System.out.println("exception handled @ Irctc");
			throw e;
		}
		finally {
			System.out.println("irctc confirm ended");
		}
	}
}
