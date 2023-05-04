package com.practice.collectionsFrameowrk;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
		
		String str="rupesh Pavan Kumar Reddyyyyy";
		
		int large=0;
		
		char x = 0;
		
	char[] chars=	str.toCharArray();
	
	Map<Character, Integer> mp=new HashMap<Character,Integer>();
	
	
	for(int i=0;i<chars.length;i++) {
		
		if(mp.containsKey(chars[i])) {
			
			mp.put(chars[i], mp.get(chars[i])+1);
			
		}
			else {

			mp.put(chars[i], 1);		
		}

	}
	   System.out.println(mp);
	
	   for(Map.Entry<Character, Integer> me:mp.entrySet()) {
		   
		   
		  if(me.getValue()>large) {
			  
			  large=me.getValue();
			  
			  x=me.getKey();
			  
		  }

	   }
	
		System.out.println("The Most Repeated Character is: "+x);
		
		System.out.println("Number of times: "+ x +" Got Repeated is: "+large);
	}

}
