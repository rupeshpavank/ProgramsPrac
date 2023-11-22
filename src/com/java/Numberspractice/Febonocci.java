package com.java.Numberspractice;

public class Febonocci {

	public static void main(String[] args) {
	
		//Febonocci Series 
		//out Put: 0 1 1 2 3 5 8 13 21 
		
		int a=0;
		int b=1;
		int sum=0;
		
		System.out.print(a);
		
		for(int i=0;i<=10;i++) {
			
			sum=a+b;
			a=b;
			b=sum;
			
			System.out.print(" "+sum);
			
		}


	}

}
