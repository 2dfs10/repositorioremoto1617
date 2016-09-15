package etiquetas;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.*;

public class Fecha extends SimpleTagSupport
{
  public void doTag() throws JspException, IOException
  {
    Calendar fechaHoraActual = new GregorianCalendar();
    
    String s = fechaHoraActual.get(Calendar.DAY_OF_MONTH) + "/" +
               (fechaHoraActual.get(Calendar.MONTH) + 1) + "/" +
               fechaHoraActual.get(Calendar.YEAR);
    
    getJspContext().getOut().write("Hoy estamos a " + s);
  }
}
