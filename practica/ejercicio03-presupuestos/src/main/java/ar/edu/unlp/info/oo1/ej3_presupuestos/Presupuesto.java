package ar.edu.unlp.info.oo1.ej3_presupuestos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	
	public Presupuesto(String cliente) {
	    this.fecha = fecha;
	    this.cliente = cliente;
	    this.items = new ArrayList<>(); //debo inicializar la lista porque sino va a dar NullPointerException al hacer this.items.add(item).
	}
	
	
	
	public LocalDate getFecha() {
		return fecha;
	}



	public String getCliente() {
		return cliente;
	}




	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
	    double total = 0;
	    for (Item item : this.items) { //recorre cada elemento de la lista items
	        total += item.costo(); //devuelve el costo de cada ítem que lo trae de la clase Item
	    }
	    return total;
	}


	
}

