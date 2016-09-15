package jdbcestructurado;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Conecta
 */
@WebServlet("/Conecta")
public class Conecta extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// El Driver, El nombre usuario , password y la Statement siempre se va a
	// usar

	private final String controlador = "com.mysql.jdbc.Driver";

	// Driver para Oracle
	// private final String controlador = "oracle.jdbc.driver.OracleDriver";

	private final String db = "jdbc:mysql://127.0.0.1:3306/tutorias";

	// para Oracle
	// private final String db = ""jdbc:oracle:thin:@localhost:1521:tutorias";

	private final String usuario = "root";
	private final String contrase�a = "";
	private Connection conexion;
	private Statement sentencia;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Conecta() {

		try {
			// Leer el driver espec�fico de la base de datos que vamos a
			// utilizar, en nuestro caso, ser�:
			Class.forName("controlador").newInstance();

			// Establecer la conexi�n, tenemos cargado el Driver y ahora
			// establecer la conexion
			Connection conexion = DriverManager.getConnection("db", "usuario", "contrase�a");
			sentencia = conexion.createStatement();

		} catch (InstantiationException e) { // excepcion de linea 1 del
												// tray(instancia)
			System.out.println("Objeto no creado..." + e.getMessage());
			e.printStackTrace();

		} catch (IllegalAccessException e) { // excepcion de linea 1 del
												// tray(instancia)
			System.out.println("Acceso ilegal a la base de datos..." + e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e) { // excepcion de linea 1 del
												// tray(instancia)
			System.out.println("No se ha podido cargar el controlador..." + e.getMessage());
			e.printStackTrace();

		} catch (SQLException e) { // excepcion de linea 2 del tray(conexion)
			System.out.println("Excepcion SQL..." + e.getMessage());
		}
	}

	public Statement getSentencia() {
		return sentencia;
	}

	
	

}
