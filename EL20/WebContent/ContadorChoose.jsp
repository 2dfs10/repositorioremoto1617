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
	
	<c:set var="atrCuenta" scope="application" value="${atrCuenta+1}">
	</c:set>
	${param.Nombre}, has visitado es página
	<c:choose>
		<c:when test="${atrCuenta == 1}">
			<c:set var="str" scope="application" value="vez" />
		</c:when>
		<c:otherwise>
			<c:set var="str" scope="application" value="veces" />
		</c:otherwise>
	</c:choose>
	<br>El valor de Cuenta es ${atrCuenta} 
	<br>El valor de cadena Str es
	
	<c:out value="${str}">
	</c:out>
	

</body>
</html>