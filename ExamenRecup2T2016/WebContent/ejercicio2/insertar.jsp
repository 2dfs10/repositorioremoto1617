<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>A�adir datos a la Base de Datos</title>

<%-- Conectar con la base de datos. Resultado: bd --%>
<sql:setDataSource var="bd" driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/datosejer1" user="root" password="" />

<sql:setDataSource />

</head>
<body>

 

	<sql:update var="cont" dataSource="${bd}">

insert into ejercicio1 values (null,'${param.empresa}','${param.alumno}','${param.fechainicio}','${param.fechafin}','${param.ambitolocal}','${param.distancia}','${param.tutordocente}');
 
</sql:update>

</body>
</html>