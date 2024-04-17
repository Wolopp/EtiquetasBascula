<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Imc</title>

<style type="text/css">
	
	.Principal_Process
	{
	
		heigth: 50vh;
		margin:5%;
		
		display:flex;
		flex-direction: column;
		justify-content:center;
		align-items: center;
	}
	
	</style>
</head>
<body>
 <div class="Principal_Process">
 		<h1> Hola:  ${usuario}</h1>
		<form action="Controller_imc" method="post">
		<p>Ingrese su Peso</p>
		<input type="text" name="Peso"><br>
		<p>Ingrese su Estatura</p>
		<input type="text" name="Estatura" ><br>
		<p>Ingrese Fecha</p>
		<input type="Datetime-local" name="Fecha" ><br>
		<input type="submit" name ="action" value="Enter">
	</div>

</body>
</html>