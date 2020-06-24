//Write a program to find sum and average of two numbers input by User (using Scanner class).
package Questions_Answers;

import java.util.Scanner;

public class answer3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first number:");
		double a = sc.nextDouble();
		System.out.println("Enter your second number:");
		double b = sc.nextDouble();
		sc.close();
	//	String c= String.valueOf(a+b);
		System.out.println("Your sum of "+a+" and "+b+" is:"+(a+b));
		System.out.println("Your average of "+a+" and "+b+" is:"+(a+b)/2);
	}

}
