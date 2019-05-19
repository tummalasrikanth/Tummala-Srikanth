package com.srikanth;

import javax.xml.ws.Endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.srikanth.ws.service.impl.EmployeeServiceImpl;

@SpringBootApplication
public class JaxwsServerSpringBootApplication {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9081/employeeservice", new EmployeeServiceImpl());
		SpringApplication.run(JaxwsServerSpringBootApplication.class, args);
	}

}
