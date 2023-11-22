package com.java.StringPractice;

public class StringProgramPractice {

	public static void main(String[] args) {
		
		/*
		 * String s1="Rupesh";
		 * 
		 * String s2="pavan";
		 * 
		 * s1=s1+s2;//Rupesh Pavan
		 * 
		 * s2=s1.substring(0, s1.indexOf(s2));//Rupesh s1=s1.substring(s2.length());
		 * 
		 * System.out.println(s1); System.out.println(s2);
		 */
		
		
		/*
		 * String str="Rupesh Pavan"; String rev="";
		 * 
		 * for(int i=str.length()-1;i>=0;i--) {
		 * 
		 * rev=rev+str.charAt(i);
		 * 
		 * }
		 * 
		 * System.out.println(rev);
		 */
		
		/*
		 * String str="Rupesh Pavan Kumar";
		 * 
		 * String[] names=str.split(" ");
		 * 
		 * String rev="";
		 * 
		 * 
		 * for(int i=0;i<names.length;i++) {
		 * 
		 * String name=names[i]; String revNames="";
		 * 
		 * for(int j=name.length()-1;j>=0;j--) {
		 * 
		 * revNames=revNames+name.charAt(j); }
		 * 
		 * rev=rev+revNames+" ";
		 * 
		 * 
		 * }
		 * 
		 * System.out.println(rev);
		 * 
		 */
		
		//Reverse with spaces intact
		/*
		 * String str="Rupesh Pavan Kumar Reddy";
		 * 
		 * 
		 * char[] chars=str.toCharArray();
		 * 
		 * char[] copyCars=new char[str.length()];
		 * 
		 * for(int i=0;i<chars.length;i++) {
		 * 
		 * if(chars[i]==' ') { copyCars[i]=' '; } }
		 * 
		 * int length=str.length(); int j=0;
		 * 
		 * for(int i=length-1;i>=0;i--) {
		 * 
		 * if(chars[i]!=' ') {
		 * 
		 * if(copyCars[j]==' ') { j++; } copyCars[j]=chars[i]; j++; }
		 * 
		 * 
		 * }
		 * 
		 * System.out.println(new String(copyCars));
		 */
		
		
		
		
		
	}

}
