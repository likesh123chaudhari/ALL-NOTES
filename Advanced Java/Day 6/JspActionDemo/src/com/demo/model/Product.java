package com.demo.model;

public class Product {
     private int pid;
     private String pname;
     private int qty;
     
	public Product() {
		super();
	}

	public Product(int pid, String pname, int qty) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
	}

	public int getPid() {
		System.out.println("in getpid");
		return pid;
	}

	public void setPid(int pid) {
		System.out.println("in setpid");
		this.pid = pid;
	}

	public String getPname() {
		System.out.println("in getpname");
		return pname;
	}

	public void setPname(String pname) {
		System.out.println("in setpid");
		this.pname = pname;
	}

	public int getQty() {
		System.out.println("in getQty");
		return qty;
	}

	public void setQty(int qty) {
		System.out.println("in setqty");
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + "]";
	}
	
     
}
