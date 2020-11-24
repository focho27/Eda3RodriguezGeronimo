package ar.edu.unlam.pb220202c.eva03;

public class Automovil extends Vehiculo implements Imultable  {
	private String Patente;
	private Integer VelocidadActual;
	private Integer limiteVelocidad;
	public Automovil(String Patente, Integer VelocidadActual, Integer limiteVelocidad) {
		super(Patente, VelocidadActual, limiteVelocidad);
		this.Patente = Patente;
		this.VelocidadActual = VelocidadActual;
		this.limiteVelocidad = limiteVelocidad;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void incrmentarVelocidad(Integer Velocidad) {
		// TODO Auto-generated method stub
	
		this.VelocidadActual = Velocidad;
	}
	@Override
	public String getPatente() {
		return Patente;
	}
	@Override
	public void setPatente(String patente) {
		Patente = patente;
	}
	@Override
	public Integer getVelocidadActual() {
		return VelocidadActual;
	}
	@Override
	public void setVelocidadActual(Integer velocidadActual) {
		VelocidadActual = velocidadActual;
	}
	@Override
	public Integer getLimiteVelocidad() {
		return limiteVelocidad;
	}
	public void setLimiteVelocidad(Integer limiteVelocidad) {
		this.limiteVelocidad = limiteVelocidad;
	}

	@Override
	public Boolean enInfraccion() {
		if(this.VelocidadActual >limiteVelocidad)
		return true;
		return false;
	}

	@Override
	public int compareTo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return getPatente().compareTo(vehiculo.getPatente());
	}

	//Si es necesario Utilice herencia o implemente de Interfaces
//	Se debe crear contructeres getters y Setters y loos que crean convenientes
	
//el Limite de velociadad para autos es de 130km
//en caso que supere dicho limite el este sera multado
	
	
	
   
	
}
