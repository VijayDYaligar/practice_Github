package String_Loical;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Scanner;

public class StringChar_Count {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String Value :");
		String str=scan.next();
		String result=str.toLowerCase();
		countCharCountOccurance(result);
	}
   
	public static void countCharCountOccurance(String str) {
		HashMap<Character, Integer> charCountMap=new HashMap<Character, Integer>();
		char[] chars = str.toCharArray();
		
		for(char c:chars) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c)+1);
				
			}
			else {
				charCountMap.put(c,1);
			}
		}
		
		for(HashMap.Entry<Character, Integer> entry:charCountMap.entrySet()) {
			System.out.println(entry.getKey()+" is "+entry.getValue());
			
		}
		
	}
}
