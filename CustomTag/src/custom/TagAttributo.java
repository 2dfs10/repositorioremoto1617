package custom;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class TagAttributo extends SimpleTagSupport {
	private String message;

	/* ponemos set & getters */

	public void setMessage(String message) {
		this.message = message;
	}

	StringWriter sw = new StringWriter();

	public void doTag() throws JspException, IOException {

		if (message != null) {

			/* Use message from attribute */
			JspWriter out = getJspContext().getOut();
			out.println(message);
		} else { /* use message from the body */
			getJspBody().invoke(sw);
			getJspContext().getOut().println(sw.toString());
		}
	}

}
