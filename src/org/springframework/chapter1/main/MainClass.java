package org.springframework.chapter1.main;

import org.springframework.chapter1.service.Employee;
import org.springframework.chapter1.service.GreetingMessageService;
import org.springframework.chapter1.service.GreetingMessageServiceImpl;
import org.springframework.chapter1.service.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainClass {

	public static void main(String... args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		GreetingMessageService greetingMessageService = context.getBean("greetingMessageServiceImpl", GreetingMessageServiceImpl.class);
		System.out.println(greetingMessageService.greetUser());	
		
		System.out.println("");
		
		Employee emp= (Employee)context.getBean("employee");
		System.out.println(emp);
		
		System.out.println();
		
		//Person p1 = (Person) context.getBean("citizen");
		//System.out.println(p1);
		
		Person darshana = (Person)context.getBean("darshana");
		System.out.println(darshana);
		Person piumine = (Person)context.getBean("piumine");
		System.out.println(piumine);
	}
}
	