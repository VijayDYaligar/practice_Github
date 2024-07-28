package Logical_Program;

import java.util.Scanner;

public class Addition_Of_String_Number {
	public static void main(String [] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Write String value : ");
		String str=scan.next();
		
		String num=str.replaceAll("[^0-9]","");
		int add=0;
		
		int number=Integer.parseInt(num);
		
		for(int i=number;i>0;i=i/10) {
			int rem=i%10;
			add=add+rem;
		}
		System.out.println("Total Addition of String digits : "+add);
	}

}
