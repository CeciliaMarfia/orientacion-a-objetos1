package ar.edu.unlp.info.oo1.ejercicio20_ServicioDeEnvioDePaquetes;
import java.time.LocalDate;

public abstract class Envio {
	private LocalDate fecha;
	private String dirOrigen;
	private String dirDestino;
	private double peso;
	
	
	public Envio(LocalDate fecha, String dirOrigen, String dirDestino, double peso) {
		super();
		this.fecha = fecha;
		this.dirOrigen = dirOrigen;
		this.dirDestino = dirDestino;
		this.peso = peso;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public String getDirOrigen() {
		return dirOrigen;
	}


	public String getDirDestino() {
		return dirDestino;
	}


	public double getpeso() {
		return peso;
	}
	
	public abstract double calcularMonto();
		
	
}
