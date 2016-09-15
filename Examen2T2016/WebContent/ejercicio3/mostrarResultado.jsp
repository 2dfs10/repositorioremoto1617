<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ejercicio 3</title>
</head>
<body>
<%
double base = Double.parseDouble(request.getParameter("base"));
double altura = Double.parseDouble(request.getParameter("altura"));

request.setAttribute("base", base);
request.setAttribute("altura", altura);
%>

	<jsp:useBean id="triangulo" scope="page" class="ejercicio3.Triangulo"></jsp:useBean>
	<jsp:setProperty property="base" value="${base}" name="triangulo"/>
	<jsp:setProperty property="altura" value="${altura}" name="triangulo"/>

	<jsp:useBean id="rectangulo" scope="page" class="ejercicio3.Rectangulo"></jsp:useBean>
	<jsp:setProperty property="base" value="${base}" name="rectangulo"/>
	<jsp:setProperty property="altura" value="${altura}" name="rectangulo"/>

  <h3>Triángulo</h3>
	Base: ${triangulo.base}
	<br>
	Altura: ${triangulo.altura}
	<br>
	Area: ${triangulo.area}
	<br>
	
  <h3>Rectángulo</h3>
	Base: ${rectangulo.base}
	<br>
	Altura: ${rectangulo.altura}
	<br>
	Area: ${rectangulo.area}
	<br>
</body>
</html>
