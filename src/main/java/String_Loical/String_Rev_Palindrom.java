package String_Loical;

import java.util.Scanner;

public class String_Rev_Palindrom {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String Value");
		String org=scan.next();
		String rev="";
		String str=org.toLowerCase();
		
		for(int i=org.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			rev=rev+ch;
		}
		if(rev.equals(str)) {
			System.out.println("Given String is palindrom");
		}
		else {
			System.out.println("Given string is not palindrom");
		}
	}

}
