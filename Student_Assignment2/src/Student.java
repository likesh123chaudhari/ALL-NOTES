import java.security.DrbgParameters;
import java.util.Scanner;

//stud id, name, m1, m2 and m3 (marks of 3 subjects )

public class Student{
	  
	private int sid;
	private String sname;
	private int math, phys, chem;
	private double gpa;
	
	public Student() {
		
		sid = 0;
		sname =null;
		math=0;
		phys=0;
		chem=0;
		gpa=0;
		
		
	}
	
	public Student(int sid, String sname,int phys,int chem,int math) {
		
		this.sid=sid;
		this.sname=sname;
		this.phys=phys;
		this.chem=chem;
		this.math=math;
		this.gpa=CalculateGPA();
	}
	
	
	public void setSid(int sid) {
		this.sid=sid;
	}
	
	public int getSid() {
		return this.sid;
	}
	
	
	public void setSname(String sname) {
		this.sname=sname;
	}
	
	public String getSname() {
		return this.sname;
	}
	
	
	
	public double CalculateGPA() {
		  return (double) ((1.0/3)*math+(1.0/2)*phys+(1.0/4)*chem);
		 
	}

	
	public double getGpa() {
		return gpa;
	}
	

	public String toString() {
		return "\nStudentID : " + sid+"\nStudent Name : "+sname+"\nPhysics Marks : "+phys+"\nChemistry Marks : "+chem+"\nMath Marks : "+math+"\n";
	}
}
