package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	List<Product> displayAll();

	void closeMyConnection();

	Product getById(int id);

	List<Product> getByPrice(float pr);

	List<Product> getsortedData();

	boolean modifyProduct(int id, float pr, int qty);

	boolean addProduct();

	boolean deleteById(int id);

}
