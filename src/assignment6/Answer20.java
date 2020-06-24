//Write a program to create the equivalent of a four-function calculator. 
//The program to enter two integer’s numbers and an operator. 
//It then carries out the specified arithmetic operator operation: addition, subtraction, multiplication or division of the two numbers. 
//Finally, it displays the result.

package assignment6;

import javax.swing.JOptionPane;

public class Answer20 {

	public static void main(String[] args) {
		
		String[] option = new String[4];
		option[0]="Add";
		option[1]="Substract";
		option[2]="Multiply";
		option[3]="Divide";
		
		String selection= String.valueOf(JOptionPane.showInputDialog(null, "Enter your selection from below", "Mathmatical Calculation", JOptionPane.QUESTION_MESSAGE,null,option,"Add"));
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your first number: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your second number: "));
		
		switch (selection) {
		
		case "Add":
			int sum = num1+num2;
			JOptionPane.showMessageDialog(null, "Your sum is: "+sum);
		break;
		
		case "Substract":
			int diff= num1-num2;
			JOptionPane.showMessageDialog(null,"Your difference is: "+diff);
		break;
		case "Multiply":
			int multi= num1*num2;
			JOptionPane.showMessageDialog(null,"Your multiplication is: "+multi);
		break;
		
		case "Divide":
			int div= num1/num2;
			JOptionPane.showMessageDialog(null,"Your divisioin is: "+div);
		break;
			
		}
		JOptionPane.showMessageDialog(null,"Thank you for using this application!!");
		

	}

}
