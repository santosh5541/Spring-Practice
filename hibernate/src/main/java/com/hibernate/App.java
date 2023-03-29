package com.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "program started..........." );
org.hibernate.SessionFactory sf = new Configuration().configure("com/hibernate/hibernate.xml").buildSessionFactory();
   
   
   Student s = new Student();
   s.setName("Santosh Luitel");
   s.setAddress("New Baneshwor");
   s.setDate(new Date());
   s.setX(12.333);
   
   
   // reading image file from class 
   
  FileInputStream fis = new FileInputStream("com/hibernate/photo.jpg");

  byte [] data = new byte[fis.available()];
  fis.read(data);
  s.setData(data);
   
   
   //session process
   
   Session session = sf.openSession();
   session.beginTransaction();
   session.save(s);
   session.getTransaction().commit();
   session.close();
   
    }
}
