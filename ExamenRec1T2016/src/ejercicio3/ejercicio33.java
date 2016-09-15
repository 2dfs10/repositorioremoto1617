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
 * Servlet implementation class ejercicio33
 */
@WebServlet("/ejercicio33")
public class ejercicio33 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Conecta conexion = new Conecta();
	ResultSet resultados = null; // objeto para guardar los resultados

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ejercicio33() {
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

		String vcodarticulo = request.getParameter("codigoarticulo");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String consulta = "select * from tarticulos where codarticulo ='" + Integer.parseInt(vcodarticulo) + "'";

		// String consulta = "SELECT id,alumno,profesor,dia,hora,asunto FROM
		// tutorias_t2 WHERE id='"+id+"'";

		try {
			resultados = conexion.getSentencia().executeQuery(consulta);
			if (resultados.isBeforeFirst()) {

				while (resultados.next()) {

					// ver la ficha concreta

					out.println("<form method='post' action='Ejercicio331'>");
					// el nombre del alumno se supone único , pues el criterio
					// para acceder a la ficha y modificarla
					// se pone a readonly
					out.println("<br>Nombre Artículo: " + "<input name='nombrearticulo'" + " value="
							+ resultados.getString("nombrearticulo") + ">");

					out.println("<br><br>Código de Artículo: " + "<input readonly name='codarticulo'" + " value="
							+ resultados.getInt("codarticulo") + ">");

					out.println("<br><br>Precio: " + "<input name='precio'" + " value=" + resultados.getInt("precio")
							+ ">");

					// selection list

					String vimpo = resultados.getString("importado");
					if (vimpo.contains("no")) {

						out.println("<br><br>Importado: " + "<select name='importado'>+" + "<option>si</option>+"
								+ "<option selected='selected'>no</option>" + "</select>" + "");

					} else {
						out.println("<br><br>Importado: " + "<select name='importado'>+" + "<option>no</option>+"
								+ "<option selected='selected'>si</option>" + "</select>" + "");

					}

					out.println("<br>");
					out.println("<br>");

					// Check Box..........

					String v2almacen = resultados.getString("almacen");
					out.println("almacennnnnn  " + v2almacen);
					out.println("<br>");
					out.println("<br>");

					int comprueba1 = 0;
					int comprueba2 = 0;
					int comprueba3 = 0;
					int comprueba4 = 0;

					comprueba1 = v2almacen.indexOf("Huelva");
					comprueba2 = v2almacen.indexOf("Sevilla");
					comprueba3 = v2almacen.indexOf("Cadiz");
					comprueba4 = v2almacen.indexOf("Malaga");

					if (comprueba1 != -1) {
						// la ha encontrado
						out.println("<input  checked='checked' name='almacen' value='Huelva' type='checkbox'>"
								+ " Huelva   ");

					} else {
						// no hay
						out.println("<input  name='almacen' value='Huelva' type='checkbox'>" + " Huelva   ");

					}

					if (comprueba2 != -1) {
						// la ha encontrado
						out.println("<input	 checked='checked' name='almacen' value='Sevilla' type='checkbox'>"
								+ " Sevilla ");

					} else {
						// no hay
						out.println("<input   	 name='almacen' value='Sevilla' type='checkbox'>" + " Sevilla   ");

					}

					if (comprueba3 != -1) {
						// lo ha encontrado
						out.println(
								"<input	checked='checked' name='almacen' value='Cadiz' type='checkbox'>" + " Cadiz ");

					} else {
						//
						out.println("<input  	 name='almacen' value='Cadiz' type='checkbox'>" + " Cadiz   ");

					}

					if (comprueba4 != -1) {
						// lo ha encontrado
						out.println("<input	  checked='almacen' name='checkk' value='Malaga' type='checkbox'>"
								+ " Malaga ");

					} else {
						//
						out.println("<input 	 name='almacen' value='Malaga' type='checkbox'>" + " Malaga   ");

					}

					out.println(
							"<br><br>Stock: " + "<input name='stock'" + " value=" + resultados.getInt("stock") + ">");

					out.println("<br><br><input value='Modificar' type='submit'><br>");

					out.println("</form>");

				}
			} else {
				// no encontrado no existe.

				out.print("No hay ningún artículo con ese Código");
				response.setHeader("Refresh", "2; URL=" + "../ExamenRec1T2016/ejercicio3/modificar.html");

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
