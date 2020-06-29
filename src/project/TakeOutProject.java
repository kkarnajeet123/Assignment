package Project;

import java.util.Scanner;

public class TakeOutProject {

	public static void selectionOption() {
		
	}
	public static void displayMainMenu() {
		
		System.out.println("-----------------------");
		System.out.println(" 1. Italian 	");
		System.out.println(" 2. Chinese 	");
		System.out.println(" 3. American	");
		System.out.println("-----------------------\n");
		System.out.println("Choose what type of food you'd like to order:");
		
		
	}
	public static void displayItalianFoodMenu() {
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("1. Lasagna Tray - Feeds 5 - 17.99");
		System.out.println("2. Pizza Pack - Feeds 7 - 15.99");
		System.out.println("3. Gazpacho Soup, salad and bread sticks pack - Feeds 4 - 12.99");
		System.out.println("--------------------------------------------------------------------\n");
		
	}
	public static void displayChineseFoodMenu() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls) - feeds 7 - 18.99");
		System.out.println("2. Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls) - feeds 7 - 18.99");
		System.out.println("3. Shrimp Fried Rice Tray (includes 10 egg rolls) - Feeds 5 - 10.99");
		System.out.println("--------------------------------------------------------------------\n");
		
	}
	public static void displayAmericanFoodMenu() {
		System.out.println("----------------------------------------------------------------------\n");
		System.out.println("1. Hamburger and Hot Dog Tray - includes buns and condiments - feeds 8 - 21.99");
		System.out.println("2. Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces -Feeds 5 - 22.99");
		System.out.println("3. Barbeque Tray - includes buns and peach cobbler - Feeds 10 - 26.99");
		System.out.println("----------------------------------------------------------------------\n");
		
	}
	
	public static int determineTrays(int people, int feeds) {
		int trays;
		
		trays=(int) Math.round(people/feeds+0.5);
		
		return trays;
		
	}
	

	public static double getSubtotal(double price, int trays) {
		double SubTotal=0;
			
		SubTotal=price*trays;
		
		return SubTotal;
	}
	
	public static double getTax(double subtotal, double taxrate) {
		double getTax=0;
		
		getTax=subtotal*taxrate;
		
		return getTax;
	}
	
	public static double getTip(double subtotal, double tipRate) {
		double getTip;
		getTip=subtotal*tipRate;
		return getTip;
				
	}
	
	public static double getGrandTotal(double subtotal, double tax, double tip) {
		double getGrandTotal=0;
		getGrandTotal=subtotal+tax+tip;
		return getGrandTotal;
	}
	
	public static double pricePerPerson(double grandTotal, int people) {
		
		double Perpersonprice=0;
		
		Perpersonprice = grandTotal/people;
		
		return Perpersonprice;
		
	}
	
	public static int determineLeftOvers(int feeds, int trays, int people) {
		return ((trays * feeds) - people);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter total number of people: ");
		Scanner sc = new Scanner(System.in);
		 int people = sc.nextInt();
		 
		 if (people<10 || people>100) {
			 System.out.println("Number of People are Invalid!!");
			 System.exit(0);
		 }
		 else {
		 int  feeds=0;
		 double price=0, tax=0.07, tips=0.15;
		 
		String decision= "N";
		boolean dec1=true;
		 
		do {
				
		
		Scanner sc1 = new Scanner(System.in);//italian, chinese, american
		Scanner sc2= new Scanner(System.in);//subselect italian
		Scanner sc3 = new Scanner(System.in);//subselect chinese
		Scanner sc4 = new Scanner(System.in);//subselect american
		
		
		//boolean people;
		 		
		TakeOutProject.displayMainMenu();
		 
		int selection = sc.nextInt();
		int count=0;
		
		
		switch (selection) {
		
		
		case (1) :
			System.out.println("Italian");
		
		TakeOutProject.displayItalianFoodMenu();
		
		System.out.println("Enter which food to order from Italian Menu: ");

		int sub_selection1=sc1.nextInt();
		
		switch (sub_selection1) {
		
				case (1):
			
					System.out.println("1. Lasagna Tray has been added in the cart.");
				feeds=feeds+5;
				price=price+17.99;
				System.out.println("");
				//System.out.println("Would you like to add more Y/N?");
				//decision = sc2.nextLine().toUpperCase();
				
				break;
				
				case (2):
		
					System.out.println("2. Pizza Pack has been added in the cart.");
				feeds=feeds+7;
				price=price+15.99;
				System.out.println("");
				//System.out.println("Would you like to add more Y/N?");
				//decision = sc2.nextLine().toUpperCase();
				break;				
				
				case (3):
						
					System.out.println("3. Gazpacho Soup, salad and bread sticks pack has been added in the cart.");
				feeds=feeds+4;
				price=price+12.99;
				System.out.println("");
				//System.out.println("Would you like to add more Y/N?");
				//decision = sc2.nextLine().toUpperCase();
				break;
			
				default: 
					//decision = "N";
					System.out.println("Thank you!! Have a nice day!!");
		}
		break;
		
		
		case (2) :
			System.out.println("Chinese");
		
		TakeOutProject.displayChineseFoodMenu();
		System.out.println("Enter which food to order from Chinese Menu: ");
		int sub_selection2=sc1.nextInt();
		
		switch (sub_selection2) {
		
				case (1):
		
					System.out.println("1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls) has been added in the cart.");
				feeds=feeds+7;
				price=price+18.99;
				System.out.println("");
				//System.out.println("Would you like to add more Y/N?");
				//decision = sc3.nextLine().toUpperCase();
				break;
				
				case (2):
			
					System.out.println("2. Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls) has been added in the cart.");
				feeds=feeds+7;
				price=price+18.99;
				System.out.println("");
				//System.out.println("Would you like to add more Y/N?");
				//decision = sc3.nextLine().toUpperCase();
				break;
				
				case (3):
			
					System.out.println("3. Shrimp Fried Rice Tray (includes 10 egg rolls) has been added in the cart.");	
				feeds=feeds+5;
				price=price+10.99;
				System.out.println("");
				//System.out.println("Would you like to add more Y/N?");
				//decision = sc3.nextLine().toUpperCase();
				break;
		
				default: 
				//	decision = "N";
					System.out.println("Thank you!! Have a nice day!!");
		}
		break;
			
			case (3) :
			
				System.out.println("American");
		
			TakeOutProject.displayAmericanFoodMenu();
			System.out.println("");
			System.out.println("Enter which food to order from American Menu: ");
			int sub_selection3 =sc1.nextInt();
		
				//American
			switch (sub_selection3) {
		
				case (1):
			
					System.out.println("1. Hamburger and Hot Dog Tray - includes buns and condiments has been added in the cart.");
				feeds=feeds+8;
				price=price+21.99;
				System.out.println("");
				//System.out.println("Would you like to add more Y/N?");
				//decision = sc4.nextLine().toUpperCase();
				break;
				
				case (2):
			
					System.out.println("2. Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces has been added in the cart.");
				feeds=feeds+5;
				price=price+22.99;
				System.out.println("");
				//System.out.println("Would you like to add more Y/N?");
				//decision = sc4.nextLine().toUpperCase();
				break;
				
				case (3):
			
					System.out.println("3. Barbeque Tray - includes buns and peach cobbler has been added in the cart.");	
				feeds=feeds+10;
				price=price+26.99;
				System.out.println("");
				//System.out.println("Would you like to add more Y/N?");
				//decision = sc4.nextLine().toUpperCase();
				break;
				
				default: 
					//decision = "N";
					System.out.println("Thank you!! Have a nice day!!");
			
			}
			
			break;
			
			default: 
				//decision = "N";
				System.out.println("Thank you!! Have a nice day!!");
				System.out.println("");
				
		}
		System.out.println("Would you like to add more Y/N?");
		Scanner sc5 = new Scanner(System.in);
		decision = sc5.nextLine().toUpperCase();
		
		}while(decision.equals("Y"));
		
		
		
		//System.out.println(dec1);
		/*
		System.out.println("Your decision is: "+decision);
		System.out.println("-----------------------------");
		System.out.println("Total number people: "+people);
		System.out.println("Your feeds is: "+feeds);
		*/
		System.out.println("-----------------------------");
		//number of trays
		int trays=TakeOutProject.determineTrays(people,feeds);
		System.out.println("You need "+trays +" trays");
		System.out.println("");
		System.out.println("Feeds: "+feeds);
		System.out.println("");
		double subtotal=TakeOutProject.getSubtotal(price, trays);
		String convertSubtotal = String.format("%.2f", subtotal);
		System.out.println("Price for "+people+" people ("+trays+" trays): "+convertSubtotal);
		System.out.println("");
		double calculateTax=TakeOutProject.getTax(subtotal, tax);
		String convertTax = String.format("%.2f", calculateTax);
		System.out.println("Tax: "+convertTax);
		System.out.println("");
		double calculateTips = TakeOutProject.getTip(subtotal, tips);
		String convertTips = String.format("%.2f", calculateTips);
		System.out.println("Tip: "+convertTips);
		System.out.println("");
		double grandTotal= TakeOutProject.getGrandTotal(subtotal, calculateTax, calculateTips);
		String convertGrandTotal = String.format("%.2f", grandTotal);
		System.out.println("Total (food, tax,tips): "+convertGrandTotal);
		System.out.println("");
		double perperson = TakeOutProject.pricePerPerson(grandTotal, people);
		String convertperperson = String.format("%.2f", perperson);
		System.out.println("Price per person: "+convertperperson);
		System.out.println("");
		int leftovers = TakeOutProject.determineLeftOvers(feeds, trays, people);
		System.out.println("Leftover serviings for the delivery person: "+leftovers);
		//Total Price
		/*
		System.out.println("");
		String covertprice = String.format("%.2f", price);
		System.out.println("Your total price before tax is: "+covertprice+ " dollars");
		*/
	
		
		 }
	}
}

