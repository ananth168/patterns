import java.util.Scanner;

public class Palin {
	public static void main(String args[]) {
		System.out.println("enter any number");
		Scanner scan =new Scanner(System.in);
		int EnteredNum=scan.nextInt();
		int r, s=0;
		int t=EnteredNum;
		while(EnteredNum>0) {
			r=EnteredNum%10;
			EnteredNum=EnteredNum/10;
			s=s*10+r;
		}
		if(t==s) {
			System.out.println(s);
			System.out.println("it is palindrome number");
			
		}
		else {
			System.out.println(s);
			System.out.println("not a palindrome number");
		}
	}
}
