package com.demo.dao;

import java.util.List;

import com.demo.model.Product;

public interface ProductDao {

	List<Product> findAllProducts();

	boolean save(Product p);

	Product findById(int pid);

	boolean modifyProduct(Product p);

	boolean removeById(int pid);

}
