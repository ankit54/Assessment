package com.manthan.propertiesFiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) {
		Properties pr=new Properties();
		pr.setProperty("driverName", "com.mysql.jdbcDriver");
		pr.setProperty("url", "jdbc:mysql://localhost:3306");
		pr.setProperty("user", "scott");
		pr.setProperty("password", "root");
		
		try {
			FileOutputStream fout=new FileOutputStream("myDBconfig.properties");
			pr.store(fout, "Storing data");
			System.out.println("done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
