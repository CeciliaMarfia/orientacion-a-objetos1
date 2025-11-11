package ar.edu.unlp.info.oo1.ejercicio_13_implementarInversores;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class PlazoFijo implements Inversion{
	private LocalDate fecha;
	private double montoDepositado;
	private double porcentajDepositado;
	
	
	
	
	public PlazoFijo(LocalDate fecha, double montoDepositado, double porcentajDepositado) {
		super();
		this.fecha = fecha;
		this.montoDepositado = montoDepositado;
		this.porcentajDepositado = porcentajDepositado;
	}





	public double valorActual() {
		double cantDias = ChronoUnit.DAYS.between(fecha, LocalDate.now());//calcula cuántas unidades (en este caso, días) hy entre fecha y hoy
		return this.montoDepositado + (cantDias * this.porcentajDepositado); //revisar
		
	}
}
