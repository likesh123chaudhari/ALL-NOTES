package com.demo.beans;

import java.time.LocalDate;

public class Item {
	private int itemno;
	private String iname;
	private int qty;
	private double price;
	private LocalDate mfgdate;
	public Item() {
		super();
	}
	public Item(int itemno, String iname, int qty, double price, LocalDate mfgdate) {
		super();
		this.itemno = itemno;
		this.iname = iname;
		this.qty = qty;
		this.price = price;
		this.mfgdate = mfgdate;
	}
	public int getItemno() {
		return itemno;
	}
	public void setItemno(int itemno) {
		this.itemno = itemno;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getMfgdate() {
		return mfgdate;
	}
	public void setMfgdate(LocalDate mfgdate) {
		this.mfgdate = mfgdate;
	}
	public double calcAmt() {
		return qty*price;
	}
	@Override
	public String toString() {
		return "Item [itemno=" + itemno + ", iname=" + iname + ", qty=" + qty + ", price=" + price + ", mfgdate="
				+ mfgdate + "]";
	}
	
	

}
