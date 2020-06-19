class calci{
	public int add(int i,int j) {
		return i+j;
		
	}
}
class Adv extends calci{
	public int sub (int i,int j) {
		return i-j;
	}
}
class Bsr extends Adv{
	public int multi(int i,int j) {
		return i*j;
	}
}
public class Inheritence {

	public static void main(String[] args) {
	Bsr c1=new Bsr();
	int result1=c1.add(2, 4);
	int result2=c1.sub(12, 5);
	int result3=c1.multi(23,34 );
	
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	}

}
