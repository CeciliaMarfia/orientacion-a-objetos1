package ar.edu.unlp.info.oo1.ejercicio_13_implementarInversores;

public class EnAcciones implements Inversion{
	
	private String nombre;
	private int cantidadDeAcciones;
	private double valorUnitario;
	
	
	public EnAcciones(String nombre, int cantidadDeAcciones, double valorUnitario) {
		this.nombre = nombre;
		this.cantidadDeAcciones = cantidadDeAcciones;
		this.valorUnitario = valorUnitario;
	}


	public double valorActual() {
		return this.cantidadDeAcciones * this.valorUnitario;
		}
		
	}

