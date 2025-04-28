package com.demo.beans;
import java.util.Date;

public class SalariedEmp extends Employee{
	private double sal,bonus;
	public SalariedEmp() {
		//System.out.println("in SalariedEmp default constructor");
		sal=0;
		bonus=0;
	}
	public SalariedEmp(int id,String nm,Date dat,String dt,String ds,double s) {
		super(id,nm,dat,dt,ds);
		//System.out.println("in SalariedEmp parametrised constructor");
		this.sal=s;
		this.bonus=sal*0.10;
		
	}
	public SalariedEmp(int id) {
		super(id);
	}
	public void setSal(double s) {
		sal=s;
		
	}
	public void setBonus(double b) {
		bonus=b;
		
	}
	public double getSal() {
		return sal;
	}
	public double getBonus() {
		return bonus;
	}
	public String toString() {
		return super.toString()+" Salary: "+sal+"Bonus: "+bonus;
	}
	
	//child specific method
	public double calcBonus(float percentage) {
		this.bonus=this.sal*percentage;
		return this.bonus;
	}
	@Override
	public double calculateSal() {
		System.out.println("in Salaried employee calcSal");
		return this.sal+0.10*this.sal+0.15*this.sal-0.08*this.sal+this.bonus;
	}

}










