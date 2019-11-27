package com.manthan.exception;

public class TestIrctcPaytm {
	public static void main(String[] args) {
		System.out.println("main started");
		Paytm p=new Paytm();
		try{
			p.booking();
		}
		catch (Exception e) {
				System.out.println("exception handled @ main");
		}
		System.out.println("main ended");
	}
}
