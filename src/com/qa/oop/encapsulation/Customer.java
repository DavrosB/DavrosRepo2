package com.qa.oop.encapsulation;

public class Customer {
	
	//variables
	private String name;
	private String address;
	private Boolean attitude;
	private int cvc;
	private int age;
	private int RiskBandLevel;
	public String getName() {
		return name;
	}
	
//	constructors -  right click -> Source -> generate constructors with fields
	
//	constructors have the same name as the class
//	used to iniitalise variables
	
	

	
	
	public void setName(String name) {
		this.name = name;
	}
	public Customer(String name, String address, Boolean attitude, int cvc, int age, int riskBandLevel) {
	super();
	this.name = name;
	this.address = address;
	this.attitude = attitude;
	this.cvc = cvc;
	this.age = age;
	RiskBandLevel = riskBandLevel;
}
	
	
//	Getters and Setters - right click -> Source -> generate Getters and Setters
//	public method to access private variables

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Boolean getAttitude() {
		return attitude;
	}
	public void setAttitude(Boolean attitude) {
		this.attitude = attitude;
	}
	public int getCvc() {
		return cvc;
	}
	public void setCvc(int cvc) {
		this.cvc = cvc;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRiskBandLevel() {
		return RiskBandLevel;
	}
	public void setRiskBandLevel(int riskBandLevel) {
		RiskBandLevel = riskBandLevel;
	}
	
	
	// 
	
	

}
