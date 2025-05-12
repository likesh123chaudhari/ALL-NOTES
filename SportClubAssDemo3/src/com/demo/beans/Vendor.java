package com.demo.beans;

import java.time.LocalDate;

public class Vendor extends Employee{

	private int No_Of_Emp;
	private double Amount;
	
	public Vendor() {
		super();
	}

	

	public Vendor(String type, String name, String mobno, String emailId, String dept, String desg, LocalDate doj,
			int no_Of_Emp, double amount) {
		
		super(type, name, mobno, emailId, dept, desg, doj);
		
		No_Of_Emp = no_Of_Emp;
		Amount = amount;
	}



	public int getNo_Of_Emp() {
		return No_Of_Emp;
	}



	public void setNo_Of_Emp(int no_Of_Emp) {
		No_Of_Emp = no_Of_Emp;
	}



	public double getAmount() {
		return Amount;
	}



	public void setAmount(double amount) {
		Amount = amount;
	}

  public double calAmt() {
	  return this.Amount+=this.Amount*0.18;
  }

	@Override
	public String toString() {
		return super.toString()+" Vendor [No_Of_Emp=" + No_Of_Emp + ", Amount=" + Amount + "]";
	}
	

	
}
