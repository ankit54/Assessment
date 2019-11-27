package com.manthan.typeCasting;

public class TestAnimal {

	public static void main(String[] args) {
		Animal a=new Cow();    // up casting  --->storing child object in parent type reference
		Cow c=(Cow)a;          // down casting--->converting parent type reference to child type reference
		c.cost=10;
		c.size=10;
		c.eat();
		c.run();
	}

}
