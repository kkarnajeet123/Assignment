//write a program to convert a celcius to farenhite and farenhite to celcius
package Questions_Answers;

import javax.swing.JOptionPane;

public class answer8 {

	public static void main(String[] args) {
		
		String choosen;
		
		String[] option = new String[2];
		option[0]="Celcius";
		option[1]="Fahrenheit ";
		
		choosen=String.valueOf(JOptionPane.showInputDialog(null, "Choose option to convert your value from", "Celcius-Ferenhite Converter", JOptionPane.QUESTION_MESSAGE,null,option,"Celcius"));
		
		if(choosen=="Fahrenheit ") {
			double value = Double.parseDouble(JOptionPane.showInputDialog("Enter Degree Fahrenheit: "));
			answer8 ac = new answer8();
			
			
			double celciusvalue=ac.convertcelcius(value);
			String strcelciusDouble = String.format("%.2f", celciusvalue);
			
			JOptionPane.showMessageDialog(null, "The fahrenheit value is: "+strcelciusDouble);
			
			//System.out.println("Converted to farenhite");
		
		}
		
		if(choosen=="Celcius") {
			double value = Double.parseDouble(JOptionPane.showInputDialog("Enter Degree Celcius: "));
			answer8 ac = new answer8();
			
			double fahrenheitvalue =ac.convertferenhite(value);
			
			String strfahrenheitDouble = String.format("%.2f", fahrenheitvalue);
			
			JOptionPane.showMessageDialog(null, "The Fahrenheit value is: "+strfahrenheitDouble);
		}
		
		
		
	}
	
	double celcius,fahrenheit ;


	public void setCelcius(double celcius) {
		this.celcius = celcius;
	}


	public void setFarenhite(double fahrenheit ) {
		this.fahrenheit  = fahrenheit;
	}
	
	
	public double convertferenhite(double celcius) {
		
		fahrenheit = (celcius*1.8)+32;
		return fahrenheit ;
	}
	
	public double convertcelcius(double fahrenheit ) {
		
		celcius= (fahrenheit-32)* 5/9;
		return celcius;
	}

}
