package EXCEPTION;
class Calc
{
	public int x=25;
	public int y=5;
	public void calculation()
	{
		try
		{
		     int z=x/y;
		   System.out.println("Z:"+z);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
			//System.out.println(ae);
			//System.out.println(ae.getMessage());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally {
			System.out.println("ALWAYS EXECUTED");//WHETHER EXCEPTION OCCUR OR NOT IT IS EXECUTED
		}
		
	}
	public void show()
	{
		System.out.println("X:"+x);
	}
}
public class UncheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calc cl=new Calc();
cl.calculation();
cl.show();
	}

}
