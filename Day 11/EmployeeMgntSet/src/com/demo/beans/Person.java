package com.demo.beans;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person>{
	private int pid;
	private String pname;
	private Date doj;
	public Person() {
		//calls parametrised constructor of same class
		this(0,null,null);
		//System.out.println("in person default constructor");
		//this.pid = generateCode("s");
		//this.pname =null;
		//this.doj = null;
		
	}
	public Person(int id, String pname, Date doj) {
		//System.out.println("in person parametrised constructor");
		this.pid =id;
		this.pname = pname;
		this.doj = doj;
	}
	public Person(int id) {
		super();
		this.pid=id;
		
	}
	public int hashCode() {
		System.out.println("in hashcode in person "+this.pid);
		return this.pid;
	}
	
	public boolean equals(Object obj) {
		Person p=(Person)obj;
		System.out.println("equals in person "+this.pid+"-----"+p.pid);
		return this.pid==(p.pid);
	}
	public void setPid(int id) {
		this.pid=id;
	}
	public int getPid() {
		return pid;
	}
	//no setter method for pid will make it readonly
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		String dt=sdf.format(doj);
		return "Person [pid=" + pid + ", pname=" + pname + ", doj=" + dt+ "]";
	}
	@Override
	public int compareTo(Person o) {
//		if(this.pid<o.pid)
//			return -1;
//		else if(this.pid==o.pid)
//			return 0;
//		else
//			return 1;
		System.out.println("In comparable "+this.pid+"---"+o.pid);
		return (this.pid-o.pid);
				
	}
	
	
	
	

}
