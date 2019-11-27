package com.manthan.exception;

public class AtmStimulator {
void verify(int amt) {
	if(amt>40000) {
		DayLimitException s= new DayLimitException();
		throw s;
	}
}
}
