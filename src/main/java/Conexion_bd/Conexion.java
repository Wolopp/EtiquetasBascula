package Conexion_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
	
	Connection con;
	
    public Connection getConexion() throws ClassNotFoundException  {
        
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bascula_starkxz","root","Pirma407");

        } catch (SQLException e) {
            
        }
        
        return con;
    }
}

