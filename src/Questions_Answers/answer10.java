/*
 * Write a Program for the following Mathematical Function.
a.s=ut+1/2*at^2
b. area=sqrt of s*(s-a)*(s-b)*(s-c)
c. x=(-b+sqrt of (b^2 -4ac))/2a
 * 
 */
package Questions_Answers;

import java.lang.Math;

import javax.swing.JOptionPane;

public class answer10 {

	public static void main(String[] args) {
		
	String [] choosen = new String [3];
	choosen[0]="Calculate Displacement";
	choosen[1]="Area of Triangle";
	choosen[2]="Quadratic Formula";
		String selected = String.valueOf(JOptionPane.showInputDialog(null, "Choose below formula", "calculation", JOptionPane.QUESTION_MESSAGE,null,choosen,"Calculate Displacement"));

		if (selected.equals(choosen[0])) {
			double value,u,time,acc;
			
			u= Double.parseDouble(JOptionPane.showInputDialog("Enter value of U: "));
			time= Double.parseDouble(JOptionPane.showInputDialog("Enter value of time: "));
			acc= Double.parseDouble(JOptionPane.showInputDialog("Enter value of acceleration: "));
			
			answer10 as = new answer10();
			
			value=as.calculateDisplacement(u,time,acc);
			
			JOptionPane.showMessageDialog(null, "Displacement value is: "+value);
			
		}
		if (selected.equals(choosen[1])) {
			double sidea,sideb,sidec;
			
			sidea= Double.parseDouble(JOptionPane.showInputDialog("Enter value of Side A: "));
			sideb= Double.parseDouble(JOptionPane.showInputDialog("Enter value of Side B: "));
			sidec= Double.parseDouble(JOptionPane.showInputDialog("Enter value of Side C: "));
			
			answer10 as2 = new answer10();
			
			double value=as2.calculateAreaofTriangle(sidea, sideb, sidec);
			
			JOptionPane.showMessageDialog(null, "Area of Triangle is: "+value);		
			
		}
		if (selected.equals(choosen[2])) {
			
			double a,b,c;
			
			a= Double.parseDouble(JOptionPane.showInputDialog("Enter value of A: "));
			b= Double.parseDouble(JOptionPane.showInputDialog("Enter value of B: "));
			c= Double.parseDouble(JOptionPane.showInputDialog("Enter value of C: "));
			
			if (b>= 4*a*c) {
			answer10 as3 = new answer10();
			
			double value=as3.calculateQuardant(a, b, c);
			
			String sValue = String.format("%.2f", value);
			
			JOptionPane.showMessageDialog(null, "Calculated Quardant value is: "+sValue);
			}else {
				JOptionPane.showMessageDialog(null, "Please enter value of B greater than 4*A*C");
			}
					
		}
	}
	
	double u,time,acc,a,b,c,s;

	public void setU(double u) {
		this.u = u;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public void setAcc(double acc) {
		this.acc = acc;
	}

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public void setS(double s) {
		this.s=s;
	}
	
	public double calculateDisplacement(double u,double time,double acc){
		
		double displacement = u*time+0.5*(acc*(time*time));
		return displacement;
	}
		
	public double calculateAreaofTriangle(double a, double b, double c) {
		double s = (a+b+c)/2;
		double areatriangle = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return areatriangle;
	}
	public double calculateQuardant(double a, double b, double c) {
				
		double quardant = (-b+(Math.sqrt(b-(4*a*c))))/(2*a);
				
		return quardant;
	}	
	
	
	
		
	}
	
	
	


