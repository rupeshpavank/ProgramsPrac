package com.practice.collectionsFrameowrk;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetPractice {

	public static void main(String[] args) {
		
		Set<String> ls=new LinkedHashSet<String>();
		
		ls.add("Rupesh");
		
		ls.add("Apple");
		
		ls.add("Banana");
		
		ls.add("Cat");
		
		
		ls.parallelStream().forEach(System.out::println);
		
		/*
		 * Iterator<String> itr =ls.iterator();
		 * 
		 * while(itr.hasNext()) { System.out.println(itr.next()); }
		 */		
		
	}

}
