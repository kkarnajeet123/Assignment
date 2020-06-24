//Write a Program to accept three sides of triangle and display which kind of triangle is formed.
package assignment5;

import javax.swing.JOptionPane;

public class Answer19 {

	public static void main(String[] args) {
		int side1=Integer.parseInt(JOptionPane.showInputDialog("Enter the side1 length: "));
		int side2=Integer.parseInt(JOptionPane.showInputDialog("Enter the side2 length: "));
		int side3=Integer.parseInt(JOptionPane.showInputDialog("Enter the side3 length: "));
		
		if(side1 > side2 && side1>side3) {
			
			if((side2*side2 + side3*side3) > side1*side1) {
				
				System.out.println("It is an Acute Angle");
						
			}else if ((side2*side2 + side3*side3)== side1*side1) {
				
				System.out.println("It is an Rectangle");
				
			}else {
				
				System.out.println("It is an Obtuse Angle");
			}
		}else if(side2 > side1 && side2>side3) {
			
			if((side1*side1 + side3*side3) > side2*side2) {
				
				System.out.println("It is an Acute Angle");
						
			}else if ((side1*side1 + side3*side3)== side2*side2) {
				
				System.out.println("It is an Rectangle");
				
			}else {
				
				System.out.println("It is an Obtuse Angle");
			
			}
				
				
			}else {
				
				if((side1*side1 + side2*side2) > side3*side3) {
					
					System.out.println("It is an Acute Angle");
							
				}else if ((side1*side1 + side2*side2)== side3*side3) {
					
					System.out.println("It is an Rectangle");
					
				}else {
					
					System.out.println("It is an Obtuse Angle");
			
			
			}
	

	}
}
}
/*
1) Square all 3 sides.

2) Sum the squares of the 2 shortest sides.

3) Compare this sum to the square of the 3rd side.

if sum > 3rd side²   Acute Triangle

if sum = 3rd side²   Right Triangle

if sum < 3rd side²   Obtuse Triangle
*/