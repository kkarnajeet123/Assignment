//Write a Program to sum 1 to nth natural numbers.
package assignment7;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Answer23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth number for their sum");
		int num = sc.nextInt();
		int sum=0;
		for (int i=1; i<=num;i++) {
			sum= num*(num+1)/2;//formula for sum of nth natural number
			
		}
		System.out.println(sum);
			
			

	}

}
