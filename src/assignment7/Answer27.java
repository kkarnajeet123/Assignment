//Write a Program to sum each digit of given number as we XX ll as product. //456 =>4*5*6 and 4+5+6
package assignment7;

import java.util.Scanner;

public class Answer27 {

	public static void main(String[] args) {
		
		int sum=0;
		int mult=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number: ");
				
		String num = sc.next();
		
		for (int i=0; i<=num.length()-1; i++) {
			for(int j=0; j<=num.length()-1; j++) {
				//System.out.print(num.charAt(i));
				int converted = (int)num.charAt(i);
				//int converted = Integer.parseInt();
				sum=sum+converted;
			}
			
			
			//mult=mult*converted;
		//	System.out.println(mult);
			
		}System.out.println(sum);
		//System.out.println(sum);
		//System.out.println(mult);
		sc.close();
	}

}
