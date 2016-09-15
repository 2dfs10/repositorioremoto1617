package ejercicio1;

// eJERCICIO 1
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ejercicio1
 */
@WebServlet("/ejercicio1")
public class ejercicio1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ejercicio1() {
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String nombre = request.getParameter("nombre");
 

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		// Primero obtenemos las cookies del cliente
		Cookie[] cookies = request.getCookies();// con esto recojo en una
												// variable todas las cookies
												// que existan

		// Tenemos que comprobar si es o no la primera vez que mete el nombre

		boolean esPrimeraVez = true;
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals(nombre)) {
					esPrimeraVez = false;
				}
			}
		}

		// Si es la primera vez creo la cookie con el nombre y el gusto

		if (esPrimeraVez) {

			
			String section = "<section>" + 
					"<h3>" + nombre + ", en tus ratos libre ¿qué te gusta más hacer?</h3>" +
					"<div>" +
					"	<form action='SetCookie' method='get'>" +
					"		<input type='hidden' name='nombre' value='" + nombre + "'/>" +
					"		<input type='radio' name='gustos' value='libros' checked='checked'/>" +
					"		<label>Leer libros</label>" +
					"		<input type='radio' name='gustos' value='musica'/>" +
					"		<label>Escuchar música</label>" +
					"		<input type='radio' name='gustos' value='peliculas'/>" +
					"		<label>Ver películas</label>" +
					"		<br />" +
					"		<input type='submit' name='submit' value='Entrar'/>" +
					"	</form>" +
				 	"</div>" +
				 "</section>"; 
			out.println(section);
	
			//response.setHeader("Refresh", "0; URL=" + gustos + ".html");

		}
		// ya existe la cookie
		else {
			String gustos = "";

			if (cookies != null) {
				for (Cookie cookie : cookies) {
					if (cookie.getName().equals(nombre)) {
						gustos = cookie.getValue();
					}
				}
			}

			//response.setHeader("Refresh", "0; URL=" + gustos + ".html");
			response.setHeader("Refresh", "0; URL=" +"../ExamenRec1T2016/ejercicio1/"+gustos+".html");
		}

	}

}
