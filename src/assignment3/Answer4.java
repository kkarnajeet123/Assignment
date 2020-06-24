//Write a program to find sum and average of two numbers input by User (using Scanner class).
package assignment3;

import javax.swing.JOptionPane;

public class Answer4 {

	public static void main(String[] args) {

		double value1 = Double.parseDouble(JOptionPane.showInputDialog("Enter Your First Value: "));
		double value2 = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Second Value: "));
		
		double sum = value1+value2;
		JOptionPane.showMessageDialog(null, ("The sum of values is: "+ sum));
		JOptionPane.showMessageDialog(null, ("Your average is: "+sum/2));

	}

}
