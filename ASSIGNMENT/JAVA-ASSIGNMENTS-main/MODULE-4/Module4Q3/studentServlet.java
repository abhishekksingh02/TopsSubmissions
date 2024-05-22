package myPackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class studentServlet extends HttpServlet {
        
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		
		// Getting data from index.jsp form through post method
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String gender =request.getParameter("gender");
		String password =request.getParameter("password");
		
		// Printing data on console from index.jsp through post method
		System.out.println("First name: " + fname);
		System.out.println("Last name: " + lname);
		System.out.println("Email: " + email);
		System.out.println("Mobile: " + mobile);
		System.out.println("Gender: " + gender);
		System.out.println("Password: " + password);
	}
}
