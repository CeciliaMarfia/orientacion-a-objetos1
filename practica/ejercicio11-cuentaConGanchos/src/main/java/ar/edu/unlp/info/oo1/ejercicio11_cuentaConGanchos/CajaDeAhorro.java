package ar.edu.unlp.info.oo1.ejercicio11_cuentaConGanchos;

public class CajaDeAhorro extends Cuenta{
	
	public CajaDeAhorro() {
		super();
	}
	
	public void transferir(double monto) {
		super.depositar(monto - (monto * 0.02));
	}
	
	
	public void extraerDinero(double monto) {
		super.extraerSinControlar(monto - (monto * 0.02));
	}
	
	protected boolean puedeExtraer(double monto) {//costo adicional de 2% del monto en cuestión
		return this.getSaldo()>= monto + (monto * 0.02) ? true : false;
	}
}
