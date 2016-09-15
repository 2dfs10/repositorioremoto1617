<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pagina Contadort JSP usando taglib standard</title>
</head>
<body>
	<!-- si pongo en scope = page no funciona, probar  -->
	<c:set var="Cuenta" scope="application" value="${Cuenta+1}">
	</c:set>


	El valor de la Cuenta es ${Cuenta};




	<!-- 
	${param.Nombre}, has visitado esta página ${atrCuenta} ${(atrCuenta > 1)
	? "veces" : "vez"}
-->

</body>
</html>