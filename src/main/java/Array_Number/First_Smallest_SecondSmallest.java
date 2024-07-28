package Array_Number;

public class First_Smallest_SecondSmallest {
	public static void main(String[] args) {
		int[] ar=new int[] {30,50,20,10,5,70,79,90,4,};
		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		
		for(int i=0;i<=ar.length-1;i++) {
			
			if(ar[i]<firstSmallest) {
				secondSmallest=firstSmallest;
				firstSmallest=ar[i];
			}
			else if(ar[i]<secondSmallest && ar[i]!=firstSmallest) {
				secondSmallest=ar[i];
			}
		}
		
		System.out.println("First Smallest Value is "+firstSmallest);
		System.out.println("Second Smallest Value is "+secondSmallest);
	}

}
