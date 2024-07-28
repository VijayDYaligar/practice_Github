package Array_Number;

public class Array_Discending_ {
	public static void main(String[] args) {
		
		int [] ar=new int[] {40,50,40,20,60,70,80,100,10};
		
		for(int i=0;i<=ar.length-1;i++) {
			
			for(int j=i+1;j<=ar.length-1;j++) {
				
				if(ar[j]>ar[i]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int k=0;k<=ar.length-1;k++) {
			System.out.println(ar[k]);
		}
	}

}
