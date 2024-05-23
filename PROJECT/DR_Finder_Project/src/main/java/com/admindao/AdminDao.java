package com.admindao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.adminModel.adminModel;
import com.adminModel.docModel;
import com.dao.dao;
import com.model.model;

public class AdminDao {
     
	public static Connection getconnect()
	{
		Connection con = null;
		  
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorfinderdb", "root", "");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	
	//Admin Login
	public adminModel Login (adminModel model)
	{
		adminModel obj = null;
		
		try 
		{
			Connection con = getconnect();
			PreparedStatement ps = con.prepareStatement("select * from admin where uname=? and pass=?");
			ps.setString(1, model.getUname());
			ps.setString(2, model.getPass());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				obj = new adminModel();
				obj.setId(rs.getInt("id"));
				obj.setUname(rs.getString("uname"));
				obj.setPass(rs.getString("pass"));
			}
		} 
		catch (SQLException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		return obj;
	}
	
	// insert
	
	public static int createdata(docModel model) {
		Connection con = AdminDao.getconnect();
		int status = 0;
		
		String sql = "insert into doctors(name,speciality,experience,edu_bkg) values(?,?,?,?)";
		
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			//Getting all details from model
		    ps.setString(1, model.getName());
		    ps.setString(2, model.getSpeciality());
		    ps.setString(3, model.getExperience());
		    ps.setString(4, model.getEdu_bkg());
		    
		    status = ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return status;
		
	}

	// Delete from the table Doctors on the basis of id
	
	public static int deleteData(int id)
	{
		Connection con = AdminDao.getconnect();
		
		int status = 0;
		
		String sql = "delete from doctors where id=?";
		
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);// Getting details from model
			status = ps.executeUpdate();
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	    
		return status;
	}
	
	// Edit data 
	
	public static docModel editData(int id)
	{
		Connection con = AdminDao.getconnect();
		
		docModel dm = new docModel();
		
		String sql = "select * from doctors where id=?";
		
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int id1 = set.getInt(1);
				String name = set.getString(2);
				String speciality = set.getString(3);
				String experience = set.getString(4);
				String edu_bkg = set.getString(5);
				
				dm.setId(id1);
				dm.setName(name);
				dm.setSpeciality(speciality);
				dm.setExperience(experience);
				dm.setEdu_bkg(edu_bkg);
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		return dm;
	}
	
	// Update the doc credentials in DB
	
	 public static int updatedata(docModel m)
	 {
		 Connection con = AdminDao.getconnect();
		 
		 int status = 0 ;
		 
		 String sql = "update doctors set name=?, speciality=?, experience=?, edu_bkg=? where id=?";
		 
		 try 
		 {
			PreparedStatement ps = con.prepareStatement(sql);
		
			//Getting details from model
			
			ps.setString(1, m.getName());
			ps.setString(2, m.getSpeciality());
			ps.setString(3, m.getExperience());
			ps.setString(4, m.getEdu_bkg());
			ps.setInt(5, m.getId());
			
		    status = ps.executeUpdate();
		 } 
		 catch (Exception e)
		 {
			// TODO: handle exception
			 e.printStackTrace();
		}
		 
		 return status;
	 }
	
	
}
