package com.practice.exceptionHandeling;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;  

public class Testthrows1 {
	
	 void m()    {  
		    //throw new IOException();
		 //We can not Propagate checked exceptions 
			/*
			 * FileInputStream fileInputStream = new FileInputStream("");
			 * 
			 * byte[] buffer = new byte[1024]; int bytesRead;
			 */
         
		  }
	 
	 void n()throws IOException{  
		    m();  
		  }  
	 
	 void p(){  
		   try{  
		    n();  
		   }catch(Exception e){System.out.println(e);}  
		  }  
	 
	 public static void main(String args[]){  
		   Testthrows1 obj=new Testthrows1();  
		   obj.p();  
		   System.out.println("normal flow...");  
	 }

}
