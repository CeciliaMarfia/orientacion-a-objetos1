package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;  
	private int cantidadDeProductos;
	private double pesoTotal;
	private double 	precioTotal;
	
	
	public Ticket(int cantidadDeProductos, double pesoTotal, double precioTotal) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cantidadDeProductos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
	}


	public double impuesto() {
		return this.precioTotal * 0.21; //el impuesto es el 21% del presupuesto total
	}


	
	public LocalDate getFecha() {
		return fecha;
	}


	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}



	public double getPesoTotal() {
		return pesoTotal;
	}



	public double getPrecioTotal() {
		return precioTotal;
	}


	public String toString() {
		String ticket = "Fecha emitida: " + this.fecha.toString() + "\n" + "Cantidad de productos comprados: "
				+ this.cantidadDeProductos + "\n" + "Peso total en productos: " + this.pesoTotal + "\n"
				+ "Total a pagar: " + this.precioTotal;
		return ticket;
	}

}
