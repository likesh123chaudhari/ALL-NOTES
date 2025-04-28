package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public class OrderDaoImpl implements OrderDao{
	static Map<Customer,List<Item>>  ordermap;
	static {
		ordermap=new HashMap<>();
		//add first order
		Customer cust1=new Customer(12,"Rajesh","454545");
		List<Item> order1=new ArrayList<>();
		order1.add(new Item(100,"chair",34,3456,LocalDate.of(2023, 11,10)));
		order1.add(new Item(101,"table",20,5555,LocalDate.of(2023, 11,20)));
		ordermap.put(cust1,order1);
		//add second order
		Customer cust2=new Customer(13,"Rajan","343434");
		List<Item> order2=new ArrayList<>();
		order2.add(new Item(100,"dining_chair",34,3456,LocalDate.of(2023, 11,10)));
		order2.add(new Item(101,"dining_table",20,5555,LocalDate.of(2023, 11,20)));
		ordermap.put(cust2,order2);
	}
	@Override
	public boolean save(Customer c, List<Item> ilst) {
		if(!ordermap.containsKey(c)) {
		    ordermap.put(c,ilst);
		    return true;
		}
		return false;
		
	}
	@Override
	public Map<Customer, List<Item>> findAll() {
		return ordermap;
	}
	
	//add multiple items in to the list of existing customer
	@Override
	public boolean addNewItems(int cid, List<Item> nItems) {
		//check whether customer exists
		if(ordermap.containsKey(new Customer(cid))) {
			//retrieve pri=evious list
			List<Item> lst=ordermap.get(new Customer(cid));
			//add all objects into lst
			lst.addAll(nItems);
			return true;
			
		}
		return false;
	}

}
