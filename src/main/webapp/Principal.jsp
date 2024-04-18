<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
	<meta charset="UTF-8">
	
	<link rel="stylesheet" href="Estilos_Principal.css">
	
	
<title>Etiquetas</title>


</head>
<body>
 <div class="Principal_Process">
 			<h1> Hola:  ${usuario}</h1>
			<form action="Controller_imc" method="post">
				<div class="Form">
					<p>Lote</p>
					<input type="text" name="lote">
				</div>
	
				<div class="Form">
					<p>Articulo</p>
					<input type="text" name="articulo" >
				</div>
	
				<div class="Form">
					<p>Medida</p>
					<input type="text" name="medida">
				</div>
	
				<div class="Form">
					<p>Calibre</p>
					<input type="text" name="calibre">
				</div>
	
				<div class="Form">	
					<p>Tarima</p>
					<input type="text" name="tarima">
				</div>
	
				<div class="Form">
					<p>Centro</p>
					<input type="text" name="centro">
				</div>
	
				<div class="Form">
					<p>Peso Bruto</p>
					<input type="text" name="pesobruto">
				</div>
	
				<div class="Form">	
					<p>Peso Neto</p>
					<input type="text" name="pesoneto">
				</div>
	
				<div class="Form">	
					<p>Cliente</p>
					<input type="text" name="cliente">
				</div>
	
				<div class="Form">	
					<p>Seleccione la fecha</p>
					<input type="Datetime-local" name="fecha" >	
				</div>
	
				<div class="Form">	
					<p>Descripcion</p>
					<input type="text" name="descripcion" class = "descripcion">
				</div>
				<br>
				<input type="submit" name ="action" value="Enter">
		</form>
	</div>
</body>
</html>