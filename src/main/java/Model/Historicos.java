package Model;

public class Historicos {
	
	private int Id_etiqueta;
	private String Operario;
	private String Lote;
	private String Articulo;
	private String Medida;
	private String Calibre;
	private double Tarima;
	private double Centro;
	private double Peso_Bruto;
	private double Peso_Neto;
	private String Cliente;
	private String fecha;
	private String Descripcion;
	private int Orden_Venta;
	private int id_Usuario;
	
	
	public Historicos() 
	{
		
	}
	
	public Historicos(int id_etiqueta, String operario, String lote, String articulo, String medida, String calibre,
			double tarima, double centro, double peso_Bruto, double peso_Neto, String cliente, String fecha,
			String descripcion, int orden_Venta, int id_Usuario)
	{
		
		Id_etiqueta = id_etiqueta;
		Operario = operario;
		Lote = lote;
		Articulo = articulo;
		Medida = medida;
		Calibre = calibre;
		Tarima = tarima;
		Centro = centro;
		Peso_Bruto = peso_Bruto;
		Peso_Neto = peso_Neto;
		Cliente = cliente;
		this.fecha = fecha;
		Descripcion = descripcion;
		Orden_Venta = orden_Venta;
		this.id_Usuario = id_Usuario;
	}
	
	
	public int getId_etiqueta() {
		return Id_etiqueta;
	}
	public void setId_etiqueta(int id_etiqueta) {
		Id_etiqueta = id_etiqueta;
	}
	public String getOperario() {
		return Operario;
	}
	public void setOperario(String operario) {
		Operario = operario;
	}
	public String getLote() {
		return Lote;
	}
	public void setLote(String lote) {
		Lote = lote;
	}
	public String getArticulo() {
		return Articulo;
	}
	public void setArticulo(String articulo) {
		Articulo = articulo;
	}
	public String getMedida() {
		return Medida;
	}
	public void setMedida(String medida) {
		Medida = medida;
	}
	public String getCalibre() {
		return Calibre;
	}
	public void setCalibre(String calibre) {
		Calibre = calibre;
	}
	public double getTarima() {
		return Tarima;
	}
	public void setTarima(double tarima) {
		Tarima = tarima;
	}
	public double getCentro() {
		return Centro;
	}
	public void setCentro(double centro) {
		Centro = centro;
	}
	public double getPeso_Bruto() {
		return Peso_Bruto;
	}
	public void setPeso_Bruto(double peso_Bruto) {
		Peso_Bruto = peso_Bruto;
	}
	public double getPeso_Neto() {
		return Peso_Neto;
	}
	public void setPeso_Neto(double peso_Neto) {
		Peso_Neto = peso_Neto;
	}
	public String getCliente() {
		return Cliente;
	}
	public void setCliente(String cliente) {
		Cliente = cliente;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public int getOrden_Venta() {
		return Orden_Venta;
	}
	public void setOrden_Venta(int orden_Venta) {
		Orden_Venta = orden_Venta;
	}
	public int getId_Usuario() {
		return id_Usuario;
	}
	public void setId_Usuario(int id_Usuario) {
		this.id_Usuario = id_Usuario;
	}
	
	 

}
