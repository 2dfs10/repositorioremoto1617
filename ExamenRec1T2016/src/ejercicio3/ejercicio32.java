package ejercicio3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ejercicio32
 */
@WebServlet("/ejercicio32")
public class ejercicio32 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Conecta conexion = new Conecta();
	ResultSet resultados = null; // objeto para guardar los resultados

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ejercicio32() {
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
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String consulta = "select * from tarticulos";
		// ejecutamos orden
		try {
			resultados = conexion.getSentencia().executeQuery(consulta);

			if (resultados.isBeforeFirst()) {

				// hay algun record

				out.println("<h1>Listado de Artículos</h1>");

				out.println("&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"
						+ "Nombre Articulo&nbsp;&nbsp;&nbsp; &nbsp; &nbsp;" + "&nbsp; &nbsp;&nbsp; &nbsp; Codigo"
						+ "Articulo&nbsp;&nbsp;&nbsp;" + "&nbsp;&nbsp;&nbsp;&nbsp; Precio &nbsp; &nbsp;"
						+ "&nbsp; &nbsp; Importado &nbsp; &nbsp; &nbsp;" + "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
						+ "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;" + "&nbsp; &nbsp; &nbsp; Almacen &nbsp; &nbsp;"
						+ "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;" + "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
						+ "&nbsp; &nbsp; &nbsp;Stock &nbsp;<br>");
				out.println("<br>");
				out.println("<br>");
				while (resultados.next()) {
					out.println(resultados.getString("nombrearticulo"));
					out.println("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;");
					out.println("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;");
					out.println("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;");
					out.println("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;");
					out.println("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;");
					out.println(resultados.getString("codarticulo"));
					out.println("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;");
					out.println("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;");
					out.println(resultados.getString("precio"));
					out.println("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;");

					out.println("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;");
					out.println(resultados.getString("importado"));
					out.println("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;");
				 
					out.println("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;");
					out.println(resultados.getString("almacen"));
					out.println("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;");
					out.println("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;");

					out.println("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;");
					out.println("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;");
					out.println(resultados.getString("stock"));
					out.println("<br>");

				}
			} else {

				out.println("no hay ningún record");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
