package Numric_Value;

import java.util.Scanner;

public class Check_Number {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number :");
		int num=scan.nextInt();

		int count=0;

		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				count++;

			}
		}
	if(count==2 && num/2!=0) {
			System.out.println("Given Number is Prime as well as odd number");
		}
	else if(count==2) {
		System.out.println("Given Number is prime number");
	}
		else if(num/2!=0) {
			System.out.println("Given Number is odd Number ");
		}
		else if(num/2==0) {
			System.out.println("Given Number is even Number");
		}

	}

}
