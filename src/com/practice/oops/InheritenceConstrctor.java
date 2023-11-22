package com.practice.oops;

public class InheritenceConstrctor extends ConstrctorDemo {

	InheritenceConstrctor() {

		System.out.println("******Child class constrctor*****");
	}

	InheritenceConstrctor(int x, int y) {

		super("Rupesh",x); 
		//this();
		System.out.println("******Parametrized Child class  constrctor*****");
		System.out.println("********" + x + " " + y);

	}

	public static void main(String args[]) {
		InheritenceConstrctor obj = new InheritenceConstrctor(30, 50);

	}

}
