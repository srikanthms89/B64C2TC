package com.tns.corejava;

public class NestedIfElseDemo {

	public static void main(String[] args) {

       int a=100, b=20, c=5;
       System.out.println("the largest number is");
       if(a>b) // 100 > 20
       {
    	    if(a>c)
    	    	System.out.println(a);
    	    else
    	    	System.out.println(c);
       }
       else
       {
    	   if(c>b)  //5>20
    		   System.out.println(c);
    	   else
    		   System.out.println(b);
       }

	}

}
