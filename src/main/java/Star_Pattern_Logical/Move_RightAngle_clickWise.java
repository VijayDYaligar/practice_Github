package Star_Pattern_Logical;

public class Move_RightAngle_clickWise {
	public static void main(String[] args) {
		
		int star=5;
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			star--;
			System.out.println();
		}
	}

}
