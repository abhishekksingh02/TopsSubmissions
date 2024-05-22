 package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



import com.model.Model;

public class Dao 
{   public static Connection getconnect()
	  {
		Connection con = null;
		
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/module4","root","");
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return con;
	}
	
	
	//insert 
	
	public static int createdata(Model m)
	{
		Connection con = Dao.getconnect();
		
		int status = 0;
		
		String sql ="insert into module4q9(name,email,pwd,cpwd) values (?,?,?,?)";
		
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			
			//get all details from model
			
			ps.setString(1,m.getName());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getPwd());
			ps.setString(4,m.getCpwd());
			
			
			status = ps.executeUpdate();
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return status;
	}
}
