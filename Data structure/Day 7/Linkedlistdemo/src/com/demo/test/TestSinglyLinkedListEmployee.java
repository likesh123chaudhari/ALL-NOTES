package com.demo.test;

import com.demo.beans.Employee;
import com.demo.linkedlist.SinglyLinkedList;
import com.demo.linkedlist.SinglyLinkedListEmployee;

public class TestSinglyLinkedListEmployee {
	public static void main(String[] args) {
		SinglyLinkedListEmployee elist=new SinglyLinkedListEmployee();
		elist.addNode(new Employee(12,"Rajan","333333"));
		elist.addNode(new Employee(13,"Revati","343333"));
		elist.addNode(new Employee(14,"Ashu","355333"));
		elist.addNode(new Employee(15,"Sangeeta","336633"));
		elist.addNode(new Employee(16,"Medha","377733"));
		elist.displayData();
		System.out.println("----------------------------");
		elist.addNodeByEmpno(new Employee(17,"Shubhangi","378833"),14);
		elist.displayData();
		System.out.println("----------------------------");
		elist.deleteByEmpno(16);
		elist.deleteByEmpno(12);
		elist.deleteByEmpno(17);
		elist.deleteByEmpno(20);
		elist.displayData();
		
		
	}
	

}
