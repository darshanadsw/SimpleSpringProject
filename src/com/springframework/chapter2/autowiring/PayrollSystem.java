package com.springframework.chapter2.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PayrollSystem {

	public static void main(String... args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService empServiceA = (EmployeeService)context.getBean("employeeService");
		empServiceA.setMessage("Message by Service A");
		System.out.println(empServiceA.getMessage());
		
		EmployeeService empServiceB = (EmployeeService)context.getBean("employeeService");		
		System.out.println(empServiceB.getMessage());
	}
}
