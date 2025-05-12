package com.demo.test;

import java.util.Scanner;

import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImp;

public class TestMgnt {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int choice=0;
	 EmployeeService eservice= new EmployeeServiceImp();
	
	do {
		System.out.println("1.Display All employees\n2. Search by id\n3. Search by name 4. Display all employee ");
		System.out.println("5.. calculate salary and display for all emplyees with particular designation");
		System.out.println("6.exit\n choice");
		
		switch(choice) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		default :
		}
		
	}while(choice!=6);

	
}
}
