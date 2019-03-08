package com.employee.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.dao.EmployeeDaoImpl;
import com.employee.pojo.Employee;
import com.employee.services.EmployeeServicesImpl;

public class EmpTest {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("employee.xml");
		Employee e=new Employee();
        e.setEmpid(122);
        //e.setEname("haneef");
        //e.setJob("ANALYST");
        //e.setMgr(0);
       // e.setSal(35000);
        //e.setComm(0);
        //e.setDeptno(20);
     EmployeeServicesImpl ser = new EmployeeServicesImpl();
    // ser.getMaxSal();
     //ser.getWithoutComm();
     //ser.deleteEmp(e);
	/*
	 * for(String s:result) { System.out.println(result); }
	 */
                         
	
        EmployeeDaoImpl d=(EmployeeDaoImpl)c.getBean("edao");
        //d.insert(e);
        
        d.orderBy();
        
        //d.delete(e);
       // EmployeeServicesImpl ser=new EmployeeServicesImpl();
       // ser.updateEmpSal(e);
        List<Employee> list= d.groupBy();
       
     for(Employee e1:list)       
    {
    	 System.out.println(e1);         }
	}
	
	

}

