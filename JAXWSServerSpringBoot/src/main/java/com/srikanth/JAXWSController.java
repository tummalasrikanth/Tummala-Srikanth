package com.srikanth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.srikanth.component.Employee;
import com.srikanth.service.EmployeeService;

@RestController
public class JAXWSController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/hi")
	public String greetingMessage() {
		return "HI Srikanth";
	}
	
	@RequestMapping("/createEmployee")
	public String createEmployee(){
		return employeeService.createEmployee(new Employee("1","Tummala srikanth","Vemuru"));
	}
	
	@RequestMapping("/getEmployee")
	public Employee getEmployee(@RequestParam("empId") String empId) {
		return employeeService.getEmployee(empId);
	}

}
