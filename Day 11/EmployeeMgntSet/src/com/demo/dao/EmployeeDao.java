package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	Set<Employee> findAll();

	boolean removeById(int id);

	Employee findById(int id);

	List<Employee> findByName(String nm);

	List<Employee> findBySalary(double sal);

	boolean modifyById(int id, double sal);

	Set<Employee> arrangeById();

	List<Employee> arrangeByName();

	List<Employee> arrangeBySal();

}
