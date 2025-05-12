package com.demo.beans;

import java.time.LocalDate;

public class SalariedEmp extends Employee {

	private double sal;
	private double bonus;
	
	
	
	public SalariedEmp() {
		super();
	}



	public SalariedEmp( String name, String mobno, String emailId, String dept, String desg, LocalDate doj,
			double sal) {
		super("S", name, mobno, emailId, dept, desg, doj);
		this.sal = sal*0.10;
		this.bonus = bonus;
	}



	


	public double getSal() {
		return sal;
	}



	public void setSal(double sal) {
		this.sal = sal;
	}



	public double getBonus() {
		return bonus;
	}



	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	public double calBonus(float percentage) {
		
		this.bonus=this.sal*percentage;
		
		return this.bonus;
	}
	
	public double calSal() {
		return this.sal+this.sal*0.10+this.sal*0.15-this.sal*0.12+this.bonus;
	}

	@Override
	public String toString() {
		return super.toString()+" SalariedEmp [sal=" + sal + ", bonus=" + bonus + "]";
	}
	
	
	
	
	
	
}
