package com.demo.services;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.dao.*;

public class EmpServiceImpl implements EmplServiceIntr{

	 EmpDaoIntr edao;
	 
	 public EmpServiceImpl() {
		 
		 edao = new EmpDaoImpl();
		 
	 }

	@Override
	public List<Employee> getAll() {
		
		return edao.findAll();
	}
	
	
}
