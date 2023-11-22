package com.practice.collectionsFrameowrk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListPractice {
	/*
	 * Collections class is an utility class in Java
	 * Array List uses Dynamic Array concept for storing and manipulating the elements
	 * Java ArrayList class can contain duplicate elements.
	  Java ArrayList class maintains insertion order.
	  Get Method will be there in array list to get the particular element 
  Java ArrayList allows random access because the array works on an index basis.

	 * In Set class we have iterator method 
	 */

	public static void main(String[] args) {
		
		
	
		
		List<String> names=new ArrayList<String>();
		
		LinkedList<String> names1=new LinkedList<String>();
		
		names1.add("Rupesh");
		
		names1.add("Aavan");
		
		names1.add("kumar");
		
		names1.add(0, "Kittu");
		
		//names1.getFirst();
		
		names.add("Rupesh");
		
		names.add("Aavan");
		
		names.add("kumar");
		
		names.add(0, "Kittu");
		
		//System.out.println(names.get(3));
		
		
		/*
		 * for(String name:names) { System.out.println(name); }
		 */

		Collections.sort(names,Collections.reverseOrder());
		Collections.sort(names1,Collections.reverseOrder());
		
		 names.replaceAll(String::toUpperCase);
		Iterator<String> itr=names.iterator();
		
		
		
		  while(itr.hasNext()) { System.out.println(itr.next()); }
		 
		/*
		 * names.parallelStream().forEach(System.out::println);
		 */			
		/*
		 * names.parallelStream().sorted().forEach(System.out::println);
		 */	
	//names.stream().sorted().forEach(System.out::println);

		 

		  System.out.println(names.equals(names1));
	}

}
