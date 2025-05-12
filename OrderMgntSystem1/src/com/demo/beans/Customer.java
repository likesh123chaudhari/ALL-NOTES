package com.demo.beans;

public class Customer {
    
	private int cid;
	private String cname;
	private String cmob;
	
	public Customer() {
		super();
	}

	public Customer(int cid, String cname, String cmob) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cmob = cmob;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCmob() {
		return cmob;
	}

	

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cmob=" + cmob + "]";
	}

	public void setCmob(String cmob2) {
		this.cmob= cmob2;
		
	}


	
	
}
