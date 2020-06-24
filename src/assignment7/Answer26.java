//Write a Program to reverse the given number. //123 => 321
package assignment7;

public class Answer26 {

	public static void main(String[] args) {
		
		String k = "123";
		
		for (int i=k.length()-1; i>=0; i--) {
			
			System.out.print(k.charAt(i));
		}

	}

}
