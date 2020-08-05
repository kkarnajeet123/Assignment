////Write a program to find the duplicate name (word) in a file.
package assignment12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Answer45 {

	public static void main(String[] args) {
		
		try {
			String pathName="C:\\Users\\krisn\\Desktop\\Demo\\Answer45.txt";
			FileWriter write = new FileWriter ("C:\\Users\\krisn\\Desktop\\Demo\\Answer45.txt");
			//or we can write path file C:/User/Krisn/Desktop
			File file = new File(pathName);
			if(file.createNewFile()) {
				System.out.println("File has been created!!");
			}else {
				System.out.println("File exists!!");
			}
			
			String input1 ="Kishor";
			
			String input2 ="Smita";
			
			PrintWriter prnt = new PrintWriter(pathName);
			prnt.println(input1);
			prnt.println(input2);
			prnt.close();
						
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
		}
		
		}

}

