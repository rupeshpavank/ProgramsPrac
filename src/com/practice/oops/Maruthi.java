package com.practice.oops;

public class Maruthi extends car{
	
	void run() {
		System.out.println("The Maruthi is Running");
	}

	@Override
	public void definition() {
		System.out.println("The Definition of Maruthi");
		
	}
	
	public static void main(String[] args) {
		
	Maruthi m=new Maruthi();
		m.run();
		m.definition();
	}



}
