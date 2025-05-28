package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {
	List<Product> findAllProduct(int c);

	List<Product> findManyByCid(String[] parr);
}
