<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="createError.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Ejercicio 2</title>
</head>
<body>
<%
/* Parámetros */
String usuario = request.getParameter("usuario");

/* Elimina la sesión y redirecciona a la página inicial */
session.setAttribute(usuario, null);
response.sendRedirect("index.html");
%>
</body>
</html>
