//Write a program to print the factorial number of given numbers.
package assignment7;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Answer24 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter your number for factorial");
		int num = sc.nextInt();
		
		int factorial=1, factorial1=1;
		
		for (int i = num; i>0; i--) {
			
			factorial1=factorial1*i;
		}
		System.out.println("decrement method "+factorial);
		
		System.out.println("=============================");
		
		for(int i=1; i<=num; i++) {
		
			factorial=factorial*i;
					
		}
		
		System.out.println("increment method "+factorial1);
		
		
		
		
	}

}
