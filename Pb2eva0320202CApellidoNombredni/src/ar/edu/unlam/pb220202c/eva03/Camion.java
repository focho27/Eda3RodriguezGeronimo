package ar.edu.unlam.pb220202c.eva03;

public class Camion extends Vehiculo implements Imultable {
	private String Patente;
	private Integer VelocidadActual;
	private Integer limiteVelocidad;
	private Integer cantidadDeEjes;
	public Camion(String Patente, Integer VelocidadActual, Integer limiteVelocidad, Integer cantidadDeEjes) {
		super(Patente, VelocidadActual, limiteVelocidad);
		this.Patente = Patente;
		this.VelocidadActual = VelocidadActual;
		this.limiteVelocidad = limiteVelocidad;
		this.cantidadDeEjes = cantidadDeEjes;
		// TODO Auto-generated constructor stub
	}

	//Si es necesario Utilice herencia o implemente de Interfaces
	//Se debe crear contructeres getters y Setters y los que crean conveniente
	
	//el Limite de velociadad para autos es de 80km
	//en caso que supere dicho limite el este sera multado

	@Override
	public Boolean enInfraccion() {
		// TODO Auto-generated method stub
		if(this.VelocidadActual >limiteVelocidad)
			return true;
			return false;
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
    @Override
	public void setLimiteVelocidad(Integer limiteVelocidad) {
		this.limiteVelocidad = limiteVelocidad;
	}

	public Integer getCantidadDeEjes() {
		return cantidadDeEjes;
	}

	public void setCantidadDeEjes(Integer cantidadDeEjes) {
		this.cantidadDeEjes = cantidadDeEjes;
	}

	@Override
	public void incrmentarVelocidad(Integer Velocidad) {
		// TODO Auto-generated method stub
		this.VelocidadActual = Velocidad;
	}

	@Override
	public int compareTo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return getPatente().compareTo(vehiculo.getPatente());
	}
	
	
}
