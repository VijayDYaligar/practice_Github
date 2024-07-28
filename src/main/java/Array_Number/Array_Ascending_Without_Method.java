package Array_Number;

public class Array_Ascending_Without_Method {
	public static void main(String[] args) {
		int[] ar=new int[] {20,90,80,60,30,10,70,50,40};
		
		for(int i=0;i<=ar.length-1;i++) {
			
			for(int j=i+1;j<=ar.length-1;j++) {
				
				if(ar[j]<ar[i]) {
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
