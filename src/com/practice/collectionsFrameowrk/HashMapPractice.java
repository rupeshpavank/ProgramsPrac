package com.practice.collectionsFrameowrk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {

		/*
		 * String str="rupesh pavan kumar reddyyyyyyy";
		 * 
		 * char[] chars= str.toCharArray();
		 * 
		 * HashMap<Character,Integer> hs=new HashMap<>();
		 * 
		 * for(int i=0;i<chars.length;i++) {
		 * 
		 * 
		 * if(hs.containsKey(chars[i])) { hs.put(chars[i], hs.get(chars[i])+1); } else {
		 * 
		 * hs.put(chars[i], 1);
		 * 
		 * } }
		 * 
		 * int max=0; char c ='0';
		 * 
		 * for(Map.Entry<Character, Integer> mp:hs.entrySet()) {
		 * 
		 * if(mp.getValue()>max) {
		 * 
		 * max=mp.getValue();
		 * 
		 * c=mp.getKey();
		 * 
		 * } }
		 * 
		 * System.out.println("The Most repeating character is "+c);
		 */

		HashMap<String, String> hs = new HashMap<>();

		hs.put("Rupesh", "Good");

		hs.put("Pavan", "bad");

		hs.put("Aumar", "Very Bad");

		
		
		
		ArrayList<String> ls=new ArrayList<>(hs.keySet());
		
		Collections.sort(ls);
		
		for(String s:ls) {
			
			String value=hs.get(s);
			System.out.println("The Sorted key are "+s+" THe values are "+value);
		}
		

		/*
		 * for(Map.Entry<String, String> ts:hs.entrySet()) {
		 * 
		 * //System.out.println("The Key is "+ts.getKey()+" The Value is: "+ts.getValue(
		 * ));
		 * 
		 * 
		 * 
		 * 
		 * 
		 * for(String ts:hs.keySet()) {
		 * 
		 * System.out.println("The Key is "+ts);
		 * 
		 * }
		 * 
		 * 
		 * } hs.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.
		 * out::println);
		 */

	}
}
