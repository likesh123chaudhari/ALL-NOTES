package com.demo.beans;
import java.util.Date;

public class ContractEmp extends Employee{
	private int hrs;
	private double charges;
	public ContractEmp() {
		//System.out.println("in contractemp default constructor");
		hrs=0;
		charges=0;
		
	}
	public ContractEmp(int id,String nm,Date dat,String dt,String ds,int h,double charges) {
		super(id,nm,dat,dt,ds);
		//System.out.println("in contractemp parametrized  constructor");
		this.hrs=h;
		this.charges=charges;
		
	}
	public ContractEmp(int id) {
		super(id);
	}
	
	public void setHrs(int h) {
		hrs=h;
	}
	public void setCharges(double c) {
		charges=c;
	}
	public int getHrs() {
		return hrs;
	}
	public double getcharges() {
		return charges;
	}
	
	public String toString() {
		return super.toString()+" Hrs: "+hrs+" Charges: "+charges;
	}
	@Override
	public double calculateSal() {
		System.out.println("in contract employee calcSal");
		return this.hrs*this.charges;
	}
	

}










