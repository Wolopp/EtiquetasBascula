<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@page import="Controller.Controller_Registro" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<style type="text/css">
	
	.Principal_RE
	{
	
		heigth: 50vh;
		margin:5%;
		
		display:flex;
		flex-direction: column;
		justify-content:center;
		align-items: center;
	}
	
	</style>

<meta charset="UTF-8">
<title>Registro usuarios</title>
</head>
<body>

	<div class="Principal_RE">
		<form action="Controller_Registro" method="post">
		<p>Ingrese su nombre</p>
		<input type="text" name="Nombre"><br>
		<p>Ingrese su sexo M o F</p>
		<input type="text" name="Sexo" ><br>
		<p>Ingrese su estatura</p>
		<input type="text" name="Estatura"><br>
		<p>Ingrese su edad</p>
		<input type="number" name="Edad" min="16"><br>
		<p>Ingrese su nombre de usuario</p>
		<input type="text" name="Nombre_usuario"><br>
		<p>Ingrese su contraseña</p>
		<input type="password" name="contraseña"><br>
		<input type="submit" value="Enter">
		<input type="reset">
		</form>

	</div>

</body>
</html>