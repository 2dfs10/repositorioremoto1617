/*
 * CuentaCk.java
 *
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class CuentaCk extends HttpServlet
{
  protected void doGet(HttpServletRequest request,
                       HttpServletResponse response)
  throws ServletException, IOException
  {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    
    // Obtener el valor actual de la cookie "cuenta.ck" buscando
    // entre las cookies recibidas.
    String scuenta = null;
    Cookie[] cookies = request.getCookies();
    if (cookies != null) // si hay cookies...
    {
      for (int i = 0; i < cookies.length; i++)
      {
        // Buscar la cookie "cuenta.ck"
        if (cookies[i].getName().equals("cuenta.ck"))
        {
          // y obtener el valor asociado
          scuenta = cookies[i].getValue();
          break;
        }
      }
    }
    
    // Incrementar el contador para esta p�gina. El valor es
    // guardado en la cookie con el nombre "cuenta.ck".
    // Despu�s, asegurarse de envi�rsela al cliente con la
    // respuesta (response).
    Integer objCuenta = null; // contador
    if (scuenta == null) // si no se encontr� "cuenta.ck"
      objCuenta = new Integer(1);
    else                 // si se encontr� "cuenta.ck"
      objCuenta = new Integer(Integer.parseInt(scuenta)+1);
    // Crear una nueva cookie con la cuenta actualizada
    Cookie c = new Cookie("cuenta.ck", objCuenta.toString());
    // A�adir la cookie a las cabeceras de la respuesta HTTP
    response.addCookie(c);

    // Responder al cliente
    out.println("<html>");
    out.println("Has visitado esta p�gina " + objCuenta.toString() +
                ((objCuenta.intValue() == 1) ? " vez." : " veces."));
    out.println("</html>");

    // Cerrar el flujo
    out.close();
  }
  
  // Devuelve una descripci�n breve.
  public String getServletInfo()
  {
    return "Servlet CuentaCk";
  }
}
