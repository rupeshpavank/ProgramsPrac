package com.practice.oops;

public class ThisUssageinRetrun {
	
	public ThisUssageinRetrun testUsageThis() {
		
		return this;
	}
	
	public void display() {
		
		System.out.println("This is invoked");
	}
	
	public static void main(String args[]) {
		
		ThisUssageinRetrun obj=new ThisUssageinRetrun();
		
		obj.testUsageThis().display();
		
		
		
	}

}
