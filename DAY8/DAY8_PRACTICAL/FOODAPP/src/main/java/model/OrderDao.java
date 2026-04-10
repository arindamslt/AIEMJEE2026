package model;
import java.sql.*;

import utilities.ConnectionFactory;
public class OrderDao {
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String select_sql="select * from BILLING ORDER BY UNAME";
    private String insert_sql="insert into orderdtls(fid,qty,uname) values(?,?,?)";
    public void insertData(String fid,int qty,String uname)
   	{
   		try
   		{
   	
   			ConnectionFactory con=new ConnectionFactory();
   			cn=con.getConn();
   			ps=cn.prepareStatement(insert_sql);
   		ps.setString(1,fid);
   		ps.setInt(2,qty);
   		ps.setString(3,uname);
   		ps.executeUpdate();//SAVING DATA INTO DATABASE
   		}
   		
   		catch(SQLException se)
   		{
   			se.printStackTrace();
   		}
   	}
    public ResultSet getData()
    {
    	try
   		{
   	
   			ConnectionFactory con=new ConnectionFactory();
   			cn=con.getConn();
   			st=cn.createStatement();
   			rs=st.executeQuery(select_sql);
   		}
   		
   		catch(SQLException se)
   		{
   			se.printStackTrace();
   		}
    	return rs;
    }
}
