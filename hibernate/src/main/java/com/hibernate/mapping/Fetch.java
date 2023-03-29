package com.hibernate.mapping;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;

public class Fetch {
	
public static void main(String[] args) {
	org.hibernate.SessionFactory factory = new Configuration().configure("com/hibernate/mapping/hibernate.xml").buildSessionFactory();
	
	
	Answer a = new Answer();
	a.setAid(321);
	a.setAns("It is an object oriented programming language");
	
	Question q = new Question();
	q.setId(123);
	q.setQue("what is java");
	q.setAnswer(a);
	
	
	
	//session started.........
	
	Session session = factory.openSession();
	session.beginTransaction();
	session.save(q);
	session.save(a);
	session.getTransaction().commit();
	
	session.close();
	factory.close();
}

}

