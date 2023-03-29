package com.santosh.spring.springcore1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	
	var context = new ClassPathXmlApplicationContext("com/santosh/spring/springcore1/config.xml");
	
	Employee emp =context.getBean(Employee.class);
	
	
	System.out.println("age of the employee is "+emp.getAge());
	System.out.println("Name of the Employee is "+emp.getName());
	
	System.out.println("Family memebers are "+emp.getFamily());
	
	System.out.println("Address of employee "+emp.getAddress());
}
}
