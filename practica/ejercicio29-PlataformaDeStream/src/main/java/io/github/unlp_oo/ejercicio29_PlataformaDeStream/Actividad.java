package io.github.unlp_oo.ejercicio29_PlataformaDeStream;
import java.time.LocalDate;
import java.time.Period;

public abstract class Actividad {
	private LocalDate fechaInicio;
	private String direccionIP;
	
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	
	public Period calcularPeriodo (DateLapse periodo) {
		return periodo.contains(this.fechaInicio);
	}
	
	public abstract double calcularCosto();
}
