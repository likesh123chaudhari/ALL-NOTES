package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.model.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestProductCrudDemo {
public static void main(String[] args) {
	ProductService pservice=new ProductServiceImpl();
	Scanner sc=new Scanner(System.in);
	int choice=0;
	do {
		System.out.println("1. Add product\n 2. delete by id\n3.modify product");
		System.out.println("4. display all\n 5. display by id\n6. display by price");
		System.out.println("7. display in sorted order\n 8. exit\n choice: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			List<Product> plist=pservice.displayAll();
			plist.forEach(System.out::println);
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			System.out.println("Thank you for visiting....." );
			sc.close();
			break;
		default:
			System.out.println("wrong choice...");
		}
		
	}while(choice!=8);
	
	
}
}
