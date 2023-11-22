
public class HelloWorld {

	public static void main(String[] args) {
		

	   
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
