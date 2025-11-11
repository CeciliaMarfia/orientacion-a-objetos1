package ar.edu.unlp.infoo.oo1.ejercicio16_intervaloDeTiempoOtravez;

import java.time.LocalDate;

public class Datelapse2 implements Date{
	private LocalDate from;
	private int sizeInDays;
	
	
	
	public Datelapse2(LocalDate desde, int cantDias) {
		this.from = desde;
		this.sizeInDays = cantDias;
	}
	public LocalDate getFrom() {
		return from;
	}
	public LocalDate getTo() {
		return this.from.plusDays(this.sizeInDays);
	}
	public int sizeInDays() {
	return sizeInDays;
}
	
	public boolean includesDate(LocalDate other) {
		//Reemplazo la variable TO por el metodo getTo. 

		return !((other.isBefore(this.from) || other.isAfter(this.getTo())));
	} 
}
