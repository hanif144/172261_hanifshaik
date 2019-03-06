package com.employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;

import com.spring.pojo.Employee;

public class EmployeeMapper implements RowMapper<Employee> {
	@Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setEmpid(rs.getInt("empnum"));
        employee.setEname(rs.getString("ename"));
        employee.setJob(rs.getString("job"));
        employee.setMgr(rs.getInt("mgr"));
      //employee.setHiredate(rs.getDate("hiredate"));
        employee.setSal(rs.getInt("sal"));
     employee.setComm(rs.getInt("comm"));
      employee.setDeptno(rs.getInt("deptno"));
        return employee;
    }
}