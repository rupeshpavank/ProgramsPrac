package com.practice.collectionsFrameowrk;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SortingPracticeMaps {

	public static void main(String[] args) {
		
		
		HashSet<String> hs=new HashSet<>();
		
		hs.add("Pavan");
		
		hs.add("Avan");
		
		hs.add("Zumar");
		
		hs.add("Rupesh");
	
		//hs.stream().sorted().forEach(System.out::println);
	
		TreeSet<String> ts=new TreeSet<>(hs);
		
		TreeSet<String> orderd=	(TreeSet<String>) ts.descendingSet();
		
		
		
		
		
	}

}
