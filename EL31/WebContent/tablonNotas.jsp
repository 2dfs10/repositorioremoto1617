<!-- Fichero tablonNotas.jsp -->
<%@ taglib prefix="mostrar" tagdir="/WEB-INF/tags" %>
<html>
<head>
<title>Fichero tag</title>
</head>
<body>
<h2>Notas de la asignatura Programación Java:</h2>
  <table border="1">
    <tr valign="top">
      <td>
      
        <mostrar:mostrarTabla colorCab="#0000ff" colorFila="#ffc0c0" 
                              titulo="Nombre">
            Isabel Martínez Pelayo<br/>
            Luis García Severiano<br/>
            Antonio Fernández Ortí<br/>
        </mostrar:mostrarTabla>
      </td>
      <td>
        <mostrar:mostrarTabla colorCab="#00fc00" colorFila="#c0ffc0"
                              titulo="Nota">
              8.50<br>
              7.00<br>
              5.50<br>
        </mostrar:mostrarTabla>
      </td>
    </tr>
  </table>
</body>
</html>

