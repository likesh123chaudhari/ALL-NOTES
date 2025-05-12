package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.services.*;

public class EmpTestMain {

	public static void main(String[] args) {
		
		EmplServiceIntr eservice = new EmpServiceImpl();

		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
			
			System.out.println("1. Display All Employees of Same Type  \n2. Search By Id  ");
			System.out.println("3. Search By Name  \n4. Display all Employee ");
			System.out.println("5. Calculate Sal & Display All Emp With Particular Desg  ");
			System.out.println("6. Accept Department From User and Display  5 Employees of That Department.  ");
            System.out.println("7. Exit  \n\nEnter The Choice : ");
			
			choice = sc.nextInt();
			
			switch(choice) {
			 
			case 1 :
				break;
			
			case 2 :
				break;
			
			case 3 :
				break;
			
			case 4 : 
				List<Employee> elist=eservice.getAll();
			 	if(elist != null) {
			 		elist.forEach(e->{System.out.println(e);});
			 	}
			 	else
			 	{
			 		System.out.println("Employees Not Found ...");
			 	}
			    break;
			
			case 5 :
				break;
			
			case 6 :
				break;
			
			case 7 :
			     System.out.println("Thank You For Visiting ...");
			     sc.close();
			     break;
			
			default : 
				System.out.println("Wrong Choice .. Plz Try Another Choice : ");
				break;
				
			}
			
		}while(choice != 7);
		
		
	}

}

