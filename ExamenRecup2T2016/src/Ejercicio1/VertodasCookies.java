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
 * Servlet implementation class VertodasCookies
 */
@WebServlet("/VertodasCookies")
public class VertodasCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public VertodasCookies() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Cookie cookiesValores[] = null;
		cookiesValores = request.getCookies();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Cookies</title>");
		out.println("</head>");
		out.println("<body>");
		if (cookiesValores != null) {
			for (int i = 0; i < cookiesValores.length; i++) {
				// valor=cookiesValores[i].getValue();
				out.println("<p>Nombre de la cookie: "
						+ cookiesValores[i].getName() + " </p>");
				out.println("<p>Contenido de la cookie: "
						+ cookiesValores[i].getValue() + " </p>");
				out.println("<p>---------------------------------------------- </p>");
			}
		} else {
			out.println("<p>No hay Cookies" + "</p>");

		}
		// out.println("<input type='button'value='Volver' onClick='window.location.reload()'/>");
		out.println("</body>");
		out.println("</html>");
		
	}
		


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Cookie cookiesValores[] = null;
		cookiesValores = request.getCookies();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Cookies</title>");
		out.println("</head>");
		out.println("<body>");
		if (cookiesValores != null) {
			for (int i = 0; i < cookiesValores.length; i++) {
				// valor=cookiesValores[i].getValue();
				out.println("<p>Nombre de la cookie: "
						+ cookiesValores[i].getName() + " </p>");
				out.println("<p>Contenido de la cookie: "
						+ cookiesValores[i].getValue() + " </p>");
				out.println("<p>---------------------------------------------- </p>");
			}
		} else {
			out.println("<p>No hay Cookies" + "</p>");

		}
		// out.println("<input type='button'value='Volver' onClick='window.location.reload()'/>");
		out.println("</body>");
		out.println("</html>");
		out.println("</body>");
	}

}
