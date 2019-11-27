package com.manthan.array;

public class Demo {
	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=2;
		a[1]=2;
		a[2]=4;
		a[3]=12;
		a[4]=7;
		System.out.println("............Integer Array...........");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);

		double[] d=new double[5];
		d[0]=5.6;
		d[1]=2.4;
		d[2]=9.2;
		d[3]=3.4;
		d[4]=4.1;
		System.out.println("............Double Array...........");
		for(int i=0;i<d.length;i++)
			System.out.println(d[i]);

		char[] c=new char[5];
		c[0]='a';
		c[1]='p';
		c[2]='p';
		c[3]='l';
		c[4]='e';
		System.out.println("............Char Array...........");
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]);



		String[] s=new String[4];
		s[0]="dimple";
		s[1]="Chinnu";
		s[2]="Raju";
		s[3]="Priya";
		System.out.println("............String Array...........");
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);

	}
}
