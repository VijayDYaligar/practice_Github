package Logical_Program;

import java.util.Scanner;

public class check_Three_Armastring_Number {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Three digit Number :");
		int num=scan.nextInt();
		
		int a,rem=0,j=0;
		
		a=num;
		
		while(a>0) {
			rem=a%10;
			
			j=(rem*rem*rem)+j;	
			a=a/10;
			}
		System.out.println("Value of j "+j);
		
		if(num==j) {
			System.out.println("Given Numb is Armstrong Number");
		}
		else {
			System.out.println("Given Number is not armastrong number");
		}
		
	}

}
