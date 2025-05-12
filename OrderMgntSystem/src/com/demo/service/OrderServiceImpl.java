package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.beans.Customer;
import com.demo.beans.Item;
import com.demo.dao.OrderDao;
import com.demo.dao.OrderDaoImpl;

public class OrderServiceImpl implements OrderService {
	private OrderDao odao;

	public OrderServiceImpl() {
		odao=new OrderDaoImpl();
	}

	@Override
	public boolean addNewOrder() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter customer id");
		int cid=sc.nextInt();
		System.out.println("enetr customer name");
		String cname=sc.next();
		System.out.println("enetr mobile");
		String mob=sc.next();
		Customer c=new Customer(cid,cname,mob);
		
		List<Item> ilst=new ArrayList<>();
		String ans=null;
		//accept all items
		do {
		System.out.println("enetr item no");
		int ino=sc.nextInt();
		System.out.println("enetr item name");
		String iname=sc.next();
		System.out.println("enetr qty");
		int qty=sc.nextInt();
		System.out.println("enetr price");
		double pr=sc.nextDouble();
		System.out.println("enetr date (dd/mm/yyyy");
		String dt=sc.next();
		//convert String to LocalDate
		LocalDate ldt=LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		ilst.add(new Item(ino,iname,qty,pr,ldt));
		System.out.println("Do you want to add more");
		ans=sc.next();
		}while(ans.equals("y")); 
		return odao.save(c,ilst);
	}

	@Override
	public Map<Customer, List<Item>> getAll() {
		return odao.findAll();
		
	}

	@Override
	public boolean addItemsInOrder(int cid) {
		Scanner sc=new Scanner(System.in);
		List<Item> nItems=new ArrayList<>();
		String ans=null;
		//accept all items
		do {
		System.out.println("enetr item no");
		int ino=sc.nextInt();
		System.out.println("enetr item name");
		String iname=sc.next();
		System.out.println("enetr qty");
		int qty=sc.nextInt();
		System.out.println("enetr price");
		double pr=sc.nextDouble();
		System.out.println("enetr date (dd/mm/yyyy");
		String dt=sc.next();
		//convert String to LocalDate
		LocalDate ldt=LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		nItems.add(new Item(ino,iname,qty,pr,ldt));
		System.out.println("Do you want to add more");
		ans=sc.next();
		}while(ans.equals("y"));
		return odao.addNewItems(cid,nItems);
	}

	@Override
	public boolean modifyQuantity(int cid, int iid, int nqty) {
		return odao.updateQuantity(cid,iid,nqty);
	}

	@Override
	public boolean deleteItem(int cid, int ino) {
		return odao.removeItem(cid,ino);
	}

	@Override
	public void getOrderById(int cid) {
		odao.findOrderById(cid);
		
	}

	@Override
	public List<Customer> getAllCustomersByItemno(int ino) {
		return odao.findAllCustomersByItemno(ino);
	}

	@Override
	public double getBillForOrder(int cid) {
		return odao.findBillAmount(cid);
	}

	@Override
	public boolean deleteOrderById(int cid) {
		return odao.removeOrderById(cid);
	}

	@Override
	public boolean modifyMobile(int cid, String nmob) {
		return odao.updateMobile(cid,nmob);
	}

	
	

}
