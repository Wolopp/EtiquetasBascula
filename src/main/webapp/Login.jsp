	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@page import="Controller.Controller_login" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
	<meta charset="UTF-8">
	<link rel="stylesheet" href="Estilos.css">
<title>Login</title>
</head>
<body>
		<div class="Contenedor_p" >
				<form action="Controller_login" method="post" class="Formulario_Inicio">
						<h2>Iniciar Sesion</h2>	
						<input type="text" name="usuario"  placeholder="Ingrese su Usuario">
						<input type="password" name="contraseña"  placeholder="Ingrese su contraseña">
						<br>
						<br>
						<input type="submit" name ="action" value="Enter" class ="boton">
						<br>
						<br>
						<a href="Registro_usuarios.jsp">Registrarme</a>
				</form>
				
		</div>
</body>
</html>