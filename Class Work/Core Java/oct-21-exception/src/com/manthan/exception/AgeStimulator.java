package com.manthan.exception;

public class AgeStimulator {
	void checkAge(int age) throws IvalidAgeException {
		if(age<20) {
			IvalidAgeException i=new IvalidAgeException();
			throw i;
		}
		else {
			System.out.println("you are above 18.");
		}
	}
}
