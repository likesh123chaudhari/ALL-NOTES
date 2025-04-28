package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmp(int ch);

	Set<Employee> getAll();

	boolean deleteById(int id);

	Employee displayById(int id);

	List<Employee> getByName(String nm);

	List<Employee> getBySalary(double sal);

	boolean updateById(int id, double sal);

	Set<Employee> sortById();

	List<Employee> sortByName();

	List<Employee> sortBySal();

}
