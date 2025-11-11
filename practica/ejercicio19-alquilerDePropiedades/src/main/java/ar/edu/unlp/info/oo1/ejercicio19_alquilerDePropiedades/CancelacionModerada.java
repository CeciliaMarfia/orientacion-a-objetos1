package ar.edu.unlp.info.oo1.ejercicio19_alquilerDePropiedades;

public class CancelacionModerada implements PoliticaDeCancelacion{
	
	@Override
	public double reembolsar(Reserva res) {
		if(res.cantDias()>= 7) {
			return res.precioDeReserva();
		}
		if(res.cantDias()> 2) {
			return res.precioDeReserva()* 0.5;
			
		}
		return 0;
	}
}
