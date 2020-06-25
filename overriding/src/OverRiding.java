class A{
	public void show(){
		
	
	System.out.println("A");
	}
}
class B extends A{
	@Override
	public void show(){
		
	
	System.out.println("B");
	}
}
public class OverRiding {
	public static void main(String args[]) {
		B obj1=new B();
		obj1.show();
	}

}
