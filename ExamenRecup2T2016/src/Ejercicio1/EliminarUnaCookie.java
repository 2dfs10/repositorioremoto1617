package Ejercicio1;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EliminarUnaCookie
 */
@WebServlet("/EliminarUnaCookie")
public class EliminarUnaCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarUnaCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Cookie[] cookies = request.getCookies();
		String nombrecookie = request.getParameter("nombre");
		String encontrado = "NO";
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Buscar Cookies</title>");
		out.println("</head>");
		out.println("<body>");
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				// valor=cookiesValores[i].getValue();
				// Buscar la cookie "user.ck"
				if (cookies[i].getName().equals(nombrecookie)) {
					// se borra la cookie
					cookies[i].setMaxAge(0);
					response.addCookie(cookies[i]);
					out.println("<p>Cookies eliminadas con ese nombre" + "</p>");
					encontrado = "SI";
					break;
				}
			}
		}

		if (encontrado == "NO") {
			out.println("<p>No hay Cookies con ese nombre" + "</p>");
		}

		out.println("</body>");
		out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
