package Logical_Program;

import java.util.HashMap;
import java.util.Scanner;

public class String_Char_ {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter STRing Value :");
		String str=scan.nextLine();
		
		HashMap<Character, Integer> charCountMap=new HashMap<Character, Integer>();
		
		char[] chars=str.toCharArray();
		
		for(char c:chars) {
			
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c,charCountMap.get(c)+1);
			}
			
			else {
				charCountMap.put(c,1);
			}
		}
		
		for(HashMap.Entry<Character,Integer> entry:charCountMap.entrySet()) {
			System.out.println(entry.getKey()+" is "+entry.getValue());
			
		}
	}

}
