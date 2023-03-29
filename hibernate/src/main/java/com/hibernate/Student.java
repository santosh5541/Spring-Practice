package com.hibernate;

import java.awt.Image;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "student_details")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "NAME",length = 50)
	private String name;
	
	@Column(length = 50,name = "ADDRESS")
	private String address;
	
	@Temporal(TemporalType.TIME)
	private Date date;
	
	@Lob
	@Column(name = "Image")
	private byte[] data;
	
	@Transient
	private double x;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String address, Date date, byte[] data, double x) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.date = date;
		this.data = data;
		this.x = x;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
	
	
	
}
