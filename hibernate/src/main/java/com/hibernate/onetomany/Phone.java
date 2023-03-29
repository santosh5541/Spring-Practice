package com.hibernate.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_PHONE")
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	@Column(name = "Phone_Name")
	private String Name;
	@Column(name = "Customer_Number")
	private String Number;
	@Column(name="Customer_Phone_Type")
	private String Type;
	
	@ManyToOne
	@JoinColumn(name = "Customer_id")
	private Customer customer;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Phone(int pid, String name, String number, String type, Customer customer) {
		super();
		this.pid = pid;
		Name = name;
		Number = number;
		Type = type;
		this.customer = customer;
	}

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
