//Write a program to find the duplicate letter in a word.
package assignment11;

import java.util.Scanner;

public class Answer41 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your word to check duplicate letter: ");
		String inputvalue = sc.next().toUpperCase();
		
		
		char [] ch = inputvalue.toCharArray();
		
		System.out.println("Your duplicate letter is: ");
		for (int i = 0; i < ch.length; i++) {
		for (int j = i+1; j < ch.length; j++) {
			if(ch[i]==ch[j]) {
				 
				System.out.print(ch[j]+ " " );
			
		}
			
			
		}
		
		}
		
	}

}
