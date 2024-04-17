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
  
		
		
    
	}
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	//}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Registro re = new Registro();
		Usuarios user = new Usuarios();
		
		
		String nombre = request.getParameter("Nombre");
		String contraseña = request.getParameter("Contraseña");
		
		user.setNombre(nombre);
		user.setContraseña(contraseña);
		
		try {
			if(re.resgistro(user)) {
				
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			}
			else {
				request.getRequestDispatcher("Registro_usuario.jsp").forward(request, response);
			}
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
