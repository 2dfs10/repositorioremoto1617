<!-- Fichero mostrarTabla.tag -->
<%@ attribute name="colorCab"%>
<%@ attribute name="colorFila"%>
<%@ attribute name="titulo"%>
<table border="0">
	<tr bgcolor="${colorCab}">
		<th><b>${titulo}</b></th>
	</tr>
	<tr bgcolor="${colorFila}">
		<td><jsp:doBody /></td>
		
	</tr>
</table>
