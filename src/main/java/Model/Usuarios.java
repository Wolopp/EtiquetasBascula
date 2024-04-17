package Model;



public class Usuarios  {
	
	private int id; 
	private String Nombre;
	private String Contraseña;
	
	
public Usuarios() {
	
}


public Usuarios(int id, String nombre,String contraseña) {
	
	this.id = id;
	Nombre = nombre;
	this.Contraseña = contraseña;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getNombre() {
	return Nombre;
}


public void setNombre(String nombre) {
	Nombre = nombre;
}


public String getContraseña() {
	return Contraseña;
}


public void setContraseña(String contraseña) {
	this.Contraseña = contraseña;
}

	
	

	
	
	
	
	
	
	
	
	

}
