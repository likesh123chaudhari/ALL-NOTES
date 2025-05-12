package com.demo.beans;

import java.time.LocalDate;

public class Employee {

	// id, name, mobile no, emailid, Department, designation, Date of joining. 
	
	private String id ;
	private String name;
	private String mobno;
	private String emailId;
	private String dept;
	private String desg;
	private LocalDate doj;
	
	private static int count=1;
	
	public Employee() {
		super();
	}

	public Employee(String type, String name, String mobno, String emailId, String dept, String desg, LocalDate doj) {
		super();
		this.id = generateType(type);
		this.name = name;
		this.mobno = mobno;
		this.emailId = emailId;
		this.dept = dept;
		this.desg = desg;
		this.doj = doj;
		
		count++;
	}

	private String generateType(String type) {
		
		return type+count;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobno=" + mobno + ", emailId=" + emailId + ", dept=" + dept
				+ ", desg=" + desg + ", doj=" + doj + "]";
	}
	
	
	
	
}
