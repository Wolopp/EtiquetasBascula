package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "/Controller_imc", urlPatterns = {"/Controller_imc"})
public class Controller_imc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		response.setContentType("text/html;chartset=UTF-8"); 
		
		String P=request.getParameter("Peso");
		String E=request.getParameter("Estatura");
		
		Model.IMC m = new Model.IMC(P,E); 
		m.Operacion_IMC();
		
		request.setAttribute("Resultado", m);
		request.getRequestDispatcher("/process_imc.jsp").forward(request, response);
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
