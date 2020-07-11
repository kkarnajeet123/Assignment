package Lab1Project;

import java.util.Scanner;

public class DisplayAccountInformation  {
	
	public static void open(Account account) {
		account.openAccount();
	}

	public static void main(String[] args) {	
Scanner sc = new Scanner(System.in);
		
		System.out.println("Which account to open? ");
		String choice = sc.next().toLowerCase();
		
		Account account = null;
		
		
		switch (choice) {
			
			case "saving":
				System.out.println("Please Enter your first name: ");
				String first_name= sc.next().toLowerCase();
				System.out.println("Please Enter your last name: ");
				String last_name= sc.next().toLowerCase();
				System.out.println("Please Enter your initial balance: ");
				double balance= sc.nextDouble();
				
				System.out.println("================================");
				System.out.println("Welcome to ABC Bank!! ");
				System.out.println("");
				account = new SavingAccount();
				
				System.out.println("");
				BankAccount bk= new BankAccount(first_name,last_name,balance);
				bk.displayAccountInfo(first_name, last_name, balance);
							
				break;
				
			case "current":
				System.out.println("Please Enter your first name: ");
				first_name= sc.next().toLowerCase();
				System.out.println("Please Enter your last name: ");
				last_name= sc.next().toLowerCase();
				System.out.println("Please Enter your initial balance: ");
				balance= sc.nextDouble();
				System.out.println("================================");
				System.out.println("Welcome to ABC Bank!! ");
				System.out.println("");
				account = new CurrentAccount();
				BankAccount bk1= new BankAccount(first_name,last_name,balance);
				bk1.displayAccountInfo(first_name, last_name, balance);
				
				break;
			
			default:
				System.out.println("Wrong Selection!!!");
			
		}
		
		if(account!=null) {
			System.out.println("================================");
			open(account);
		}
		
		sc.close();

		}
	
		
	}

