//Write a program to accept the roll, name, and nationality of the person and display those values in good format way.

package assignment4;

import javax.swing.JOptionPane;

public class Answer12 {

	public static void main(String[] args) {
		
		String name = String.valueOf(JOptionPane.showInputDialog("Enter your name: ")).toUpperCase();
		int roll = Integer.parseInt(JOptionPane.showInputDialog("Enter your roll number"));
		String nationality = String.valueOf(JOptionPane.showInputDialog("End your nationality: ")).toUpperCase();
		
		
		JOptionPane.showMessageDialog(null, "Hi "+name+"!!\n"+"You are from "+nationality+".\n"+"and your roll number is: "+roll+".");
		
				

	}

}
