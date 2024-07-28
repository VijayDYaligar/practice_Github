package Numric_Value;

public class Armastrong_Numbr {
	public static void main(String[] args) {
		
		int num=371;
		int a, rem=0,j=0;
		
		a=num;
				while(a>0) {
					rem=a%10;
					j=(rem*rem*rem)+j;
					a=a/10;
				}
		System.out.println("value of j "+j);
   
		if(num==j) {
			System.out.println("Given number is armastrong number");
		}
		else {
			System.out.println("Given Number is not armastrong number");
		}
	}

}
