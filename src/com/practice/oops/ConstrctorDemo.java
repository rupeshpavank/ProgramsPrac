package com.practice.oops;

/*
 * 
 * Default Constructor is used to provide the default values like 0's and Null
 * The parameterized constructor is used to provide different values to distinct objects.
 * A Java constructor cannot be abstract, static, final, and synchronized
   A Constructor must have no explicit return type
   Order of constructor Execution: 
   Inheritance: Parent class constructor is called first even though when u create 
   an object of child class
   'This' is used to call the default constructor from parameterized constructor in same class
   Super is used to invoke the parameterized constructor of parent class from child class 
   Abstract class can have constructor. The usage is if we extend the abstract class
    constructor in the abstract will be called first
 */

public class ConstrctorDemo {
	
	
	public ConstrctorDemo() {
		this("Rupesh",5);
		
		System.out.println("**Parent Class default Constrctor*********");
		
	}
	
	public ConstrctorDemo(String str, int i) {
		
		
		//System.out.println(str+" "+i);
		System.out.println("**Parent Class parametrized Constrctor*********");
	}
	

	
	public String toString() {
		
		return "Rupesh Pavan to STring";
	}
	
	
	/*
	 * public static void main(String args[]) {
	 * 
	 * ConstrctorDemo obj=new ConstrctorDemo();
	 * 
	 * String s=obj.toString();
	 * 
	 * System.out.println(obj.toString());
	 * 
	 * ConstrctorDemo obj2=new ConstrctorDemo();
	 * 
	 * ConstrctorDemo obj1=new ConstrctorDemo("Rupesh",10);
	 * 
	 * }
	 */

}
