/*
 * Write a program to swap two numbers
a) using temp variable
b) without temp variable

 */
package Questions_Answers;

import javax.swing.JOptionPane;

public class answer11 {

	public static void main(String[] args) {
	
		double a,b,c;
		
		a= Double.parseDouble(JOptionPane.showInputDialog("Enter Your First Number: "));
		b= Double.parseDouble(JOptionPane.showInputDialog("Enter Your Second Number: "));
		
		c=a;
		a=b;
		b=c;
		
		System.out.println(a);
		System.out.println(b);
			
		
		

	}

}
