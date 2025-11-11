package ar.edu.unlp.info.oo1.ejercicio15_clienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	private Carpeta inbox; //tiene una relacion de conocer 1 carpeta --inbox y muchas carpetas- VER
	private List<Carpeta> carpetas;
	
	
	public ClienteDeCorreo() {
		this.inbox = new Carpeta("inbox");
		this.carpetas = new ArrayList<Carpeta>(); //NO OLVIDAR INICIALIZAR LISTA!!!
		carpetas.add(this.inbox); 
	}
	
	public void recibir(Email email) { //deberia agregar un if? qué pasa con el else; asumimos que no llega null
		this.inbox.agregarMail(email); 
	}
	

	public Email buscar(String texto) {
		return carpetas.stream()
				.map(carpeta -> carpeta.buscarMail(texto)) //
				.findFirst()
				.orElse(null);
			
	}
	
	public int espacioOcupado() {
		return this.carpetas.stream().mapToInt(carpeta -> carpeta.calcularEspacio()).sum();
	}
	
	
}
