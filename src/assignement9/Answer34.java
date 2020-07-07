//Write a program to reverse the element of an array.
package assignement9;

import java.awt.DisplayMode;
import java.util.Scanner;

public class Answer34 {

	public static int[] reverseArray(int [] arr) {
		
	int [] reverse = new int[arr.length];
	int a = arr.length-1;
	for(int i=0; i<arr.length; i++) {
		
		reverse[i]=arr[a];
		a--;
	}
	return reverse;
		
	}
	
	public static void displayArray(int []arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
	
	
	public static void main(String[] args) {
		
	int [] orignialArray = {10,2,34,1};
	int [] reverseArray = reverseArray(orignialArray);

	displayArray(orignialArray);
	System.out.println("===============");
	displayArray(reverseArray);
	
	
	}

}
