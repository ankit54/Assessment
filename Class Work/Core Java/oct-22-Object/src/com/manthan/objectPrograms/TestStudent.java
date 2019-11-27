package com.manthan.objectPrograms;

public class TestStudent {

	public static void main(String[] args) {
		Student s=new Student("Ankit",25,95);
		System.out.println(s.hashCode());

		System.out.println(s);// print qualified address of student object;
		
		Student n=new Student("kkk", 5, 56);
		
		System.out.println(n.hashCode());
		

	}

}
