package String_Loical;

import java.util.Scanner;

public class String_Int_Addition {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String va;lue : ");
		String str=scan.nextLine();
		
		String numText=str.replaceAll("[^0-9]","");
		
		
		int num = Integer.parseInt(numText);
		int add=0;
		
		for(int i=num;i>0;i=i/10) {
			int rem=i%10;
			add=rem+add;
			
		}
		System.out.println("total addition is : "+add);
	}

}
