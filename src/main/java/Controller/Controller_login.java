package Controller;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Login;
import Model.Usuarios;

/**
 * Servlet implementation class Controller_login
 */
@WebServlet(name = "/Controller_login", urlPatterns = {"/Controller_login"})
public class Controller_login extends HttpServlet {
	
	Login lg = new Login();
	Usuarios us = new Usuarios();
	int res;
	private static final long serialVersionUID = 1L;
      
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		response.setContentType("text/html;chartset=UTF-8");
		
		
			
		}
		
		
	
		
	
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	//}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
		
		
		String action=request.getParameter("action");
		if(action.equals("Enter")) {
			String usuario = request.getParameter("usuario");
			String contraseña= request.getParameter("contraseña");
			us.setNombre(usuario);
			us.setContraseña(contraseña);
			res=lg.valid(us);
			
			if(res == 1) {
			 
				request.getSession().setAttribute("usuario",usuario);
				 request.getRequestDispatcher("process.jsp").forward(request, response);	
				}
			else 
			{
				request.getRequestDispatcher("Login.jsp").forward(request, response);			
			}
			}
	
	}
}


