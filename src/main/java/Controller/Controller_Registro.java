package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Registro;
import Model.Usuarios;


@WebServlet(name ="/Controller_Registro", urlPatterns = {"/Controller_Registro"})
public class Controller_Registro extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
  
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException{
		response.setContentType("text/html;chartset=UTF-8");
  
		Registro dao = new Registro();
		Usuarios mod = new Usuarios();
		
		
		String nombre = request.getParameter("Nombre");
		String sexo = request.getParameter("Sexo");
		Double estatura = Double.parseDouble(request.getParameter("Estatura"));
		int edad = Integer.parseInt(request.getParameter("Edad"));
		String nombre_us = request.getParameter("Nombre_usuario");
		String contraseña = request.getParameter("contraseña");
		
		mod.setNombre(nombre);
		mod.setSexo(sexo);
		mod.setEstatura(estatura);
		mod.setEdad(edad);
		mod.setNombre_de_usuario(nombre_us);
		mod.setContraseña(contraseña);
		
		if(dao.resgistro(mod)) {
			
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("Registro_usuario.jsp").forward(request, response);
		}
		
    
	}
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	//}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
			processRequest(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
