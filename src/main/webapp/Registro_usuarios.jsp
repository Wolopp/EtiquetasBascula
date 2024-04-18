<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@page import="Controller.Controller_Registro" %>
<!DOCTYPE html>
<html lang="en">
<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
	<meta charset="UTF-8">
	<link rel="stylesheet" href="Estilos.css">


<title>Registro usuarios</title>
</head>
<body>

	<div class="Principal_RE">
		<form action="Controller_Registro" class="Formulario_Registro" method="post">
		<p>Ingrese su nombre</p>
		<input type="text" name="Nombre"><br>
		<p>Ingrese su Contraseña</p>
		<input type="password" name="Contraseña">
		<br>
		<br>
		<input type="submit" value="Enter">
		<br>
		<br>
		<%-- input type="reset" value="Borrar"> --%>
		</form>

	</div>

</body>
</html>