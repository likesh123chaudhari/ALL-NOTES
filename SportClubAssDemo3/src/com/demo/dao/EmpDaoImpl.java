package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;

public class EmpDaoImpl implements EmpDaoIntr{

	static ArrayList<Employee> elist;
	
	static{
		elist = new ArrayList<>();
		//String name, String mobno, String emailId, String dept, String desg, LocalDate doj,double sal, double bonus
		elist.add(new SalariedEmp("Ajinkya", "424304", "ajinkya@gmail.com", "Development", "Software Developer",LocalDate.of(2001,01,25),5000));
		elist.add(new SalariedEmp("Sankeerth", "424304", "Sankeerth@gmail.com", "R&D", "Data Scientist",LocalDate.of(2001,01,26),5000));
		elist.add(new SalariedEmp("Likesh", "424304", "likesh@gmail.com", "Development", "Full Stack Developer",LocalDate.of(2001,01,01),5000));

		
		//String name, String mobno, String emailId, String dept, String desg, LocalDate doj, int hrs, double sal
		
		elist.add(new ContractEmp("Arjun", "424304", "ajinkya@gmail.com", "Development", "Software Developer",LocalDate.of(2001,01,25),10,500));
		elist.add(new ContractEmp("NagaArjun", "424304", "Sankeerth@gmail.com", "R&D", "Data Scientist",LocalDate.of(2001,01,26),11,450));
		elist.add(new ContractEmp("RamCharan", "424304", "likesh@gmail.com", "Development", "Full Stack Developer",LocalDate.of(2001,01,01),8,400));
		
		//iString type, String name, String mobno, String emailId, String dept, String desg, LocalDate doj,int no_Of_Emp, double amount
		
		elist.add(new Vendor("Arman", "424304", "arman@gmail.com", "Development", "Software Developer",LocalDate.of(2001,01,25),10,5000));
		elist.add(new Vendor("Abhidutt", "424304", "abhidutt@gmail.com", "R&D", "Data Scientist",LocalDate.of(2001,01,26),11,4000));
		elist.add(new Vendor("Shrikant", "424304", "shrikant@gmail.com", "Development", "Full Stack Developer",LocalDate.of(2001,01,01),8,3000));
	}
	
	
	
	@Override
	public List<Employee> findAll() {
		
		return elist;
	}

	
	
	
}
