package ar.edu.unlp.info.oo1.ejercicio20_ServicioDeEnvioDePaquetes;

import java.util.List;

public class ClienteCorporativo extends Cliente{
	private int CUIT;

	public ClienteCorporativo(String nombre, String direccion, List<Envio> envios, int cUIT) {
		super(nombre, direccion, envios);
		CUIT = cUIT;
	}
	
	
}
