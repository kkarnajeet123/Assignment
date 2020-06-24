//Write a program that prompts the user to enter the number of students and each student’s name and score. 
//Finally display the student with highest score.
package assignment7;

import java.util.Scanner;

public class Answer25 {

	public static void main(String[] args) {
		System.out.println("Enter number of student: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxscore=0;
		String Scorename="";
		
		for(int i=1; i<=n; i++) {
			
			System.out.println("Enter student name");
			String name= sc.next();
			System.out.println("Enter score: ");
			int score=sc.nextInt();
			
			if(score>maxscore) {
				maxscore=score;
				Scorename=name;
			}
			
		}
		System.out.println("The highest score is "+maxscore+", scored by " +Scorename+"." );
		
	sc.close();
	}

}
