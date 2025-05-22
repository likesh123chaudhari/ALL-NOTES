package com.demo.dao;

import java.util.List;

import com.demo.model.Product;

public interface ProductDao {

	List<Product> findAll();

	void closeMyConnection();

	Product findById(int id);

	List<Product> findByPrice(float pr);

	List<Product> findSortedData();

	boolean changeProduct(int id, float pr, int qty);

	boolean saveProduct(Product p);

	boolean removeById(int id);


}
