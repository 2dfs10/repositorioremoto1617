
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Uso Bean</title>
</head>
<body>

	<jsp:useBean id="bean1" class="paquete.Bean2">
	</jsp:useBean>

	<jsp:setProperty property="*" name="bean1" />
	El valor de la propiedad Nombre es:
	<br>
	<jsp:getProperty property="nombre" name="bean1" />

	<br> El valor de la Edad es:

	<br>
	<jsp:getProperty property="edad" name="bean1" />

</body>
</html>