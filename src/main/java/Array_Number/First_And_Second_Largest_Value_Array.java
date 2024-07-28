package Array_Number;

public class First_And_Second_Largest_Value_Array {
	
	public static void main(String[] args) {
		int [] ar=new int[] {30,50,770,50,400,30,290,100,500,450};
		 int firstMax=Integer.MIN_VALUE;
		 int secondMax=Integer.MIN_VALUE;
		 
		 for(int i=0;i<=ar.length-1;i++) {
			 
			 if(ar[i]>firstMax) {
				 secondMax=firstMax;
				 firstMax=ar[i];
			 }
			 else if(ar[i]>secondMax && ar[i]!=firstMax) {
				 secondMax=ar[i];
			 }
		 }
		 System.out.println("first largest value is"+firstMax);
		 System.out.println("Second Larest Value is "+ secondMax);
	}

}
