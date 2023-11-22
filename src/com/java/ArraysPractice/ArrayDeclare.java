package com.java.ArraysPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayDeclare {

	public static void main(String args[]) throws FileNotFoundException {
		
		

        System.out.println("Hello, World!");
        //Reverse Hello world 
        String str="Hello, World!";
       
     String[] words = str.split(" ");
     
     
     String rev="";
     String word="";
     for(int i=0;i<words.length;i++){
         
         word="";
         
         String test=words[i];
         
         for(int j=test.length()-1;j>=0;j--){
             
             word=word+test.charAt(j);
             
         }
         
         rev=rev+word+" ";
         
         
     }
       
        System.out.println("The Reverse is"+rev);
       
		
	}

}
