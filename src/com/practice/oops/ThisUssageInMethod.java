package com.practice.oops;

public class ThisUssageInMethod {
	
	public void test(ThisUssageInMethod obj) {
		
		  System.out.println("method is invoked");  

	}
	
	public void testMethod2() {
		
		test(this);
	}
	
	public static void main(String [] args) {
		ThisUssageInMethod obj=new ThisUssageInMethod();
		
		obj.testMethod2();
		
	}
	
	
}
