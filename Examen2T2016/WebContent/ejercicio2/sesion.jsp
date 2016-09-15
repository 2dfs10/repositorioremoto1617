<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
<title>Ejercicio 2</title>
</head>
<body>
<%
String usuario = request.getParameter("usuario");

/* Si el usuario est� logeado (sesi�n) */
if (session.getAttribute(usuario) != null)
{
	String redireccion = (String) session.getAttribute(usuario);
	response.sendRedirect(redireccion);
}

/* Si no est� logeado (no existe sesi�n para ese usuario) */
else
{
%>
  <h3>En sus ratos de ocio, <%=usuario %> �Qu� le gusta hacer?</h3>
	<form action="login.jsp" method="post" class="pure-form">
    <input type="radio" name="gustos" value="libro.jsp">Leer Libros
    <input type="radio" name="gustos" value="musica.jsp">Escuchar m�sica
    <input type="radio" name="gustos" value="pelicula.jsp">Ver pel�culas
    <input type="hidden" name="usuario" value="<%=usuario%>">
	  <button type="submit" class="pure-button pure-button-primary">Entrar</button>
	</form>
<%
}
%>
</body>
</html>
