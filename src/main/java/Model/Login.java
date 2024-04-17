package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



import Conexion_bd.Conexion;	


public class Login implements Valid
{
		Connection con;
		Conexion c = new Conexion();
		PreparedStatement ps;
		ResultSet r;
			
		
	@Override
	public int valid(Usuarios user) 
	{
		int res = 0;
		String sql ="SELECT * FROM usuarios where Nombre =? and Contraseña =?";
		try {
			
			con =c.getConexion();
			
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getNombre() );
			ps.setString(2, user.getContraseña());
			r = ps.executeQuery();
			
			while (r.next()) {
				res=res+1;
				user.setNombre(r.getString("Nombre"));
				user.setContraseña(r.getString("Contraseña"));
			}
			
			if(res==1) {
				return 1;
			}
			else {
				return 0;
			}
		}
		catch (Exception e) 
		{
			return 0;	
		}
		
		
	}
	

	
}
