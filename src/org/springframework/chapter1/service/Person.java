package org.springframework.chapter1.service;

public class Person {

	private int nationalId;
	private String name;
	private String country;
	
	public int getNationalId() {
		return nationalId;
	}
	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String toString() {
		return " N.I.D : " + nationalId + ", Name : " + name + " , Country : " + country;   
	}
}
