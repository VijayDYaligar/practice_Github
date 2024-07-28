package Array_Number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert_Array_To_List {

	public static void main(String[] args) {
		//int [] ar=new int[] {40,50,70,60,90,302,30};
		Integer[] ar= {40,50,70,60,90,302,30};
	   
		 
		List l=new ArrayList(Arrays.asList(ar));
		
	
		System.out.println(l);
		
		//List<int[]> lis = Arrays.asList(ar);
		
		
	}

}
