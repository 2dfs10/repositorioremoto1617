<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="../style.css">
  <script src="../jquery-2.1.4.min.js"></script>
  <script src="apartado3.js"></script>
	<title>Ejercicio 1</title>
</head>
<body>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost/articulos" user="root" password="" />

	<sql:query dataSource="${db}" var="result">
	SELECT * from tarticulos WHERE codarticulo=${param.codigo};
  </sql:query>
  
  <c:if test="${empty result.rows}">
	 <c:redirect url="error_apartado3.jsp"></c:redirect>
  </c:if>

<form action="modificar_apartado3.jsp" method="post">
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

			<td><input type="number" name="codigo" value="${row.codarticulo}" disabled></td>

			<td><input type="text" name="nombre" value="${row.nombrearticulo}" required></td>

			<td><input type="number" name="precio" value="${row.precio}" required></td>

			<td>
			 <select name="importado" required>
          <option selected hidden value="${row.importado}">${row.importado}</option>
          <option value="si">si</option>
          <option value="no">no</option>
      </select>
      </td>

      <td>
        <c:set var="checkboxes" value="${row.almacen}"/>
        <input type="checkbox" name="almacen" value="huelva" <c:if test="${fn:contains(checkboxes,'huelva')}">checked</c:if>>Huelva
        <br>
        <input type="checkbox" name="almacen" value="sevilla" <c:if test="${fn:contains(checkboxes,'sevilla')}">checked</c:if>>Sevilla
        <br>
        <input type="checkbox" name="almacen" value="cadiz" <c:if test="${fn:contains(checkboxes,'cadiz')}">checked</c:if>>Cádiz
        <br>
        <input type="checkbox" name="almacen" value="malaga" <c:if test="${fn:contains(checkboxes,'malaga')}">checked</c:if>>Málaga
      </td>
      
      <td>
        <c:set var="radios" value="${row.stock}"/>
        <input type="radio" name="stock" value="100" required <c:if test="${fn:contains(radios,'100')}">checked</c:if>>100%
        <br>
        <input type="radio" name="stock" value="75" required <c:if test="${fn:contains(radios,'75')}">checked</c:if>>75%
        <br>
        <input type="radio" name="stock" value="50" required <c:if test="${fn:contains(radios,'50')}">checked</c:if>>50%
        <br>
        <input type="radio" name="stock" value="25" required <c:if test="${fn:contains(radios,'25')}">checked</c:if>>25%
      </td>

	 	</tr>
	</c:forEach>
</table>
<input type="hidden" name="codigo" value="${param.codigo}">
<input type="submit" value="Modificar">
</form>
</body>
</html>
