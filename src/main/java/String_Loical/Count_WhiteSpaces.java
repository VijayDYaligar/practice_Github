package String_Loical;

import java.util.Scanner;

public class Count_WhiteSpaces {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter string value : ");
		String org=scan.nextLine();
		int whiteSpaceCount=0;
		
		for(int i=0;i<=org.length()-1;i++) {
			char ch=org.charAt(i);
			
			if(ch==' ') {
				whiteSpaceCount++;
			}
		}
		System.out.println("total white spaces are : "+whiteSpaceCount);
	}

}
