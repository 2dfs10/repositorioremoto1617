<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ejercicio 2</title>
</head>
<body>
<%
/* Parámetros */
String usuario = request.getParameter("usuario");
String redireccion = request.getParameter("gustos") + "?usuario=" + usuario;

/* Crea sesión */
session.setAttribute(usuario, redireccion); 

/* Redirecciona */
response.sendRedirect(redireccion);
%>
</body>
</html>