package ar.edu.unlp.info.oo1.figurasYCuerpos;


public class Circulo implements Figura{

    private double radio;

    
    
	public Circulo() {
	
		}
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double getDiametro() {
		return this.radio * 2;
	}
	
	
	public double getRadio() {
		return radio;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.radio, 2); //el pow hace la potencia del valor que le envie como parámetro
	}
	
	public void setDiametro(double diametro) {
		this.radio = diametro / 2;
	}

	
	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
    
    
}
