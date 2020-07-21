
package assignment2;

import java.util.Scanner;

public class Answer5 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Principle:");
		double P= sc.nextDouble();
		//double Interest = Integer.to
		System.out.println("Time:");
		double T= sc.nextDouble();
		System.out.println("Rate:");
		double R= sc.nextDouble();
				
		double I=(P*T*R)/100;
		
	//	int Interest= I;
		
		sc.close();

		System.out.println("Interest:"+I);
			
		
	
	}

}
