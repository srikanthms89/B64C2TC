package com.tnsif.day2.scannerdemo;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		//Scanner object to accept user inputs
		Scanner ob = new  Scanner(System.in);
		
		String name;
		System.out.println("Enter Person Name:" );
		name =ob.nextLine();
		
		String gender;
		System.out.println("Enter the Person gender");
		gender = ob.nextLine();
		int age,income;
		double tax;
		System.out.println("enter the person age");
		age = ob.nextInt();
		System.out.println("enter the person income");
		income = ob.nextInt();
		ob.nextLine();
		System.out.println("enter the person tax");
		tax= ob.nextInt();
		
		//Person object  and initialize values using setter
		Person person = new Person();
		person.setName(name);
		person.setGender(gender);
		person.setIncome(income);
		person.setAge(age);
		person.setTax(tax);
		
		//display person details using toString() method
		System.out.println(person);
		
		TaxCalculation calc = new TaxCalculation();
		calc.calculateTax(person); // Tax calculation
		System.out.println("After calculating tax: ");
		System.out.println(person);
		
		ob.close();
		
		
		
		
		
		

	}

}
