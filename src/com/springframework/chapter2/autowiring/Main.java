package com.springframework.chapter2.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String... args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeServiceImpl empService = (EmployeeServiceImpl)context.getBean("employeeSercice");
		
		System.out.println(empService.getEmployeeDao());
	}
}
