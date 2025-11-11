package ar.edu.unlp.info.oo1.ejercicio20_ServicioDeEnvioDePaquetes;

import java.time.LocalDate;

public class EnvioLocal extends Envio{
	private boolean envioRapido;

	public EnvioLocal(LocalDate fecha, String dirOrigen, String dirDestino, double peso, boolean envioRapido) {
		super(fecha, dirOrigen, dirDestino, peso);
		this.envioRapido = envioRapido;
	}

	@Override
	public double calcularMonto() {
		
		if (this.envioRapido == true) {
			return 1500;
		}else {
			return 1000;
		}
	}
}
