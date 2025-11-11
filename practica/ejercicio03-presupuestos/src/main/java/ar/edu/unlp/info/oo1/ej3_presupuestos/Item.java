package ar.edu.unlp.info.oo1.ej3_presupuestos;

public class Item{
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	
	public Item(String detalle, double costoUnitario,int cantidad) {
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}




	public double getCostoUnitario() {
		return costoUnitario;
	}




	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}




	public double costo() {
		return this.cantidad * this.costoUnitario;
	}
	
	
}
