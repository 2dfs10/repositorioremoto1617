<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<jsp:useBean id="calculadora" scope ="application" class="calculadora.Main"></jsp:useBean>
<jsp:setProperty property="*" name="calculadora"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculadora Web JSP</title>
</head>
<body>
<h3>
El Resultado de sumar
<!--  
<jsp:getProperty property="op1" name="calculadora"/>

Usamos LE -->

${calculadora.op1};

<br>
y
<!--  X
<jsp:getProperty property="op2" name="calculadora"/>
-->

${calculadora.op2};
<br>
es
<!--  
<jsp:getProperty property="suma" name="calculadora"/>
-->
${calculadora.suma};
</h3>

</body>
</html>
