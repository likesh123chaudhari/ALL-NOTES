package com.demo.dao;

import java.util.List;
import java.util.Map;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public interface OrderDao {

	boolean save(Customer c, List<Item> ilst);

	Map<Customer, List<Item>> findAll();

	boolean addNewItems(int cid, List<Item> nItems);

	boolean updateQuantity(int cid, int iid, int nqty);

	boolean removeItem(int cid, int ino);

	void findOrderById(int cid);

	List<Customer> findAllCustomersByItemno(int ino);

	double findBillAmount(int cid);

	boolean removeOrderById(int cid);

	boolean updateMobile(int cid, String nmob);

}
