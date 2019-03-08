package com.employee.services;

import java.util.List;
import java.util.stream.Collectors;

import com.employee.dao.EmployeeDaoImpl;
import com.employee.pojo.Employee;

public class EmployeeServicesImpl implements EmployeeServices{
	EmployeeDaoImpl ed=new EmployeeDaoImpl();
	@Override
	public boolean addEmp(Employee e) {
		EmployeeDaoImpl ed=new EmployeeDaoImpl();
		ed.insert(e);
		return true;
	}
	@Override
	public List<Employee> getEmp(Employee e) {
		return ed.employee(e);
		
	}

	@Override
	public boolean updateEmpSal(Employee e) {
	  ed.update(e);
		return true;
	}
	@Override
	public String getMaxSal() {
		List<Employee> l=ed.getAll();
		Integer maxSal=l.stream().map(e->e.getSal()).max((x,y)->x.compareTo(y)).get();
		System.out.println(maxSal);
		return null;
	

		
	}
	@Override
	public boolean deleteEmp(Employee e) {
		ed.delete(e);
		return true;
	
	}
	@Override
	public boolean getWithoutComm() {
		List<Employee> l=ed.getAll();
		 List<String> result = l.stream() .filter(line ->line.getComm()==0).map(e->e.getEname()).collect(Collectors.toList());
		 result.forEach(emp -> System.out.println(emp));
		/*
		 * for(String s:result) { System.out.println(result); }
		 */
	                         
		return true;
	}
	


}
