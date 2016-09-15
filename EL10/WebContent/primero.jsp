<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Seguimiento JSP con JSLT</title>
</head>
<body>
<!-- El scope es fundamental para contar -->

<c:set var="atrCuenta"  scope="session" value="${atrCuenta + 1}"/>
Demostracion seguimiento
${param.parNombre}, has visitado esta página
${atrCuenta} ${(atrCuenta >1) ? "veces " : " vez"}

</body>
</html>



