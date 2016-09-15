<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error_apartado1.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Ejercicio 1</title>
</head>
<body>
  <!-- Recupera valores checkbox -->
  <c:set var="checked" value=""/>
	<c:forEach var="check" items="${paramValues.almacen}">
   <c:set var="checked" value="${check},${checked}"/>
  </c:forEach>

  <!-- Conecta a BBDD -->
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost/articulos" user="root"
		password="" />

  <!-- Insert into db -->
	<sql:update dataSource="${db}">
			INSERT INTO tarticulos (nombrearticulo, codarticulo, precio, importado, almacen, stock) VALUES (?, ?, ?, ?, ?, ?);
		<sql:param value="${param.nombre}"></sql:param>
		<sql:param value="${param.codigo}"></sql:param>
		<sql:param value="${param.precio}"/>
		<sql:param value="${param.importado}"/>
		<sql:param value="${checked}"/>
		<sql:param value="${param.stock}"/>
	</sql:update>
	
	<c:redirect url="insertar_apartado1.html"></c:redirect>
</body>
</html>
