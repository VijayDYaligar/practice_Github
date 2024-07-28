package Numric_Value;

import java.util.Scanner;

public class Feboneci_Series {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" I need foolowing febonecic series Number : ");
		int totalFibo=scan.nextInt();
		 int n1=0;
		 int n2=1;
		 int i=0;
		 
		 System.out.println("first fibo number is "+n1);
		 System.out.println("Second fibo series number is :"+n2);
		 System.out.println("remaining ");
		 
		
		while(totalFibo>i) {
			
			int sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.println(sum);
			totalFibo--;
			
		}
		
		
		
		System.out.println(" -----Second method ----------");
		System.out.println(" I need foolowing febonecic series Number : ");
		int totalFibo1=scan.nextInt();
		
		System.out.println("fibonecis series number is ");
		int n=0;
		int n3=1;
		System.out.println(n);
		System.out.println(n3);
		
		for(int j=2;j<=totalFibo1;j++) {
			int sum1=n1+n2;
			n1=n2;
			n2=sum1;
			System.out.println(n1);
			System.out.println(n2);
		}
		
	}
	

}
