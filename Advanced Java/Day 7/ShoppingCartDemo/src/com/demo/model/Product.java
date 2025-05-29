package com.demo.model;

public class Product {
	private int pid,qty,catid;
	private String pname;
	private double price;
	public Product() {
		super();
	}
	public Product(int pid, String pname,int qty,  double price,int catid) {
		super();
		this.pid = pid;
		this.qty = qty;
		this.catid = catid;
		this.pname = pname;
		this.price = price;
	}
	
	public Product(int pid,  String pname, int qty,double price) {
		super();
		this.pid = pid;
		this.qty = qty;
		this.pname = pname;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", qty=" + qty + ", catid=" + catid + ", pname=" + pname + ", price=" + price
				+ "]";
	}
	

}
