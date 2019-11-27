package com.manthan.array;

public class TestStudent {

	public static void main(String[] args) {
		Student[] s=new Student[4];
		Student s1=new Student("Ankit", 25, 85.2);
		Student s2=new Student("Anu", 5, 67.2);
		Student s3=new Student("bikas", 25, 95.2);
		Student s4=new Student("kunal", 25, 55.2);

		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		s[3]=s4;

		for (Student r : s) {
			System.out.println(r.name);
			System.out.println(r.roll);
			System.out.println(r.marks);

		}

	}

}
