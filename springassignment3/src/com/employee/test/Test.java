package com.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.Employee;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c=new ClassPathXmlApplicationContext("employee.xml");
		Employee e=new Employee();
        e.setEmpid(1113);
//        e.setEname("haneef");
//        e.setJob("ceo");
//        e.setMgr(0);
        e.setSal(29999);
//        e.setComm(0);
//        e.setDeptno(20);
        
       // EmployeeDaoImpl d=(EmployeeDaoImpl)c.getBean("edao");
       // d.insert(e);
       // d.delete(e);
      EmployeeServicesImpl ser=new EmployeeServicesImpl();
      ser.updateEmpSal(e);
//         List<Employee> list= ser.getEmp(e);
//        
//         for(Employee e1:list)
//         {
//        	 System.out.println(e1);
//         }
	}

}
