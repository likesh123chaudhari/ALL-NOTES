package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="myuser333")
public class MyUser {
	@Id
    private int uid;
	@Column(name="usernm",nullable=false)
    private String uname;
    private String address;
    private String email;
	public MyUser() {
		super();
	}
	public MyUser(int uid, String uname, String address,String email) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.address = address;
		this.email=email;
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", uname=" + uname + ", address=" + address + ", email=" + email + "]";
	}
	
    
    
}
