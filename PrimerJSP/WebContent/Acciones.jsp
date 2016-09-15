<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%-- 	<jsp:include page="PaginaParametro.jsp">
		<jsp:param value="Pepe" name="nombre" />
		<jsp:param value="Pérez" name="apellido" />
	</jsp:include> --%>

	<jsp:forward page="PaginaParametro.jsp">

		<jsp:param value="Pepe" name="nombre" />
		<jsp:param value="Pérez" name="apellido" />


	</jsp:forward>


	<h1>Estoy de vuelta en el JSP</h1>




</body>
</html>