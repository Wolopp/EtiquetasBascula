<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@page import="Model.IMC" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<% 
	
		IMC m = (IMC) request.getAttribute("Resultado");
	
		%>
	<p>Tu IMC es: </p>
	<%= m.getrimc()  %><br>
</body>
</html>