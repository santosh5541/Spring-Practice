package com.hibernate.onetomany;

import java.util.ArrayList;
import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;

public class Main {
	
	public static void main(String[] args) {
		
	org.hibernate.SessionFactory factory = new Configuration().configure("com/hibernate/onetomany/Hibernate.xml").buildSessionFactory();
	
	Customer c = new Customer();
	c.setAge(20);
	c.setName("Santosh Luitel");
	c.setSalary(30000);
	
	
	Phone p = new Phone();
	p.setName("Iphone");
	p.setNumber("9827069653");
	p.setType("Ncell");
	p.setCustomer(c);
	
	
	Phone p1 = new Phone();
	p1.setName("Samsung");
	p1.setNumber("9851079044");
	p1.setType("NTC");
	p1.setCustomer(c);
	
	
	c.setPhone(Arrays.asList(p,p1));
	
	
	//Session started
	
	
	Session session = factory.openSession();
	session.beginTransaction();
		
		session.save(p);
		session.save(p1);
		session.save(c);
		session.getTransaction().commit();
		
	session.close();
	
	factory.close();
		
	}

}
