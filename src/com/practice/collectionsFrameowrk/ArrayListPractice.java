package com.practice.collectionsFrameowrk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {
	/*
	 * Collections class is an utility class in Java
	 * 
	 * In Set class we have iterator method 
	 */

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<String>();
		
		names.add("Rupesh");
		
		names.add("Aavan");
		
		names.add("kumar");
			
		/*
		 * names.parallelStream().forEach(System.out::println);
		 */			
		/*
		 * names.parallelStream().sorted().forEach(System.out::println);
		 */	
	names.stream().sorted().forEach(System.out::println);


	}

}
