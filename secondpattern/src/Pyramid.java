import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		
	System.out.println("how many dollars would you like?!!");
	Scanner scan=new Scanner(System.in);
		
			int NumOfStars=scan.nextInt();
			for(int i=1;i<=NumOfStars;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("$ ");
			}
			System.out.println();
		}
			for(int i=NumOfStars-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("$ ");
			}
			System.out.println();
			
		}
		

	}

}
