package ar.edu.unlp.info.oo1.ejercicio20_ServicioDeEnvioDePaquetes;

import java.util.List;

public class PersonaFisica extends Cliente{
	private int DNI;

	public PersonaFisica(String nombre, String direccion, List<Envio> envios, int dNI) {
		super(nombre, direccion, envios);
		DNI = dNI;
	}
	
	
}
