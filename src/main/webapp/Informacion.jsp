<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@ page import="Conexion_bd.Conexion" %>
<%@ page import="Model.Historicos" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Historicos</title>
</head>
<body>

 <h1>Datos Historicos</h1>
    <table border="1">
        <tr>
            <th>Operario</th>
            <th>Lote</th>
            <th>Articulo</th>
            <th>Medida</th>
            <th>Calibre</th>
            <th>Tarima</th>
            <th>Centro</th>
            <th>Peso Bruto</th>
            <th>Peso Neto</th>
            <th>Cliente</th>
            <th>Fecha</th>
            <th>Descripción</th>
            <th>Orden de Venta</th>
        </tr>
        <% 
            
        Connection con;
    	Conexion c = new Conexion();
   		ResultSet rs; 
    	PreparedStatement ps;
    
        
            try {
            	
            	 
                 con = c.getConexion();
                 String sql = "SELECT * FROM historicos";
                 ps = con.prepareStatement(sql);
                 rs = ps.executeQuery();
                 while (rs.next())  {
        %>
        <tr>
            <td><%= rs.getString("Operario") %></td>
            <td><%= rs.getString("Lote") %></td>
            <td><%= rs.getString("Articulo") %></td>
            <td><%= rs.getString("Medida") %></td>
            <td><%= rs.getString("Calibre") %></td>
            <td><%= rs.getDouble("Tarima") %></td>
            <td><%= rs.getDouble("Centro") %></td>
            <td><%= rs.getDouble("Peso_Bruto") %></td>
            <td><%= rs.getDouble("Peso_Neto") %></td>
            <td><%= rs.getString("Cliente") %></td>
            <td><%= rs.getString("fecha") %></td>
            <td><%= rs.getString("Descripcion") %></td>
            <td><%= rs.getInt("Orden_Venta") %></td>
        </tr>
        <% 
              
           }
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        %>
    </table>


		<div class="Cerrar_Sesion">
	<form action="Controller_Principal" method="post">
       <input type="submit" name ="regresar" value="Regresar" class ="boton">
       
       </form>
    </div>
		
</body>
</html>