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
			boolean status=pservice.addProduct();
			if(status) {
				System.out.println("Added successfully");
			}else {
				System.out.println("not inserted");
			}
			break;
		case 2:
			System.out.println("enter pid");
			int id=sc.nextInt();
			status=pservice.deleteById(id);
			if(status) {
				System.out.println("deleted successfully");
			}else {
				System.out.println("not found");
			}
			break;
		case 3:
			System.out.println("enter pid");
			id=sc.nextInt();
			System.out.println("enter price");
			float pr=sc.nextFloat();
			System.out.println("enter qty");
			int qty=sc.nextInt();
			status=pservice.modifyProduct(id,pr,qty);
			if(status) {
				System.out.println("updated successfully");
			}else {
				System.out.println("not found");
			}
			
			break;
		case 4:
			List<Product> plist=pservice.displayAll();
			plist.forEach(System.out::println);
			break;
		case 5:
			System.out.println("enetr pid");
			id=sc.nextInt();
			Product p=pservice.getById(id);
			if(p!=null) {
				System.out.println(p);
			}else {
				System.out.println("not found");
			}
			break;
		case 6:
			System.out.println("enetr price");
			pr=sc.nextFloat();
			plist=pservice.getByPrice(pr);
			if(plist!=null)
				plist.forEach(System.out::println);
			else
				System.out.println("not found");
			break;
		case 7:
			plist=pservice.getsortedData();
			plist.forEach(System.out::println);
			break;
		case 8:
			System.out.println("Thank you for visiting....." );
			sc.close();
			pservice.closeMyConnection();
			break;
		default:
			System.out.println("wrong choice...");
		}
		
	}while(choice!=8);
	
	
}
}
