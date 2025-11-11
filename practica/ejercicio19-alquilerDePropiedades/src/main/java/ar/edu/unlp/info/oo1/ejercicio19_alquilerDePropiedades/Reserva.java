package ar.edu.unlp.info.oo1.ejercicio19_alquilerDePropiedades;

import ar.edu.unlp.info.oo1.ejercicio16_intervaloDeTiempo.DateLapse;

import java.time.LocalDate;

public class Reserva{
	private DateLapse periodo;
	private double precioPorNoche;
	
	
	public Reserva(DateLapse periodo, double precioPorNoche) {
		this.periodo = periodo;
		this.precioPorNoche = precioPorNoche;
	}



	/**
	Retorna true si el período de tiempo del receptor se superpone con el recibido por parámetro
	**/
	public boolean overlaps(DateLapse anotherDateLapse) {
		return (this.periodo.includesDate(anotherDateLapse.getFrom())|| this.periodo.includesDate(anotherDateLapse.getTo()));
		}


/***
 Calcular el precio de una reserva: Dada una reserva, se debe poder calcular su precio.  
 El mismo se obtiene multiplicando la cantidad de noches por el precio por noche.
 ***/
	public int cantDias() {
		return this.periodo.sizeInDays();
	} 
	
	public double precioDeReserva() {
	    return this.precioPorNoche * this.cantDias();
	}


	public boolean enCurso() {
		LocalDate hoy = LocalDate.now(); //me guardo la fecha actual
		return !this.periodo.getFrom().isAfter(hoy) && !this.periodo.getTo().isBefore(hoy);
		}
		// el inicio no es después de hoy y el fin no es antes de hoy
}
