//Write a program to swap two numbers
//a) using temp variable
//b) without temp variable

package assignment4;

import javax.swing.JOptionPane;

public class Answer11 {

	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("Enter your first number: "));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Enter your second number: "));
		
		double c = a;
		 a=b;
		 b=c;
		//double z=x;
		
		System.out.println("Your first number has been changed from "+b+" to "+a);
		System.out.println("and your second number has been changed from "+a+" to "+c);
	}

}
