//Write a program to check whether a given string is palindrome or not.
package assignment11;

import java.util.Scanner;

public class Answer38 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your word: ");
		String enteredWord =sc.next();
		System.out.println();
		
		char [] ch = enteredWord.toCharArray();
		
		for (int i = 0; i < ch.length/2; i++) {
			
			char temp=ch[i];
			
			ch[i]=ch[ch.length-i-1];
			ch[ch.length-i-1]=temp;	
		}
		String s ="";
		for (int i = 0; i < ch.length/2; i++) {
			 s = String.valueOf(ch).toUpperCase();
		}
		System.out.println("Your reverse word is: " +s);
	}

}
