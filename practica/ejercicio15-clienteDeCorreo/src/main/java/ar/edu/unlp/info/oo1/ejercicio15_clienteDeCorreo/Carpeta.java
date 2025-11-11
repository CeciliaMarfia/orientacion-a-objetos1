package ar.edu.unlp.info.oo1.ejercicio15_clienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class Carpeta{
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();;
	}

	public String getNombre() {
		return nombre;
	}

	//es responsabilidad del objeto DUEÑO de la colección agregar/eliminar elementos!
	public void agregarMail(Email email) {
		this.emails.add(email);
	}
	
	public void eliminarMail(Email email) {
		this.emails.remove(email);
	}
	
	public void mover(Email email, Carpeta destino) {
		this.eliminarMail(email);
		destino.agregarMail(email);
	}
	
	public Email buscarMail(String texto) { //acá es responsabilidad del mail ver si tiene el texto en su titulo o contenido
		return this.emails.stream().filter(mail-> mail.contiene(texto)).findFirst().orElse(null);
	}
	
	public int calcularEspacio() {
		return this.emails.stream().mapToInt(email -> email.getEspacio()).sum();
	}
}
