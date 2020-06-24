//Write a Program for the following Mathematical Function.

package assignment4;

import javax.swing.JOptionPane;

public class Answer10 {

	public static void main(String[] args) {
		
		String[] option = new String[3];
		option[0]="Calculate Displacement";
		option[1]="Calculate area of triangle";
		option[2]="Calculate quadratic equation";
		//object ko value string ma rakhe pachi string lai directly null sanga compare garna milcha haina?
		
		String selection = String.valueOf(JOptionPane.showInputDialog(null, "Select from below option", "Math Calculation", JOptionPane.QUESTION_MESSAGE,null,option,option[0]));
		
		//int i = (Integer)JOptionPane.showInputDialog(null, "Select from below option", "Math Calculation", JOptionPane.QUESTION_MESSAGE,null,option,option[0]);
		
		//if (i!=null) {
			
		if (selection != null) {
			
			
		if (selection.equals(option[0])) {
		double distance,time ,accelaration;
		
		String s = JOptionPane.showInputDialog("Please enter distance : ");
		String s1=JOptionPane.showInputDialog("Please enter time: ");
		String s2= JOptionPane.showInputDialog("Please enter acceleration: ");
		
		if (s!=null && s1!=null && s2!=null) {
		distance = Double.parseDouble(s);
		time = Double.parseDouble(s1);
		accelaration = Double.parseDouble(s2);
		
		double calculatedisplacement = (distance*time)+(0.5*accelaration*time*time);
		String strdispl	= String.format("%.2f", calculatedisplacement);
		JOptionPane.showMessageDialog(null, "The displacement is: "+ strdispl);
		}else {
			System.out.println("You entered the wrong value");
		}
		}
		if (selection.equals(option[1])) {
		
			double side1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter side1 : "));
			double side2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter side2: "));
			double side3 = Double.parseDouble(JOptionPane.showInputDialog("Please enter side3: "));
			
			if(side1>side2 && side1>side3 && side2>side3) {
			double perimeter = (side1+side2+side3)/2;
			double calculatedareaoftriangle = Math.sqrt((perimeter*(perimeter-side1)*(perimeter-side2)*(perimeter-side3)));
			String strarea= String.format("%.2f", calculatedareaoftriangle);
			JOptionPane.showMessageDialog(null, "The area of triangle is: "+ strarea);
			}else {
				JOptionPane.showMessageDialog(null, "Pleaese enter side1 and side 2 value more than side 3");
			}
		}
		if (selection.equals(option[2])) {
			
			double a = Double.parseDouble(JOptionPane.showInputDialog("Please enter a : "));
			double b = Double.parseDouble(JOptionPane.showInputDialog("Please enter b: "));
			double c = Double.parseDouble(JOptionPane.showInputDialog("Please enter c: "));
			double quadraticequation1 = Math.sqrt(b*b-(4*a*c));
			if (quadraticequation1>=0) {
			double calculatequadratic = (-b+quadraticequation1)/2*a;
			String strarea= String.format("%.2f", calculatequadratic);
			JOptionPane.showMessageDialog(null, "The value of quadratic equation is: "+ strarea);
			}else if (quadraticequation1<0) {
				JOptionPane.showMessageDialog(null, "Please enter the value of a and c more than b");
				
			}
		}
		}else {
			JOptionPane.showMessageDialog(null, "Please try again!!");
		}
	}

}
