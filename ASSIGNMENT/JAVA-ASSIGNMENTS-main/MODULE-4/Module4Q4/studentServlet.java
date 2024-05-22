package myPackage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class studentServlet extends HttpServlet {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);

		// Fetching the data from index.jsp
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String gender = request.getParameter("gender");
		String password = request.getParameter("password");

		
		
				
		request.setAttribute("fname" ,fname); 
		request.setAttribute("lname", lname);
		request.setAttribute("email", email);
		request.setAttribute("mobile", mobile);
		request.setAttribute("gender", gender);
		request.setAttribute("password", password);
		RequestDispatcher rd = request.getRequestDispatcher("studentData.jsp");
		rd.forward(request, response);
		

	}
}
