package ar.edu.unlp.info.oo1.ejercicio15_clienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	
	public Email(String titulo, String cuerpo, List<Archivo> adjuntos) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>();;
	}


	public String getTitulo() {
		return titulo;
	}


	public String getCuerpo() {
		return cuerpo;
	}

	public boolean contiene(String texto) {
		return (this.titulo.contains(texto) || this.cuerpo.contains(texto));
	}
	
	public List<Archivo> getAdjuntos(){
		//Le paso una copia.
		return new ArrayList<Archivo>(this.adjuntos);
	}
	
	public int getEspacio() { //el método debe ser público!! para que otra clase pueda accederla :)
		return this.titulo.length() + this.cuerpo.length() + this.getLongArchivos();
	}
	
	private int getLongArchivos() {
		return this.adjuntos.stream().mapToInt(archivo -> archivo.tamanio()).sum();
	}
	
}
