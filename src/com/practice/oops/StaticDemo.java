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
	
	static int count=0;
	
	int test=10;
	
	public void sum() {
		
		count=count+1;
	}
	
	public void display() {
		
		System.out.println(count);
	}
	
	public static void main(String args[]) {
		
		StaticDemo obj=new StaticDemo();
		
		StaticDemo obj1=new StaticDemo();
		
		StaticDemo obj2=new StaticDemo();
		
		obj.sum();
		
		obj.display();

		
	obj1.sum();
		
		obj1.display();

		
	obj2.sum();
		
		obj2.display();
		
	}
	
}
