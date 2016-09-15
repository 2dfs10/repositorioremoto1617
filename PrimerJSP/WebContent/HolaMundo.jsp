<%@page import="sun.text.resources.cldr.ak.FormatData_ak"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"   errorPage="MyErrorPage.jsp" isErrorPage="true"  %>
  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hola,    Mundo</title>
</head>
<body>
<h1> ¡Hola, Mundo! lllllllllllllllllll</h1>

	La fecha de hoy es: <%= new Date() %> 
	
 


	
<%
int j;
for (j=0;j<3;j++)
{ 
	j=j+1; 

}
%>


</body>
</html>