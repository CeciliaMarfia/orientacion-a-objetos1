package ar.edu.unlp.info.oo1.ejercicio11_cuentaConGanchos;

public class CuentaCorriente extends Cuenta{
	private double descubierto;
	
	public CuentaCorriente() {
		super();
		this.descubierto = 0;
	}
	
	
	public double getDescubierto() {
		return descubierto;
	}


	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
	
	protected boolean puedeExtraer(double monto) {
		return monto <= (this.getSaldo() + this.descubierto); //debería ser get y por qué getSaldo y no this.saldo? porque si esta privada no me va a deejar
	}
	
}
