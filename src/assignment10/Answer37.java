//Write a Program to perform for the following task.
package assignment10;

public class Answer37 {

	public static int[][] collectArrays(int [] [] a, int [] [] b){
		
		int[][] sum= new int [a.length][b.length];
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<b.length; j++) {
				sum[i][j]=a[i][j]+b[i][j];
				//System.out.print((sum[i][j])+" ");
				
			}
			
		}
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] arr1 = {{4,5,6},{2,7,8},{3,1,9}};
		int[][] sum= new int [arr.length][arr1.length];
		
				
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length; j++) {
				
				System.out.print((arr[i][j])+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("+");
		
		for(int i=0; i<arr1.length;i++) {
			for(int j=0; j<arr1.length; j++) {
				
				System.out.print((arr1[i][j])+" ");
			}
			System.out.println();
		}
	
		System.out.println("=");
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr1.length; j++) {
				sum[i][j]=arr[i][j]+arr1[i][j];
				System.out.print((sum[i][j])+" ");
			}
			System.out.println();
		}
		
		
		
		
		
					
	}

}
