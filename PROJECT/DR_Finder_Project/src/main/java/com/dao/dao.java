package com.dao;
// For database connectivity

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.DoctorModel;
import com.model.contactModel;
import com.model.model;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;

public class dao {
   public static Connection getconnect()
   {
	   Connection con = null;
	   try 
	   {
		Class.forName("com.mysql.jdbc.Driver");
		con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorfinderdb","root","");
	   } 
	   catch (Exception e) 
	   {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
	   
	   return con;
	   
   }
   
   //Fetching data to database
   
   public static int savedata(model m)
   {
	   int status =0 ;
	   Connection con = dao.getconnect();
	   
	   try {
		PreparedStatement ps = con.prepareStatement("insert into signup (name, surname, phone, email, gender, pwd, cpwd) values(?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, m.getName());
		ps.setString(2, m.getSurname());
		ps.setString(3, m.getPhone());
		ps.setString(4, m.getEmail());
		ps.setString(5, m.getGender());
		ps.setString(6, m.getPwd());
		ps.setString(7, m.getCpwd());
		
		status = ps.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return status;
   }
   
   // Login
   
   public static model login(model m1)
   {   
	   model obj = null;
	   
	   Connection con = dao.getconnect();
	   try {
		PreparedStatement ps = con.prepareStatement("select * from signup where email=? and pwd=?");
		ps.setString(1, m1.getEmail());
		ps.setString(2, m1.getPwd());
		
	    ResultSet rs = (ResultSet) ps.executeQuery();
	    
	    if(rs.next())
	    {
	    	obj = new model();
	    	obj.setId(rs.getInt("id"));
	    	obj.setName(rs.getString("name"));
	    	obj.setSurname(rs.getString("surname"));
	    	obj.setPhone(rs.getString("phone"));
	    	obj.setEmail(rs.getString("email"));
	    	obj.setGender(rs.getString("gender"));
	    	obj.setPwd(rs.getString("pwd"));
	    }
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return obj;
   }
   
   // Edit
   
   public static model getdetailbyemail(String email)
	{
		model m = new model();
		
		Connection con = dao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("Select * from signup where email=?");
			ps.setString(1,email);
			ResultSet set = (ResultSet) ps.executeQuery();
			
			if(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String surname = set.getString(3);
				String phone = set.getString(4);
				String email1 = set.getString(5);
				String gender = set.getString(6);
				String password = set.getString(7);
				
				m.setId(id);
				m.setName(name);
				m.setSurname(surname);
				m.setPhone(phone);
				m.setEmail(email1);
				m.setGender(gender);
				m.setPwd(password);
			}
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return m;
	}
   
   // Update
   
   public static int updatedata(model m)
	{
		int status = 0;
		Connection con = dao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("update signup set name=?,surname=?,phone=?,email=?,gender=? where id=?");
			
			ps.setString(1,m.getName());
			ps.setString(2,m.getSurname());
			ps.setString(3,m.getPhone());
			ps.setString(4,m.getEmail());
			ps.setString(5,m.getGender());
			ps.setInt(6,m.getId());
			
			status = ps.executeUpdate();
		
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
   
   // Doctors
   public static List<DoctorModel> doctorviewdata()
	{
		Connection con = dao.getconnect();
		ArrayList<DoctorModel> list = new ArrayList();
		try 
		{
			PreparedStatement	ps = con.prepareStatement("select * from doctors");
			
			ResultSet set =(ResultSet) ps.executeQuery();
			
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String img = set.getString(3);
				String speciality = set.getString(4);
				String experience = set.getString(5);
				String edu_bkg = set.getString(6);
				
				DoctorModel m = new DoctorModel();
				m.setId(id);
				m.setName(name);
				m.setImg(img);
				m.setSpecility(speciality);
				m.setExperience(experience);
				m.setEdu_bkg(edu_bkg);
			
				list.add(m);
			}
		
		
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return list;
	
	}
   
   // Contact Insert User
   
    public static int contactinsertUser(contactModel m)
    {
		int status = 0;
		
		Connection con = dao.getconnect();
		
		try 
		{
			String sql ="insert into contacteduser(fullname,email,subject,message) values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1,m.getFullname());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getSubject());
			ps.setString(4,m.getMessage());
			
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
