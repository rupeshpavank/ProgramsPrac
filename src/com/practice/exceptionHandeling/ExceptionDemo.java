package com.practice.exceptionHandeling;

public class ExceptionDemo {
	
	/*
	 * Throwable is the root class of Java Exception
	 * Exception and Error are the two sub classes
	 * ClassNotFoundException, IOException, SQLException, RemoteException, etc.
	 * Throw is used to throw the exception
	 * throws is used to declare the exception
	 */

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int [] arr=new int[5];
		
		
		try {
			
		int i=60/0;
		
		}
		
		
		catch(ArithmeticException e) {
			
			System.out.println("In Exception Block");
		}


		System.out.println("After Try - Catch Block");

		
		try {
			
			String s=null;
			
			s.substring(0);
		}
		
		catch(NullPointerException e) {
			
			System.out.println("In Null pointer Exception"+e.fillInStackTrace());
		}
		
		try {
			System.out.println("Final Try");
		}
		finally {
			System.out.println("***The Finally Block******");
		}

	}

}
