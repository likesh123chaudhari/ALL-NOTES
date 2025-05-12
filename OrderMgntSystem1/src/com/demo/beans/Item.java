package com.demo.beans;

import java.time.LocalDate;

public class Item {

	private int iteno;
	private String iname;
	private int qty;
	private double price;
	private LocalDate mfgDate;
	
	public Item() {
		super();
	}

	public Item(int iteno, String iname, int qty, double price, LocalDate mfgDate) {
		super();
		this.iteno = iteno;
		this.iname = iname;
		this.qty = qty;
		this.price = price;
		this.mfgDate = mfgDate;
	}

	public int getIteno() {
		return iteno;
	}

	public void setIteno(int iteno) {
		this.iteno = iteno;
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

	public LocalDate getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}

	@Override
	public String toString() {
		return "Item [iteno=" + iteno + ", iname=" + iname + ", qty=" + qty + ", price=" + price + ", mfgDate="
				+ mfgDate + "]";
	}
	
	
	
	
}
