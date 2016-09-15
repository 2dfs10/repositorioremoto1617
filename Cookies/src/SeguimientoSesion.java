/*
 * SeguimientoSesion.java
 *
  */

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class SeguimientoSesion extends HttpServlet
{
  // Manipular la petici�n enviada por el cliente
  // utilizando el atributo method=get.
  protected void doGet(HttpServletRequest request,
                       HttpServletResponse response)
  throws ServletException, IOException
  {
    // Tipo de la respuesta que ser� enviada al cliente
    response.setContentType("text/html");
    // Obtener el objeto 'PrintWriter' para devolver la respuesta
    PrintWriter out = response.getWriter();
    
    // Obtener la sesi�n actual; crear una si fuera necesario.
    HttpSession sesionCli = request.getSession(true);
    // Datos de la sesi�n
    String idSesion = sesionCli.getId();
    
    long fechaCreacion = sesionCli.getCreationTime();
    long fechaUltimoAcceso = sesionCli.getLastAccessedTime();
    
    // Incrementar el contador para esta p�gina. El valor es
    // guardado en la sesi�n del cliente con el nombre "cuenta.ss".
    Integer cuenta = (Integer)sesionCli.getAttribute("cuenta.ss");
    if (cuenta == null)
      cuenta = new Integer(1);
    else
      cuenta = new Integer(cuenta.intValue() + 1);
    sesionCli.setAttribute("cuenta.ss", cuenta);
    
    out.println("<html>");
    out.println("<head><title>Seguimiento de sesi�n</title></head>");
    out.println("<body>");
    out.println("<h1>Demostraci�n de seguimiento de una sesi�n</h1>");
    
    // Visualizar la cuenta para esta p�gina
    out.println("Has visitado esta p�gina " + cuenta +
    ((cuenta.intValue() == 1) ? " vez." : " veces."));
    out.println("<p>");
    out.println("<h2>Datos de tu sesi�n:</h2>");
    out.println("Sesi�n: " + idSesion);
    out.println("<br>Fue creada: " +
                 (new Date(fechaCreacion)).toString());
    out.println("<br>Fue accedida por �ltima vez: " +
                 (new Date(fechaUltimoAcceso)).toString());
    out.println("<br>Atributos:<br>");
    Enumeration nombresParams = sesionCli.getAttributeNames();
    while (nombresParams.hasMoreElements())
    {
      String param = (String)nombresParams.nextElement();
      Object valor = sesionCli.getAttribute(param);
      out.println(param + ": " + valor.toString() + "<br>");
    }
    out.println("</body>");
    out.println("</html>");
    
    // Cerrar el flujo
    out.close();
  }
  
  // Devuelve una descripci�n breve.
  public String getServletInfo()
  {
    return "Servlet SeguimientoSesion";
  }
}
