//Write a program to display largest number from given three values.
package assignment5;

import javax.swing.JOptionPane;

public class Answer18 {

	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("Enter your first value: "));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Enter your second value: "));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Enter your third value: "));
		
		if (a>b && a>c) {
			
			JOptionPane.showMessageDialog(null,"Your first value is bigger than rest of your inputs.");
		}
		else if (b>a && b>c) {
			
			JOptionPane.showMessageDialog(null,"Your second value is bigger than rest of your inputs.");
		}else {
			JOptionPane.showMessageDialog(null,"Your third value is bigger than rest of your inputs.");
		}
		

	}

}
