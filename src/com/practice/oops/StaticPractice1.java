package com.practice.oops;

public class StaticPractice1 {
	
	 int i=10;
	
	public static void testStatic() {
		
		//i=30; static methods can not access non static data members
		
	}

	public static void main(String args[]) {
		
		StaticPractice1.testStatic();
	}
}
