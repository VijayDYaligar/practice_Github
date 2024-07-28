package Logical_Program;

import java.util.Scanner;

public class String_Swapping {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("First String  : ");
		String a=scan.next();
		System.out.println("Second String : ");
		
		String b=scan.next();
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length(),a.length());
		
		System.out.println("String a after swapping :"+a);
		
		System.out.println("String b after swappig : "+b);
		
				
				
;
		}

}
