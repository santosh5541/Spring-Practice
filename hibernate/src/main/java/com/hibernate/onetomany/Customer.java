package com.hibernate.onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	@Column(name = "cname")
	private String Name;
	@Column(name = "c_age")
	private int age;
	@Column(name = "csalary")
	private long salary;
	
	@OneToMany(mappedBy = "customer")
	private List <Phone> phone;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public List<Phone> getPhone() {
		return phone;
	}

	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, String name, int age, long salary, List<Phone> phone) {
		super();
		this.cid = cid;
		Name = name;
		this.age = age;
		this.salary = salary;
		this.phone = phone;
	}
	

	
	
}
