package com.demo.beans;

public class Employee {
     private int empno;
     private String name;
     private String mobile;
	public Employee() {
		super();
	}
	public Employee(int empno, String name, String mobile) {
		super();
		this.empno = empno;
		this.name = name;
		this.mobile = mobile;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", mobile=" + mobile + "]";
	}
     
}
