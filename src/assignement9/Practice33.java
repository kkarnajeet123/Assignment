//Write a Program to display number in ascending order in array.
package assignement9;

import java.util.Scanner;

public class Practice33 {

	public int[] gatherNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int input=sc.nextInt();
			
		int[] arr = new int[input];
		
		for (int i =0; i<arr.length; i++) {
			
			System.out.println("Enter your number: ");
			arr[i] = sc.nextInt();
			
		}return arr;
		
	}
	

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		//input = sc.nextInt();
		Practice33 as = new Practice33();
		
		
		
		//int[]ar=as.gatherNum(input);
		
	//	System.out.println(ar);
		
	}

}
