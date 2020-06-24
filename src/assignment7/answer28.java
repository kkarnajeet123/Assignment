/*Write a program in single class having the following functions.
isPrimenumber(int)
firstNthPrime(int )
allPrimebetween(int start , int  end)
*/
package assignment7;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class answer28 {

	
	public boolean isPrimenumber(int i) {
	//	isPrimenumber(int)
		
		boolean verdict = true;
		int temp;
		for (int l =2; l<=i/2; l++) {
			
			temp = i%2;
			
			if (temp==0) {
				
				verdict=false;
				break;
			}
		}
		
		return verdict;
		
	}
	
	public void firstNthPrime(int entervalue) {
		//firstNthPrime(int )

		  int num, count, j;
		    num=1;
		    count=0;
		 
		    while (count < entervalue){
		      num=num+1;
		      for ( j = 2; j <= num; j++){ //Here we will loop from 2 to num
		        if (num % j == 0) {
		          break;
		        }
		      }
		      if ( j == num){//if it is a prime number
		          count = count+1;
		      }
		    }
		   JOptionPane.showMessageDialog(null,"Value of nth prime: " + num);
	}
	
	public void allPrimeBetween(int start, int end) {
	//allPrimebetween(int start , int  end)
	int num=1,count=0,j,countprime=0;
	
	while (count<end) {
		num++;
		for(j= start; j<=end; j++) {
			if(num%2==0) {
				count++;
			}
		}
		
	}System.out.println(count);
	
	/*
	    while (count < end){
	      num=num+1;
	      for ( j = start; j <= num; j++){ //Here we will loop from 2 to num
	        if (num % j == 0) {
	        	countprime++;
	       //  break;
	        }
	      }
	      if ( j == num){//if it is a prime number
	          count = count+1;
	          break;
	      }
	    }
	   JOptionPane.showMessageDialog(null,"The number of prime numbers between "+start+" and "+end+" are " + countprime);
*/	
}

	
	public static void main(String[] args) {
		
		String[] option = new String[3];
		
		option[0]="Check Prime Number";
		option[1]="First Nth Prime Number";
		option[2]="Prime Number Between Start and End";
		
		String selection = String.valueOf(JOptionPane.showInputDialog(null, "Select Your Options", "Finding Prime Number", JOptionPane.QUESTION_MESSAGE,null,option,option[0]));
		
		if(selection.equals(option[0])) {
			
		
		answer28 as = new answer28();
		
		int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your number: "));
		
		boolean verdict = as.isPrimenumber(i);
		
		//isPrimenumber(int)
		if(verdict==true) {
			
			
			JOptionPane.showMessageDialog(null, "Your number is a prime number.");	
		}else {
			JOptionPane.showMessageDialog(null, "Your number is not a prime number.");
		}
		
	//firstNthPrime(int)
		}else if(selection.equals(option[1])) {
			
			answer28 as = new answer28();
			int i = Integer.parseInt(JOptionPane.showInputDialog("Enter your value","Enter your nth number"));
			
			 as.firstNthPrime(i);
			
			
			//allPrimebetween(int start , int  end)	
		}else if(selection.equals(option[2])) {
			
			int i = Integer.parseInt(JOptionPane.showInputDialog("Please enter your start number: "));
			int j = Integer.parseInt(JOptionPane.showInputDialog("Please enter your end number: "));
			
			answer28 as = new answer28();
			as.allPrimeBetween(i, j);
			
		}else {
			JOptionPane.showMessageDialog(null, "Pleae try again!!");
		}
		
		
		
	}

}
