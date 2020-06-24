
//Write a Program for the following Mathematical.


package assignment7;

import java.util.Scanner;

public class answer29 {

	public int findfactorial(int n) {
	
		int factorial =1;
		
		for (int i=1; i<=n; i++) {
			
			factorial = factorial*i;
			
		}
		
		return factorial;
		
	}
	
	public static void main(String[] args) {
		
		answer29 as = new answer29();
		
		System.out.println("Enter your number: ");
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		int sum=0;
		
		
		for(int i=1; i<=n; i++) {
		
			
			sum=sum+(i/as.findfactorial(i));
			
			System.out.println(sum);
		}
	
		

	}

}
