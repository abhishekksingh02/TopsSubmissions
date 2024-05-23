<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
    // Calling OTP from the form 
    String otp = request.getParameter("otp");
    String otp2 = request.getParameter("otp2");
    String otp3 = request.getParameter("otp3");
    String otp4 = request.getParameter("otp4");
    
    // Converting OTP into integer
    
    int otp11 = Integer.parseInt(otp);
    int otp22 = Integer.parseInt(otp2);
    int otp33 = Integer.parseInt(otp3);
    int otp44 = Integer.parseInt(otp4);
    
    //System.out.print(otp11+otp22);
    
    // Calling From the Form
    
    int n1 = (int) session.getAttribute("n1");
    int n2 = (int) session.getAttribute("n2");
    int n3 = (int) session.getAttribute("n3");
    int n4 = (int) session.getAttribute("n4");
    
    System.out.print("Start");
    System.out.print(otp11+ " " +n1);
    System.out.print(otp22+ " " +n2);
    System.out.print(otp33+ " " +n3);
    System.out.print(otp44+ " " +n4);
    System.out.print("End");
     
    if(otp11==n1)
    {
    	if(otp22==n2)
    	{
    		if(otp33==n3)
    		{
    			if(otp44==n4)
    			{
    				String name = (String) session.getAttribute("name");
    				String surname = (String) session.getAttribute("surname");
    				String phone = (String) session.getAttribute("phone");
    				String email = (String) session.getAttribute("email");
    				String gender = (String) session.getAttribute("gender");
    				String pwd = (String) session.getAttribute("pwd");
    				String cpwd = (String) session.getAttribute("cpwd");
    				
    				Class.forName("com.mysql.jdbc.Driver");
    				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorfinderdb","root","");
    				
    				PreparedStatement ps = con.prepareStatement("select * from signup where email=?");
    				ps.setString(1, email);
    				ResultSet rs = ps.executeQuery();
    				
    				if(rs.next())
    				{
    					out.print("exist");
    				}
    				else
    				{
    					PreparedStatement ps2 = con.prepareStatement("insert into signup (name,surname,phone,email,gender,pwd,cpwd) values (?,?,?,?,?,?,?)");
        				ps2.setString(1, name);
        				ps2.setString(2, surname);
        				ps2.setString(3, phone);
        				ps2.setString(4, email);
        				ps2.setString(5, gender);
        				ps2.setString(6, pwd);
        				ps2.setString(7, cpwd);
        				int data = ps2.executeUpdate();
        				out.print(data);
        				
        				RequestDispatcher rd = request.getRequestDispatcher("EmailSendingServlet");
        				request.setAttribute("e1", email);
        				rd.forward(request, response); 
    				}
    				
    				
    				/* PreparedStatement ps2 = con.prepareStatement("insert into signup (name,surname,phone,email,gender,pwd,cpwd) values (?,?,?,?,?,?,?)");
    				ps2.setString(1, name);
    				ps2.setString(2, surname);
    				ps2.setString(3, phone);
    				ps2.setString(4, email);
    				ps2.setString(5, gender);
    				ps2.setString(6, pwd);
    				ps2.setString(7, cpwd);
    				int data = ps2.executeUpdate();
    				out.print(data);
    				
    				RequestDispatcher rd = request.getRequestDispatcher("EmailSendingServlet");
    				request.setAttribute("e1", email);
    				rd.forward(request, response); */
    						
    			}
    			else
    			{
    				response.sendRedirect("register.jsp");
    			}
    		}
    		else
    		{
    			response.sendRedirect("register.jsp");
    		}
    	}
    	else
    	{
    		response.sendRedirect("register.jsp");
    	}
    }
    else
    {
    	response.sendRedirect("register.jsp");
    }
 
%>
         
</body>
</html>