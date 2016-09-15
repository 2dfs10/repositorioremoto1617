<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ejercicio 2</title>
</head>
<body>
    <h1>Página Web de Libros</h1>
    <a href="logout.jsp?usuario=<%=request.getParameter("usuario")%>">Cerrar sesión</a>
    <br>
    <a href="index.html">Volver</a>
</body>
</html>