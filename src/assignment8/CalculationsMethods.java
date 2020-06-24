package assignment8;

public class CalculationsMethods {

public void MultiplicationTable (int n){
	
	for (int i=1; i<=10; i++) {
			
		System.out.println(n+" X "+i+" = "+(n*i));
		
		}
}

public boolean isPrime(int num) {
	
	boolean isPrime=false;
	
	if(num==2) {
		isPrime=false;
	}
	if(num>2) {
	if (num%2==0) {
			 isPrime=true;
	}
		}return isPrime;
}

public int showFactorial(int num) {
	
	int factorial =1;
	
	for (int i=1; i<=num; i++) {
		
		factorial= factorial*i;
		
	}
		
	return factorial;
}

public String showReverse(String num) {
	
	String reverse="";
	
	for (int i=num.length()-1; i>=0; i--) {
		
		char k = num.charAt(i);
	
		reverse=reverse+k;
		//factorial=factorial+mult;
	}
		
	return reverse;
	}

public int showNthPrime(int num) {
	
	 int i,j=1, count=0;
	    
	 
	    while (count < num){
	      j=j+1;
	      for ( i = 2; i <= j; i++){ //Here we will loop from 2 to num
	        if (j % i == 0) {
	          break;
	        }
	      }
	      if ( i == j){//if it is a prime number
	          count = count+1;
	      }
	    } return j;
	  
}
}