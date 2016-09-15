<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="oracion" value="Estos,son,los,tokens,de,la,frase"/>
        Los tokens son los siguientes:
        <p>
            <c:forTokens items="${oracion}" delims="," var="token" varStatus="i" >
                <b><c:out value="${i.count}"/>.</b>  <c:out value="${token}"/> <br/>
            </c:forTokens>
        </p>
    </body>
</html>