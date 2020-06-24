package Questions_Answers;

import javax.swing.JOptionPane;

public class answer5 {

	public static void main(String[] args) {
			
	String[] Option = new String[3];
	Option[0]="Circle";
	Option[1]="Rectangle";
	Option[2]="Triangle";
	
	String selection=String.valueOf(JOptionPane.showInputDialog(null, "Choose Your Selection: ", "Option", JOptionPane.QUESTION_MESSAGE, null,Option,"Circle"));
	//System.out.println("Selection Option is "+selection);	
	
	if (selection=="Circle") {
		/*
			Answer5 my_circle = new Answer5();
		
			double areaofcircle_1=my_circle.
			mycircle(JOptionPane.showMessageDialog(null, "The Area of Circle with radius "+r+"is: "+AreaofCircle));
		 */	
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
		
		double AreaofCircle=3.1415*r*r;
		
		//return AreaofCircle;
				
		JOptionPane.showMessageDialog(null, "The Area of Circle with radius "+r+"is: "+AreaofCircle);
			
	}
		
	public static void myRectangle() {
		
		double l = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the value of length:"));
		double w = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the value of weidth:"));
		
		double AreaofRectangle = l*w;
		
		//return AreaofRectangle;
		
		JOptionPane.showMessageDialog(null, "The Area of Rectangle with length "+l+" and "+"width"+w+"is: "+AreaofRectangle);
			
	}
	
	public static void mytriangle() {
		
		double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the value of base:"));
		double h = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the value of height:"));
		
		double AreaofTriangle = (b*h)/2;
		
		JOptionPane.showMessageDialog(null, "The Area of Triangle with base "+b+" and " +"height"+h+" is: "+AreaofTriangle);
		
	}
	

}

