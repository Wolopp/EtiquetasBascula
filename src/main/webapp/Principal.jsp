<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="Controller.Controller_Principal" %> 
    
    
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
	<meta charset="UTF-8">
	
	<link rel="stylesheet" href="Estilos_Principal.css">
	
		<style>
		
			
		
		@media print
		{
    			.boton
    			{
    			
        		display: none;
    			}
		}
		</style>
	
	
	
<title>Etiquetas</title>


</head>
<body>
	<div class="Cerrar_Sesion">
	<form action="Controller_Principal" method="post">
       <input type="submit" name ="cerrar" value="Cerrar" class ="boton">
       <input type="submit" name = "action" class = "boton" value="Mostrar">
       </form>
    </div>

 <div class="Principal_Process">
 			<h1>Starkxz</h1>
 			<%-- <h1> Hola:  ${usuario}</h1> --%>
 			
			<form action="Controller_Principal" method="post">
				<div class="Form">
					<p>Operario</p>
					<input type="text" name="operario">
				</div>
				
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
				<br>
	
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
					<p>Orden de Venta</p>
					<input type="text" name="orden_venta" class = "orden_venta">
				</div>

				<div class="Form">	
					<p>Descripcion</p>
					<input type="text" name="descripcion" class = "descripcion">
				</div>
				
				<br>
				<br>
				<input type="submit" name ="action" value="Guardar" class ="boton">
				<input type="button" name = "accion" class = "boton" value="Imprimir" onclick="window.print()">
				
		</form>
		
		<script>


			function imprimir() 
				{
    				window.print(); 
				}
		</script>
		
		
	</div>
	
	
</body>
</html>