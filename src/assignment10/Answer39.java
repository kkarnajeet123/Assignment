//Write a Program to display name in short form. E.g. Ram Kishore Singh  -> R. k. Singh
//Write a program to reverse the string.
package assignment10;

import java.util.Arrays;
import java.util.Scanner;

public class Answer39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String firstname = sc.next().toUpperCase();
		System.out.println("Enter your middle name: 'if no middle name then please write NA");
		String middlename = sc.next().toUpperCase();
		System.out.println("Enter your lastname name: ");
		String lastname=sc.next();
		
		char [] ch1 = firstname.toCharArray();
		char [] ch2 = middlename.toCharArray();
		if(!middlename.isEmpty()) {
			if(middlename.equals("NA")) {
				System.out.println(ch1[0]+". "+lastname);
			}else {
				System.out.println(ch1[0]+"."+ch2[0]+"."+lastname);
			}
				
		}
		
		System.out.println(ch1[0]);
		System.out.println(ch2[0]);
		
	}

}
