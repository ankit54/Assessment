package com.manthan.comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class TestComparator {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(15);
		al.add(8);
		al.add(14);
		al.add(7);
		
		Comparator<Integer> fn= (i,j)->i.compareTo(j);
		
		int a=al.stream().max(fn).get();
		System.out.println("max in arrayList = "+a);
		int b=al.stream().min(fn).get();
		System.out.println("min in arrayList = "+b);
			
		

	}

}
