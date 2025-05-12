package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

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
	@Override
	public boolean updateQuantity(int cid, int iid, int nqty) {
		//check customer exists or not
		if(ordermap.containsKey(new Customer(cid))) {
			List<Item> lst=ordermap.get(new Customer(cid));
			for(Item item:lst) {
				if(item.getItemno()==iid)
					item.setQty(nqty);
				return true;
			}
			return false;
		}
		return false;
	}
	@Override
	public boolean removeItem(int cid, int ino) {
		//find list of items for the customer
		//if customer exists it will return value otherwise null
		//or you may use containsKey
		List<Item> lst=ordermap.get(new Customer(cid));
		//remove item from the list
		if(lst!=null) {
			return lst.remove(new Item(ino));
			
		}
		//customer id not found
		return false;
		
	}
	@Override
	public void findOrderById(int cid) {
		Set<Customer> cset=ordermap.keySet();
		for(Customer c:cset) {
			if(c.getCid()==cid) {
				//display customer information
				System.out.println(c);
				//display list of items in the order
				System.out.println(ordermap.get(c));
			}
		}
		
	}
	@Override
	public List<Customer> findAllCustomersByItemno(int ino) {
		List<Customer> clist=new ArrayList<>();
		Set<Customer> cset=ordermap.keySet();
		//to get list of all customers who has ordered given item
		for(Customer c:cset) {
			List<Item> ilist=ordermap.get(c);
			if(ilist.contains(new Item(ino))) {
				clist.add(c);
			}
		}
		if(clist.size()>0)
			return clist;
		return null;
	}
	@Override
	public double findBillAmount(int cid) {
		//find list of items for the given customer
		List<Item> ilist=ordermap.get(new Customer(cid));
		//navigate through list of items to calculate bill amount
		double billamt=0;
		if(ilist!=null) {
			for(Item it:ilist) {
				billamt+=it.calcAmt();
			}
		}
		return billamt;
		
	}
	@Override
	public boolean removeOrderById(int cid) {
		List<Item> ilist=ordermap.remove(new Customer(cid));
		if(ilist!=null) {
			return true;
		}
		return false;
	}
	@Override
	public boolean updateMobile(int cid, String nmob) {
		//find customer from the map
		Set<Customer> cset=ordermap.keySet();
		Optional<Customer> op=cset.stream().filter(c->c.getCid()==cid).findFirst();
		//modify mobile number , if found return true, otherwise return false
		if(op.isPresent()) {
			Customer c=op.get();
			c.setCmob(nmob);
			return true;
		}
		return false;
	}

}
