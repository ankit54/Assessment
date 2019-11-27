package com.manthan.createFiles;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileUsingCharacter {

	public static void main(String[] args) {
		String msg="hii... Pavitra !!!";
		char ch[] = msg.toCharArray();
		try {
			FileWriter fw=new FileWriter("writeUsingChar.txt");
			fw.write(ch);
			fw.flush();
			fw.close();
			System.out.println("Created and written !!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
