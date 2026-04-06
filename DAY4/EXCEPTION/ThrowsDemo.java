package EXCEPTION;
class Calcs
{
	public int x=25;
	public int y=0;
	public void calculation() throws ArithmeticException,Exception 
	{
		
		     int z=x/y;//CALLE ENVIRONMENT
		   System.out.println("Z:"+z);
		
		
		
	}
	
}
public class ThrowsDemo {

	public static void main(String[] args) throws ArithmeticException,Exception {
		// TODO Auto-generated method stub
Calcs c=new Calcs();
c.calculation();//CALLER ENVIRONMENT
	}

}
