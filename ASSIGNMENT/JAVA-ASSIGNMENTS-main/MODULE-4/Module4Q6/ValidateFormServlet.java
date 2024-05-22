import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidateFormServlet extends HttpServlet {
        /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        	// TODO Auto-generated method stub
//        	super.doPost(req, resp);
        	String firstName = request.getParameter("firstName");
        	String lastName = request.getParameter("lastName");
        	String mobile = request.getParameter("mobile");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            
            // validating first name and last name
            if (!isValidName(firstName) || !isValidName(lastName)) {
                response.getWriter().println("Invalid first name or last name.");
                return;
            }

            // Validate mobile number
            if (!isValidMobile(mobile)) {
                response.getWriter().println("Invalid mobile number.");
                return;
            }

            // Validate email
            if (!isValidEmail(email)) {
                response.getWriter().println("Invalid email.");
                return;
            }

            // Validate password
            if (!isValidPassword(password)) {
                response.getWriter().println("Invalid password.");
                return;
            }

            response.getWriter().println("Form submitted successfully!");
        }

        private boolean isValidName(String name) {
            return name != null && name.matches("[a-zA-Z]+");
        }

        private boolean isValidMobile(String mobile) {
            return mobile != null && mobile.matches("\\d{10}");
        }

        private boolean isValidEmail(String email) {
            if (email == null) return false;
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            Pattern pattern = Pattern.compile(emailRegex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }

        private boolean isValidPassword(String password) {
            return password != null && password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%&_]).{8,}$");
        }
    
    }

