package com.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao edao;
	public EmployeeServiceImpl() {
		edao=new EmployeeDaoImpl();
	}
	//accept data and add new employee
	@Override
	public boolean addNewEmp(int ch) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String nm=sc.nextLine();
		System.out.println("enter date(dd/mm/yyyy)");
        String dt=sc.next();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
        Date dt1=null;
        try {
			dt1=sdf.parse(dt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("enter department");
        String dept=sc.next();
        System.out.println("enter designation");
        String desg=sc.next();
        Employee e=null;
        if(ch==1) {
        	System.out.println("enter sal");
        	double sal=sc.nextDouble();
        	e=new SalariedEmp(id,nm, dt1, dept, desg, sal);
        }else {
        	System.out.println("enter hrs");
        	int h=sc.nextInt();
        	System.out.println("enetr charges");
        	double charges=sc.nextDouble();
        	e=new ContractEmp(id,nm,dt1,dept,desg,h,charges);
        }
        return edao.save(e);
        
        
	}
	//return list to displayall
	@Override
	public Set<Employee> getAll() {
		return edao.findAll();
	}
	@Override
	public boolean deleteById(int id) {
		return edao.removeById(id);
	}
	@Override
	public Employee displayById(int id) {
		return edao.findById(id);
	}
	@Override
	public List<Employee> getByName(String nm) {
		return edao.findByName(nm);
	}
	@Override
	public List<Employee> getBySalary(double sal) {
		return edao.findBySalary(sal);
	}
	@Override
	public boolean updateById(int id, double sal) {
		return edao.modifyById(id,sal);
	}
	@Override
	public Set<Employee> sortById() {
		return edao.arrangeById();
	}
	@Override
	public List<Employee> sortByName() {
		return edao.arrangeByName();
	}
	@Override
	public List<Employee> sortBySal() {
		return edao.arrangeBySal();
	}

}
