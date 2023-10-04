package com.tns.corejava;

public class NestedForDemo {

	public static void main(String[] args) {
		
		int beg=10;
		int end =20;
		
		for(int i= beg; i<=end ; i++) //11<=20
		{
			for(int j=1; j<=10; j++)    //1<=10
			{
				System.out.println(i + "*" + j + "=" + i * j); // 10 * 1 = 10
			}
			System.out.println();
			
		}

	}

}
