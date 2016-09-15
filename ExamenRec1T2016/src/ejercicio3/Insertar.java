package ejercicio3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Insertar11
 */
@WebServlet("/Insertar")
public class Insertar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Conecta conexion = new Conecta();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Insertar() {
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
		String vnombrearticulo = request.getParameter("nombrearticulo");
		String vcodarticulo = request.getParameter("codigoarticulo");
		String vprecio = request.getParameter("precio");
		String vimportado = request.getParameter("importado");
		String[] valmacen = request.getParameterValues("almacen");
		String vstock = request.getParameter("stock");

		String v2almacen = "";
		for (int i = 0; i < valmacen.length; i++) {
			if (valmacen[i] != null) {
				v2almacen += " " + valmacen[i];
			}
		}

		String inserta = "INSERT INTO tarticulos VALUES('" + vnombrearticulo + "','" + Integer.parseInt(vcodarticulo)
				+ "','" + Integer.parseInt(vprecio) + "','" + vimportado + "','" + v2almacen + "',  '"
				+ Integer.parseInt(vstock) + "')";

		try {

			conexion.getSentencia().executeUpdate(inserta);
			out.println ("Insertado registro con éxito ");
			 

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// se ha producido un error
			out.println(" Clave Duplicada ");
			 
		}
		response.setHeader("Refresh", "2; URL=" +"../ExamenRec1T2016/ejercicio3/Insertar.html");
		//response.setHeader("Refresh", "2; URL=" + "Insertar.html");
	}

	/*
	 * String inserta = "INSERT INTO tarticulos VALUES('" + vnombrearticulo +
	 * "','" + vcodarticulo + "','" + vprecio + "','" + vimportado + "','" +
	 * v2almacen + "',  '" + vstock + "')";
	 * 
	 */

	/*
	 * 
	 * 
	 * // String consulta = "INSERT INTO tutorias_t2 //
	 * VALUES(null,'"+alumno+"','"+profesor+"','"+dia+"','"+hora+"','"+asunto+"'
	 * )";
	 * 
	 * String consulta = "SELECT * FROM 'tarticulos' WHERE codarticulo='"
	 * +vcodarticulo+"'";
	 * 
	 * //String consulta =
	 * "SELECT id,alumno,profesor,dia,hora,asunto FROM tutorias_t2 WHERE id='"
	 * +id+"'";
	 * 
	 * 
	 * try { resultados = conexion.getSentencia().executeQuery(consulta); //
	 * resultados = ordensql.executeQuery(consulta);
	 * 
	 * if (resultados.isBeforeFirst()) { // si hay alguna tupla, Error
	 * 
	 * out.println(" Error, LLave Repetida....");
	 * 
	 * response.setHeader("Refresh", "3;URL=registro.html");
	 * 
	 * } else { // no hay llaves repetidas, se inserta el dato
	 * 
	 * String inserta = "INSERT INTO tarticulos VALUES('" + vnombrearticulo +
	 * "','" + vcodarticulo + "','" + vprecio + "','" + vimportado + "','" +
	 * v2almacen + "',  '" + vstock + "')";
	 * 
	 * 
	 * conexion.getSentencia().executeUpdate("inserta");
	 * //ordensql.executeUpdate("inserta");
	 * 
	 * }
	 * 
	 * } catch (SQLException e1) { // TODO Auto-generated catch block
	 * e1.printStackTrace(); }
	 * 
	 */

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
