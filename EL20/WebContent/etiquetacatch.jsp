<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Excepciones JSP usando etiqueta</title>
</head>
<body>




	<c:set var="nMes" value="${param.mes}">
	</c:set>

	<br>El valor del Mes es: ${nMes}

<c:catch var="errorOcurrido">
		<br>Ejecutamos multiplicación: ${nMes*3}
</c:catch>
	<c:if test="${not empty errorOcurrido}">
		<br>Error, el parámetro mes debe ser un numero
		<br> Informacion del error
			<br> ${errorOcurrido}
	</c:if>


</body>
</html>