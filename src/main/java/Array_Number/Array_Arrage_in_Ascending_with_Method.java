package Array_Number;

import java.util.Arrays;

public class Array_Arrage_in_Ascending_with_Method {
	public static void main(String[] args) {
		
		int[] ar=new int[] {20,30,80,70,60,50,40,10};
		Arrays.sort(ar);
		for(int i=0;i<=ar.length-1;i++) {
			System.out.println(ar[i]);
		}
	}

}
