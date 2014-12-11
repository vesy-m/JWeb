package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;

public class Inscription extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		
		// Now use our Coffee Model above
		User.createUser(firstname, lastname, email, password);
		
		// Use the below code to debug the program if you get problems
		// response.setContentType("text/html"):
		// PrintWriter out = response.getWriter();
		// out.println("Coffee Selection Advise<br>");

		// Iterator it = result.iterator();
		// while(it.hasNext()) {
		// out.print("<br>try: " + it.next());
		// }

		// The results will be passed back (as an attribute) to the JSP view
		// The attribute will be a name/value pair, the value in this case will
		// be a List object
		// request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}
}