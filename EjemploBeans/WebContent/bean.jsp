<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
int radio=Integer.parseInt(request.getParameter("radio"));
%>

<jsp:useBean id="Volumen" scope="page" class="paquete.Volumen">
<jsp:setProperty property="radio" name="Volumen" value="<%=radio%>"/>
<p>El volumen = <jsp:getProperty property="volumen" name="Volumen"/></p>
<p>El area = <jsp:getProperty property="area" name="Volumen"/></p>
<p>La longitud = <jsp:getProperty property="longitud" name="Volumen"/></p>
<p>El radio = <jsp:getProperty property="radio" name="Volumen"/></p>
</jsp:useBean>


</body>
</html>