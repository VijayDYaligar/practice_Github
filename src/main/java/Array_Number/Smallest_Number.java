package Array_Number;

public class Smallest_Number {
	public static void main(String[] args) {
		int[] ar=new int[] {404,40,60,30,20,10,4403,4};
		
		int minValue=Integer.MAX_VALUE;
		
		
		//metho first
		System.out.println("----------first Method-----------");
		for(int i=0;i<=ar.length-1;i++) {
			if(ar[i]<minValue) {
				minValue=ar[i];
			}
		}
		System.out.println("Smallest Number of Array :"+minValue);
		
		System.out.println("---------second Method");
		
		for(int i=0;i<=ar.length-1;i++){
			
			for(int j=i+1;j<=ar.length-1;j++) {
				if(ar[j]<ar[i]) {
					ar[i]=ar[j];
				}
			}
			}
		System.out.println(" smallest Number is "+ar[0]);
		}

}
