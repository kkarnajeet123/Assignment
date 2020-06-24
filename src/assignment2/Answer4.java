package assignment2;

import java.util.Scanner;

public class Answer4 {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first number:");
		a= sc.nextInt();
		System.out.println("Enter your second number:");
		b= sc.nextInt();
		c=a+b;
		System.out.println("Sum of your number is: "+c);
		System.out.println("Average of your number is: "+c/2);
		
		sc.close();

	}

}
