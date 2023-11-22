package com.practice.exceptionHandeling;

import java.io.IOException;

public class ThrowExceptionDemo {
	
	public void validateAge(int a)  {
		
		if(a<18) {
			try {
				throw new IOException("Person is not eligible to Vote");
			}
			
			catch (Exception e) {
				System.out.println("Exception handeled");
			}
		}
		else
		{
			System.out.println("The Person is eligible to vote");
		}
		
	}
	
	public static void main(String args[]) {
		
		/*
		 * String s=null;
		 * 
		 * s.substring(0);
		 */
		/*
		 * Object s1=null;
		 * 
		 * s1.hashCode();
		 */
		
		ThrowExceptionDemo obj=new ThrowExceptionDemo();
		
		obj.validateAge(2);
		
		
	}
	
	
}
