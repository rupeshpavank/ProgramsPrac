package com.practice.oops;

public class StringPractices {

	public static void main(String[] args) {
		
		String s1="Rupesh";
		String s2="Pavan";
		
		s1=s1+s2;
		
		s2=s1.substring(0,s1.indexOf(s2));
		System.out.println(s2);
		s1=s1.substring(s2.length());
		System.out.println(s1);
	}

}
