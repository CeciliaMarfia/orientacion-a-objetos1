package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuadrado implements Figura{
	private double lado;
    
    
	public Cuadrado() {
		
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	public double getLado() {
		return lado;
	}


	public double getPerimetro() {
		return this.lado * 4;
	}


	public double getArea() {
		return this.lado* this.lado; // o bien Math.pow(lado, 2);
	}

	

    
}
