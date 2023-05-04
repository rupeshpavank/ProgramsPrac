package com.practice.collectionsFrameowrk;

import java.util.HashMap;
import java.util.Map;

public class StreamDemoJava8 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(103, "Amit");

		map.put(101, "Vijay");

		map.put(102, "Rahul");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::print);

		/*
		 * map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out
		 * ::println);
		 * 
		 * 
		 * map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.
		 * out ::println);
		 * 
		 * 
		 * map.entrySet().stream().forEach(System.out::println);
		 */

	}

}
