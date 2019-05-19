package com.srikanth.service.impl;

import org.springframework.stereotype.Component;

import com.srikanth.component.Employee;
import com.srikanth.service.EmployeeService;

@Component
public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public String createEmployee(Employee emp) {
		try {
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getAddress());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "Employee Created";
	}

	@Override
	public Employee getEmployee(String empId) {		
		return new Employee("1","Tummala srikanth","Vemuru");
	}

}
