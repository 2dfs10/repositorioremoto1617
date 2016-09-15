<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><title>JSP 2.0</title></head>

<body>
  <h3>Lenguaje de expresión (LE)</h3>
  <p>La siguiente tabla ilustra algunas expresiones LE:
  <br><br><table border="1">
  <tr>
    <th><b>Expresión</b></th>
    <th><b>Valor</b></th>
  </tr>
  <tr>
    <td>\${3 + 6}</td>
    <td>${3 + 6}</td>
  </td>
  <tr>
    <td>\${(7 > 4) ? 7 : 4}</td>
    <td>${(4 > 7) ? 7 : 4}</td>
  </tr>
  <tr>
    <td>\${header["host"]}</td>
    <td>${header["host"]}</td>
  </tr>
  </table>
</body>
</html>