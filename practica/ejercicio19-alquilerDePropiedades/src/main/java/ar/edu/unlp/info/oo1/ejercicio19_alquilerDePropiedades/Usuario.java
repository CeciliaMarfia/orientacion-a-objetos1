package ar.edu.unlp.info.oo1.ejercicio19_alquilerDePropiedades;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String direccion;
	private int DNI;
	private List<Propiedad> propiedades;
	
	public Usuario(String nombre, String direccion, int dNI, List<Propiedad> propiedades) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.DNI = dNI;
		this.propiedades = new ArrayList<Propiedad>();
	}
	/*Calcular los ingresos de un propietario: 
	 * Se debe calcular la retribución a un propietario, la cual es el 75% 
	 * de la suma de precio totales de las reservas incluidas en un período específico de tiempo.
	 */
	public double gananciaEnPeriodo() {
		return this.propiedades.stream()
				.mapToDouble(prop -> prop.montoTotal())
				.sum();
	}
	
}
