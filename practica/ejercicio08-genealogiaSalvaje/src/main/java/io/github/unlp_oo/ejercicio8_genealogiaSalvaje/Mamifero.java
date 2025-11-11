package io.github.unlp_oo.ejercicio8_genealogiaSalvaje;

import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	
	public Mamifero() {
	
	}


	public Mamifero(String identificador) {
		this.identificador = identificador;
	}


	public String getIdentificador() {
		return identificador;
	}


	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public Mamifero getPadre() {
		return padre;
	}


	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}


	public Mamifero getMadre() {
		return madre;
	}


	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	
	//operador ternario (condición ? valor_si_verdadero : valor_si_falso).
	public Mamifero getAbueloMaterno() {
		return this.madre != null ? this.madre.getPadre() : null;
	}
	
	public Mamifero getAbuelaMaterna() {
		return this.madre != null ? this.madre.getMadre() : null;
	}
	
	public Mamifero getAbueloPaterno() {
		return this.padre != null ? this.padre.getPadre() : null;
	}
	
	public Mamifero getAbuelaPaterna() {
		return this.padre != null ? this.padre.getMadre() : null;
	}
	
	
	//revisar por el tema de los abuelos
	public boolean tieneComoAncestroA(Mamifero unMamifero ) {
		return this.getPadre() == unMamifero|| this.getMadre()== unMamifero || 
				(this.getPadre()!=null && this.padre.tieneComoAncestroA(unMamifero))||
				(this.getMadre()!=null && this.madre.tieneComoAncestroA(unMamifero)); 
		
	}
	//retorna el valor de comparar si al obtener el padre de este apunta al padre de unMamifero o análogamente con la madre o de el abuelo o la abuela
}
