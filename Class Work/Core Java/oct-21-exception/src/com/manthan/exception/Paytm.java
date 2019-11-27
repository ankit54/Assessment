package com.manthan.exception;

public class Paytm {
	void booking() {
		System.out.println("paytm booking started");
		Irctc c=new Irctc();
		try{
			c.confirm();
		}
		catch(ArithmeticException e){
			System.out.println("exception handled @ Paytm");
		}
		System.out.println("paytm booking ended");

	}
}
