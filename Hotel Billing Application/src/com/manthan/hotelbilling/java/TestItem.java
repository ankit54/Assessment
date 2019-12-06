package com.manthan.hotelbilling.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


import com.manthan.hotelbilling.bean.ItemInfoBean;
import com.manthan.hotelbilling.dao.ItemDao;
import com.manthan.hotelbilling.dao.ItemDaoImpl;

public class TestItem {
	static Scanner sc = new Scanner(System.in);
	static ItemDao dao= new ItemDaoImpl();
	static double totalbill=0;
	static boolean exit=false;
	public static void main(String[] args) {
		while(!exit) {
			System.out.println("**** WELCOME TO HOTEL BILLING ****");
			System.out.println("Press 1 to 'Show all food items'");
			System.out.println("Press 2 to 'Take order from customers'  ");
			System.out.println("Press 3 to 'Operate on food items'");
			System.out.println("Press 4 to 'Total bill of the day'");
			System.out.println("Press 5 to Exit");

			System.out.println("Enter Your Choice : ");
			int input1=sc.nextInt();
			sc.nextLine();

			switch (input1) {
			case 1:

				List<ItemInfoBean> allItems=dao.showAll();
				for (ItemInfoBean itemInfoBean : allItems) {
					System.out.println("All Items are shown below:-");
					System.out.println("Item Code: "+itemInfoBean.getItemCode());
					System.out.println("Food Name: "+itemInfoBean.getFoodName());
					System.out.println("Price: "+itemInfoBean.getPrice());
				}
				break;
			case 2:
				System.out.println("Taking order...");
				List<Integer> orderedItems=new ArrayList<Integer>();
				Map<Integer,Integer> quantity=new HashMap<Integer, Integer>();
				boolean orderEnd=false;
				while(!orderEnd) {
					System.out.println("enter the item code: or Press 0 to end your order ");
					int itemCode=sc.nextInt();
					if(itemCode!=0) {
						orderedItems.add(itemCode);
					}else {
						orderEnd=true;
					}
				}
				List<ItemInfoBean> bill=dao.generateBill(orderedItems);
				System.out.println("****** YOUR BILL DETAILS ******");
				for (ItemInfoBean item : bill) {
					if(quantity.containsKey(item.getItemCode())) {
						quantity.put(item.getItemCode(),quantity.get(item.getItemCode())+1);


					}else {
						quantity.put(item.getItemCode(), 1);
					}
				}
				for (Map.Entry<Integer, Integer> q:quantity.entrySet()) {

					System.out.println("Item Code: "+"     "+"Quantity");
					System.out.println(q.getKey()+"             "+q.getValue());
				}
				double totalPrice=dao.generateTotalPrice(orderedItems);
				totalbill=totalbill+totalPrice;
				System.out.println("Total Price: "+totalPrice);
				break;
			case 3:
				System.out.println("Press A to 'add food item'");
				System.out.println("Press B to 'remove food item'");
				System.out.println("Press C to 'modify food item");
				System.out.println("Enter Your Choice : ");
				char input2=sc.next().charAt(0);

				switch(input2) {
				case 'A':
					System.out.println("Enter the details of food you want to add...");
					System.out.println("Enter Item Code:");
					int itemCode=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Food Name:");
					String foodName=sc.nextLine();
					System.out.println("Enter Price:");
					Double price=sc.nextDouble();

					ItemInfoBean itemInfoBean=new ItemInfoBean();
					itemInfoBean.setItemCode(itemCode);
					itemInfoBean.setFoodName(foodName);
					itemInfoBean.setPrice(price);

					boolean isAdded= dao.addFoodItem(itemInfoBean);

					if (isAdded) {
						System.out.println("Item Added!!");
					}else {
						System.out.println("Sorry..Item not added!!");
					}

					break;
				case 'B':
					System.out.println("Enter the details of food you want to remove...");
					System.out.println("Enter Item Code:");
					int itemCode2=sc.nextInt();
					sc.nextLine();

					boolean isRemoved=dao.removeFoodItem(itemCode2);
					if(isRemoved) {
						System.out.println("Item Removed!!");
					}else {
						System.out.println("Sorry... Item cannot be removed");
					}
					break;
				case 'C':
					System.out.println("Enter the details of food you want to remove...");
					System.out.println("Enter Item Code:");
					itemCode=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Food Name:");
					foodName=sc.nextLine();
					System.out.println("Enter Price:");
					price=sc.nextDouble();

					boolean isModified=dao.modifyFoodItem(itemCode, foodName, price);
					if (isModified) {
						System.out.println("Item modified");
					}else {
						System.out.println("Sorry... Item not modified!!");
					}
					break;
				default:
					System.out.println("Wrong choice!!");
					break;
				}
				break;
			case 4:
				System.out.println("***** TOTAL BILL OF THE DAY *****");
				System.out.println("Rs: "+ totalbill);
				System.out.println();
				break;
			case 5:
				exit=true;
			default:
				System.out.println("Sorry... Wrong Choice!!");
				break;
			}
		}



	} // end of main()

}
