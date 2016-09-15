package custom;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.*; 
import java.io.*;

public class HelloTag extends SimpleTagSupport {

	public void doTag() throws JspException, IOException { 
		JspWriter out = getJspContext().getOut(); 
		out.println("Hola, Etiqueta Tag !"); }
}
