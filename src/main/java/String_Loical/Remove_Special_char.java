package String_Loical;

import java.util.Scanner;

public class Remove_Special_char {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String Value : ");
		String org=scan.nextLine();
		
		String result=org.replaceAll("[^A-Za-z0-9]", "");
		
		System.out.println("Value of String after replace : "+result);
	}

}
