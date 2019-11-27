package com.manthan.createFiles;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		File f=new File("ankit.txt");
		try {
			f.createNewFile();
			System.out.println("Created");
		} catch (IOException e) {
			System.out.println("Not Created");
		}
	}

}
