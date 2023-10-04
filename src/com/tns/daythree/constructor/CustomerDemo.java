package com.tns.daythree.constructor;

import java.util.Scanner;

public class CustomerDemo {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();//default constructor
		c1.setCustomerName("Musaib");
		c1.setCustomerId(101);
		c1.setCustomerCity("kolar");
		System.out.println(c1);
		
		Scanner sc = new Scanner(System.in);
		
		String name,city;
		int id;
		System.out.println("enter the customer name");
		name= sc.nextLine();
		sc.nextLine();
		System.out.println("enter the customer city");
		city = sc.nextLine();
		System.out.println("enter the customer id");
		id= sc.nextInt();
		
		
		
		Customer c2 = new Customer(name,id,city); //parameterized
		
		
		System.out.println(c2);
		
		sc.close();
		
	}

}
