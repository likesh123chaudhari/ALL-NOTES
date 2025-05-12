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

public class OrderDaoImpl implements OrderDao {
	
	static Map<Customer,List<Item>> ordermap;
	
	static {
		ordermap = new HashMap<>();
		
		Customer cust1 = new Customer(1,"Ajinkya","9359474842");
		List<Item> order1 = new ArrayList<>();
		
		order1.add(new Item(100,"chair",34,3456,LocalDate.of(2023, 11,10)));
		order1.add(new Item(101,"table",20,5055,LocalDate.of(2023, 10, 26)));
	
		ordermap.put(cust1, order1);
		
		Customer cust2 = new Customer(2,"Ajju","9923022101");
		List<Item> order2 = new ArrayList<>();
		
		order2.add(new Item(100, "Cooler", 30, 5000, LocalDate.of(2025, 5, 19)));
		order2.add(new Item(101, "Freez", 40, 4999, LocalDate.of(2024, 4, 25)));
		
		ordermap.put(cust2, order2);
		
	}

	@Override
	public Map<Customer, List<Item>> findAll() {
		
		return ordermap;
	}

	@Override
	public boolean save(Customer c, List<Item> ilist) {
		
		if(!ordermap.containsKey(c)) {
			
			ordermap.put(c, ilist);
			return true;
			
		}
		
		
		return false;
	}

	@Override
	public boolean ModifyNew(int cid,String cmob) {
		Set<Customer> cset=ordermap.keySet();
		Optional<Customer> op=cset.stream().filter(c->c.getCid()==cid).findFirst();
		if(op.isPresent()) {
			Customer c=op.get();
			c.setC
			mob(cmob);
			return true;
		}
		return false;
	}

	
	
}
