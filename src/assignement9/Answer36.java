//Write a function to find duplicate elements in an array.
package assignement9;

import java.util.Arrays;
import java.util.Scanner;

public class Answer36 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your length of the array: ");
		int len = sc.nextInt();
		
		String [] name = new String[len];
		
		System.out.println("Enter your elements name: ");
		for(int i=0; i<name.length; i++) {
			
			name[i]=sc.next();
		}
		
		String duplicate=findingDuplicates(name);
		System.out.println("The duplicate element is: "+duplicate);
		}
			
	
	static String findingDuplicates(String [] arr) {
		String duplicate ="";
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i].equals(arr[j])) {
					
					duplicate=arr[i];
					//
				}
			}
			
		}
		
		return duplicate;
		
	}

}
