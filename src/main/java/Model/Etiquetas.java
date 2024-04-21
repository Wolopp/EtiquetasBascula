package Model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Conexion_bd.Conexion;

public class Etiquetas {
	
	Connection con;
	Conexion c = new Conexion();
	PreparedStatement ps;
	
	
	public boolean registroH(Historicos H) throws ClassNotFoundException 
	{
		
		String sql = "INSERT INTO historicos (Operario, Lote, Articulo, Medida, Calibre, Tarima, Centro, Peso_Bruto, Peso_Neto, Cliente, fecha, Descripcion, Orden_Venta) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
		
		try 
		{
			con =c.getConexion();
			ps= con.prepareStatement(sql);
			
			
			ps.setString(1, H.getOperario());
			ps.setString(2, H.getLote()); 
			ps.setString(3, H.getArticulo()); 
			ps.setString(4, H.getMedida()); 
			ps.setString(5, H.getCalibre()); 
			ps.setDouble(6, H.getTarima());
			ps.setDouble(7, H.getCentro()); 
			ps.setDouble(8, H.getPeso_Bruto());
			ps.setDouble(9, H.getPeso_Neto());
			ps.setString(10, H.getCliente()); 
			ps.setString(11, H.getFecha());
			ps.setString(12, H.getDescripcion());
			ps.setInt(13, H.getOrden_Venta());
			//ps.setInt(14, H.getId_Usuario());
			
			ps.execute();
			return true;
			
			
		} 
		catch (SQLException e) 
		{
			System.out.println(e);
			
		}
		
		
		return false;
		
		
		
	}

}
