//Write a program to find the given number is even or odd.
package assignment5;

import javax.swing.JOptionPane;

public class Answer16 {

	public static void main(String[] args) {
		
		double input = Double.parseDouble(JOptionPane.showInputDialog("Enter your number: "));

		if(input%2==0) {
			JOptionPane.showMessageDialog(null,"Your input value "+input+" is even.");
			
		}else {
			JOptionPane.showMessageDialog(null,"Your input value "+input+" is odd.");
		}
	}

}
