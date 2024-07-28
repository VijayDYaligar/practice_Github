package Logical_Program;

import java.util.Scanner;

public class String_Rev_palindrom {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String value :");
		String str=scan.next();
		String result=str.toLowerCase();
		String rev="";
		
		
		for(int i=result.length()-1;i>=0;i--) {
			char ch=result.charAt(i);
			rev=rev+ch;
			
		}
		System.out.println("value of rev : "+rev);
		if(rev.equals(result)) {
			System.out.println("Given String is palindrom");
		}
		else {
			System.out.println("Not palindrom");
		}
	}

}
