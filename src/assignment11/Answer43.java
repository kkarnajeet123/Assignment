//Write a program to trap the exception handling to trap the divided by zero and out of index value in array.
package assignment11;

import java.util.Scanner;

public class Answer43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter how long is the array: ");
		int a = sc.nextInt();
		int [] arr = new int [a] ;
		for(int b = 0; b<arr.length; b++) {
			System.out.println("Enter your number: ");
			arr[b]=sc.nextInt();
		}
				System.out.println("Enter what number to divide: ");
				int c = sc.nextInt();
		
		for(int b = 0; b<arr.length; b++) {
			System.out.print(arr[b]/c+", ");
		}
		System.out.println();
		
		System.out.println(arr[9]);
		
		}catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		catch(myArrayIndexException ai) {
			System.out.println(ai);
			
		}finally {
			sc.close();
		}
		}

}


	

