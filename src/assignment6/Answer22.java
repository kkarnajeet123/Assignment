//Write a program to print the table of given number.
package assignment6;

import javax.swing.JOptionPane;

public class Answer22 {

	public static void main(String[] args) {
		
		int number = Integer.parseInt(JOptionPane.showInputDialog("Enter your number for multiplication table"));
		System.out.println("-----------------");
		for (int i=1; i<=10; i++) {
			
			System.out.println("|"+number+" X "+i+" = "+(number*i)+"  |");
			
		}
		System.out.println("-----------------");

	}

}
