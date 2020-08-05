//
package SirsAssignment;

import java.util.ArrayList;
import java.util.Collection;

public class CheckPalindromeSir {

	public static void main(String[] args) {
		ArrayList<String > strings = new ArrayList<String>();
		
		strings.add("Hello, World");
		strings.add("Welcome to Nepal.");
		//strings.add("This pad is running Java" +Runtive.version().features());
		for(int i=0; i<strings.size();i++) {
			System.out.println(strings);
		}
		isPalindromeOrNot(strings);
		
	}
	public static ArrayList<Boolean> isPalindromeOrNot(Collection<String>list){
		
		ArrayList<Boolean> palindromeList = new ArrayList<Boolean>();
		
		for (int i = 0; i < list.size(); i++) {
			//palindromeList.add(isPalindrome(list.get(i));
		}
		return palindromeList;
	}
	
	public static Boolean isPalindrome(String orginialString) {
		
		char[] splittedString = orginialString.toCharArray();
		char[] tempArray = new char[splittedString.length];
		
		for (int i = 0; i < splittedString.length; i++) {
			tempArray[i]=splittedString[splittedString.length-i-1];
			
		}
		String reversedString = new String(tempArray);
		Boolean isPalindrome=false;
		
		if(reversedString.equals(orginialString)) {
			isPalindrome=true;
		}
		return isPalindrome;
	}

}
