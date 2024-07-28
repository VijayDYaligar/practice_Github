package Array_Number;

public class Swapping_Value_in_Array {
	public static void main(String[] args) {
		int[] ar=new int[] {10,20,30,40,50,60,70,80};
		int firstnum=ar[1];
		int secondnum=ar[6];
		
		for(int i=0;i<=ar.length-1;i++) {
			
			if(ar[i]==firstnum) {
				ar[i]=secondnum;
			}
			else if(ar[i]==secondnum) {
				ar[i]=firstnum;
			}
		}
		System.out.println("Value of array after position changing : ");
		for(int i=0;i<=ar.length-1;i++) {
			System.out.print(" "+ar[i]);
		}
	}

}
