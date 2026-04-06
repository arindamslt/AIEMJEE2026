package EXCEPTION;
import java.sql.*;
class TestConnection
{
	private Connection cn=null;
   public void testconnection()
   {
	   try
	   {
	      Class.forName("com.mysql.driver");
	      cn=DriverManager.getConnection("mysql:3306/db","root","root");
	   /*int x=10;
	   int y=0;
	   int z=x/y;*/
	   }
	   catch(ClassNotFoundException ce)
	   {
		   ce.printStackTrace();
	   }
	   catch(SQLException se)
	   {
		   se.printStackTrace();
	   }
	   
   }
}
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
