//Write a program that read the radius and length of a cylinder and computes volume.
package assignment3;

import javax.swing.JOptionPane;

public class Answer7 {

	public static void main(String[] args) {
		String radius = JOptionPane.showInputDialog("Enter the value of radius: ");
		String height = JOptionPane.showInputDialog("Enter the value of height: ");
		if(radius != null && height != null) {
			double r = Double.parseDouble(radius);
			double h = Double.parseDouble(height);
		
			double volumeofcylinder = 3.14*r*r*h;
			
			JOptionPane.showMessageDialog(null, "The volume of cylinder with radius"+r+" and height"+h+" is: "+volumeofcylinder);
		}else {
			System.out.println("you have canclled.");
		}
		
		
	}

}
