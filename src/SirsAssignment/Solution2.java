//
package SirsAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution2 {

	public static void main(String[] args) {
		String input = "school";
		System.out.println(input.toLowerCase());
		System.out.print("=======After list=======\n");
		TreeMap <Character, Integer> treeMapList= new TreeMap<>();
		List <Character> list = new ArrayList<>();
		int count =1;
		char[] arr = input.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
		//	System.out.println(arr[i]);
			list.add(arr[i]);
			if(list.contains(arr[i])) {
				count++;
			}else {
				count=1;
			}
			System.out.println(count);
			//treeMapList.put(arr[i], count);
		}
		System.out.println(list);
		System.out.println("===================");
	//	treeMapList.entrySet(list,count);
	//	System.out.println(treeMapList.);
		
		
		
	}

}
