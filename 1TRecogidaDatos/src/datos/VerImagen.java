package datos;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VerImagen
 */
@WebServlet("/VerImagen")
public class VerImagen extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerImagen() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("image/jpeg");
		PrintWriter out = response.getWriter();
		
		String vdni= request.getParameter("dni");
		
		//out.print(vdni);
		
		out.print("<img src='vdni' >");
		
		
		byte [] resultado=null;  
        //ServletContext sc = getServletContext();
          
      //  String filename = sc.getRealPath(File.separator + "imagenes" + File.separator + "nada.jpg");
		 String filename = vdni;
		
         File f=new File(filename);
        int  size=(int) f.length();
         resultado=new byte[size];
       BufferedInputStream  stream = new BufferedInputStream(new FileInputStream(f));
         stream.read(resultado);

     // response.setContentType("image/jpeg");
      OutputStream sos = response.getOutputStream();
        sos.write(resultado);
      sos.flush();
      sos.close();
		
		

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
