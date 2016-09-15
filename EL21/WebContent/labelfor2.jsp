<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
 
<jsp:useBean id="lista" class="Beans.Lista"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>Los elementos en la lista son: </p>
        <p>
            <c:forEach var="nombreActual" items="${lista.listaDeNombres}">
            <b><c:out value="${nombreActual}"/></b> <br/>
        </c:forEach>
        </p>
    </body>
</html>