package Lab1Project;

//import java.util.Scanner;

import javax.swing.JOptionPane;

//import java.util.Scanner;

public class DisplayAccountInformation  {
	
	public static void openAccount(Account ac) {
		ac.openAccount();
	};
	
	
	public static void main(String[] args) {
		
		Object [] option0 = new Object[] {"Regular Customer".toUpperCase(),"New Customer".toUpperCase() ,"Quit".toUpperCase()};
		
		
		int decision0=JOptionPane.showOptionDialog(null, "Please Check The Option Below", 
				"Welcome to ABC Bank", JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,null,option0,null);
		
		if(decision0 ==0) {
			System.out.println("You press Regular Customer");
			
		}else if(decision0==1) {
			System.out.println("You press New Customer");
		}else {
			System.out.println("You press Quit");
		}
		
		
		
		//=========================================================================================
		int result1;
		do {
		String [] decision = new String[] {"Create Account".toUpperCase(), "Deposit".toUpperCase(),"Withdraw".toUpperCase()};
		String selection =String.valueOf(JOptionPane.showInputDialog(null, "Please select the option below: ", 
				"Welcome to ABC Bank", JOptionPane.QUESTION_MESSAGE,null, decision,decision[0]));
		
		int result;
		String[] option = new String[] {"Current Account".toUpperCase(), "Saving Account".toUpperCase()};
		
		
		
		if(selection.toLowerCase().equals("create account")) {
		
		do {
		
			String input =String.valueOf(JOptionPane.showInputDialog(null, 
					"Please select the option below: ", "Welcome to ABC Bank", JOptionPane.QUESTION_MESSAGE,null, 
					option,option[0]));
			
			String name= JOptionPane.showInputDialog("Enter your full name: ");
			double balance= Double.parseDouble(JOptionPane.showInputDialog("Balance: "));
			BankAccount ba = new BankAccount(name,balance);
		switch (input.toLowerCase()) {
		
		case "saving":
			
			
			ba.displayAccountInfo();
			SavingAccount sa = new SavingAccount();
			sa.openAccount();			

			break;
		case "current":
			
			ba.displayAccountInfo();
			CurrentAccount ca = new CurrentAccount();
			ca.openAccount();	
			
			
			break;
		default:
			JOptionPane.showMessageDialog(null, "Invalid Input!!!");
			
		}
		
		
		
		 if(JOptionPane.showConfirmDialog(null, "Would you like to create again?", "Account Info", 
				 JOptionPane.YES_NO_CANCEL_OPTION)== JOptionPane.YES_OPTION) {
			 result=1;
			 break;
		 }else {
			 result=2;
			 JOptionPane.showMessageDialog(null, "Thank you!! See you again!!");
			 break;
		 }
		 
		}while (result==1);
		
		System.out.println("==================================");
		System.out.println("Thank you!! Have a nice day!! ");
	
		}else if(selection.toLowerCase().equals("deposit")) {
			
			String name=JOptionPane.showInputDialog("Enter your name: ");
			double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter your balance"));
			double interest =6;
			BankAccount ba = new BankAccount(name,balance);
			ba.depositFund(interest,balance);
		}
		else if (selection.toLowerCase().equals("withdraw")){
			String name=JOptionPane.showInputDialog("Enter your name: ");
			double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter your balance"));
			double fee=200.00;
			BankAccount ba = new BankAccount(name,balance);
			ba.withdrawFund(balance,fee);
		}
		
		 if(JOptionPane.showConfirmDialog(null, "Please check the option below", "Account Info", 
				 JOptionPane.YES_NO_CANCEL_OPTION)== JOptionPane.YES_OPTION) {
			 result1=1;
			 break;
		 }else {
			 result1=2;
			 JOptionPane.showMessageDialog(null, "Thank you!! See you again!!");
			 break;
		 }
		}while(result1==1);
	}


}