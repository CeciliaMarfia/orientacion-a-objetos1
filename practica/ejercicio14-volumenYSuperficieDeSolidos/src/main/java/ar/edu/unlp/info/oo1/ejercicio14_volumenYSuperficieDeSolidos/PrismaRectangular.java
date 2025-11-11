package ar.edu.unlp.info.oo1.ejercicio14_volumenYSuperficieDeSolidos;

public class PrismaRectangular extends Pieza{
	private double ladoMayor;
	private double ladoMenor;
	private double altura;
	
	
	
public PrismaRectangular(String material, String color, double ladoMayor, double ladoMenor, double altura) {
		super(material, color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}
// Volumen del prisma: ladoMayor * ladoMenor * altura
 
 	public double volumen() {
 	return this.ladoMayor* this.ladoMenor * this.altura;
 	}
//Superficie del prisma: 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura)
 	public double superficie() {
 	 	return 2* (this.ladoMayor * this.ladoMenor * this.ladoMayor* this.altura + this.ladoMenor* this.altura);
 	 	}
}
