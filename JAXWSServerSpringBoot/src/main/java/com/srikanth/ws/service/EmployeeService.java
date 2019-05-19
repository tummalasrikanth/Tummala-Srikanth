package com.srikanth.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.srikanth.component.Employee;

@WebService
public interface EmployeeService {

	@WebMethod
	public String createEmployee(Employee emp);

	@WebMethod
	public Employee getEmployee(String empId);

}
