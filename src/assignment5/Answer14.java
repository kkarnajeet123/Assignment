//Write a program to relate two integers entered by user using = =or > or < sign.
package assignment5;

import javax.swing.JOptionPane;

public class Answer14 {

	public static void main(String[] args) {
		
		double a = Integer.parseInt(JOptionPane.showInputDialog("Enter your first number: "));
		double b = Integer.parseInt(JOptionPane.showInputDialog("Enter your second number: "));
		
		String s1 = String.valueOf(a);
		String s2 = String.valueOf(b);
		if (s1!=null && s2!=null) {
		
		if(a>b) {
			
			JOptionPane.showMessageDialog(null,"A is greater than B");
			
		}else if(a<b) {
			JOptionPane.showMessageDialog(null,"B is greater than A");
		
		}else {
			JOptionPane.showMessageDialog(null,"A is equals to B");
				
		}

	}
	}

}

