//program to demonstrate identifiers
package com.tns.corejava;

public class IdentifiersDemo {

	public static void main(String[] args) {
		
		//invalid identifiers
		//int for = 13; // error because keyword cannot be identifier
		//System.out.println("value of the number variable is:" +for);
		
		
		//int number 2 = 13; // error because do not add space within identifiers
		//System.out.println("value of the number variable is:" +number 2);
		
		//int @number3 = 10; // error because identifier can not starts with @,#
		
		//valid identifiers
		
		int $number = 20;
		System.out.println("value of the number variable is:" +$number);
		
		String studentName ="Abhishek";// use camelcase
		System.out.println("value is:"+studentName );
		
	}

}
