package com.manthan.createFiles;

import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {
		File f=new File("Manthan/Ankit");
		f.mkdirs();

	}

}