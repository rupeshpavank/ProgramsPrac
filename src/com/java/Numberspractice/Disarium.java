package com.java.Numberspractice;

public class Disarium {

	public static void main(String[] args) {
		
		int num=175;
		
		int count=0;
		
		int temp=num;
		
		int temp1=num;
		
		double sum=0;
		
		int rem=0;
		
		
		while(temp>0) {
			
			temp=temp/10;
	
			count++;
		}
		System.out.println(count);
		
		while(temp1>0 ) {
			
			rem=temp1 % 10;
			
			sum=sum+(Math.pow(rem, count));

			temp1=temp1/10;
			
			count=count-1;
		}
		
		if(sum==num) {
			System.out.println("The Number is Disarium Number");
		}
		
		else {
			System.out.println("The Number is not ******* Disarium Number");

		}

	}

}
