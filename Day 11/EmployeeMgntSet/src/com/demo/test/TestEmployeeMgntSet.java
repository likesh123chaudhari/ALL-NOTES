package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeMgntSet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		EmployeeService eservice=new EmployeeServiceImpl();
		do {
			System.out.println("1.Add new emp\n2.Delete Employee\n3.Modify employee");
			System.out.println("4.display by id\n5.display by name\n6. display all\n7. display by salary");
			System.out.println("8.display in sorted order by id\n9. display in sorted order by name");
			System.out.println("10.display in sorted order by sal\n11exit\n choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("1.Salaried 2. Contract");
				int ch=sc.nextInt();
				boolean status=eservice.addNewEmp(ch);
				if(status) {
					System.out.println("added successfully");
				}else {
					System.out.println("not added, duplicate employee");
				}
				break;
			case 2:
				System.out.println("enetr id");
				int id=sc.nextInt();
				status=eservice.deleteById(id);
				if(status) {
					System.out.println("deleted successfully");
				}else {
					System.out.println("not found");
				}
				break;
			case 3:
				System.out.println("enter id");
				id=sc.nextInt();
				System.out.println("enetr salary");
				double sal=sc.nextDouble();
				status=eservice.updateById(id,sal);
				if(status) {
					System.out.println("updated successfully");
				}else{
					System.out.println("not found");
				}
				break;
			case 4:
				System.out.println("enter id");
				id=sc.nextInt();
				Employee e=eservice.displayById(id);
				if(e!=null) {
					System.out.println(e);
				}else{
					System.out.println("not found");
				};
				break;
			case 5:
				System.out.println("enter name");
				String nm=sc.next();
				List<Employee> elist=eservice.getByName(nm);
				if(elist!=null) {
					elist.forEach(System.out::println);
				}else {
					System.out.println("not found");
				}
				break;
			case 6:
				Set<Employee> eset=eservice.getAll();
				eset.forEach(System.out::println);
				break;
			case 7:
				System.out.println("enetr salary");
				sal=sc.nextDouble();
				elist=eservice.getBySalary(sal);
				elist.forEach(System.out::println);
				break;
			case 8:
				eset=eservice.sortById();
				eset.forEach(System.out::println);
				break;
			case 9:
				elist=eservice.sortByName();
				elist.forEach(System.out::println);
				break;
			case 10:
				elist=eservice.sortBySal();
				elist.forEach(System.out::println);
				break;
			case 11:
				sc.close();
				System.out.println("Thank you for visiting....");
				break;
			default:
				System.out.println("wrong choice");
				break;
			}
			
		}while(choice!=11);
	}

}
