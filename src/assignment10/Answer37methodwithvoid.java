package assignment10;

public class Answer37methodwithvoid {

	public static void sumOfArrays(int [] [] a, int [] [] b){
		
		int[][] sum= new int [a.length][b.length];
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<b.length; j++) {
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print((sum[i][j])+" ");	
			}
			System.out.println();
		}
				
	}
	
	
	public static void main(String[] args) {
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] arr1 = {{4,5,6},{2,7,8},{3,1,9}};
		
		
		sumOfArrays(arr, arr1);
		
	}
}
