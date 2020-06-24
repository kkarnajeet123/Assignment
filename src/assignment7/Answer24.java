//Write a program to print the factorial number of given numbers.
package assignment7;

import javax.swing.JOptionPane;

public class Answer24 {

	public static void main(String[] args) {
	
		
		String a = JOptionPane.showInputDialog("Enter your first number: ");
		int b=Integer.parseInt(a);
		int factorial=1;
		
		for(int i=1; i<=b; i++) {
		
			factorial=factorial*i;
			
			
		}
		System.out.println(factorial);
		
		
		
		
	}

}
