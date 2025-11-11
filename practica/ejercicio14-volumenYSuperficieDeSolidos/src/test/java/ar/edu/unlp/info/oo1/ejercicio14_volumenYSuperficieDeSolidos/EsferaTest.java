package ar.edu.unlp.info.oo1.ejercicio14_volumenYSuperficieDeSolidos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EsferaTest {
	private Esfera esfera;
	private Esfera esfera2;
	
	@BeforeEach
	void setUp(){
		esfera = new Esfera("Aluminio","Rojo", 3.0);
		esfera2 = new Esfera("Aluminio","Rojo",0);
	
	}

	@Test
	public void testVolumen() {
		assertEquals(113.09, esfera.volumen(),0.1);
		assertEquals(0, esfera2.volumen());
		
	}

}
