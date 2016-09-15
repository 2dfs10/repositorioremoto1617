<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pagina usando tag de for each</title>
</head>
<body>

<table border="1">
<!-- PageScope variable definida a nivel de ambito de pagina -->
<c:forEach var="item" items="${pageScope}">
<tr>
<!-- 
<td>${item}</td>
 -->
<!-- tambien se puede escribit con etiqueta c:out -->
<c:out value="${item}"></c:out>
</tr>
</c:forEach>
</tabla>





</table>


</body>
</html>