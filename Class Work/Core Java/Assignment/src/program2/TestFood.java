package program2;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestFood {
public static void main(String[] args) {
	
	System.out.println("Enter your choice");
	System.out.println("1. Lays");
	System.out.println("2. Bingo");
	System.out.println("3. Kurkure");
	
	Scanner sc=new Scanner(System.in);
	int input=sc.nextInt();
	
	
	
	
	
	Function<Integer,Food> fn = input1 -> {
		switch (input1) {
		case 1:
			return new Lays();
		case 2:
			return new Bingo();
		case 3:
			return new Kurkure();
		default:
			return null;
		}
	};
	Food f=fn.apply(input);
	f.name();
}
}
