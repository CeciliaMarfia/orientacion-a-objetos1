package ar.edu.unlp.info.oo1.ejercicio20_ServicioDeEnvioDePaquetes;

import java.time.LocalDate;

public class EnvioInternacional extends Envio{
	private boolean envioRapido;

	public EnvioInternacional(LocalDate fecha, String dirOrigen, String dirDestino, double pago, boolean envioRapido) {
		super(fecha, dirOrigen, dirDestino, pago);
		this.envioRapido = envioRapido;
	}

	@Override
	public double calcularMonto() {
		double peso = this.getpeso();
		return peso <= 1000 ? (5000 + 10 * peso) : (5000 + 12 * peso);
	}
}
