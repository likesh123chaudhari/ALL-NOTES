package com.demo.beans;

import java.time.LocalDate;

public class ContractEmp extends Employee{

	  private int hrs;
	  private double sal;
	
	  
	  public ContractEmp() {
		super();
	}


	public ContractEmp( String name, String mobno, String emailId, String dept, String desg, LocalDate doj,
			int hrs, double sal) {
		
		super("C", name, mobno, emailId, dept, desg, doj);
		this.hrs = hrs;
		this.sal = sal;
	}


	public int getHrs() {
		return hrs;
	}


	public void setHrs(int hrs) {
		this.hrs = hrs;
	}


	public double getSal() {
		return sal;
	}


	public void setSal(double sal) {
		this.sal = sal;
	}


	@Override
	public String toString() {
		return super.toString()+" ContractEmp [hrs=" + hrs + ", sal=" + sal + "]";
	}
	  
	
	public double calSal() {
		return this.hrs*this.sal;
	}
	  
	  
	
}
