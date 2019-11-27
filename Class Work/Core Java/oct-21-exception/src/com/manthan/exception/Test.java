package com.manthan.exception;

public class Test {

	public static void main(String[] args) {
		System.out.println("Main started");
		String s="Ankit";
		int a[]=new int[3];
		try {
			System.out.println(10/2);
			System.out.println("HII");
			System.out.println("BYE");
			System.out.println(s.length());
			System.out.println(a[5]);
		}

		catch (ArithmeticException e) {
			System.out.println("dont divide by zero");
		}
		catch (NullPointerException e) {
			System.out.println("dont deal with null");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("dont cross the limit of the array" );
		}
		catch (Exception e) {
			System.out.println("i m general catch block");		}

		System.out.println("Main ended");

	}

}
