package com.mantan.junit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Filter {
	private DBUtil dbUtil;
	
	public Filter(DBUtil dbUtil) {
		this.dbUtil=dbUtil;
	}
	
	public List<String> myFilter(){
		List<String> list=dbUtil.getList();
		List<String> newList=new ArrayList<String>();
		
		for (String name : list) {
			if(name.startsWith("A")) {
				newList.add(name);
				
			}
		}
		return newList;
	}
}
