package com.java.StringPractice;

import java.util.Collections;

public class StringPractice {

	public static void main(String[] args) {
		/*
		 * String is Immutable in java because of 
		 * Caching, Security, Memory Save, synchronization
		 * The String objects are cached in the String pool, and it makes the String immutable. 
		 * 
		 * All the string objects were cached in a string pool memory 
		 * The String obejctys will be accessed by multiple clients
		 * If one Clinet changes the value all other clients will be efffected
		 * 
		 * 
		 * If you want to represent any object as a string, toString() method comes into existence.
		 * 
		 * 
		 */
		
		
		
		//String reverse
		/*String str="Rupesh Pavan";
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);*/
		
		//char at I
		
		/*
		 * String str="rupesh";
		 * 
		 * System.out.println(str.charAt(str.length()-1));
		 */
		
		//Index of
		//Index of will return you the integer

		/*
		 * String str="Rupesh Pavan Kumar Reddy Reddy Pavan Kumar";
		 * 
		 * System.out.println(str.indexOf("Rupesh"));
		 * 
		 * 
		 * System.out.println(str.lastIndexOf("Reddy"));
		 * 
		 * System.out.println(str.indexOf("Pavan", 10));
		 */
		
		//Sub String
		
/*		String str="Rupesh Pavan Kumar Reddy";
*/		
		/*
		 * System.out.println(str.substring(7));
		 * 
		 * System.out.println(str.substring(7,19));
		 */
		
		/*
		 * String s1="Rupesh";
		 * 
		 * String s2="Pavan";
		 * 
		 * s1=s1+s2;
		 * 
		 * s2=s1.substring(0, s1.indexOf(s2));
		 * 
		 * System.out.println(s2);
		 * 
		 * s1=s1.substring(s2.length());
		 * 
		 * System.out.println(s1);
		 */
		
		//Difference between String literals and new Key Word 
		//Using intern will return you true 
		//If we did not use intern it will return false
		
		
		/*
		 * String s1="Rupesh";
		 * 
		 * String s2="Rupesh";
		 * 
		 * System.out.println(s1==s2);
		 * 
		 * String s3=new String("Rupesh").intern();
		 * 
		 * String s4=new String("Rupesh").intern();
		 * 
		 * System.out.println(s3==s4);
		 */
		 
		//Value of 
		
		/*
		 * char c='a';
		 * 
		 * System.out.println(String.valueOf(c));
		 * 
		 * int i=30; System.out.println(String.valueOf(i));
		 */

		
		//Split 
		
		/*
		 * String str="Rupesh Pavan Kumar Reddy";
		 * 
		 * String[] names =str.split(" ");
		 * 
		 * for(String str1:names) { System.out.println(str1); }
		 */
		
		
		//Replace
		
		
	/*	  String str="Rupesh123$%&*(^^^Pavan&&Kumar&%%Reddy";
		  
		  System.out.println(str.replaceAll("[^A-Za-z0-9]+", ""));*/

		
		//More spaces
		
		/*
		 * String str1="Rupesh        Pavan    Kumar Reddy";
		 * 
		 * System.out.println(str1.replaceAll("\\s+", " "));
		 */
		
		//Format
	
		/*
		 * float test=12.123f;
		 * 
		 * 
		 * String str= String.format("%f", test);
		 * 
		 * System.out.println(str);
		 * 
		 * str.equals(str);
		 */
		

		//Reverse each word in a String
		/*
		 * String str="Rupesh Pavan Kumar Reddy";
		 * 
		 * String OverallRev="";
		 * 
		 * 
		 * String [] name =str.split(" ");
		 * 
		 * for(int i=0;i<name.length;i++) {
		 * 
		 * String rev="";
		 * 
		 * for(int j=name[i].length()-1;j>=0;j--) {
		 * 
		 * rev=rev+name[i].charAt(j); }
		 * 
		 * OverallRev=OverallRev+rev+" ";
		 * 
		 * 
		 * } System.out.println(OverallRev);
		 */
		
		//Reverse with spaces intact
		
		/*
		 * String str="Rupesh Pavan Kumar Reddy";
		 * 
		 * char[] chars =str.toCharArray();
		 * 
		 * char[] dups=new char[chars.length];
		 * 
		 * 
		 * for(int i=0;i<chars.length;i++) {
		 * 
		 * if(chars[i]==' ') {
		 * 
		 * dups[i]=' '; } }
		 * 
		 * int n=dups.length-1;
		 * 
		 * 
		 * for(int i=0;i<chars.length;i++) {
		 * 
		 * if(chars[i]!=' ') {
		 * 
		 * if(dups[n]==' ') { n--;
		 * 
		 * } dups[n]=chars[i]; n--;
		 * 
		 * }
		 * 
		 * } String str1=String.valueOf(dups);
		 * 
		 * System.out.println(str1);
		 */
		
		/*
		 * int [] arr= {-1,-2,-3,1,2,3};
		 * 
		 * int [] arr1=new int[arr.length];
		 * 
		 * int k=0;
		 * 
		 * for(int i=0;i<arr.length;i++) {
		 * 
		 * for(int j=i+1;j<arr.length;j++) {
		 * 
		 * if(arr[i]==-arr[j]) {
		 * 
		 * arr1[k]=arr[i];
		 * 
		 * arr1[k+1]=arr[j];
		 * 
		 * k=k+2;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * }
		 * 
		 * for(int i:arr1) { System.out.print(" "+i); }
		 */
		
		/*
		 * String string1 = "Great responsibility"; int count;
		 * 
		 * //Converts given string into character array char string[] =
		 * string1.toCharArray();
		 * 
		 * System.out.println("Duplicate characters in a given string: "); //Counts each
		 * character present in the string for(int i = 0; i <string.length; i++) { count
		 * = 1; for(int j = i+1; j <string.length; j++) { if(string[i] == string[j] &&
		 * string[i] != ' ') { count++; //Set string[j] to 0 to avoid printing visited
		 * character string[j] = '0'; } } //A character is considered as duplicate if
		 * count is greater than 1 if(count > 1 && string[i] != '0')
		 * System.out.println(string[i]); }
		 * 
		 */
		
	}

}
