package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Etiquetas;
import Model.Historicos;

/**
 * Servlet implementation class Controller_Principal
 */
@WebServlet(name = "/Controller_Principal",urlPatterns = {"/Controller_Principal"})
public class Controller_Principal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller_Principal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		Historicos h = new Historicos();
		Etiquetas eti = new Etiquetas();
		
		String Operario;
		String Lote;
		String Articulo;
		String Medida;
		String Calibre;
		double Tarima;
		double Centro;
		double Peso_Bruto;
		double Peso_Neto;
		String Cliente;
		String fecha;
		String Descripcion;
		int Orden_Venta;
		
		
		
		
		
		String action=request.getParameter("action");
		
		if(action.equals("Guardar")) {
			
			
		
			Operario = request.getParameter("operario");
			Lote = request.getParameter("lote");
			Articulo = request.getParameter("articulo");
			Medida = request.getParameter("medida");
			Calibre = request.getParameter("calibre");
			Tarima = Double.parseDouble(request.getParameter("tarima"));
			Centro =  Double.parseDouble(request.getParameter("centro"));
			Peso_Bruto = Double.parseDouble(request.getParameter("pesobruto"));
			Peso_Neto = Double.parseDouble(request.getParameter("pesoneto"));
			Cliente = request.getParameter("cliente");
			fecha = request.getParameter("fecha");
			Descripcion = request.getParameter("descripcion");
			Orden_Venta = Integer.parseInt(request.getParameter("orden_venta"));
			
			
			h.setOperario(Operario);
			h.setLote(Lote);
			h.setArticulo(Articulo);
			h.setMedida(Medida);
			h.setCalibre(Calibre);
			h.setTarima(Tarima);
			h.setCentro(Centro);
			h.setPeso_Bruto(Peso_Bruto);
			h.setPeso_Neto(Peso_Neto);
			h.setCliente(Cliente);
			h.setFecha(fecha);
			h.setDescripcion(Descripcion);
			h.setOrden_Venta(Orden_Venta);
			
			try {
				if(eti.registroH(h))
				{
				
					request.getRequestDispatcher("Principal.jsp").forward(request, response);	
				}

				else 
				{
					request.getRequestDispatcher("/Login.jsp").forward(request, response);			
				}
			} 
			catch (ClassNotFoundException | ServletException | IOException e) 
			{
				System.out.println(e);
			}
			
		}

	}
}