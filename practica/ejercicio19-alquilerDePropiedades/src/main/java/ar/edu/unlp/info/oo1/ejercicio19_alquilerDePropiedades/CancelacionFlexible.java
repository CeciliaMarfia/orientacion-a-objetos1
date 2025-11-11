package ar.edu.unlp.info.oo1.ejercicio19_alquilerDePropiedades;

public class CancelacionFlexible implements PoliticaDeCancelacion{

	public double reembolsar(Reserva res) {
		return res.precioDeReserva();
	}
}
