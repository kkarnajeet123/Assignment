//Write a program that receives an ASCII code (between 0 – 128) and display its character [example: 97 (input) ->a(output)].

package assignment5;

import javax.swing.JOptionPane;

public class Answer15 {

	public static void main(String[] args) {
		
		
		int asciicode = Integer.parseInt(JOptionPane.showInputDialog("Enter the number to convert in ASCII" ));
		
		char ascii = (char)asciicode;
		
		JOptionPane.showMessageDialog(null,"Your ASCII character is "+"'"+ascii+"'"+".");

	}

}
