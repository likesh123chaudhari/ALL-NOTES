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


public Customer(int cid) {
	super();
	this.cid = cid;
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
public void setCmob(String cmob) {
	this.cmob = cmob;
}

public int hashCode() {
	System.out.println("in customer hashcode method"+cid);
	//return cid+cname.hashCode();
	return cid;
}

public boolean equals(Object obj) {
	System.out.println("in customer equals  method"+cid+"----"+((Customer)obj).cid);
	return this.cid==((Customer)obj).cid;
}

@Override
public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + ", cmob=" + cmob + "]";
}

}
