//Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.
package assignment3;

import javax.swing.JOptionPane;

public class Answer8 {

	public static void main(String[] args) {
		
		String[] option = new String[2];
		option[0] = "Convert To Celcius";
		option[1] = "Convert To Fahrenheit";

		String selection = String.valueOf(JOptionPane.showInputDialog(null, "Select from below", "Temperature Converter", JOptionPane.QUESTION_MESSAGE,null,option,"Convert To Celcius"));
		
		if (selection=="Convert To Celcius") {
			
			double temp = Double.parseDouble(JOptionPane.showInputDialog("Pleae enter the farenheit temperature: "));
			
			double converttocel = (temp -32)* 5/9;
			
			String strcel = String.format("%.2f", converttocel);
			
			JOptionPane.showMessageDialog(null, "The celcius temperarture is "+strcel+" C");
			
		}
		
		if (selection=="Convert To Fahrenheit") {
			
			double temp = Double.parseDouble(JOptionPane.showInputDialog("Please enter the celcius temperature: "));
			
			double converttofahr = (temp * 9/5) + 32 ;
			
			String strfahr = String.format("%.2f", converttofahr);
			
			JOptionPane.showMessageDialog(null, "The fahrenheit temperarture is "+strfahr+" F");
		
		}
	}

}
