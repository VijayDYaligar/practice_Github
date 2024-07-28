package Array_Number;

public class Largest_Number {
	public static void main(String[] args) {
		int [] ar=new int[] {20,40,60,80,990,20,1110};
	
		
	//first Method
		System.out.println("---------First Method---------");
		int maxValue = Integer.MIN_VALUE;
		
		for(int i=0;i<=ar.length-1;i++) {
			
			if(ar[i]>maxValue) {
				maxValue=ar[i];
			}
		}
		System.out.println("largest value is  : "+maxValue);
		
		
		//Second Method
		System.out.println("---------------Second Method------------");
		
		for(int j=0;j<=ar.length-1;j++) {
			
			for(int k=j+1;k<=ar.length-1;k++) {
				if(ar[k]>ar[j]) {
					ar[j]=ar[k];
					
				}
			}
		
		}
		System.out.println(" Largest value is "+ar[0]);
	}

}
