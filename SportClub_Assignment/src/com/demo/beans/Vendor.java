package com.demo.beans;

public class Vendor extends Employee{
	private double amount;
    private double sal;
    private int empno;
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vendor(int id, String name, String email, int mobno, String deg) {
		super(id, name, email, mobno, deg);
		// TODO Auto-generated constructor stub
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	@Override
	public String toString() {
		return "Vendor [amount=" + amount + ", sal=" + sal + ", empno=" + empno + "]";
	}
	public double calAmt(double amt) {
		sal=amount+amount*0.18;
		return this.sal;
	}
}
	
