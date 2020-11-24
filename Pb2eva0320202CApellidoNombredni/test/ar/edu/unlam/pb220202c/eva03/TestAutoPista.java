package ar.edu.unlam.pb220202c.eva03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TestAutoPista {
	
	@Test
	public void queSePuedaRegistrarTelepase () {
		Autopista autopista = new Autopista ("Richieri");
		Vehiculo vehiculo = new Automovil ("ABS123",40,130);
		
		assertTrue(autopista.registrarTelepase(1, vehiculo));
	}
	@Test (expected = VehiculoNotFounException.class)
	public void queAlSalirDelAutopistaNoestaEncirculacionLanceUnaExcepcion() throws VehiculoNotFounException {
		Autopista autopista = new Autopista ("Richieri");
		Vehiculo vehiculo = new Automovil ("ABS123",40,130);
		
		autopista.salirAutpista(vehiculo);
		
		
		
		assertEquals(0,autopista.cantidadDeVehiculosENCirculacion(),0.01);
	}
	@Test
	public void queVerifiqueQueSeObtengaUnaListaDeAutosInsfractoresOrdenadaPorPatente() throws VehiculoNotFounException{
		Autopista autopista = new Autopista ("Richieri");
		Vehiculo vehiculo = new Automovil ("ABS123",140,130);
		autopista.registrarTelepase(1, vehiculo);
		try {
		autopista.ingresarAutopista(1);
		}
		catch(VehiculoNotFounException v) {
			System.out.println(v.getMessage());
		}
		assertEquals(1,autopista.obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente().size());
	}
	@Test
	public void queUnVehiculoSalgaDeAutopista() throws VehiculoNotFounException{
		Autopista autopista = new Autopista ("Richieri");
		Vehiculo vehiculo = new Automovil ("ABS123",140,130);
		autopista.registrarTelepase(1, vehiculo);
		try {
			autopista.ingresarAutopista(1);
			}
			catch(VehiculoNotFounException v) {
				System.out.println(v.getMessage());
			}
		try {
			autopista.salirAutpista(vehiculo);
			}
			catch(VehiculoNotFounException v) {
				System.out.println(v.getMessage());
			}
		assertEquals(0,autopista.cantidadDeVehiculosENCirculacion(),0.01);
	}
	@Test
	public void queSeIngreseVehiculoAAutopista() throws VehiculoNotFounException {
		Autopista autopista = new Autopista ("Richieri");
		Vehiculo vehiculo = new Automovil ("ABS123",140,130);
		autopista.registrarTelepase(1, vehiculo);
		try {
			autopista.ingresarAutopista(1);
			}
			catch(VehiculoNotFounException v) {
				System.out.println(v.getMessage());
			}
		assertEquals(1,autopista.cantidadDeVehiculosENCirculacion(),0.01);
	}
	
}
