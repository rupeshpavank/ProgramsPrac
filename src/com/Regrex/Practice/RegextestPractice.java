package com.Regrex.Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegextestPractice {

	public static void main(String[] args) {
		
		/*
		 * String
		 * str="rupeshpavankumarrupeshpavaaarupeshaaarupeshsjshsjsrupeshrupeshrupesh";
		 * 
		 * Pattern p=Pattern.compile("rupesh");
		 * 
		 * Matcher m=p.matcher(str);
		 * 
		 * int count=0;
		 * 
		 * while(m.find()) { count++;
		 * System.out.println("The Starting index is: "+m.start()+" End Inedex is "+m.
		 * end()); } System.out.println(count);
		 */
		
		// 0 1 1 2 3 5 8 13
		
		/*
		 * int i=0; int j=1;
		 * 
		 * int sum=0; System.out.println(i);
		 * 
		 * System.out.println(j);
		 * 
		 * for(int k=0;k<30;k++) {
		 * 
		 * sum=i+j;
		 * 
		 * System.out.println(sum);
		 * 
		 * i=j;
		 * 
		 * j=sum;
		 * 
		 * 
		 * }
		 */
		
		
		int n=30;
		
		for(int i=2;i<n;i++) {
			
			int count=0;
			
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
					
					count++;
				}
			}
			
			if(count ==2) {
				System.out.println(i);
			}
		}
		
		
		
	}

}
