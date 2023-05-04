package com.java.Numberspractice;

public class PalindromeNumber {
	
	// % is the Reminder 
	// / is the Coefficient 

	public static void main(String[] args) {
		
		int i=543;
		
		int res=i;
		
		int sum=0;
		
		int n=10;
				
		while(i>0) {
			
			sum=sum*10+i%n;
			
			i=i/10;
		}
		
	if(sum==res) {
		
		System.out.println("The Number is and Palindrome: " +sum);
	}
	else
	{
		System.out.println("The Number is not a Palindrome "+ sum);
	}
		

	}

}
