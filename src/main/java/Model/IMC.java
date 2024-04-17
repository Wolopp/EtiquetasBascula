package Model;

public class IMC {
	
	private	double Peso;
	private double Estatura;
	private double Rimc;
	
	
public IMC(String P, String E) {
		
		this.setpeso(Double.parseDouble(P));
		this.setestatura(Double.parseDouble(E));
	}
	
	public void Operacion_IMC() 
	{
		
		double m=this.getpeso()/this.getestatura();
		this.setRimc(m);
	}
	

	
	
	public double getpeso() 
		{
		
		return Peso;
	
		}
	
	
	public void setpeso(double Peso) 
		{
		
		this.Peso = Peso;
		}
	
	
	public double getestatura() 
		{
		
		return Estatura;
		}
	
	
	public void setestatura(double Estatura)
		{
			
			this.Estatura= Estatura;
		}
	
	
	public double getrimc()
		{
		return Rimc;
		}
	
	
	public void setRimc(double Rimc)
		{
		this.Rimc = Rimc;
		}

}
	
