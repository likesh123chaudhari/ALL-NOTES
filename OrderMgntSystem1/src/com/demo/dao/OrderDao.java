package com.demo.dao;

import java.util.List;
import java.util.Map;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public interface OrderDao {

	Map<Customer, List<Item>> findAll();

	boolean save(Customer c, List<Item> ilist);

	boolean ModifyNew(int cid, String cmob);



}
