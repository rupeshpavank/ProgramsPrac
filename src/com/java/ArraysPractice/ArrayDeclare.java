package com.java.ArraysPractice;

import java.util.Iterator;

public class ArrayDeclare {
	
	public static void main(String args[]) {
		
		//Declaration
		/*
		 * int [] arr=new int[5];
		 * 
		 * int [] arr1=new int[arr.length];
		 * 
		 * int [] arr2= {1,4,6};
		 * 
		 * arr[0]=10;
		 * 
		 * arr[1]=20;
		 * 
		 * arr[2]=30;
		 * 
		 * for(int i :arr) { System.out.println(i); }
		 * 
		 * 
		 * for(int i :arr2) { System.out.println(i); }
		 */
		
		//Biggest and second Biggest
		
		/*
		 * int [] arr= {30,10,50,5,100,95};
		 * 
		 * int biggest=arr[0];
		 * 
		 * int secondBiggest=arr[1];
		 * 
		 * 
		 * for(int i=0;i<arr.length;i++) {
		 * 
		 * if(arr[i]>biggest) {
		 * 
		 * secondBiggest=biggest;
		 * 
		 * biggest=arr[i]; }
		 * 
		 * else if(arr[i]>secondBiggest && arr[i]!=biggest) {
		 * 
		 * secondBiggest=arr[i]; }
		 * 
		 * }
		 * 
		 * System.out.println(biggest);
		 * 
		 * System.out.println(secondBiggest);
		 */
		
		//To Print Zeros on Left side
		
		/*
		 * int [] arr= {1,0,1,0,1,1,0,0};
		 * 
		 * int count=0;
		 * 
		 * for(int i=0;i<arr.length;i++)
		 * 
		 * {
		 * 
		 * if(arr[i]==1) { count++; } } System.out.println(count);
		 * 
		 * System.out.println();
		 * 
		 * for(int i=count;i<arr.length;i++) {
		 * 
		 * arr[i]=1; }
		 * 
		 * for(int i=0;i<count;i++) {
		 * 
		 * arr[i]=0; }
		 * 
		 * for(int i:arr) { System.out.print(" "+ i); }
		 */
		
		//Sorting with out Arrays.Sort
		
		/*
		 * int [] arr= {50,10,70,20,100,5};
		 * 
		 * int temp=0;
		 * 
		 * for(int i=0;i<arr.length;i++) {
		 * 
		 * for(int j=i+1;j<arr.length;j++) {
		 * 
		 * if(arr[i]<arr[j]) {
		 * 
		 * temp=arr[i];
		 * 
		 * arr[i]=arr[j];
		 * 
		 * arr[j]=temp;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * }
		 * 
		 * for(int i:arr) { System.out.print(" "+i); }
		 */
		
		//Frequency of an element
		
		/*
		 * int [] arr= {5,5,10,20,10,30,20,5,10};
		 * 
		 * int [] dups= new int[arr.length];
		 * 
		 * int count;
		 * 
		 * for(int i=0;i<arr.length;i++) {
		 * 
		 * count=0;
		 * 
		 * for(int j=i+1;j<arr.length;j++) {
		 * 
		 * if(arr[i]==arr[j]) {
		 * 
		 * count++;
		 * 
		 * dups[j]=-1; } } if(dups[i]!=-1) {
		 * 
		 * dups[i]=count; } }
		 * 
		 * 
		 * for(int i=0;i<arr.length;i++) {
		 * 
		 * if(dups[i]!=-1) {
		 * 
		 * System.out.println("The Number of Times: "+arr[i]+" Repeated is: "+dups[i]);
		 * 
		 * }
		 * 
		 * }
		 */
		//Even Position
		
		int arr[]= {1,2,3,5,6,7,8,10};
		
		for(int i=1;i<arr.length;i=i+2) {
			
			System.out.println("The Even Position is: "+arr[i]);
		}
		
		
	}


}
