package Lab1Project;

public  class BankAccount {

	//private double accountNum;
	static int accountNum=0;
	private String firstname, lastname;
	private double balance;
	
	public BankAccount(String first_name, String last_name, double balance) {
		this.firstname=first_name;
		this.lastname=last_name;
		this.balance=balance;
	}

	public void displayAccountInfo(String first_name, String last_name, double balance) {
		int account_number=0;
				account_number++;
		System.out.println("Account Number: "+ account_number);
		System.out.println("Account Holder Name: "+ first_name+ " "+last_name);
		
		if(balance!=0) {
		System.out.println("Balance: "+String.format("%.2f", balance));
		}else {
			balance=0;
			System.out.println("Balance: "+String.format("%.2f", balance));
		}
		
	}
	
	public double withdrawFund(double balance, double withdraw_fee) {
		
		double new_balanceWithdrawn=balance-withdraw_fee;
				
		return new_balanceWithdrawn;
		
	}
	
	public double depositFund(double balance, double deposit_amount) {
		
		double new_balanceDeposit=balance+deposit_amount;
				
		return new_balanceDeposit;
		
	}
	
	
	
}
