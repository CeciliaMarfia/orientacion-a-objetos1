package ar.edu.unlp.info.oo1.ejercicio20_ServicioDeEnvioDePaquetes;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio{
	private double distancia;

	public EnvioInterurbano(LocalDate fecha, String dirOrigen, String dirDestino, double peso, double distancia) {
		super(fecha, dirOrigen, dirDestino, peso);
		this.distancia = distancia;
	}
	
	
	
/**Los envíos interurbanos tienen un costo que depende de la distancia
 *  entre el origen y el destino (utilice $20 para menos de 100 km por cada gramo de peso,
 *   $25 para distancias entre 100 km y 500 km por gramo de peso, y 
 *   $30 para distancias de más de 500 km por gramo de peso). 
 */

	@Override
	public double calcularMonto() {
		
		double peso = this.getpeso();
		
		if (this.distancia < 100) {
			return 20 * peso;
		}else if (this.distancia >= 100 && this.distancia <=500) {
			return 25 * peso;
		}
		return 30 * peso;
	}
	
	
	
	

}
