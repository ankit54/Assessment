package program4;

import java.util.HashMap;
import java.util.Scanner;

public class Train {
	public static void main(String[] args) {
		HashMap<Integer, String> train= new HashMap<Integer, String>();
		train.put(1, "Train 1");
		train.put(2, "Train 2");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter choice");
		System.out.println("1. search by train no.");
		System.out.println("2. search by name");
		int ch=sc.nextInt();
		sc.nextLine();
		switch (ch) {
		case 1:
			System.out.println("Enter train no");
			int trainNo=sc.nextInt();
			sc.nextLine();
			System.out.println("Train name is: "+train.get(trainNo));
			break;
		case 2:
			System.out.println("enter train name: ");
			String trainName=sc.nextLine();
			System.out.println("train number is: "+train.containsValue(trainName));
		default:
			break;
		}
		
	}
}
