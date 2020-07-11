package Lab1Project;

//import java.util.Scanner;

import javax.swing.JOptionPane;

//import java.util.Scanner;

public class DisplayAccountInformation  {
	
	public static void openAccount(Account ac) {
		ac.openAccount();
	};
	
	
	public static void main(String[] args) {	
		int result1;
		do {
		String [] decision = new String[] {"Create Account".toLowerCase(), "Deposit".toLowerCase(),"Withdraw".toLowerCase()};
		String selection =String.valueOf(JOptionPane.showInputDialog(null, "Please select the option below: ", 
				"Welcome to ABC Bank", JOptionPane.QUESTION_MESSAGE,null, decision,decision[0]));
		
		int result;
		String[] option = new String[2];
		option[0]="Current".toLowerCase();
		option[1]="Saving".toLowerCase();
		
		
		
		if(selection.equals("create account")) {
		
		do {
		
			String input =String.valueOf(JOptionPane.showInputDialog(null, 
					"Please select the option below: ", "Welcome to ABC Bank", JOptionPane.QUESTION_MESSAGE,null, 
					option,option[0]));
			
			String name= JOptionPane.showInputDialog("Enter your full name: ");
			double balance= Double.parseDouble(JOptionPane.showInputDialog("Balance: "));
			BankAccount ba = new BankAccount(name,balance);
		switch (input) {
		
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
	
		}else if(selection.equals("deposit")) {
			
			String name=JOptionPane.showInputDialog("Enter your name: ");
			double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter your balance"));
			double interest =6;
			BankAccount ba = new BankAccount(name,balance);
			ba.depositFund(interest,balance);
		}
		else if (selection.equals("withdraw")){
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