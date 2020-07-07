package assignement9;

import java.util.Scanner;

public class practice {

	public  int[] getNumber(Scanner sc) {
		
		System.out.println("Enter the lenght of the array: ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
				
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter your number: ");
			arr[i]=sc.nextInt();
		}
		return arr;
		
	}
	
	public void displayArray(int[] arr) {
		
		//practice as = new practice();
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		practice as = new practice();
		
		int [] ar = as.getNumber(sc);
		as.displayArray(ar);
		//System.out.println(ar);
		
		
	}

}
