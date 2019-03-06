package com.employee.dao;

import java.util.List;

import com.spring.pojo.Employee;

public interface EmployeeDao {
	public List<EmployeeDao> getAll();
	public boolean insert(Employee e);
	public boolean delete(Employee e);
	public boolean update(Employee e);
	public List<Employee> employee(Employee e);
}


