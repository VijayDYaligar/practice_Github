package Array_Number;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Two_Array_Common_Values {
	public static void main(String[] args) {
		Integer[] ar= {20,30,40,50,602,10,65,70,80,90};
		Integer [] ar2= {20,60,70,55,78, 65};
		
		Set a=new HashSet(Arrays.asList(ar));
		Set b=new HashSet(Arrays.asList(ar2));
		
		Set common=new HashSet();
		
		common.addAll(a);
		common.retainAll(b);
		System.out.println(common);
		
		
	}

}
