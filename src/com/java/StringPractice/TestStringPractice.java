package com.java.StringPractice;

public class TestStringPractice {
	
	
	
	@Override
	public String toString() {
		return "Test";
		
	}

	public static void main(String[] args) {
		
	
		
		
		  String str="Rupesh Pavan Kumar Pavan Rupesh";
		  
		  System.out.println(str.indexOf("Pavan", 10));
		  
		  String str1="Pavan";
		  
		  System.out.println(str.charAt(10));
		  
		  System.out.println(str.length());
		  
		  System.out.println(str.substring(5));
		  
		  System.out.println(str.substring(7,12));
		  
		  System.out.println(str.substring(str.indexOf('P')));
		  
		  System.out.println("Length "+str.substring(0,str.length()-str1.length()));
		  
		  System.out.println(str.substring(str.indexOf("Pavan"),str.indexOf("Kumar")));
		  
		  String str3="Rupesh Pavan Kumar Reddy";
		  
		  String [] arr=str3.split(" ");
		  
		  for(String s:arr) { System.out.println(s); }
		  
		  String s1=new String("Welcome to Fedility Investments").intern(); String
		  s2=new String("Welcome to Fedility Investments").intern();
		  
		  if(s1==s2) { System.out.println("***************"); } else {
		  System.out.println("Not Equal"); }
		  
		  int i=30;
		  
		  System.out.println(String.valueOf(i));
		  
		  TestStringPractice obj=new TestStringPractice();
		  
		  System.out.println(obj.toString());
		 
		
		/*
		 * String str="Rupesh%$#143Kumar22";
		 * 
		 * String newNum=str.replaceAll("[^0-9]", "");
		 */
		
		/*
		 * int sum=0; char[] chars= newNum.toCharArray();
		 * 
		 * for(int i=0;i<chars.length;i++) {
		 * sum=sum+Character.getNumericValue(chars[i]); }
		 * 
		 * 
		 * System.out.println(sum);
		 */
		
	/*	int sum=0;
		int temp=0;
		int conv=Integer.parseInt(newNum);
		
		while(conv>0) {
			sum=sum+conv%10;
			conv=conv/10;
			
		}
		System.out.println(sum);
		
	}*/
		
		
	/*
	 * int i=321;
	 * 
	 * 
	 * int sum=0;
	 * 
	 * int temp=i;
	 * 
	 * while(i>0) {
	 * 
	 * sum=sum*10+i%10;
	 * 
	 * i=i/10; } System.out.println(sum);
	 */
		
	/*
	 * String str1="Rupesh    Pavan     Kumar Reddy";
	 * 
	 * System.out.println(str1.replaceAll("\\s+", " "));
	 */
		
	/*
	 * String str="rupesh Pavan Kumar reddy";
	 * 
	 * char[] chars=str.toCharArray();
	 * 
	 * int[] charCount=new int[str.length()];
	 * 
	 * 
	 * for(int i=0;i<str.length();i++) {
	 * 
	 * int count=1;
	 * 
	 * for(int j=i+1;j<str.length();j++) {
	 * 
	 * if(chars[i]==chars[j] ) { count++; charCount[j]='*'; }
	 * 
	 * 
	 * }
	 * 
	 * if(charCount[i]!='*') {
	 * 
	 * charCount[i]=count; }
	 * 
	 * }
	 * 
	 * System.out.println(charCount);
	 * 
	 */
		
		
	}
}
