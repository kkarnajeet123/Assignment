//Write a Program to display name in short form. E.g. Ram Kishore Singh  -> R. k. Singh
package assignment11;

import java.util.Scanner;

public class Answer39 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String FName= sc.next();
		System.out.println("Enter your middle name: ");
		String MName= sc.next();
		System.out.println("Enter your last name: ");
		String LName= sc.next();
		/*
		String FName= "Ram";
		String MName= "Kishor";
		String LName= "Singh";
		*/
		char [] ch = FName.toCharArray();
		char [] ch1 = MName.toCharArray();
		char [] ch2 = LName.toCharArray();
		
		String s1 = String.valueOf(ch[0]);
		String s2 = String.valueOf(ch1[0]);
		String s3 = String.valueOf(ch2[0]);
		String s4="";
				
		for (int i=1; i<ch2.length; i++) {
			 s4 =s4+ String.valueOf(ch2[i]);
		}
		
		
		StringBuilder sb = new StringBuilder(FName);
		StringBuilder sb1= new StringBuilder(MName);
		StringBuilder sb2 = new StringBuilder(LName);
		
		int len = sb2.length();
		System.out.println("---------------------------");
		System.out.println("From String Builder");
		System.out.println(sb.substring(0,1).toUpperCase()+". "+sb1.substring(0, 1).toUpperCase()+". "+sb2.substring(0, 1).toUpperCase()+sb2.substring(1, len));
		System.out.println("---------------------------");
		System.out.println("From String only");
		System.out.print(s1.toUpperCase()+". "+s2.toUpperCase()+". "+s3.toUpperCase()+s4);
		
		sc.close();
		
		
		
		
		
	}

}
