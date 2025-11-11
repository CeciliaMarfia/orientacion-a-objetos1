package ar.edu.unlp.info.oo1.ejercicio19_alquilerDePropiedades;

public class CancelacionEstricta implements PoliticaDeCancelacion{
	
	@Override
	public double reembolsar(Reserva res) {
		return 0;
	}
}
