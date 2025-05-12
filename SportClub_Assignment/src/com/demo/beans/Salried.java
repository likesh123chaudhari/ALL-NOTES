package com.demo.beans;

public class Salried extends Employee{
	private double sal;
	private double bonus;
	public Salried(double sal, double bonus) {
		super();
		this.sal = sal;
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
	@Override
	public String toString() {
		return "Salried [sal=" + sal + ", bonus=" + bonus + "]";
	}
	public double calBonus(float percentage){
		this.bonus=this.sal*percentage;
		return this.bonus;
		
	}
	public double calculatesal() {
		System.out.println("calculate the salried");
		return this.sal+0.10*this.sal+0.15*this.sal-0.12*this.sal+this.bonus;
		
	}
	
	
	

}
