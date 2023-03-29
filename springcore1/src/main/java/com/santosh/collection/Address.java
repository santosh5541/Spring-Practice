package com.santosh.collection;

import java.util.List;

public class Address {

	private String city;
	private String ward;
	private List<String>wardno;
	private String houseno;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	public List<String> getWardno() {
		return wardno;
	}
	public void setWardno(List<String> wardno) {
		this.wardno = wardno;
	}
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", ward=" + ward + ", wardno=" + wardno + ", houseno=" + houseno + "]";
	}
	
}
