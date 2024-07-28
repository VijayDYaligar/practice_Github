package Numric_Value;

import java.util.Scanner;

public class Palindrom_Number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Number");
		long num=scan.nextLong();
		long rev=0;
		
		for(long i=num;i>0;i=i/10) {
			long rem=i%10;
			rev=rev*10+rem;
		}
		if(rev==num) {
			System.out.println("Given Number is palindrom");
		}
		else {
			System.out.println("Given Number is not palindrom");
		}
	}

}
