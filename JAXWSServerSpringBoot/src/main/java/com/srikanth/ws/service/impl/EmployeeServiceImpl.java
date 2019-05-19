package com.srikanth.ws.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.srikanth.component.Employee;
import com.srikanth.ws.service.EmployeeService;

@WebService(serviceName = "EmployeeService", endpointInterface = "com.srikanth.ws.service.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	private com.srikanth.service.impl.EmployeeServiceImpl employeeServiceImpl;	
	public EmployeeServiceImpl(){
		employeeServiceImpl=new com.srikanth.service.impl.EmployeeServiceImpl();
	}

	
	@WebMethod
	public String createEmployee(Employee emp) {
		return employeeServiceImpl.createEmployee(emp);
	}

	@WebMethod
	public Employee getEmployee(String empId) {
		return employeeServiceImpl.getEmployee(empId);
	}

}
