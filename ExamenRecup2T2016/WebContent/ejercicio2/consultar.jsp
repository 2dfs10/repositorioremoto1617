<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consulta Acuerdos por Fecha de Inicio</title>
</head>
<body>


	<%-- Conectar con la base de datos. Resultado: bd --%>
	<sql:setDataSource var="bd" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/datosejer1" user="root" password="" />

	<%-- Realizar una consulta. Resultado: cdr 
 SELECT * FROM mytabla WHERE STR_TO_DATE(fecha, '%d/%m/%y') > STR_TO_DATE('20/05/05', '%d/%m/%y');
 --%>

	<sql:query var="cdr" dataSource="${bd}">

SELECT * 
FROM ejercicio1
WHERE STR_TO_DATE( finicio,  '%d/%m/%Y' ) >= STR_TO_DATE(  '${param.fechainicio1}',  '%d/%m/%Y' ) 
AND STR_TO_DATE( finicio,  '%d/%m/%Y' ) <= STR_TO_DATE(  '${param.fechainicio2}',  '%d/%m/%Y' ) 

</sql:query>

	<%-- Mostrar el resultado, cdr, en una tabla --%>

	<table width=100% border=1>
		<%-- Cabeceras --%>
		<big style="font-weight: bold;"><big> <big>CONSULTA
					DE ACUERDOS POR FECHA DE INICIO</big></big></big>
		<br>
		<tr>
			<th>Alumno</th>
			<th>Empresa</th>
			<th>Fecha inicial</th>
			<th>Fecha final</th>
			<th>Tutor Docente</th>
		</tr>
		<%-- Filas --%>
		<c:forEach var="fila" items="${cdr.rows}">
			<tr>
				<td width=20%>${fila.alumno}</td>
				<td width=20%>${fila.empresa}</td>
				<td width=20%>${fila.finicio}</td>
				<td width=20%>${fila.ffinal}</td>
				<td width=20%>${fila.tutordocente}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>