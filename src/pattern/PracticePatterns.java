package pattern;

public class PracticePatterns {
	
	public static void main(String args[]) {
		/*
		 * 
		 * for(int i=0;i<6;i++) {
		 * 
		 * for(int j=0;j<=i;j++) { System.out.print("*"); }
		 * 
		 * 
		 * System.out.println();
		 * 
		 * }
		 * 
		 * 
		 * 
		 */
		int n=6;
		
	
		
		
		  for(int i=1;i<6;i++) {
		  
		  for(int j=1;j<=n-i;j++) {
		  
		  System.out.print(" "); }
		  
		  for(int k=1;k<=i;k++) { 
			  System.out.print("*"); 
			  }
		  
		  System.out.println(); 
		  
		  }
		 
		 
		
			/*
			 * for(int i=1;i<n;i++) {
			 * 
			 * 
			 * for(int j=1;j<n-i;j++) {
			 * 
			 * System.out.print(" "); }
			 * 
			 * for(int k=1;k<=2*i-1;k++) { System.out.print("*"); }
			 * 
			 * System.out.println();
			 * 
			 * 
			 * }
			 */
	
	}
	
}
