package String_Loical;

import java.util.Scanner;

public class String_Swapping {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first string value : ");
		String a=scan.next();
		System.out.println("Enter second String value : ");
		String b=scan.next();
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length(),a.length());
		System.out.println("Value of A after swapping : "+a);
		System.out.println("Value of B after swapping : "+b);
	}

}
