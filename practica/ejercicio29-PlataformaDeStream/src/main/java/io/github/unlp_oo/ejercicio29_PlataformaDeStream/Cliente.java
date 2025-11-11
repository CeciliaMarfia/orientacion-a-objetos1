package io.github.unlp_oo.ejercicio29_PlataformaDeStream;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import ar.edu.unlp.info.oo1.ejercicio20_ServicioDeEnvioDePaquetes.Envio;


public class Cliente {
	private String nombre;
	private LocalDate fechaAlta;
	private Plan tipoPlan;
	private List<Actividad> actividades;
	
	 
	 
	public Cliente(String nombre, LocalDate fechaAlta, Plan tipoPlan) {

		this.nombre = nombre;
		this.fechaAlta = fechaAlta;
		this.tipoPlan = tipoPlan;
		this.actividades =  new ArrayList<Actividad>();
	}
	
	

	public int antiguedad() {
		return Period.between(this.fechaAlta, LocalDate.now()).getYears();
	}

	public double montoACobrar(DateLapse periodo){
			return this.actividades.stream()
					.filter(act-> act.calcularPeriodo(periodo))
					.mapToDouble(act -> act.calcularCosto())
					.sum() + this.plan.precioBasePlan() + this.montoPenalizacion();
				
	}
		
	public double montoPenalizacion() {
		if (this.antiguedad() > 10)
			return 0;
		else
			return (this.cantidadIpsUsadas - this.cantidadIpsContratadas) * 500;
	}
	
	
	
}
