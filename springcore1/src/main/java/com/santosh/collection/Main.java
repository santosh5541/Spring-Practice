package com.santosh.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
		var context = new ClassPathXmlApplicationContext("com/santosh/collection/config.xml");
				
		Employee emp = (Employee) context.getBean("Employee");
		
		System.out.println(emp);
		
	}
}
