package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public interface OrderService {

	boolean addNewOrder();

	Map<Customer, List<Item>> getAll();

	boolean addItemsInOrder(int cid);

	boolean modifyQuantity(int cid, int iid, int nqty);

}
