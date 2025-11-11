package ar.edu.unlp.info.oo1.ejercicio16_intervaloDeTiempo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import ar.edu.unlp.infoo.oo1.ejercicio16_intervaloDeTiempoOtravez.Date;

public class DateLapse implements Date{
	private LocalDate from;
	private LocalDate to;
	
	
	
	//“Retorna la fecha de inicio del rango”


	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}


//“Retorna la fecha de inicio del rango”

	public LocalDate getFrom() {
		return from;
	}

//“Retorna la fecha de fin del rango”

	public LocalDate getTo() {
		return to;
	}

	

	//“retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”
	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(from, to);
	}
	
	//“recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.
	public boolean includesDate(LocalDate other) {
		return !((other.isBefore(this.from) ||  other.isAfter(this.to)));
	}
	
}
