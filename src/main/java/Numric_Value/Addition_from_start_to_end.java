package Numric_Value;

import java.util.Scanner;

public class Addition_from_start_to_end {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter starting value :");
		int startNum=scan.nextInt();
		
		System.out.println("Last Value :");
		int endValue=scan.nextInt();
		
		int add=0;
	
		for(int i=startNum;i<=endValue;i++) {
			add=add+i;
			
		}
		System.out.println("total addition is "+add );
		
	
	}

}
