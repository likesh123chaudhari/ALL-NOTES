package com.demo.beans;

public class ContractEmp extends Employee{
	private int hrs;
	private double charges;
	
	
	@Override
	public String toString() {
		return "ContractEmp [hrs=" + hrs + ", charges=" + charges + "]";
	}


	public int getHrs() {
		return hrs;
	}


	public void setHrs(int hrs) {
		this.hrs = hrs;
	}


	public double getCharges() {
		return charges;
	}


	public void setCharges(double charges) {
		this.charges = charges;
	}


	public ContractEmp(int hrs, double charges) {
		super();
		this.hrs = hrs;
		this.charges = charges;
	}


	public ContractEmp() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ContractEmp(int id, String name, String email, int mobno, String deg) {
		super(id, name, email, mobno, deg);
		// TODO Auto-generated constructor stub
	}


	public double calcal(){
		System.out.println("in contract employee calcSal");
		return this.hrs*this.charges;
		
	}
	

}
