package ar.edu.unlp.info.oo1.ejercicio20_ServicioDeEnvioDePaquetes;
import java.util.ArrayList;
import java.util.*;

public abstract class Cliente {
	 private String nombre;
	 private String direccion;
	 private List<Envio> envios;
	 
	public Cliente(String nombre, String direccion, List<Envio> envios) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.envios = new ArrayList<Envio> ();
	}

	public void agregarEnvio(Envio nuevoEnvio) {
		this.envios.add(nuevoEnvio);
	}
	
	public double montoAPagar(DateLapse periodo) {
		 return envios.stream()
				 .filter(fecha -> periodo.includesDate(fecha.getFechaDespacho()))
				 .mapToDouble()
				 .sum();
	}
	

}
