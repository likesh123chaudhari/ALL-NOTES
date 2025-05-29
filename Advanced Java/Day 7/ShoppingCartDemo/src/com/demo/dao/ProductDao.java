package com.demo.dao;

import java.util.List;

import com.demo.model.Product;

public interface ProductDao {
	List<Product> getAllProduct(int c);

	List<Product> findManyByCid(String[] parr);
}
