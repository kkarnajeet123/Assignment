//Write a program to calculate leap year.
package assignment5;

import javax.swing.JOptionPane;

public class Rnswer17 {

	public static void main(String[] args) {
		
		int enteryear = Integer.parseInt(JOptionPane.showInputDialog("Enter your year: "));
		
		if(enteryear%4==0) {
			
			JOptionPane.showMessageDialog(null, "The input year is a Leap Year");
		}else {
			
			JOptionPane.showMessageDialog(null, "The input year is not a Leap Year");
		}

	}

}
