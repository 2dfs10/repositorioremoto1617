<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="ex" uri="WEB-INF/custom.tld"%>
 <%@ taglib prefix="ex2" uri="WEB-INF/custom.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- Usando libreria de etiquetas personalizadas -->

<ex:Hello/> Usando etiqueta ex
<br>
<br>
ahora uso la segunda etiqueta

<ex:HelloAtributo message="probando probando"></ex:HelloAtributo>

</body>
</html>