package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.beans.Customer;
import com.demo.beans.Item;
import com.demo.dao.OrderDao;
import com.demo.dao.OrderDaoImpl;

public class OrderServiceImpl implements OrderService {

	private  OrderDao odao;
	
	public OrderServiceImpl() {
		odao = new OrderDaoImpl();
	}

	@Override
	public Map<Customer, List<Item>> getAll() {
		
		return odao.findAll();
	}

	@Override
	public boolean addNewOrder() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Customer Id : ");
		int cid=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter The Customer Name : ");
		String cname=sc.next();
		
		System.out.println("Enter the Customer Mob No. : ");
		String cmob = sc.next();
		
		Customer c = new Customer(cid,cname, cmob);
      
		List<Item> ilist = new ArrayList();
		
	    String ans = null;
	    
	    do {
	    	
	    	System.out.println("Enter Item No. : ");
	    	int itemno = sc.nextInt();
	    	
	    	sc.nextLine();
	    	System.out.println("Ente the Item Name : ");
	    	String iname = sc.nextLine();
	    	
	    	System.out.println("Enter the Qty of Items : ");
	    	int qty = sc.nextInt();
	    	
	    	System.out.println("Ente the Price Of Item : ");
	    	double price = sc.nextDouble();
	    	
	    	System.out.println("Enter the Date In [ dd/mm/yyyy ] Format : ");
	    	String dt = sc.next();
	    	
	    	LocalDate ldt = LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	    	
	    	ilist.add(new Item (itemno, iname, qty, price, ldt));
	    	
	    	System.out.println("Do You Want To continue To Add Items In List : [y/n] ");
	    	ans= sc.next();
	    	
	    	
	    }while(ans.equals("y"));
		
		return odao.save(c,ilist);
	}

	@Override
	public boolean ModifyNew(int cid,String cmob) {
		return odao.ModifyNew(cid,cmob);
	}



	

		
	
	
}
