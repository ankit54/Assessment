package com.manthan.exception;

import java.io.File;

public class CheckedException {

	public static void main(String[] args) {
		System.out.println("start");
		File f=new File("ankit.txt");
		try {
			f.createNewFile();
			System.out.println("file created");
		}
		catch(Exception e){
			System.out.println("sorry file not created");
		}
		System.out.println("end");
	}

}
