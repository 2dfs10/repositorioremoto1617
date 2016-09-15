<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="mytest" uri="http://tomcat.apache.org/testing"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1" cellpadding="2" cellspacing="0">
	<tr>
		<td><mytest:img url="http://tomcat.apache.org/images/tomcat.gif" /></td>
		<td><mytest:img url="http://tomcat.apache.org/images/tomcat.gif" showBorder="true" /></td>
		<td><mytest:img url="http://www.apache.org/images/asf-logo.gif" showUrl="true" /></td>
		<td><mytest:img url="http://www.apache.org/images/asf-logo.gif" showUrl="true" showBorder="true" /></td>
	</tr>
</table>
</body>
</html>