//Write a program to print the number entered by user only if the number entered is negative.
package assignment5;

import javax.swing.JOptionPane;

public class Answer13 {

	public static void main(String[] args) {
		
		double entervalue = Double.parseDouble(JOptionPane.showInputDialog("Enter your number: ")) ;
		
		while (entervalue>0) {
			
			JOptionPane.showMessageDialog(null, "Pleae enter negative values");
			double entervalue1 = Double.parseDouble(JOptionPane.showInputDialog("Enter your number: ")) ;
					
			if (entervalue1<0) {
				
				JOptionPane.showMessageDialog(null, "Your random value is " + entervalue1);
				
				break;
				}
							
			}
		
	
	}

}
