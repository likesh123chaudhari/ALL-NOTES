package com.demo.beans;

public class Coordinator {
	private int cid;
	private String cname;
	private String addr;
	public Coordinator() {
		super();
	}
	public Coordinator(int cid, String cname, String addr) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.addr = addr;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Coordinator [cid=" + cid + ", cname=" + cname + ", addr=" + addr + "]";
	}
	

}
