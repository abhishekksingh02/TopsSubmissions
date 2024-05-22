import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dao 
{
	
	//Connection Establish
	public static Connection getconnect()
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
		
		String sql ="insert into module4q7(fname,lname,mob,tech,fees) values (?,?,?,?,?)";
		
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			
			//get all details from model
			
			ps.setString(1,m.getFname());
			ps.setString(2,m.getLname());
			ps.setString(3,m.getMob());
			ps.setString(4,m.getTechnology());
			ps.setInt(5,m.getFees());
			
			status = ps.executeUpdate();
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return status;
	}
	
		//view 
	
		public static List<Model> viewdata()
		{
			Connection con = Dao.getconnect();
			List<Model>list = new ArrayList();
			
			String sql ="Select * from module4q7";
			
			try 
			{
				PreparedStatement ps = con.prepareStatement(sql);
				
				ResultSet set = ps.executeQuery();
				
				while(set.next())
				{
					int id = set.getInt(1);
					String fname = set.getString(2);
					String lname = set.getString(3);
					String mob = set.getString(4);
					String tech = set.getString(5);
					int fees = set.getInt(6);
					
					Model m = new Model();
					m.setId(id);
					m.setFname(fname);
					m.setLname(lname);
					m.setMob(mob);
					m.setTechnology(tech);
					m.setFees(fees);
					
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
		
		//Delete
		
		public static int deletedata(int id)
		{
			Connection con = Dao.getconnect();
			
			int status = 0;
			
			String sql ="delete from module4q7 where id=?";
			
			try 
			{
				PreparedStatement ps = con.prepareStatement(sql);
				
				//get all details from model
				
				ps.setInt(1,id);
				status = ps.executeUpdate();
				
			}
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return status;
		}
		
		//Edit
		
				public static Model editdata(int id)
				{
					Connection con = Dao.getconnect();
					
					Model m = new Model();
					
					String sql ="select * from module4q7 where id=?";
					
					try 
					{
						PreparedStatement ps = con.prepareStatement(sql);
						ps.setInt(1,id);
						
						ResultSet set = ps.executeQuery();
						
						if(set.next())
						{
							
							int id1 = set.getInt(1);
							String fname = set.getString(2);
							String lname = set.getString(3);
							String mob = set.getString(4);
							String tech = set.getString(5);
							int fees = set.getInt(6);
							
							m.setId(id1);
							m.setFname(fname);
							m.setLname(lname);
							m.setMob(mob);
							m.setTechnology(tech);
							m.setFees(fees);
							
							
						}
						
						//get all details from model
						
						
						
					}
					catch (Exception e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					return m;
				}
		
				//update 
				
				public static int updatedata(Model m)
				{
					Connection con = Dao.getconnect();
					
					int status = 0;
					
					String sql ="update module4q7 set fname=?,lname=?,mob=?,tech=?,fees=? where id=?";
					
					try 
					{
						PreparedStatement ps = con.prepareStatement(sql);
						
						//get all details from model
						
						ps.setString(1,m.getFname());
						ps.setString(2,m.getLname());
						ps.setString(3,m.getMob());
						ps.setString(4,m.getTechnology());
						ps.setInt(5,m.getFees());
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
	
	
	
}
