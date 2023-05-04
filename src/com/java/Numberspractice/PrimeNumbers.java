package com.java.Numberspractice;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int num=97;
		int count =0;

		
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) {
				count++;
			}
			
		}
		
		if(count ==2) {
			System.out.println("The Number is a Prime Number");
		}
		
		else {
			System.out.println("The Numver is not a Prime Number");
		}
		
	}

}
