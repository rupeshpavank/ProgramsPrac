package com.Regrex.Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemoPractice {

	public static void main(String[] args) {
		
		String str="rupeshpavankumarreddyrupeshrupeshkumar";
		
		Pattern p=Pattern.compile("rupesh");
		
		Matcher mi=	p.matcher(str);
		
		int count =0;
	
  while(mi.find()) {
	  
	  
	System.out.println("Present in: "+mi.start()+" and "+mi.end());
	  count++;
  }
		
	System.out.println(count);	
		
		
	}

}
