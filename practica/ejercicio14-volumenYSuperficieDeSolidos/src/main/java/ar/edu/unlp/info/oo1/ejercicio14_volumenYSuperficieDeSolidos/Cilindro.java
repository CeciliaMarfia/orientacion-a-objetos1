package ar.edu.unlp.info.oo1.ejercicio14_volumenYSuperficieDeSolidos;

public class Cilindro extends Pieza {
	private double altura;
	private double radio;
	
	
	public Cilindro(String material, String color,double altura, double radio) {
		super(material, color);
		this.altura = altura;
		this.radio = radio;
	}
	

public double getRadio() {
		return radio;
	}


	public double getAltura() {
		return altura;
	}

	//Volumen de un cilindro: π * radio 2 * h.
	public double volumen() {
		return Math.PI* Math.pow(this.radio, 2)* this.altura;
	}	
	
//Superficie de un cilindro: 2 * π * radio  * h + 2 * π * radio 2 

	public double superficie() {
		return 2 * Math.PI* this.radio*this.altura + 2* Math.PI* Math.pow(this.radio, 2);
}	
}
