package program3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.function.Function;

public class TestCollection1 {
	

	public static void main(String[] args) {
		
		

		System.out.println("Enter your choice");
		System.out.println("1. Array List");
		System.out.println("2. Linked List");
		System.out.println("3. Vector");
		
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		Function<Integer, Collection> fn = input1 -> {
			switch (input1) {
			case 1:
				Collection1 c1= new ArrayList1();
				Collection c11=c1.returnColl();
				return c11;
			case 2:
				Collection1 c2= new LinkedList1();
				Collection c12=c2.returnColl();
				return c12;
			case 3:
				Collection1 c3= new Vector1();
				Collection c13=c3.returnColl();
				return c13;
			default:
				return null;
			}
		};
		
		Collection obj=fn.apply(input);
		System.out.println(obj);
	}

}
