package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public interface OrderService {

	Map<Customer, List<Item>> getAll();

	boolean addNewOrder();
    boolean ModifyNew(int cid, String cmob);

}
