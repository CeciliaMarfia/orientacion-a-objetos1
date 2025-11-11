package io.github.unlp_oo.ejercicio9_redDeAlumbrado;
import java.util.*;
public class Farola {
	private boolean encendido;
	private List<Farola> farolas;
	
	
	
	
	public Farola() {
		this.encendido = false;
		this.farolas = new ArrayList<Farola>(); 
	}

	/* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca,
	 *  es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola
	 *  también se convertirá en vecina del receptor del mensaje
*/

	public void pairWithNeighbor(Farola otraFarola) {
	    if (!this.farolas.contains(otraFarola)) {
	        this.farolas.add(otraFarola);
	        otraFarola.pairWithNeighbor(this);//No alcanza con que f1 considere vecina a f2.También necesitamos que f2 considere vecina a f1.
	    }//Por eso llamamos recursivamente al mismo método, pero al revés:Si f1 agrega a f2, entonces ahora f2 agrega a f1.
	}


	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors (){
		return farolas;
	}


	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if(!this.isOn()) {
			this.encendido = true;
			for(Farola i:  farolas) {
				i.turnOn();
			}
		}
	}
		
	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if(this.isOn()) {
			this.encendido = false;
			for(Farola i:  farolas) {
				i.turnOff();
			}
		}
	}

	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		return this.encendido == true;
	}

	public boolean isOff() {
		return !this.isOn();
	}
}
