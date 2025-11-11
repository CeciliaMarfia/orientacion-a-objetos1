package ar.edu.unlp.infoo.oo1.ejercicio16_intervaloDeTiempoOtravez;

import java.time.LocalDate;

public interface Date {
	
	public LocalDate getFrom();
	public LocalDate getTo();
	public int sizeInDays();
	
	public boolean includesDate(LocalDate other);
}
