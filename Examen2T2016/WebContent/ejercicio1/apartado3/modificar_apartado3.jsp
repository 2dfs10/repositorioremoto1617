<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ejercicio 1 - Apartado 3</title>
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

	<sql:update dataSource="${db}">
		UPDATE tarticulos SET nombrearticulo=?, precio=?, importado=?, almacen=?, stock=? WHERE codarticulo=?;
		<sql:param value="${param.nombre}"></sql:param>
		<sql:param value="${param.precio}"></sql:param>
		<sql:param value="${param.importado}"></sql:param>
		<sql:param value="${checked}"></sql:param>
		<sql:param value="${param.stock}"></sql:param>
		<sql:param value="${param.codigo}"></sql:param>
	</sql:update>
	
	<c:redirect url="modificar_apartado3.html"></c:redirect>
</body>
</html>
