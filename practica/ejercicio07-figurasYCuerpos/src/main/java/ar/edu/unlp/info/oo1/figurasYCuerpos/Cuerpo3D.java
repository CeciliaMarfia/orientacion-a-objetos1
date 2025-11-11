package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuerpo3D{
	private double altura;
	private Figura caraBasal;


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}

	public void setCaraBasal(Figura caraBasal){ //Al ser de tipo interfaz Figura puede ser circulo o cuadrado.
		this.caraBasal = caraBasal;
	}
	// Cara basal al momento de darle un valor sera de tipo Cuadrado o Circulo donde los dos 
	   // Poseen los metodos compartidos y por eso hacemos uso de la interfaz.
	
	
	public double getVolumen() {
		return this.caraBasal.getArea() * this.altura;
	}
	
	public double getSuperficieExterior() {
		return 2 * this.caraBasal.getArea() + this.caraBasal.getPerimetro() * this.altura;
	}
}