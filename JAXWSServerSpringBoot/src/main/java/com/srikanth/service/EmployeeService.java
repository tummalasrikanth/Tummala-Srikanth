package com.srikanth.service;

import com.srikanth.component.Employee;

public interface EmployeeService {
	
	public String createEmployee(Employee emp);
	
	public Employee getEmployee(String empId);

}
