package ar.edu.unlp.info.oo1.ejercicio_13_implementarInversores;


import java.util.ArrayList;
import java.util.List;


public class Inversor {
	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversion>();
	}
	
	public void agregarInversion(Inversion inv){
		if (inv!=null) 
			inversiones.add(inv);
	}
	
	public void sacarInversion(Inversion inv){
		if (inv!=null) 
			inversiones.remove(inv);
	}
	
	public double valorActual() {
		return inversiones.stream()
			.mapToDouble(i -> i.valorActual())
			.sum();
	}
}
