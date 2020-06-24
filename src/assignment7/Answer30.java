//Write a program to print the Fibonacci series. 1 1 2 3 5 8 ….
package assignment7;

import java.util.Scanner;

public class Answer30 {
	
	public void fibonnacci(int n) {
		 int a = 0, b = 1, c; 
	        if (n == 0) {
	            System.out.println("please enter again");
	        }
	        for (int i = 2; i <= n; i++) 
	        { 
	            c = a + b; 
	            a = b; 
	            b = c; 
	            System.out.print("Your Fibonacci series is"+b+",");
	        } 
	         
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		
		int k= sc.nextInt();
		sc.close();
		Answer30 as = new Answer30();
		as.fibonnacci(k);
		

	}

}
