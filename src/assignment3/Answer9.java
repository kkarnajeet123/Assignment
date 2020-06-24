//Write a program that converts pounds into kg. The program prompts the user to enter
//number of pounds, converts it to kg and displays the result [1 pound is 0.454 kg].
package assignment3;

import javax.swing.JOptionPane;

public class Answer9 {

	public static void main(String[] args) {
		
		String[] option = new String[2];
		option[0]="Convert to pounds";
		option[1]="Convert to kg";
		
	
		
		String select = String.valueOf(JOptionPane.showInputDialog(null, "Please select from below", "Weight Conversion", JOptionPane.OK_CANCEL_OPTION, null, option, "Convert to pounds"));
					
		if (select.equals(option[0])) {
			
			double poundvalue = Double.parseDouble(JOptionPane.showInputDialog("Please enter weight in kg: "));
			
			double weightinkg = poundvalue/0.454;
			
			String strweightkg = String.format("%.2f", weightinkg);
			
			JOptionPane.showMessageDialog(null, "Your weight in pound is: "+ strweightkg);
		}
		
		if (select.equals(option[1])) {
			
			double kgvalue = Double.parseDouble(JOptionPane.showInputDialog("Please enter weight in pound: "));
			
			double weightinpound = kgvalue*0.454;
			
			String strweightpound = String.format("%.2f", weightinpound);
			JOptionPane.showMessageDialog(null, "Your weight in kilos is: "+ strweightpound);
		}
		
		
	}
	
	

}
