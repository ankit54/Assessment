package com.manthan.exception;

import java.io.File;
import java.io.IOException;

public class CheckedExcption {
	void run() throws IOException{ //indicate that there might be a exception so those who
		                           //are calling run() it is neccesary to use try/catch.
		File f=new File("C:./demo1.txt");
		f.createNewFile();
	}
}
