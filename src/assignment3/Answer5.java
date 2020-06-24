//Write a program to calculate Simple Interest input by user. Simple Interest = P*T*R/100
package assignment3;

import javax.swing.JOptionPane;

public class Answer5 {

	public static void main(String[] args) {

		double p= Double.parseDouble(JOptionPane.showInputDialog("Enter your principle amount: ")); 
		//String validp=(p>0)? String.valueOf(p):"Enter your principal amount again";
		double t= Double.parseDouble(JOptionPane.showInputDialog("Enter your time: "));
		double r=Double.parseDouble(JOptionPane.showInputDialog("Enter your rate: "));
		
		double i = (p*t*r)/100;
		
		JOptionPane.showMessageDialog(null, "Your Interest Payment is: "+i+"$");

	}

}
