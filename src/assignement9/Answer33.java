//Write a Program to display number in ascending order in array.
package assignement9;

import java.util.Scanner;

public class Answer33 {

	
	public static void displayAscending(int ...arr) {
	
		for(int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}System.out.println(arr[i]);
		}
		
	}	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int num= sc.nextInt();
		
		int [] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println("Enter the number: ");
			arr[i]=sc.nextInt();
		}
		
		Answer33.displayAscending(arr);
		sc.close();
	}

}
