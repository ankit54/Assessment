package com.manthan.exception;

public class TestAge {

	public static void main(String[] args) {
		int age=28;
		AgeStimulator a=new AgeStimulator();
		try {
			a.checkAge(age);
		}
		catch(IvalidAgeException i){
			//i.printStackTrace();
			System.out.println(i.getMessage());
		}
	}

}
