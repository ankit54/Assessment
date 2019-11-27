package com.manthan.array;

public class TestReturnArray {

	public static void main(String[] args) {
		ReturnArray r=new ReturnArray();
		double[] k=r.getArray();
		for (double d : k) {
			System.out.println(d);
		}
	}
 
}
