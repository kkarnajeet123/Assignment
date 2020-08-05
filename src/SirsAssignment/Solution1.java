//
package SirsAssignment;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		List<String> list1 = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		String decision ="";
		try {
		do {
			
		System.out.println("Enter your words: ");
		String 	input=sc.next();
		list.add(input);
		StringBuilder sb = new StringBuilder(input);
		String rev=sb.reverse().toString();
		String retresult=isPalindrome(input, rev);
		
		list1.add(retresult);
			
			System.out.println("Do you want to add more? ");
			decision =sc.next().toLowerCase();
		}while(decision.equals("y"));
		System.out.println("Original List:");
		System.out.println(list);
		System.out.println("=================");
		System.out.println("Palindrome List: ");
		System.out.println(list1);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			sc.close();
		}
	}
	
	public static String isPalindrome(String s1, String s2) {
		String palindrome="";
		
		if(s1.equals(s2)) {
			palindrome=s2;
		}
		
		return palindrome;
		
	}
	

	
	
}