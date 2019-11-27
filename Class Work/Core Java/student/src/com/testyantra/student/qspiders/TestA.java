package com.testyantra.student.qspiders;

import com.testyantra.student.jspiders.Angular;
import com.testyantra.student.jspiders.React;

public class TestA {
	public static void main(String[] args) {
		QTP p=new QTP();
		p.teachQTP();

		Selenium s=new Selenium();
		s.teachSelenium();

		Angular a= new Angular();
		a.teachAngular();

		React r=new React();
		r.teachReact();
	}
}
