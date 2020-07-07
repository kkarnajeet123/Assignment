//Write a function to find second largest number in given array.
package assignement9;

import java.util.Scanner;

public class Answer35 {
	
	public static int secondHighestNumber(int...arr ) {
		int first=arr[0], second=arr[0];
		for(int i =0; i<arr.length; i++) {
			if(arr[i]>first) {
				second=first;
				first=arr[i];
			}else if (arr[i]>second){
				 
				second=arr[i];
			}
		}
		return second;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int len = sc.nextInt();
		int [] num = new int[len];
		for(int i=0; i<num.length; i++) {
			System.out.println("Enter your number: ");
			num[i]=sc.nextInt();
		}
		sc.close();
		int secondHighest =secondHighestNumber(num);
		System.out.println("Your second highest number is: "+secondHighest);
		

	}

}
