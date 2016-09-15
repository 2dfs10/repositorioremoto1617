<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../style.css">
<script src="../jquery-2.1.4.min.js"></script>
<title>Ejercicio 1</title>
</head>
<body>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost/articulos" user="root" password="" />

	<sql:query dataSource="${db}" var="result">
		SELECT * from tarticulos;
	</sql:query>

	<table class="table-students">
		<tr>
			<th>Cód.Artículo</th>
			<th>Nombre Artículo</th>
			<th>Precio</th>
			<th>Importado</th>
			<th>Almacen</th>
			<th>% Stock</th>
		</tr>
		<c:forEach var="row" items="${result.rows}">
			<tr>
				<td>${row.codarticulo}</td>
				<td>${row.nombrearticulo}</td>
				<td>${row.precio}</td>
				<td>${row.importado}</td>
				<td>${row.almacen}</td>
				<td>${row.stock}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
