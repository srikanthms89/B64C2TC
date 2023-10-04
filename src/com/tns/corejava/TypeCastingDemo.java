package com.tns.corejava;

public class TypeCastingDemo {

	public static void main(String[] args) {

    // implicit type casting / widening
		byte b =10;
		int i = b;
		System.out.println(i);
		
		float f= 22.14f;
		double d = f;
		System.out.println(d);
	
		//explicit typecasting / narrowing
		double f1 = 10.52d;
		long l1 = (long)f1;
		System.out.println(l1);
		
		long l2 = 90084011;
		int i1 = (int)l2;
		System.out.println(i1);
				

	}

}
