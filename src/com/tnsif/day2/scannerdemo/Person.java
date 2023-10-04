//program to demonstrate person entity
package com.tnsif.day2.scannerdemo;

public class Person {
	//Data members
	private String name;
	private String gender;
	private int income ;
	private int age;
	private double tax;
	
	//Getter and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", income=" + income + ", age=" + age + ", tax=" + tax
				+ "]";
	}
	
 
	

}
