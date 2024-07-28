package Numric_Value;

import java.util.Scanner;

public class All_Even_Number {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" total even number :");
		int totalEven=scan.nextInt();
		
		int multiple=2*totalEven;
		
		
		for(int i=1;i<=multiple;i++ ) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}

