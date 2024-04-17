package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Conexion_bd.Conexion;

public class IMCDao {

	Connection con;
	Conexion c = new Conexion();
	PreparedStatement ps;
	
	public boolean resgistroimc(IMC m) throws ClassNotFoundException {
		
		String sql = "INSERT INTO histiticos (IMC) values(?,)";
		try {
			
			con =c.getConexion();
			ps= con.prepareStatement(sql);
			
			ps.setDouble(1, m.getrimc());
			ps.execute();
			return true;
			
		} catch (SQLException e) {
			return false;
			
		}
		}
	}

