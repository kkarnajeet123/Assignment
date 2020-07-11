package Lab1Project;

public  class BankAccount {

	//private double accountNum;
	
	private String fullname;
	private double initialBalance;
	private int accountNum;
	private static int accountNumber=1000;
	
	
	public BankAccount(String fullname) {
		this.fullname =fullname;
		this.initialBalance=0;
		this.accountNum=accountNumber++;
				
	}
	
	public BankAccount(String fullname, double initialBalance) {
		this.fullname =fullname;
		this.initialBalance=initialBalance;
		this.accountNum=accountNumber++;
		
		
	}

	public void displayAccountInfo() {
		System.out.println("===================================================");
		System.out.println("Account Number: "+ accountNum);
		System.out.println("Account Holder Name: "+ fullname);
		System.out.println("Balance: "+String.format("%.2f", initialBalance));
		
		
	}
	
	public void withdrawFund(double amount) {
		
		initialBalance=initialBalance-amount;
				
		displayAccountInfo();
	}
	
	public void withdrawFund(double amount, double fee) {
		
		 initialBalance=initialBalance-(amount-fee);		
		
		 displayAccountInfo();
	}
	
	public void depositFund(double amount) {
		initialBalance=initialBalance+amount;
		displayAccountInfo();
	}
	
	
	public void depositFund(double interest, double deposit_amount) {
		
		initialBalance=deposit_amount +(initialBalance*interest/100);
		displayAccountInfo();
	}
	
	
}
