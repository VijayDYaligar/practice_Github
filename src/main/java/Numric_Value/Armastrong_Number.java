package Numric_Value;

import java.util.Scanner;

public class Armastrong_Number {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 3 digit number :");
		int num=scan.nextInt();
		int a,rem=0,j=0;
		
		a=num;
				while(a>0) {
					rem=a%10;
					j=(rem*rem*rem)+j;
					a=a/10;
				}
				System.out.println("Value of j is "+j);
				if(num==j) {
					System.out.println("Given Number is Armstrong number");
				}
				else {
					System.out.println("Given Number is not Armstrong Number");
				}
	}

}
