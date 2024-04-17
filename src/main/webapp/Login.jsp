<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@page import="Controller.Controller_login" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<style type="text/css">
	
	.Cont{
	border: 2px;
    border-style: solid;
	}
	.Contenedor_p
	{
	border: 2px;
    border-style: solid;
		heigth: 50vh;
		margin:15%;
		
		display:flex;
		flex-direction: column;
		justify-content:center;
		align-items: center;
	}
	
	</style>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
		<div class="Cont">
			<div class="Contenedor_p" >
				<h2>Iniciar Sesion</h2>	
					<form action="Controller_login" method="post">
						<input type="text" name="usuario"  placeholder="Ingrese su Usuario">
						<input type="password" name="contraseña"  placeholder="Ingrese su contraseña">
						<input type="submit" name ="action" value="Enter">
				</form><br>
				<a href="Registro_usuarios.jsp">Registrarme</a>
			</div>
		</div>
</body>
</html>