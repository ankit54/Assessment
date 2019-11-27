package com.manthan.exception;

import java.io.IOException;

public class TestCheckedExcption {

	public static void main(String[] args)  {
		CheckedExcption d=new CheckedExcption();
		try {                                        //here exception is handled when run() is called 
			//because of checked exception.
			d.run();
		} catch (IOException e) {
			System.out.println("hh");

		}
	}
}