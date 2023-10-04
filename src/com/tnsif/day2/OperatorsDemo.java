package com.tnsif.day2;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		int a= 10;
		int b=20;
		int x=10;
		System.out.println("a and b value before the operations " +a +" " +b);
		
		++a; // 11
		int c= ++a + b + a--; //12 + 20 + 12
		System.out.println("c value after the operations :" +c); //11 20 44
		
		int d= c++ + a + b-- ; // 44+ 11 + 20 = 75
		System.out.println("d value after the operations :" +d);
		
		System.out.println(" a, b, c, d : " +a+" " +b+" " +c +" "+d); // 11 19 45 75
		
		//Ternary operator
		x= (100==x ) ? 1 :0;
		
		System.out.println(x);
	}

}
