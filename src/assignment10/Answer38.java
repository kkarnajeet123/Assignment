//Write a program to check whether given string is palindrome or not.
package assignment10;

import java.util.Arrays;
import java.util.Scanner;

public class Answer38 {
	
	public static void checkPalindrome(String a) {
		
		
		char [] ch = a.toCharArray();
		int len = ch.length;
		
		char [] orig = Arrays.copyOf(ch, ch.length);
		for(int i=0; i<len/2; i++) {
			
			char temp=ch[i];
			
			ch[i]=ch[len-i-1];
			ch[len-i-1]=temp;	
		}
		
		System.out.println("Original Arrays "+Arrays.toString(orig));
		System.out.println("Pelindrone Arrays "+Arrays.toString(ch));
		
		System.out.println("=========================================");
		
		if(Arrays.equals(ch, orig)) {
			System.out.println("That is Pelindrome!!");
		}else {
			System.out.println("That is not Pelindrome!!");
		}
		
		//boolean verdict=false;
		/*
		
		char [] ch = new char[len];
		String [] st = new String[len];
		//char ab;
		for(int i=0; i<len; i++) {
			
			System.out.print(ch[i]);
			System.out.println(st[i]);
		}System.out.println();
		
		
		//return verdict;
		*/
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your word: ");
		
		String element = sc.next().toUpperCase();
		
		checkPalindrome(element);
		

	}

}
