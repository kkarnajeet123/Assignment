//Write a program to calculate Simple Interest input by user. Simple Interest = P*T*R/100
package Questions_Answers;

import javax.swing.JOptionPane;

public class answer4 {

	public static void main(String[] args) {
				
		double p = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your prinicipal amount: "));
		double t = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your time: "));
		double r = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your rate: "));
	
		JOptionPane.showMessageDialog(null,"Your Interest is: "+(p*t*r)/100);
		
	}

}
