package OOPS;
class Parent
{
	public int a=25;
}
class Child extends Parent{
	public int b=60;
	public void add()
	{
		int c=a+b;
		System.out.println("RESULT IS:"+c);
	}
	
}
public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Child ch=new Child();
  ch.add();
	}

}
