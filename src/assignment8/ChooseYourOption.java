package assignment8;

import javax.swing.JOptionPane;

public class ChooseYourOption {

	public static void main(String[] args) {
	
		
		String[] option = new String[5];
		option[0]= "Multiplication Table";
		option[1]= "Prime Number";
		option[2]= "Factorial";
		option[3]= "Reverse";
		option[4]= "firstNthPrime";
		
		int  decision=0;
		do {
		
		String selection = String.valueOf(JOptionPane.showInputDialog(null, "Choose your options!!", "Mathematics Calculation Mart!!", JOptionPane.QUESTION_MESSAGE, null, option, option[0]));
		
			
		
		CalculationsMethods calmth = new CalculationsMethods();
		
	
		
		switch (selection) {
		case ("Multiplication Table"):
			
			int num= Integer.parseInt(JOptionPane.showInputDialog("Enter your number to get multiplication table: "));
		
			calmth.MultiplicationTable(num);
			
			break;
			
		
		case ("Prime Number"):
			
			 num= Integer.parseInt(JOptionPane.showInputDialog("Enter your number to check prime or not: "));
		
			boolean verdict = calmth.isPrime(num);
			
			if(verdict==true) {
			JOptionPane.showMessageDialog(null, "Your number is not a prime number");
			}else {
			JOptionPane.showMessageDialog(null, "Your number is a prime number");
			}
			
			break;
			
		case ("Factorial"):
			
			 num= Integer.parseInt(JOptionPane.showInputDialog("Enter your number to get factorial: "));
			
			int calculation=calmth.showFactorial(num);
			
			JOptionPane.showMessageDialog(null, "The factorial of your number "+num+" is: "+calculation);
			
			break;
		
		case ("Reverse"):
	
			 num= Integer.parseInt(JOptionPane.showInputDialog("Enter your number to get reverse number: "));
			String value= String.valueOf(num);
			
			String reverse = calmth.showReverse(value);
			
			JOptionPane.showMessageDialog(null, "Your reverse value is: "+reverse);
			
			break;

		case ("firstNthPrime"):
	
			num= Integer.parseInt(JOptionPane.showInputDialog("Enter your number to get Nth prime: "));
			
			int value1= calmth.showNthPrime(num);
			
			JOptionPane.showMessageDialog(null, "Your Nth Prime number is: "+value1);
			break;
		
		default:
			  JOptionPane.showMessageDialog(null, "Invalid Input!! Please try again!!");
			break;
		}
		decision = JOptionPane.showConfirmDialog(null, "Would you like to try again?", "", JOptionPane.YES_NO_CANCEL_OPTION);
	}while (decision==0);
	
		
		if(decision==1) {
			
			JOptionPane.showMessageDialog(null,"Thank you for using it. Have a good day!!");
		}else if(decision==2) {
			
			JOptionPane.showMessageDialog(null,"You just cancelled me!! Oucchhh..");
		}
		
	}
}



