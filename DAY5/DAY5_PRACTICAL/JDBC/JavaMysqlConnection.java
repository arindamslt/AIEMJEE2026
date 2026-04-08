package JDBC;
import java.sql.*;
class TestConnection{
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String select_sql="select * from customer_dtls";
    private String insert_sql="insert into customer_dtls values(?,?,?)";
    private String delete_sql="delete from customer_dtls where cid=?";
    public String update_sql="update customer_dtls set cname=?,cphno=? where cid=?";
    public void updateData()
   	{
   		try
   		{
   		//Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE DRIVER
   		//ESTABLISH THE CONNECTION
   		//cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjavadb","root","arindam");
   			ConnectionFactory con=new ConnectionFactory();
   			cn=con.getConn();
   			ps=cn.prepareStatement(update_sql);
   		ps.setString(3,"C2");
   		ps.setString(1,"AJOY");
   		ps.setString(2,"12341234");
   		ps.executeUpdate();//SAVING DATA INTO DATABASE
   		}
   		/*catch(ClassNotFoundException ce)
   		{
   			ce.printStackTrace();
   		}*/
   		catch(SQLException se)
   		{
   			se.printStackTrace();
   		}
   	}
    public void deleteData()
	{
		try
		{
		//Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE DRIVER
		//ESTABLISH THE CONNECTION
		//cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjavadb","root","arindam");
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			ps=cn.prepareStatement(delete_sql);
		ps.setString(1,"C1");
		
		ps.executeUpdate();//SAVING DATA INTO DATABASE
		}
		/*catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}*/
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
    public void insertData()
	{
		try
		{
		//Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE DRIVER
		//ESTABLISH THE CONNECTION
		//cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjavadb","root","arindam");
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			ps=cn.prepareStatement(insert_sql);
		ps.setString(1,"C3");
		ps.setString(2,"AYAN");
		ps.setString(3,"343434");
		ps.executeUpdate();//SAVING DATA INTO DATABASE
		}
		/*catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}*/
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void getData()
	{
		try
		{
		//Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE DRIVER
		//ESTABLISH THE CONNECTION
	//	cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjavadb","root","arindam");
		ConnectionFactory con=new ConnectionFactory();
		cn=con.getConn();
			st=cn.createStatement();//CREATING THE STATEMENT
		rs=st.executeQuery(select_sql);
		while(rs.next())
		{
			//System.out.println(rs.getString(1));
			//System.out.println(rs.getString(2));
			//System.out.println(rs.getString(3));
	System.out.println(rs.getString(1)+"==>"+rs.getString(2)+"===>"+rs.getString(3));
		}
		}
		/*catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}*/
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
public class JavaMysqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 TestConnection ts=new TestConnection();
//ts.insertData();
 //ts.deleteData();
 //ts.updateData();
 ts.getData();
	}

}
