package Ejercicio1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adjuntarCookie")
public class adjuntarCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public adjuntarCookie() {
		super();
		// TODO Auto-generated constructor stub
	}



	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Cookie c = new Cookie(request.getParameter("nombre"),
				request.getParameter("valor"));
		c.setMaxAge(Integer.parseInt(request.getParameter("duracion")));
		response.addCookie(c);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Cookies</title>");
		out.println("</head>");
		out.println("<body>");

		out.println("<h1>Cookie añadida con èxito " + "</h1>");
		out.println("</body>");
		
		out.println("</html>");
	
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	
	}
}
