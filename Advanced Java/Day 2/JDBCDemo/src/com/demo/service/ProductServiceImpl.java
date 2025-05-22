package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.demo.model.Product;

public class ProductServiceImpl implements ProductService{
  private ProductDao pdao;
  public ProductServiceImpl() {
	  pdao=new ProductDaoImpl();
  }
  
@Override
public List<Product> displayAll() {
	return pdao.findAll();
}

@Override
public void closeMyConnection() {
	pdao.closeMyConnection();
	
}

@Override
public Product getById(int id) {
	return pdao.findById(id);
}

@Override
public List<Product> getByPrice(float pr) {
	return pdao.findByPrice(pr);
}

@Override
public List<Product> getsortedData() {
	return pdao.findSortedData();
}

@Override
public boolean modifyProduct(int id, float pr, int qty) {
	return pdao.changeProduct(id,pr,qty);
}

@Override
public boolean addProduct() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter pid");
	int id=sc.nextInt();
	System.out.println("enetr name");
	String pname=sc.next();
	System.out.println("enetr qty");
	int qty=sc.nextInt();
	System.out.println("enter price");
	float pr=sc.nextFloat();
	System.out.println("enter date(dd/MM/yyyy)");
	String dt=sc.next();
	LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	System.out.println("enetr category id");
	int cid=sc.nextInt();
	Product p=new Product(id,pname,qty,pr,ldt,cid);
	return pdao.saveProduct(p);
	
}

@Override
public boolean deleteById(int id) {
	return pdao.removeById(id);
}
}
