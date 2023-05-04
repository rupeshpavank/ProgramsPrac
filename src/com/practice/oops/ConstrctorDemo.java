package com.practice.oops;

/*
 * 
 * A Java constructor cannot be abstract, static, final, and synchronized
 A Constructor must have no explicit return type
 */

public class ConstrctorDemo {
	
	
	public ConstrctorDemo() {
		
		System.out.println("***********");
		
	}
	
	public ConstrctorDemo(String str, int i) {
		
	}
	

	
	public String toString() {
		
		return "Rupesh Pavan to STring";
	}
	
	
	public static void main(String args[]) {
		
		ConstrctorDemo obj=new ConstrctorDemo();
		
		String s=obj.toString();
		
		System.out.println(obj.toString());
		
		ConstrctorDemo obj2=new ConstrctorDemo();
		
		ConstrctorDemo obj1=new ConstrctorDemo("Rupesh",10);

	}

}
