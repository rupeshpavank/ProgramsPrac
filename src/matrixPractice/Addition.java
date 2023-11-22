package matrixPractice;

public class Addition {

	public static void main(String[] args) {
		
		int [][] arr= {{1,2,3},{3,4,5},{5,6,7}};
		
		int [][] brr= {{1,2,3},{3,4,5},{5,6,7}};
		
		int [][] crr = new int[arr.length][brr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			
			for(int j=0;j<arr.length;j++) {
				
				
				crr[i][j]=arr[i][j]+brr[i][j];
				
				System.out.print(crr[i][j]+" ");   
				
			}
			
			System.out.println();
			
		}
		
		
		
	}

}
