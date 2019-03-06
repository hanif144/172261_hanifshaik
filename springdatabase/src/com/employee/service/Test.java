package com.employee.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.pojo.Employee;
import com.spring.dao.EmployeeDaoImpl;

public class Test
{
public static void main(String[] args) {
	// TODO Auto-generated method stub
	ApplicationContext c=new ClassPathXmlApplicationContext("employee.xml");
	Employee e=new Employee();
  e.setEmpid(7934);
//    e.setEname("Raja");
//    e.setJob("ceo");
//    e.setMgr(0);
   e.setSal(1500);
//    e.setComm(0);
//    e.setDeptno(20);
    
    EmployeeDaoImpl d=(EmployeeDaoImpl)c.getBean("edao");
   // d.insert(e);
   // d.delete(e);
    d.update(e);
//     List<Employee> list= d.getAll();
//    
//     for(Employee e1:list)
//     {
//    	 System.out.println(e1);
//     }
}
}


