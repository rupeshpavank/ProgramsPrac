package com.java.Numberspractice;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		int i=153;
		
		int res=i;
		
		int temp=0;
		
		double sum=0;
		
		int count=0;
		
		int res1=i;
		
		while(res1>0) {
			
			res1=res1/10;
			
			count++;
			
		}
		
		System.out.println(count);
		
		while(res>0) {
			
			temp=res%10;
			
			sum=sum+(Math.pow(temp,count));
			
			res=res/10;
		}
		
		System.out.println(sum);
		
	}

}
