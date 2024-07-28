package Logical_Program;

import java.util.Scanner;

public class Smallest_Numb {
	public static void main(String[] args) {
		int[] ar=new int[] {3904,27,490,4850,3729,2889};
		
		int smallestNum=Integer.MAX_VALUE;
		
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]<smallestNum) {
				smallestNum=ar[i];
			}
		}
		System.out.println("Smallest number is "+smallestNum);
	}

}
