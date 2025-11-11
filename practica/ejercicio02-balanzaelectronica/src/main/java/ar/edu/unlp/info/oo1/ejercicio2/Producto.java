package ar.edu.unlp.info.oo1.ejercicio2;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public Producto(String descripcion, double peso, double precioPorKilo) {
		this.peso = peso;
		this.precioPorKilo = precioPorKilo;
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return this.peso * this.precioPorKilo; //el precio se obtiene de calcular el peso * precio por kilo
	}
	
	public double getPeso() {
		return this.peso;
	}
	public double precioPorKilo() {
		return this.precioPorKilo;
	}
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	
	public double getPrecioPorKilo() {
		return precioPorKilo;
	}

	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}