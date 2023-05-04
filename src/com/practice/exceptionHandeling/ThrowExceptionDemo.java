package com.practice.exceptionHandeling;

public class ThrowExceptionDemo {
	
	public void validateAge(int a) {
		
		if(a<18) {
			
			throw new ArithmeticException("Person is not eligible to Vote");
		}
		else
		{
			System.out.println("The Person is eligible to vote");
		}
		
	}
	
	public static void main(String args[]) {
		
		ThrowExceptionDemo obj=new ThrowExceptionDemo();
		
		obj.validateAge(10);
		
	}
	
	
}
