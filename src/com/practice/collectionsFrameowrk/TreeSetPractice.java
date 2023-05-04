package com.practice.collectionsFrameowrk;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		
		Set<String> treeSet=new TreeSet<String>();
		
		treeSet.add("Zabili");
		
		treeSet.add("Apple");
		
		treeSet.add("Banana");
		
	Iterator<String> itr=treeSet.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
		
		
	}

}
