package Logical_Program;

import java.util.Scanner;

public class Rev_Number {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number : ");
		long num=scan.nextLong();
		long rev=0;
		for(long i=num;i>0;i=i/10) {
			long rem=i%10;
			rev=rev*10+rem;
			
		}
		System.out.println("value of rev is  : "+rev);
		
		if(rev==num) {
			System.out.println("given nub is palindrom");
		}
		else {
			System.out.println("Not palindrom");
		}
		
	}

}
