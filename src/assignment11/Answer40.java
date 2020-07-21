//Write a program to reverse the string.
package assignment11;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Answer40 {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your word to reverse: ");
		String input = sc.next();
		StringBuilder sb = new StringBuilder(input);
		System.out.println(sb.reverse());
		}catch(InputMismatchException ie) {
			System.out.println("Pleae enter valid input!!!");
			
		}catch(Exception e) { 
			System.out.println(e);
		}
		
		

	}

}
