package com.practice.collectionsFrameowrk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEntryPractice {

	public static void main(String[] args) {
		
		HashMap<String,Integer> hs=new HashMap<String,Integer>();
		
		hs.put("Pavan", 100);
		
		hs.put("Kumar", 10);
		
		hs.put("Aeddy", 200);
		
		List<Map.Entry<String, Integer>> list=new ArrayList<>(hs.entrySet());
		
		Collections.sort(list,Map.Entry.comparingByKey());
		
		for(Map.Entry<String, Integer> mp:list) {
			System.out.println(mp.getKey()+"  "+mp.getValue());
		}
		
		
		
	}

}
