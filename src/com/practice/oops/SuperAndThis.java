package com.practice.oops;

/*
 *  This is used to refer the current class instance variables
 * This is used to invoke the current class method
 * This is used to invoke the current class constructor. Call should be your first statement
 * This is used as a return statement for a method. The return type is class type
 * ******************************
 * 
 * Super is used to refer the immediate parent class method
 * Super is used to invoke the immediate parent class instance variable 
 * 
 */


public class SuperAndThis {
	
	String name;
	
	int roll;
	
	static String collName="Vignan";
	
	public void setDetails(int roll,String name) {
		
		this.roll=roll;
		
		this.name=name;
		
	}
	
	public void displayDetails() {
		
		System.out.println("The SuperAndThis name is: "+name);
		
		System.out.println("The roll number is: "+roll);
		
		System.out.println("The college Name is:"+collName);
	}
	
	public void ussageOfThis() {
		this.displayDetails();
		
	}
	
	
	public static void main(String args[]) {
		
		SuperAndThis s1=new SuperAndThis();
		
		s1.setDetails(64, "Rupesh");
		
		s1.ussageOfThis();
		

	}
	
}
