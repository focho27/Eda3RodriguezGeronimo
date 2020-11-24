package ar.edu.unlam.pb220202c.eva03;

public abstract class Vehiculo implements Comparable<Vehiculo> {

	//Se debe crear contructeres getters y Setters y loos que crean convenientes
	private String Patente;
	private Integer VelocidadActual;
	private Integer limiteVelocidad;

	public Vehiculo(String Patente, Integer VelocidadActual, Integer limiteVelocidad) {
	
	}

		
	public abstract String getPatente();

	public abstract void setPatente(String patente);

	public abstract Integer getVelocidadActual(); 


	public abstract void setVelocidadActual(Integer velocidadActual);


	public abstract Integer getLimiteVelocidad();

	public abstract void setLimiteVelocidad(Integer limiteVelocidad) ;

	public abstract void incrmentarVelocidad(Integer Velocidad) ;


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Patente == null) ? 0 : Patente.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (Patente == null) {
			if (other.Patente != null)
				return false;
		} else if (!Patente.equals(other.Patente))
			return false;
		return true;
	}
	
	
}
