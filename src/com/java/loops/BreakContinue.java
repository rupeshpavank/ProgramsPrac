package com.java.loops;

public class BreakContinue {

	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++) {
			
			if(i==5) {
				
				break;
			}
			System.out.print(" "+i);
			
		}
		
		System.out.println();
		
		for(int i=10;i<=20;i++) {
			
			if(i==15) {
				continue;
			}
			System.out.print(" "+i);
		}
		
	}

}
