//Write a Program to sum 1 to nth natural numbers.
package assignment7;

import javax.swing.JOptionPane;

public class Answer23 {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter your number for sum"));
		int sum=0;
		for (int i=1; i<=num;i++) {
			sum++;
			
		}
		System.out.println(sum);
			
			

	}

}
