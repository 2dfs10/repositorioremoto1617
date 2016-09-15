package ejercicio3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ejercicio331
 */
@WebServlet("/Ejercicio331")
public class Ejercicio331 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Conecta conexion = new Conecta();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Ejercicio331() {
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
		String vcodarticulo = request.getParameter("codarticulo");
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

		// Ahora hago la modificación

		String modificar = "UPDATE tarticulos SET nombrearticulo='" + vnombrearticulo + "'," + "precio='"
				+ Integer.parseInt(vprecio) + "', " + "importado='" + vimportado + "', almacen ='" + v2almacen
				+ "', stock ='" + Integer.parseInt(vstock) + "'  WHERE codarticulo= '" + Integer.parseInt(vcodarticulo)
				+ "'";

 

		try {
			conexion.getSentencia().executeUpdate(modificar);
			out.println("Modificado registro con éxito ");
			  
			response.setHeader("Refresh", "2; URL=" + "../ExamenRec1T2016/ejercicio3/modificar.html");
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
