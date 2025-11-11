package ar.edu.unlp.info.oo1.ejercicio15_clienteDeCorreo;

public class Archivo{
	private String nombre;

	
	public Archivo(String nombre) {
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}
	
	//obtengo el tamaño asumiendo que este es el largo del nombre
	public int tamanio() {
		return this.nombre.length();
	}
}
