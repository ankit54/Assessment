package com.manthan.exception;

public class TestAtmStimulator {
public static void main(String[] args) {
	int amt=41000;
	AtmStimulator a=new AtmStimulator();
	try {
		a.verify(amt);
	}
	catch (DayLimitException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
		
	}
}
}
