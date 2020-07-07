//2 dimensional array returning with int type
package assignment10;

import java.util.Arrays;

public class Answer37method {

	public static int[][] sumOfArrays(int [] [] a, int [] [] b){
		
		int[][] sum= new int [a.length][b.length];
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<b.length; j++) {
				sum[i][j]=a[i][j]+b[i][j];
					
			}
		}
		return sum;		
	}
	
	
	public static void main(String[] args) {
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] arr1 = {{4,5,6},{2,7,8},{3,1,9}};
		int Row=3,Column=3;
		
		int[] [] sum = new int [Row][Column];
		
		sum=sumOfArrays(arr, arr1);
		
		for(int i=0; i<Row; i++) {
			for(int j=0; j<Column; j++) {
				System.out.print(sum[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
	
}

