
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ejemplo
 */
@WebServlet("/Ejemplo")
public class Ejemplo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static final String NEW_HOST = "http://www.elmundo.es";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Ejemplo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String metodo = request.getMethod();

		out.println("El método de comunicación es " + metodo);

		String vuri = request.getRequestURI();
		out.println("<br>");
		out.println("El valor del URI " + vuri);

		out.println("Protocolo " + request.getProtocol());
		out.println("<br>");
		out.println("Path " + request.getContextPath());
		out.println("<br>");
		out.println("Dirección Remota " + request.getRemoteAddr());
		out.println("<br>");
		out.println("Remote Host " + request.getRemoteHost());
		out.println("<br>");
		out.println("Puerto Remoto" + request.getRemotePort());
		out.println("<br>");
		out.println(" URL " + request.getRequestURL());
		out.println("<br>");
		out.println("<br>");
		out.println("<br>");
		out.println("<br>");
		out.println("<br>");
		
		

		Enumeration e = request.getHeaderNames();
		
		
		while (e.hasMoreElements()) {
			String name = (String) e.nextElement();
			String value = request.getHeader(name);
			out.println(name + " = " + value);
			out.println("<br>");
		}
		

	 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 doGet(request, response); 
	}

}
