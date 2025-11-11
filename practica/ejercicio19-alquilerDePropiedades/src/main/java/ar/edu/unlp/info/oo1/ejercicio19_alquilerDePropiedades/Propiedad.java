package ar.edu.unlp.info.oo1.ejercicio19_alquilerDePropiedades;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import ar.edu.unlp.info.oo1.ejercicio16_intervaloDeTiempo.DateLapse;

public class Propiedad {
	
	private String direccion;
	private String nombreDescriptivo;
	private double precioPorNoche;
	private List<Reserva> reservas;
	private PoliticaDeCancelacion politica;
	
	public Propiedad(String direccion, String nombreDescriptivo, double precioPorNoche, List<Reserva> reservas,PoliticaDeCancelacion polit) {
		super();
		this.direccion = direccion;
		this.nombreDescriptivo = nombreDescriptivo;
		this.precioPorNoche = precioPorNoche;
		this.reservas = new ArrayList<Reserva>();
		this.politica = polit;	
	}
	
	public List<Reserva> getReservas() {
		return reservas;
	}
	/***
	 Consultar la disponibilidad de una propiedad en un período específico: dada una propiedad, 
	 una fecha inicial y una fecha final, se debe determinar si la propiedad está disponible 
	 el período indicado.
	 ***/
	
	private boolean disponibilidad(LocalDate ingreso, LocalDate egreso) {
		return this.reservas.stream()
				.noneMatch(reservas->reservas.overlaps(new DateLapse(ingreso,egreso)));
	}
	
	public Reserva crearReserva(LocalDate ingreso, LocalDate egreso) {
		
	    if (this.disponibilidad(ingreso, egreso)) {
	    	
	        DateLapse periodo = new DateLapse(ingreso, egreso);
	        Reserva res = new Reserva(periodo,this.precioPorNoche);
	        this.reservas.add(res);
	        return res;
	    }
	    return null;
	}

	/*
	 Cancelar una reserva: Se debe permitir cancelar una reserva. 
	  En este caso, la propiedad pasa a estar disponible durante el período de tiempo 
	  indicado en la reserva.  Esta operación sólo es permitida si el período de la reserva 
	  no está en curso.

	 */
	public double cancelarReserva(Reserva reserva) {
		if (!reserva.enCurso()) {
			this.reservas.remove(reserva);
			return this.politica.reembolsar(reserva);
		}
		return 0;
		
	}
	public double montoTotal(){
		return this.reservas.stream()
				.mapToDouble(res -> res.precioDeReserva())
				.sum();
	}
	
}
