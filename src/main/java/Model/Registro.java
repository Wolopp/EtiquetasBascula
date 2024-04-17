package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Conexion_bd.Conexion;

public class Registro {

	Connection con;
	Conexion c = new Conexion();
	PreparedStatement ps;
	
	public boolean resgistro(Usuarios usr) throws ClassNotFoundException {
		
	
			
			
			String sql = "INSERT INTO usuarios (Nombre, Contraseña) values(?,?)";
			try {
				
				con =c.getConexion();
				
				ps= con.prepareStatement(sql);
				ps.setString(1, usr.getNombre());
				ps.setString(6, usr.getContraseña());
				ps.execute();
				return true;
				
			} catch (SQLException e) {
				return false;
				
			}
	}
}
			
		
		

