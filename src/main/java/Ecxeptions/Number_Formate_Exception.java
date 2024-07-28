package Ecxeptions;

import java.util.Scanner;

public class Number_Formate_Exception {
	public static void main(String[] args) {
		
		
		// while trying to convert String value into integer make sure that should be consist only digits not charecter
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String value : ");
		
		String str=scan.nextLine();
		
		int value=Integer.parseInt(str);
		
		System.out.println(value);
	}

}
