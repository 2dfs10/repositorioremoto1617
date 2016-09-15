<!-- Fichero fechaHora.tag -->
<%@ variable name-given="hora" %>
<%@ variable name-given="minutos" %>
<%@ variable name-given="fecha" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:useBean id="bfecha" class="beans.BeanFecha"/>

<!-- Obtener la hora y la fecha actuales -->
<fmt:formatNumber value="${bfecha.hora}" pattern="00" var="hora"/>
<fmt:formatNumber value="${bfecha.minutos}" pattern="00" var="minutos"/>
<c:set var="fecha" value="${bfecha.fecha}"/>

<!-- Actualizar y mostrar el contador de visitas a esta página -->
<c:set var="cuenta" scope="application" value="${cuenta + 1}"/>
<jsp:doBody/>


<!-- Fichero fechaHora.tag -->
<%@ attribute name="mostrarFechaHora" fragment="true" %>
<%@ attribute name="mostrarCuenta" fragment="true" %>
<%@ variable name-given="hora" %>
<%@ variable name-given="minutos" %>
<%@ variable name-given="fecha" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!-- Obtener la hora y la fecha actuales -->
<fmt:formatNumber value="${bfecha.hora}" pattern="00" var="hora"/>
<fmt:formatNumber value="${bfecha.minutos}" pattern="00" var="minutos"/>
<c:set var="fecha" value="${bfecha.fecha}"/>
<jsp:invoke fragment="mostrarFechaHora"/>

<!-- Actualizar y mostrar el contador de visitas a esta página -->
<c:set var="cuenta" scope="application" value="${cuenta + 1}"/>
<jsp:invoke fragment="mostrarCuenta"/>
