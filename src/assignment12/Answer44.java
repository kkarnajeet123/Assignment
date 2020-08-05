////Write a program to store the name and address of 10 students in file and search address by given name.
package assignment12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Answer44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> studentInfo = new TreeMap<>();
		//createFile();
		//writingInFile(creatingList());
		//studentInfo= creatingList();
		//System.out.println("==========Before Searching==========");
		//System.out.println(studentInfo);
		
		System.out.println("==========After Searching==========");
		
		//writingInFile(findSearchName(creatingList(),input));
		//System.out.println("Enter to whom to select: ");
		String input = "Kishor";
		String result = findSearchName(creatingList(),input);
		System.out.println(result);
		sc.close();
	}
	
	public static void createFile() {
		
		System.out.println("==========Creating File=============");
		String pathDirectory = "C:\\Users\\krisn\\Desktop\\Demo";
		String pathFile = "C:\\Users\\krisn\\Desktop\\Demo\\DemoFile100.txt";
		File makeDirectory = new File(pathDirectory);
		File makeFile = new File(pathFile);
		if(makeDirectory.exists()) {
				if(makeFile.exists()) {
					System.out.println("File already exists!!!");
				}else {
					try {
						makeFile.createNewFile();
					} catch (IOException e) {
				
						e.printStackTrace();
					}
						System.out.println("File has been created!!!");
				}
		}else{
			makeDirectory.mkdir();
			try {
				makeFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		makeFile.setWritable(true);
		System.out.println("File set to write: "+makeDirectory.canWrite());
	}
	
	public static Map<String,String> creatingList() {
System.out.println("==========List==============");
		
		Map<String, String> studentInfo = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		String name, address="";
		
		String decision = "y";
		do {
			System.out.println("Enter your name: ");
			name=sc.nextLine();
			System.out.println("Enter your address: ");
			address=sc.nextLine();
			studentInfo.put(name,address);
			System.out.println("Do you want to continue (y/n)? ");
			decision=sc.nextLine().toLowerCase();
		}while (decision.equals("y"));
		
	//	System.out.println();
		return(studentInfo);
		
	
	//	System.out.println();
	}

	public static void writingInFile(Map<String, String> studInfo) {
		System.out.println("=========Writing List in File============");
		 String mapToString =studInfo.toString();
		try {
			FileOutputStream fos = new FileOutputStream(mapToString);
			
			PrintWriter write = new PrintWriter("C:\\Users\\krisn\\Desktop\\Demo\\DemoFile100.txt");
			write.println(mapToString);
			
			write.println("======================");
			write.println("This is calling from findSearchName");
			write.println(mapToString);
			write.close();
			
			System.out.println("Written Task has been completed");
		
			try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	}
	
	
	public static String findSearchName(Map<String, String> searchName, String name) {
		
	//	Map<String, String> returningValues = new TreeMap<>();
		
	//String returnedValue="";
		searchName= new TreeMap<>();
		searchName.put("Kishor", "Kathmandu");
		searchName.put("K1", "Kath1");
		searchName.put("K2", "Kath2");
		//searchName = creatingList();
		//searchName.putAll(creatingList());
		//Scanner sc = new Scanner(System.in);
		//System.out.println(searchName);
		//System.out.println("Select name for address search: "+searchName.keySet());
		
		//if(searchName.containsKey(name)) {
		//for(Map.Entry<String, String> search: searchName.entrySet()) {
		//	returnedValue=(search.getKey()+" "+search.getValue()).toString();
	//	}
		//}
		return name+searchName.toString();
		//returningValues.put(returnedValue);
		
		//return returningValues;
	}
	/*
	public static void writingStringInFile(String s) {
		s=findSearchName(creatingList());
		try {
			PrintWriter writeFindingList = new PrintWriter("C:\\Users\\krisn\\Desktop\\Demo\\DemoFile100.txt");
			
			writeFindingList.println("======================");
			writeFindingList.println("This is calling from findSearchName");
			
			writeFindingList.println(s);
			writeFindingList.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			
		}
	}*/
}
