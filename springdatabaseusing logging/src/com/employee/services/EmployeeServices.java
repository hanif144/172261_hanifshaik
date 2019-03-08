package com.employee.services;

import java.util.List;

import com.employee.pojo.Employee;

public interface EmployeeServices {

	public boolean addEmp(Employee e);

	List<Employee> getEmp(Employee e);

	boolean updateEmpSal(Employee e);
	public String getMaxSal();
	public boolean deleteEmp(Employee e);
	public boolean getWithoutComm();
}
