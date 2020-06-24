//Write the program that read the radius and length of the cylinder and computes volume 
package Questions_Answers;

import javax.swing.JOptionPane;


public class answer7 {

	public static void main(String[] args) {
		double radius,height, volume;
		
		radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius: "));
		height = Double.parseDouble(JOptionPane.showInputDialog("Enter height: "));
		
		answer7 as = new answer7();
		
		volume=as.calculateCylinder(radius, height);
		
		//System.out.println("The volume of the cylinder with radius: "+radius+ "and "+"height: "+height+" is: "+volume);
		
		JOptionPane.showMessageDialog(null, "The volume of the cylinder with radius: "+radius+ " and "+"height: "+height+" is: "+volume);

	}
	
	double radius,height, volume;
	
	public void getradius(double radius) {
		this.radius=radius;
	}
	public void getheight(double height) {
		this.height=height;
	}
	
	public double calculateCylinder(double radius, double height) {
		
		 double calculateCylinder = Math.PI*radius*radius*height;
		 return calculateCylinder;
	}

}
