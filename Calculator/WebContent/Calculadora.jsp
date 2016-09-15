<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculadora Web</title>

</head>
<body>
<jsp:useBean id="calcula"  scope="application"  class="calculadora.MainBean"></jsp:useBean>

<jsp:setProperty property="op1" name="calcula"/>

<jsp:setProperty property="op2" name="calcula"/>


La suma del Operando 1 
<br>
<jsp:getProperty property="op1" name="calcula"/>
<br>
y del operando 2 
<br>

<jsp:getProperty property="op2" name="calcula"/>
es

<br>

<jsp:getProperty property="suma" name="calcula"/>


</body>
</html>