//Write a program that converts pounds into kg. The program prompts the user to enter
//number of pounds, converts it to kg and displays the result [1 pound is 0.454 kg].
package Questions_Answers;

import javax.swing.JOptionPane;
public class answer9 {

	public static void main(String[] args) {
		String[] selec = new String[2];
		selec[0]="ConvertFromKg";
		selec[1]="ConvertFromPound";
		
	String selected = String.valueOf(JOptionPane.showInputDialog(null, "Enter your weight", "Kg-Pound Converter", JOptionPane.QUESTION_MESSAGE,null,selec,"Kg"));
	double inputvalue = Double.parseDouble(JOptionPane.showInputDialog("Enter the weight"));
	if (selected.equals(selec[0])) {
		
		answer9 as =new answer9(inputvalue);
		double valuepound=as.convertedtopound(inputvalue);
		String finalvalue= String.format("%.2f", valuepound);
		JOptionPane.showMessageDialog(null, "Your weight in pound is: "+finalvalue);
		
	}
	
    if (selected.equals(selec[1])) {
    	answer9 as =new answer9(inputvalue);
    	double valuekg=as.convertedtokg(inputvalue);
    	String finalvalue = String.format("%.2f", valuekg);
    	JOptionPane.showMessageDialog(null, "Your weight in Kg is: "+finalvalue);
		
	}
		
		
	}
	
	double kg,pound,value;

	public answer9(double value) {
		super();
		this.value = value;
		
	}

	public void setKg(double kg) {
		this.kg = kg;
	}

	public void setPound(double pound) {
		this.pound = pound;
	}
	
	public double convertedtopound(double kg) {
		
		double convertedtopound=kg/0.454;
		
		return convertedtopound;
	}
	
	public double convertedtokg(double pound) {
		
		double convertedtokg =pound*0.454;
		return convertedtokg;
		
	}
	
	
	
	
	

}
