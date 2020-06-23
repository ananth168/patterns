class Employee{
	int id;
	int salary;
	String ceo;
	String name;

      public void show() {
    	  System.out.println(id + ": company id  :   " + salary + ": salary  :   " + ceo + " :CEO  :   " + name );
      }

}


public class Emp{
	public static void main(String args[]) {
		Employee ananth=new Employee();
		ananth.id=8;
		ananth.salary=4000000;
		ananth.ceo="king B S R";
		ananth.name="ANANTHRAM";
		
		Employee harshitha=new Employee();
		harshitha.id=13;
		harshitha.salary=352352;
		harshitha.ceo="gerat GURAJJA";
		harshitha.name="HARSHITHA";
		
	
     ananth.show();
     harshitha.show();
}
}
