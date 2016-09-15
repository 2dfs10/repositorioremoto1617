<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

	<%-- Conectar con la base de datos. Resultado: bd --%>
	<sql:setDataSource var="bd" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/datosejer1" user="root" password="" />



	<sql:query var="cdr" dataSource="${bd}">

SELECT * 
FROM ejercicio1
WHERE  ejercicio1.tutordocente ='${param.tutor}'
</sql:query>


	<%-- Mostrar el resultado, cdr, en una tabla --%>


	<%-- Cabeceras --%>



	<table width=100% border=1>
		<%-- Cabeceras --%>
		<big style="font-weight: bold;"><big> <big>Dietas
					del Tutor Docente</big></big></big>
		<br>
		<tr>
			<th>Tutor docente</th>
			<th>Ambito Local</th>
			<th>Kilómetros</th>
			<th>Fecha inicio</th>
			<th>Empresa</th>
			<th>Dieta</th>
		</tr>
		<%-- Filas --%>
		<c:forEach var="fila" items="${cdr.rows}">
			<tr>
				<td width=20%>${fila.tutordocente}</td>
				<td width=20%>${fila.ambitolocal}</td>
				<td width=20%>${fila.distancia}</td>
				<c:if test="${fila.ambitolocal == 'Si'}">
					<c:set var="pago" scope="application"
						value="${fila.distancia*0.25}" />
					<c:set var="parcial" scope="application" value="${pago}" />

				</c:if>

				<c:if test="${fila.ambitolocal == 'No'}">
					<c:set var="pago" scope="application"
						value="${fila.distancia*0.45}" />
					<c:set var="parcial" scope="application" value="${pago}" />

				</c:if>
				<c:set var="totalparcial" scope="application"
					value="${parcial+totalparcial}" />
				<td width=20%>${fila.finicio}</td>
				<td width=20%>${fila.empresa}</td>


				<td width=20%><fmt:formatNumber type="number"
						maxFractionDigits="6" value="${parcial}" /></td>

				<%-- <td width=20%><c:out value="${parcial}"></c:out></td> --%>


			</tr>
		</c:forEach>
	</table>

	<big style="font-weight: bold;"><big> <big>Total a
				Pagar</big></big></big>

	<fmt:formatNumber type="number" maxFractionDigits="6"
		value="${totalparcial}" />
	<%-- <c:out value="${totalparcial}"></c:out> --%>
	</td>

	<%-- Inicializamos totasles  --%>
	<c:set var="totalparcial" scope="application" value="0" />



</body>
</html>