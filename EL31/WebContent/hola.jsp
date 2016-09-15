<%-- página hola.jsp --%>
<%@ page contentType="text/html"%>
<%@ taglib prefix="et" tagdir="/WEB-INF/tags" %>
<html>
<head><title>Página JSP cuenta</title></head>
<body>
<%--
  <et:fechaHora>
    <h2>Hola. Son las ${hora}:${minutos} del día ${fecha}</h2>
    ${param.parNombre}, has visitado esta página
    ${cuenta} ${(cuenta > 1) ? " veces." : " vez."}
  </et:fechaHora>
--%>
  <et:fechaHora>
    <jsp:attribute name="mostrarFechaHora">
      <h2>Hola. Son las ${hora}:${minutos} del día ${fecha}</h2>
    </jsp:attribute>
    <jsp:attribute name="mostrarCuenta">
      ${param.parNombre}, has visitado esta página
      ${cuenta} ${(cuenta > 1) ? " veces." : " vez."}
    </jsp:attribute>
  </et:fechaHora>
</html>
