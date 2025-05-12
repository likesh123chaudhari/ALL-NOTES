package com.demo.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.beans.Customer;
import com.demo.beans.Item;
import com.demo.service.OrderService;
import com.demo.service.OrderServiceImpl;

public class TestOrderMgtSystem {

	public static void main(String[] args) {
		
		OrderService oservice= new OrderServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		int choice=0;
		
		do {
			
			System.out.println("1. Add New Order \n2. Delete Order \n3. Modify Customer Mob No.");
			System.out.println("4. Add New Item In Existing Order \n5. Delete Item From Existing Order ");
			System.out.println("6. modify Qty for Existing Order of a Particular Item ");
			System.out.println("7. Display All \n8. Display Order of a Customer");
			System.out.println("9. Display Order That has Some Particular Item \n10. Calculate ill For a Particular Order");
			System.out.println("11. Exit \nChoice : ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1 :
				boolean status=oservice.addNewOrder();
				if(status) {
					System.out.println("Order Added Successfully ...");
				}
				else {
					System.out.println("Failed To Add Order .... Plz Try Again ...");
				}
				break;
			case 2 :
			break;
			
			case 3 :
		       System.out.println("enter customer id to modify moblie Number");
		       int cid=sc.nextInt();
		       System.out.println("Entre the New Number");
		       String cmob=sc.next();
		       status=oservice.ModifyNew(cid,cmob);
		       if(status) {
		    	   System.out.println("Moblie Number modification Done");
		       }else {
		    	   System.out.println("Not Found");
		       }
		       
				break;
			case 4 :
				
				
				break;
			case 5 :
				break;
			case 6 :
				break;
			case 7 :
				Map<Customer, List<Item>> cmap = oservice.getAll();
				cmap.forEach((c,olist)-> {
					System.out.println(c+" : ");
					System.out.println(olist +"\n");
				});
				break;
			case 8 :
				break;
			case 9 :
				break;
			case 10 :
				break;
			case 11 :
				sc.close();
				System.out.println("Thanks For Visiting Us .....");
				break;
				
			default : 
				System.out.println("Wrong Choice ... Plz Enter Valid Choice .....");
			}
			
		}while(choice!=11);
		
	}
	
}
