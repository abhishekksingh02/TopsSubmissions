import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditServlet2")
public class EditServlet2 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		int id2 = Integer.parseInt(id);
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String mob = req.getParameter("mob");
		String tech = req.getParameter("technology");
		String fees = req.getParameter("fees");
		int fees2 = Integer.parseInt(fees);
		
		Model m = new Model();
		//set in Model
		m.setId(id2);
		m.setFname(fname);
		m.setLname(lname);
		m.setMob(mob);
		m.setTechnology(tech);
		m.setFees(fees2);
		
		
		int data = Dao.updatedata(m);
		
		if(data>0)
		{
			//out.print("success");
			resp.sendRedirect("ViewServlet");
		}
		else
		{
			out.print("fail");
		}
	
	}
}
