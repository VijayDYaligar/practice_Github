package Logical_Program;

public class LargestNumber_Array {
	int [] ar;
	public static void main(String[] args) {
		
		int [] ar=new int[] {10,30,405,60,6730,29};
		
		
	
		int largestnum=Integer.MIN_VALUE;
		
		for(int i=0;i<=ar.length-1;i++) {
			
			if(ar[i]>largestnum) {
				largestnum=ar[i];
			}
		}
		System.out.println("Largest Numb is : "+largestnum);
		
	}

}
