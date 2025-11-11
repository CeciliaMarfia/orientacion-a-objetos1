package ar.edu.unlp.info.oo1.ejercicio14_volumenYSuperficieDeSolidos;

public class Esfera extends Pieza{
	private double radio;
	
	public Esfera(String material, String color, double radio) {
		super(material, color);
		this.radio = radio;
	}


//Volumen de una esfera: ⁴⁄₃ * π * radio ³.
	public double volumen() {
			return 4.0/3.0 * Math.PI * Math.pow(this.radio, 3);
	}


//Superficie de una esfera: 4 * π * radio 2
	public double superficie() {
		return 4 * Math.PI* Math.pow(this.radio, 2);
	}
}
