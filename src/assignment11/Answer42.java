//Write a program to find the duplicate word from a long string.
package assignment11;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Answer42 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your long string: ");
		//String input = sc.next();
		
		//String input1 = "This is how we do, we do, how is";
		String input = "This is is my place and i love this place";
		String [] arr = input.toUpperCase().split(" ");
	
		for (int i = 0; i < arr.length; i++) {
		//	System.out.println(arr[i]);
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].matches((arr[j]))) {
					System.out.print(arr[j]+" ");
				}
			}System.out.print(" ");
			
		}
		//StringTokenizer st = new StringTokenizer(input1," ");
	}
}
