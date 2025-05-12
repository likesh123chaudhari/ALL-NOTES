package com.demo.beans;

public class Employee {
   private int id;
	private String name;
	private String email;
	private int mobno;
	private String deg;
	public Employee() {
		super();
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	public String getDeg() {
		return deg;
	}
	public void setDeg(String deg) {
		this.deg = deg;
	}
	public Employee(int id, String name, String email, int mobno, String deg) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobno = mobno;
		this.deg = deg;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", mobno=" + mobno + ", deg=" + deg + "]";
	}
}
