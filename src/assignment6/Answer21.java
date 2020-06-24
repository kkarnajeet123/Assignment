//Program to input the number of (1...7) and translate to its equivalent name of the day of
//the week.
package assignment6;

import javax.swing.JOptionPane;

public class Answer21 {

	public static void main(String[] args) {
		

		String selec = String.valueOf(JOptionPane.showInputDialog("Enter your selection from 1 to 7"));
		
		int days = Integer.parseInt(selec);
		
		switch (days) {
		
		case 1:
			
			JOptionPane.showMessageDialog(null, "It's Sunday!!");
		break;
		
		case 2:
			
			JOptionPane.showMessageDialog(null, "It's Monday!!");
		break;
		
		case 3:
	
			JOptionPane.showMessageDialog(null, "It's Tuesday!!");
		break;

		case 4:
	
			JOptionPane.showMessageDialog(null, "It's Wednesday!!");
		break;

		case 5:
	
			JOptionPane.showMessageDialog(null, "It's Thursday!!");
		break;

		case 6:
	
			JOptionPane.showMessageDialog(null, "It's Friday!!");
		break;

		case 7:
	
			JOptionPane.showMessageDialog(null, "It's Saturday!!");
		break;

	//	String repeat= String.valueOf(JOptionPane.showInternalConfirmDialog(null, "Whats today?", "Guess your day", JOptionPane.OK_OPTION));

		}
		
		JOptionPane.showMessageDialog(null, "Thank you for using this app!!"); 
	}

}
