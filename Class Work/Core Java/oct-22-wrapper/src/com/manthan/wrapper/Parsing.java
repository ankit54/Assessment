package com.manthan.wrapper;

public class Parsing {
	public static void main(String[] args) {
		String a="90";
		int i=Integer.parseInt(a);
		String b="50";
		int j=Integer.parseInt(b);
		System.out.println(a+b);
		System.out.println(i+j);
		
		String c="2.4";
		double k=Double.parseDouble(c);
		System.out.println(k*2);
		
		String d="true";
		boolean l=Boolean.parseBoolean(d);
		System.out.println(l);
		
		String e="ankit";
		try {
			double m=Double.parseDouble(e);
		}
		catch(NumberFormatException n) {
			System.out.println("String to double not possible");
		}
		
		
	}
}
