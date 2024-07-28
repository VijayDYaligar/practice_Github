package Numric_Value;

import java.util.Scanner;

public class febonices_Series_Number {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("total number of fibo number :");
		
		
		int fibo=scan.nextInt();
		int n=0;
		int n1=1;
		System.out.println(n);
		
		
		for(int i=2;i<=fibo;i++) {
			int sum=n+n1;
			n=n1;
			n1=sum;
			System.out.println(n);
			
		}
	}

}
