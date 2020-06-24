//Write a program to find the area of circle, rectangle, and triangle.
package assignment3;

import javax.swing.JOptionPane;

public class Answer6 {

	public static void main(String[] args) {
		
		String [] option = new String[3];
		option[0]= "Area of Circle";
		option[1]="Area of Rectangle";
		option[2]= "Area of Triangle";
		
		String selection = String.valueOf(JOptionPane.showInputDialog(null, "Select the option from below: ", "Calculate the Areas", JOptionPane.QUESTION_MESSAGE,null,option, "Area of Circle"));
		
		if (selection.contains("Area of Circle")) {
		double r = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius: "));
		double areaofcircle = 3.14*r*r;
		JOptionPane.showMessageDialog(null, "Your Area of Circle with the radius "+r+" is: "+areaofcircle );
		
		}
		else if (selection.equals("Area of Rectangle")) {
			double w = Double.parseDouble(JOptionPane.showInputDialog("Enter the width: "));
			double l = Double.parseDouble(JOptionPane.showInputDialog("Enter the lenght: "));
			double areaofrectangle = w*l;
			JOptionPane.showMessageDialog(null, "Your Area of Rectangle with the width "+w+" and the "+"length "+l+" is: "+areaofrectangle );
		}	
		else if (selection.equals("Area of Triangle")) {
				double b = Double.parseDouble(JOptionPane.showInputDialog("Enter the base: "));
				double h = Double.parseDouble(JOptionPane.showInputDialog("Enter the height: "));
				double areaoftriangle = (b*h)/2;
				JOptionPane.showMessageDialog(null, "Your Area of Triangle with the base "+b+" and the "+"height"+h+" is: "+areaoftriangle );
			}
		else {
			System.out.println("you have cancelled.");
		}
			
				
	
		}

	}

