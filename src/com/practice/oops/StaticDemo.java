package com.practice.oops;

/*
 * All the Refrences will be stored in stack memory
 * If we declare static it will refers to class reather than instance of the class
 * Static will get memory only once
 *  A static method can access static data member and can change the value of it.
 *  The static method can not use non static data member or call non-static method directly.
 *  this and super cannot be used in static context.
 *  Static methods can not be overridden
 */

public class StaticDemo {
	
	static int count=20;
	
	int test=10;


	public void sum() {
		
		count=count+1;
		
		test=test+1;
		
	}
	
	public static void testDisplay() {
		
		/* test=11; */ //Static methods can access only static variables not non static ones
		count=30;
	}
	
	public void display() {
		
		
		System.out.println(count);
		System.out.println("********Non Static***"+test);
	}
	
	public static void main(String args[]) {
		
	
		
		StaticDemo obj=new StaticDemo();
		
		StaticDemo obj1=new StaticDemo();
		
		StaticDemo obj2=new StaticDemo();
		
		obj.sum();
		
		obj.display();
		
		StaticDemo.testDisplay();

		
	obj1.sum();
		
		obj1.display();

		
	obj2.sum();
		
		obj2.display();
		
	}
	
}
