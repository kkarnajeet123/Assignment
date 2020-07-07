//Write a Program to accepts 5 values in array and display their sum.
package assignement9;

import java.util.Scanner;

public class Answer32 {
	
	
	public static void main(String[] args) {
	
		int[] arr = new int[5];
		
		for (int i=0; i<arr.length; i++) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		arr[i]= sc.nextInt();
		
		}
		
		for (int i=0; i<arr.length; i++) {
			
			
			System.out.println("Your number is: "+arr[i]);
			}
	}

}
