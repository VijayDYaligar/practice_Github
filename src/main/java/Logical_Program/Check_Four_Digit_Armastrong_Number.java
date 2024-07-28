package Logical_Program;

import java.util.Scanner;

public class Check_Four_Digit_Armastrong_Number {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter four digit number");
		int num=scan.nextInt();
		
		int a,rem=0,j=0;
		
		a=num;
		
		while(a>0) {
			rem=a%10;
			
			j=(rem*rem*rem*rem)+j;   //1634 9474  
			
			a=a/10;
		}
		
		System.out.println("Value of  j : "+j);
		
		if(num==j) {
			System.out.println("Given Number is Arm");
		}
		else {
			System.out.println("Not arm number");
			}
		}

}
