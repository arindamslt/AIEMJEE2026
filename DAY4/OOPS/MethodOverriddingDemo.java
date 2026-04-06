package OOPS;
class Parents
{
	public void show()
	{
		System.out.println("I AM IN PARENT CLASS");
	}
}
class Childs extends Parents{
	public void show()
	{
		super.show();//calling the super class method which is hidden in sub class
		System.out.println("I AM IN CHILD CLASS");
	}
}
public class MethodOverriddingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Childs ch=new Childs();
   ch.show();//ALWAYS OVERRIDDEN IS CALLED
   
	}

}
