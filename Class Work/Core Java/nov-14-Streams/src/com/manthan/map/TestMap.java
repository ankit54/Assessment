package com.manthan.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestMap {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(15);
		al.add(8);
		al.add(14);
		al.add(7);
		
		Function<Integer, Integer> fn = i -> i*10;
		
		List<Integer> bl = al.stream().map(fn).collect(Collectors.toList());
		
		System.out.println("mapped list = "+bl);

	}

}
