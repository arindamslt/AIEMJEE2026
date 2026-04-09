package model;
import java.sql.*;

import utilities.ConnectionFactory;
public class FoodDao {
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	//private String select_sql="select * from customer_dtls";
    private String insert_sql="insert into food values(?,?,?)";
  //  private String delete_sql="delete from customer_dtls where cid=?";
   // public String update_sql="update customer_dtls set cname=?,cphno=? where cid=?";
    public void insertData(String fid,String fname,double price)
   	{
   		try
   		{
   	
   			ConnectionFactory con=new ConnectionFactory();
   			cn=con.getConn();
   			ps=cn.prepareStatement(insert_sql);
   		ps.setString(1,fid);
   		ps.setString(2,fname);
   		ps.setDouble(3,price);
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
}
