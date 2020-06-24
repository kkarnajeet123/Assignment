//Write a program to find the perimeter of circle, triangle, and rectangle.
package Questions_Answers;

import javax.swing.JOptionPane;

public class answer6 {

	public static void main(String[] args) {
		
	String[] Option = new String[3];
	Option[0]="Circle";
	Option[1]="Rectangle";
	Option[2]="Triangle";
	
	String selection=String.valueOf(JOptionPane.showInputDialog(null, "Choose Your Selection: ", "Option", JOptionPane.QUESTION_MESSAGE, null,Option,"Circle"));
	//System.out.println("Selection Option is "+selection);	
	
	if (selection=="Circle") {
		
		mycircle();
		
	}
	
	if (selection=="Rectangle") {
		myRectangle();
		
	}
	if (selection=="Triangle") {
		mytriangle();
	}

	
	}
	public static void mycircle () {
		
		double r = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the value of radius: "));
		
		double PerimeterofCircle=3.1415*r*2;
		
		JOptionPane.showMessageDialog(null, "The Perimeter of Circle with radius: "+r+"is: "+PerimeterofCircle);
			
	}
		
	public static void myRectangle() {
		
		double l = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the value of length:"));
		double w = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the value of weidth:"));
		
		double PerimeterofRectangle = (l*w)*2;
		
		JOptionPane.showMessageDialog(null, "The Perimeter of Rectangle with length: "+l+" and "+"width: "+w+" is: "+PerimeterofRectangle);
			
	}
	
	public static void mytriangle() {
		
		double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the value of 1st Side:"));
		double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the value of 2nd Side:"));
		double c = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the value of 3rd Side:"));
		
		double PerimeterofTriangle = a+b+c;
		
		JOptionPane.showMessageDialog(null, "The Perimeter of Triangle with side1: "+a+"," +"side2: "+b+" and " +"side3: "+c+" is: "+PerimeterofTriangle);
		
	}
	

}

