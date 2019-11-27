package com.manthan.propertiesFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) {
	
	try {
		FileInputStream fin= new FileInputStream("myDBconfig.properties");
		Properties pr=new Properties();
		pr.load(fin);
		
		String url=pr.getProperty("url");
		String user=pr.getProperty("user");
		
		System.out.println(url);
		System.out.println(user);
		fin.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
