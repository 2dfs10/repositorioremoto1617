<%@page import="Persona.PersonaBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="persona"   class="Persona.PersonaBean">

</jsp:useBean>


<jsp:setProperty property="nombre" name="persona"  value ="Manolito"/>

El valor del nombre en el Bean es : <jsp:getProperty property="nombre" name="persona"/>

<jsp:setProperty property="edad" name="persona" value = "23"/>



<br>
<br>

La Edad de la persona es :  <jsp:getProperty property="edad" name="persona"/>




<%! PersonaBean p= new PersonaBean();
%>

<%
p.setEdad(3);
p.setNombre("Juanioto");

%>


El Nombre usando clases instanciadas es <%out.print(p.getNombre()); %>
<br>
<br>
La edad es <%out.print(p.getEdad()); %>





</body>
</html>